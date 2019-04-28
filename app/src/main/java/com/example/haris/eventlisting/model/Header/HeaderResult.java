package com.example.haris.eventlisting.model.Header;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HeaderResult {


    @SerializedName("hmac")
    @Expose
    private Hmac hmac;

    public Hmac getHmac() {
        return hmac;
    }

    public void setHmac(Hmac hmac) {
        this.hmac = hmac;
    }
}