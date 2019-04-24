package com.example.haris.eventlisting.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Schedule {
    @SerializedName("id_schedule")
    @Expose
    private Integer idSchedule;
    @SerializedName("start_date")
    @Expose
    private String startDate;
    @SerializedName("end_date")
    @Expose
    private String endDate;
    @SerializedName("use_seating_chart")
    @Expose
    private Boolean useSeatingChart;
    @SerializedName("tax")
    @Expose
    private Integer tax;
    @SerializedName("form_option")
    @Expose
    private List<String> formOption = null;
    @SerializedName("status_schedule")
    @Expose
    private Integer statusSchedule;
    @SerializedName("status_schedule_name")
    @Expose
    private String statusScheduleName;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("groups")
    @Expose
    private List<Group> groups = null;

    public Integer getIdSchedule() {
        return idSchedule;
    }

    public void setIdSchedule(Integer idSchedule) {
        this.idSchedule = idSchedule;
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

    public Boolean getUseSeatingChart() {
        return useSeatingChart;
    }

    public void setUseSeatingChart(Boolean useSeatingChart) {
        this.useSeatingChart = useSeatingChart;
    }

    public Integer getTax() {
        return tax;
    }

    public void setTax(Integer tax) {
        this.tax = tax;
    }

    public List<String> getFormOption() {
        return formOption;
    }

    public void setFormOption(List<String> formOption) {
        this.formOption = formOption;
    }

    public Integer getStatusSchedule() {
        return statusSchedule;
    }

    public void setStatusSchedule(Integer statusSchedule) {
        this.statusSchedule = statusSchedule;
    }

    public String getStatusScheduleName() {
        return statusScheduleName;
    }

    public void setStatusScheduleName(String statusScheduleName) {
        this.statusScheduleName = statusScheduleName;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}
