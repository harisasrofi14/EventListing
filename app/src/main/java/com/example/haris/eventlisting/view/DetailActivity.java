package com.example.haris.eventlisting.view;

import android.content.Intent;
import android.net.Uri;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.haris.eventlisting.R;
import com.example.haris.eventlisting.UtilKt;
import com.example.haris.eventlisting.model.Event.Detail;
import com.example.haris.eventlisting.model.Event.DetailEventResult;
import com.example.haris.eventlisting.presenter.EventDetailPresenter;
import com.example.haris.eventlisting.presenter.EventPresenter;
import com.squareup.picasso.BuildConfig;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class DetailActivity extends AppCompatActivity implements EventDetailPresenter.View {
    private EventDetailPresenter eventDetailPresenter;
    private ArrayList<Detail> detailArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        eventDetailPresenter = new EventDetailPresenter(this);
        Bundle extras = getIntent().getExtras();
        Integer eventID = null;
        if (extras != null) {
            eventID = extras.getInt("eventID",0);
        }
        eventDetailPresenter.getEventDetail(eventID);
    }

    private void initView(final DetailEventResult detailEventResult){
        ImageView   iv_event_banner = findViewById(R.id.iv_detail_event_banner);
        TextView    tv_event_name = findViewById(R.id.tv_detail_event_name);
        TextView    tv_event_by = findViewById(R.id.tv_detail_event_by);
        TextView    tv_event_date = findViewById(R.id.tv_detail_event_date);
        TextView    tv_event_time = findViewById(R.id.tv_detail_event_time);
        TextView    tv_event_place = findViewById(R.id.tv_detail_event_place);
        TextView    tv_event_street_name = findViewById(R.id.tv_detail_event_street_name);
        TextView    tv_event_price = findViewById(R.id.tv_detail_event_price);
        Button      btn_add_calendar = findViewById(R.id.btn_add_to_calendar);
        TextView    tv_event_desc = findViewById(R.id.tv_detail_event_desc);
        ImageView   iv_event_location = findViewById(R.id.iv_detail_event_location);
        Button      btn_read_more = findViewById(R.id.btn_read_more);
        ImageButton btn_back =  findViewById(R.id.btn_back);
        LinearLayout wrapper_linear_layout = findViewById(R.id.wrapper_linear_layout);
        FrameLayout wrapper_frame_layout = findViewById(R.id.wrapper_frame_layout);

        Picasso.get().load(detailEventResult.getEventBanner()).into(iv_event_banner);
        tv_event_name.setText(detailEventResult.getEventName());
        tv_event_date.setText(UtilKt.dateTimeRFC_1123(detailEventResult.getStartDate()));
        tv_event_by.setText(String.format("%s %s", "By ",detailEventResult.getOrganizationName()));
        tv_event_time.setText(UtilKt.timeFormat(detailEventResult.getStartDate(),detailEventResult.getEndDate()));
        tv_event_place.setText(detailEventResult.getSchedules().get(0).getLocation().getLocationName());
        tv_event_street_name.setText(detailEventResult.getSchedules().get(0).getLocation().getAddress());
        tv_event_price.setText(UtilKt.toMoney(detailEventResult.getStartPrice(),detailEventResult.getEndPrice()));
        tv_event_desc.setText(getResources().getString(R.string.dummy_about_text));

        int count = tv_event_desc.getLineCount();
        if (count>5){
            tv_event_desc.setMaxLines(5);
            btn_read_more.setVisibility(View.VISIBLE);
        }

        final String lat = detailEventResult.getSchedules().get(0).getLocation().getLatitude().toString();
        final String lon = detailEventResult.getSchedules().get(0).getLocation().getLongitude().toString();
        String api_key = getResources().getString(R.string.gmpas_api_key);
        String url ="https://maps.googleapis.com/maps/api/staticmap?";
        url+="&zoom=17";
        url+="&size=640x320";
        url+="&maptype=roadmap";
        url+="&markers=color:red%7Clabel:G%7C"+lat+", "+lon;
        url+="&key="+api_key;

        Picasso.get().load(url).into(iv_event_location);

        btn_add_calendar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               addToCalendar(detailEventResult);
            }
        });
        iv_event_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("geo:"+lat+","+lon));
                startActivity(intent);
            }
        });
        btn_read_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetailActivity.this, AboutActivity.class);
                i.putExtra("aboutText", getResources().getString(R.string.dummy_about_text));
                startActivity(i);
            }
        });
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    private void addToCalendar(DetailEventResult detailEventResult){
        Intent intent = new Intent(Intent.ACTION_INSERT);
        intent.setData(CalendarContract.Events.CONTENT_URI);
        intent.putExtra(CalendarContract.Events.TITLE, detailEventResult.getEventName())
                .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,UtilKt.toMilis(detailEventResult.getStartDate()))
                .putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY,true)
                .putExtra(CalendarContract.Events.EVENT_LOCATION, detailEventResult.getSchedules().get(0).getLocation().getLocationName());
                //.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,UtilKt.toMilis(detailEventResult.getEndDate()));
        startActivity(intent);
    }

    @Override
    public void onSuccessGetEventDetail(DetailEventResult detailList) {
        initView(detailList);
    }

    @Override
    public void onErrorGetEvent(Throwable throwable) {

    }

    @Override
    public void showLoading() {
        ProgressBar progressBar = findViewById(R.id.event_detail_progress_bar);
        LinearLayout wrapper_linear_layout = findViewById(R.id.wrapper_linear_layout);
        FrameLayout wrapper_frame_layout = findViewById(R.id.wrapper_frame_layout);
        progressBar.setVisibility(View.VISIBLE);
        wrapper_frame_layout.setVisibility(View.INVISIBLE);
        wrapper_linear_layout.setVisibility(View.INVISIBLE);
    }

    @Override
    public void hideLoading() {
        ProgressBar progressBar = findViewById(R.id.event_detail_progress_bar);
        LinearLayout wrapper_linear_layout = findViewById(R.id.wrapper_linear_layout);
        FrameLayout wrapper_frame_layout = findViewById(R.id.wrapper_frame_layout);
        progressBar.setVisibility(View.GONE);
        wrapper_frame_layout.setVisibility(View.VISIBLE);
        wrapper_linear_layout.setVisibility(View.VISIBLE);
    }
}
