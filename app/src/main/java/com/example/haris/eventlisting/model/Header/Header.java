package com.example.haris.eventlisting.model.Header;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Header {
    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("result")
    @Expose
    private HeaderResult result;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public HeaderResult getResult() {
        return result;
    }

    public void setResult(HeaderResult result) {
        this.result = result;
    }
}
