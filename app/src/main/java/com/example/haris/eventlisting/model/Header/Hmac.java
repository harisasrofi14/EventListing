package com.example.haris.eventlisting.model.Header;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hmac {
    @SerializedName("Authorization")
    @Expose
    private Authorization authorization;

    public Authorization getAuthorization() {
        return authorization;
    }

    public void setAuthorization(Authorization authorization) {
        this.authorization = authorization;
    }

}
