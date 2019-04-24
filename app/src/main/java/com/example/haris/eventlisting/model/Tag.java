package com.example.haris.eventlisting.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tag {
    @SerializedName("id_event_tag")
    @Expose
    private Integer idEventTag;
    @SerializedName("tag_name")
    @Expose
    private String tagName;

    public Integer getIdEventTag() {
        return idEventTag;
    }

    public void setIdEventTag(Integer idEventTag) {
        this.idEventTag = idEventTag;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
}
