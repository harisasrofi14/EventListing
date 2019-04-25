package com.example.haris.eventlisting.view;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;


import com.example.haris.eventlisting.R;
import com.example.haris.eventlisting.UtilKt;
import com.example.haris.eventlisting.model.Detail;
import com.example.haris.eventlisting.presenter.EventPresenter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements EventPresenter.View {


    private EventPresenter eventPresenter;
    private EventAdapter eventAdapter;
    CoordinatorLayout coordinatorLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eventPresenter = new EventPresenter(this);
        eventAdapter = new EventAdapter(null);
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

    @Override
    public void onErrorGetEvent(Throwable throwable) {
            showErrorDialog();
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


}
