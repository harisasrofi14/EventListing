package com.example.haris.eventlisting.model.Event;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Summary {
    @SerializedName("event_count")
    @Expose
    private Integer eventCount;
    @SerializedName("page_count")
    @Expose
    private Integer pageCount;

    public Integer getEventCount() {
        return eventCount;
    }

    public void setEventCount(Integer eventCount) {
        this.eventCount = eventCount;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

}
