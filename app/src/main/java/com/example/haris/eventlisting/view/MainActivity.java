package com.example.haris.eventlisting.view;

import android.content.Intent;
import android.os.Parcelable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;


import com.example.haris.eventlisting.R;
import com.example.haris.eventlisting.UtilKt;
import com.example.haris.eventlisting.model.Event.Detail;
import com.example.haris.eventlisting.model.Event.DetailEventResult;
import com.example.haris.eventlisting.model.Event.EventDetailResult;
import com.example.haris.eventlisting.presenter.EventPresenter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements EventPresenter.View {


    private EventPresenter eventPresenter;
    private EventAdapter eventAdapter;
    CoordinatorLayout coordinatorLayout;
    private ArrayList<EventDetailResult> details = new ArrayList<EventDetailResult>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eventPresenter = new EventPresenter(this);
        eventAdapter = new EventAdapter(null,recyclerItemClickListener);
        coordinatorLayout = findViewById(R.id.coordinatorLayout);
        RecyclerView recyclerView = findViewById(R.id.rv_event);
        recyclerView.setAdapter(eventAdapter);
        if (UtilKt.isNetworkAvailable(this)){
            eventPresenter.getEvent();
        }
        else{
            showErrorDialog();
        }
    }

    @Override
    public void onSuccessGetEvent(List<Detail> detailsList) {
        eventAdapter.setDetailsList(detailsList);
        eventAdapter.notifyDataSetChanged();
    }

//    @Override
//    public void onSuccessGetEventDetail(DetailEventResult detailList) {
////        ArrayList<EventDetailResult> details = new ArrayList<>();
//        //details.add(detailList);
//        Bundle b = new Bundle();
//        b.putParcelable("EventDetail",detailList);
//        Intent i = new Intent(this,DetailActivity.class);
//        i.putExtras(b);
//        startActivity(i);
//    }


    @Override
    public void onErrorGetEvent(Throwable throwable) {
            showErrorDialog();
    }

    @Override
    public void showLoading() {
        ProgressBar progressBar = findViewById(R.id.event_progress_bar);
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
        ProgressBar progressBar = findViewById(R.id.event_progress_bar);
        progressBar.setVisibility(View.GONE);
    }

    public void showErrorDialog (){
        Snackbar snackbar = Snackbar.make(coordinatorLayout,getResources().getString(R.string.no_connection),Snackbar.LENGTH_INDEFINITE);
        snackbar.setAction(getResources().getString(R.string.retry), new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (UtilKt.isNetworkAvailable(view.getContext())){
                    eventPresenter.getEvent();
                }
                else{
                    showErrorDialog();
                }
            }
        });
        snackbar.show();
    }

    private RecyclerItemClickListener recyclerItemClickListener = new RecyclerItemClickListener() {
        @Override
        public void onItemClick(Detail detail) {
            Intent i = new Intent(MainActivity.this,DetailActivity.class);
            Integer eventId  = detail.getIdEvent();
            i.putExtra("eventID",eventId);
            startActivity(i);
        }
    };
}
