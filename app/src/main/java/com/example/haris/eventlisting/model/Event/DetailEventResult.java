package com.example.haris.eventlisting.model.Event;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DetailEventResult {
    @SerializedName("id_event")
    @Expose
    private Integer idEvent;
    @SerializedName("event_name")
    @Expose
    private String eventName;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("event_capacity")
    @Expose
    private Integer eventCapacity;
    @SerializedName("start_date")
    @Expose
    private String startDate;
    @SerializedName("end_date")
    @Expose
    private String endDate;
    @SerializedName("start_price")
    @Expose
    private Integer startPrice;
    @SerializedName("end_price")
    @Expose
    private Integer endPrice;
    @SerializedName("event_banner")
    @Expose
    private String eventBanner;
    @SerializedName("news_feed")
    @Expose
    private String newsFeed;
    @SerializedName("id_organization")
    @Expose
    private Integer idOrganization;
    @SerializedName("organization_name")
    @Expose
    private String organizationName;
    @SerializedName("custom_form")
    @Expose
    private Object customForm;
    @SerializedName("custom_url")
    @Expose
    private Object customUrl;
    @SerializedName("required_member")
    @Expose
    private Boolean requiredMember;
    @SerializedName("is_private_event")
    @Expose
    private Boolean isPrivateEvent;
    @SerializedName("status_event")
    @Expose
    private Integer statusEvent;
    @SerializedName("status_event_name")
    @Expose
    private String statusEventName;
    @SerializedName("categories")
    @Expose
    private List<Category> categories = null;
    @SerializedName("segments")
    @Expose
    private List<Segment> segments = null;
    @SerializedName("tags")
    @Expose
    private List<Tag> tags = null;
    @SerializedName("users")
    @Expose
    private List<User> users = null;
    @SerializedName("schedules")
    @Expose
    private List<Schedule> schedules = null;

    public Integer getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(Integer idEvent) {
        this.idEvent = idEvent;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getEventCapacity() {
        return eventCapacity;
    }

    public void setEventCapacity(Integer eventCapacity) {
        this.eventCapacity = eventCapacity;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(Integer startPrice) {
        this.startPrice = startPrice;
    }

    public Integer getEndPrice() {
        return endPrice;
    }

    public void setEndPrice(Integer endPrice) {
        this.endPrice = endPrice;
    }

    public String getEventBanner() {
        return eventBanner;
    }

    public void setEventBanner(String eventBanner) {
        this.eventBanner = eventBanner;
    }

    public String getNewsFeed() {
        return newsFeed;
    }

    public void setNewsFeed(String newsFeed) {
        this.newsFeed = newsFeed;
    }

    public Integer getIdOrganization() {
        return idOrganization;
    }

    public void setIdOrganization(Integer idOrganization) {
        this.idOrganization = idOrganization;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public Object getCustomForm() {
        return customForm;
    }

    public void setCustomForm(Object customForm) {
        this.customForm = customForm;
    }

    public Object getCustomUrl() {
        return customUrl;
    }

    public void setCustomUrl(Object customUrl) {
        this.customUrl = customUrl;
    }

    public Boolean getRequiredMember() {
        return requiredMember;
    }

    public void setRequiredMember(Boolean requiredMember) {
        this.requiredMember = requiredMember;
    }

    public Boolean getIsPrivateEvent() {
        return isPrivateEvent;
    }

    public void setIsPrivateEvent(Boolean isPrivateEvent) {
        this.isPrivateEvent = isPrivateEvent;
    }

    public Integer getStatusEvent() {
        return statusEvent;
    }

    public void setStatusEvent(Integer statusEvent) {
        this.statusEvent = statusEvent;
    }

    public String getStatusEventName() {
        return statusEventName;
    }

    public void setStatusEventName(String statusEventName) {
        this.statusEventName = statusEventName;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Segment> getSegments() {
        return segments;
    }

    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }




}
