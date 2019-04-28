package com.example.haris.eventlisting.presenter;

import com.example.haris.eventlisting.model.Event.EventResult;
import com.example.haris.eventlisting.model.Header.Header;
import com.example.haris.eventlisting.network.EventDataSource;

import org.junit.Test;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

import static org.junit.Assert.*;

public class EventPresenterTest {

    @Test
    public void getEvent() {
        Observable.just(EventDataSource.getService("").getHeader("androidtestapi","9f36ed23e4a9249dece874a22e6dfd37").subscribeOn(Schedulers.io())
                .blockingFirst())
                .doOnNext(new Consumer<Header>() {
                    @Override
                    public void accept(Header header) throws Exception {

                    }
                })
                .concatMap(new Function<Header, ObservableSource<EventResult>>() {
                    @Override
                    public ObservableSource<EventResult> apply(Header header) throws Exception {
                        String h = header.getResult().getHmac().getAuthorization().getHeader();
                        return EventDataSource.getService(h).getEvent();
                    }
                })
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<EventResult>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(EventResult eventResult) {

                    }

                    @Override
                    public void onError(Throwable e) {
                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }
}