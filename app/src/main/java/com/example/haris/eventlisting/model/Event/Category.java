package com.example.haris.eventlisting.model.Event;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Category implements Serializable {

    @SerializedName("id_event_category")
    @Expose
    private Integer idEventCategory;
    @SerializedName("name_event_category")
    @Expose
    private String nameEventCategory;
    @SerializedName("status_event_category")
    @Expose
    private Integer statusEventCategory;
    @SerializedName("status_event_category_name")
    @Expose
    private String statusEventCategoryName;

    public Integer getIdEventCategory() {
        return idEventCategory;
    }

    public void setIdEventCategory(Integer idEventCategory) {
        this.idEventCategory = idEventCategory;
    }

    public String getNameEventCategory() {
        return nameEventCategory;
    }

    public void setNameEventCategory(String nameEventCategory) {
        this.nameEventCategory = nameEventCategory;
    }

    public Integer getStatusEventCategory() {
        return statusEventCategory;
    }

    public void setStatusEventCategory(Integer statusEventCategory) {
        this.statusEventCategory = statusEventCategory;
    }

    public String getStatusEventCategoryName() {
        return statusEventCategoryName;
    }

    public void setStatusEventCategoryName(String statusEventCategoryName) {
        this.statusEventCategoryName = statusEventCategoryName;
    }

}

