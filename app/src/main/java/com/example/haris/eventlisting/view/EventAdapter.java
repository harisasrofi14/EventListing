package com.example.haris.eventlisting.view;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.haris.eventlisting.R;
import com.example.haris.eventlisting.UtilKt;
import com.example.haris.eventlisting.model.Detail;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.EventViewHolder> {
    public interface OnItemClickListener {
        void onItemClick(Detail detail);
    }
    private List<Detail> detailsList;


    public EventAdapter(List<Detail> detailsList){
        setDetailsList(detailsList);
    }

    public void  setDetailsList(List<Detail> detailsList){
        if (detailsList == null){
            this.detailsList = new ArrayList<>();
        }
        else {
            this.detailsList = detailsList;
        }
    }
    @NonNull
    @Override
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new EventViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_event,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull EventViewHolder eventViewHolder, int i) {
        eventViewHolder.bind(detailsList.get(i));
    }

    @Override
    public int getItemCount() {
        return detailsList.size();
    }

    class EventViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_event_banner;
        TextView tv_event_name;
        TextView tv_event_date;
        TextView tv_event_price;
        TextView tv_event_place;
        TextView tv_event_start_time;
        EventViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_event_banner = itemView.findViewById(R.id.iv_event_banner);
            tv_event_name = itemView.findViewById(R.id.tv_event_name);
            tv_event_date = itemView.findViewById(R.id.tv_event_date);
            tv_event_price = itemView.findViewById(R.id.tv_event_price);
            tv_event_place = itemView.findViewById(R.id.tv_event_place);
            tv_event_start_time = itemView.findViewById(R.id.tv_event_start_time);
        }
        void bind(final Detail details) {

            Picasso.get().load(details.getEventBanner()).into(iv_event_banner);
            tv_event_name.setText(details.getEventName());
            tv_event_date.setText(UtilKt.dateFormat(details.getStartDate()));
            tv_event_price.setText(UtilKt.toMoney(details.getStartPrice(),details.getEndPrice()));
            tv_event_place.setText(String.format("%s %s", details.getSchedules().get(0).getLocation().getLocationName(),details.getSchedules().get(0).getLocation().getProvinceName()));
            tv_event_start_time.setText(UtilKt.timeFormat(details.getStartDate(),details.getEndDate()));

        }


    }
}

