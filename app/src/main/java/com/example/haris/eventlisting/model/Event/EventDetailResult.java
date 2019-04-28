package com.example.haris.eventlisting.model.Event;

import android.os.Parcel;
import android.os.Parcelable;

import com.example.haris.eventlisting.model.Result;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class EventDetailResult{
    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("result")
    @Expose
    private DetailEventResult result;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public DetailEventResult getResult() {
        return result;
    }

    public void setResult(DetailEventResult result) {
        this.result = result;
    }


}
