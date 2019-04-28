package com.example.haris.eventlisting.presenter;

import com.example.haris.eventlisting.model.Event.Detail;
import com.example.haris.eventlisting.model.Event.DetailEventResult;
import com.example.haris.eventlisting.model.Event.EventDetailResult;
import com.example.haris.eventlisting.model.Header.Header;
import com.example.haris.eventlisting.network.EventDataSource;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public class EventDetailPresenter {

    private CompositeDisposable composite = new CompositeDisposable();

    private EventDetailPresenter.View view;


    public interface View {
        void onSuccessGetEventDetail(DetailEventResult detailList);
        void onErrorGetEvent(Throwable throwable);
        void showLoading ();
        void hideLoading ();
    }

    public  EventDetailPresenter(EventDetailPresenter.View view){
        this.view = view;
    }

    public void getEventDetail(final Integer eventId){
        view.showLoading();
        Observable.just(EventDataSource.getService("").getHeader("androidtestapi","9f36ed23e4a9249dece874a22e6dfd37").subscribeOn(Schedulers.io())
                .blockingFirst())
                .doOnNext(new Consumer<Header>() {
                    @Override
                    public void accept(Header header) throws Exception {
                        // view.onSuccessGetHeader(header.getResult().getHmac().getAuthorization().getHeader());
                    }
                })
                .concatMap(new Function<Header, ObservableSource<EventDetailResult>>() {
                    @Override
                    public ObservableSource<EventDetailResult> apply(Header header) throws Exception {
                        // String a= eventId;
                        String h = header.getResult().getHmac().getAuthorization().getHeader();
                        return EventDataSource.getService(h).getEventDetail(eventId);
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<EventDetailResult>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        composite.add(d);

                    }

                    @Override
                    public void onNext(EventDetailResult eventResult) {
                        view.onSuccessGetEventDetail(eventResult.getResult());
                        view.hideLoading();
                    }


                    @Override
                    public void onError(Throwable e) {
                        view.onErrorGetEvent(e);
                        view.hideLoading();
                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }
}
