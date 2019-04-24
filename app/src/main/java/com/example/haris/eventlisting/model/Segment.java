package com.example.haris.eventlisting.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Segment {
    @SerializedName("id_event_segment")
    @Expose
    private Integer idEventSegment;
    @SerializedName("name_event_segment")
    @Expose
    private String nameEventSegment;
    @SerializedName("status_event_segment")
    @Expose
    private Integer statusEventSegment;
    @SerializedName("status_event_segment_name")
    @Expose
    private String statusEventSegmentName;

    public Integer getIdEventSegment() {
        return idEventSegment;
    }

    public void setIdEventSegment(Integer idEventSegment) {
        this.idEventSegment = idEventSegment;
    }

    public String getNameEventSegment() {
        return nameEventSegment;
    }

    public void setNameEventSegment(String nameEventSegment) {
        this.nameEventSegment = nameEventSegment;
    }

    public Integer getStatusEventSegment() {
        return statusEventSegment;
    }

    public void setStatusEventSegment(Integer statusEventSegment) {
        this.statusEventSegment = statusEventSegment;
    }

    public String getStatusEventSegmentName() {
        return statusEventSegmentName;
    }

    public void setStatusEventSegmentName(String statusEventSegmentName) {
        this.statusEventSegmentName = statusEventSegmentName;
    }
}
