package com.example.haris.eventlisting.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Group {

    @SerializedName("id_group")
    @Expose
    private Integer idGroup;
    @SerializedName("id_schedule")
    @Expose
    private Integer idSchedule;
    @SerializedName("group_name")
    @Expose
    private String groupName;
    @SerializedName("is_unique_email")
    @Expose
    private Boolean isUniqueEmail;
    @SerializedName("max_transaction")
    @Expose
    private Integer maxTransaction;
    @SerializedName("widget_code")
    @Expose
    private String widgetCode;
    @SerializedName("widget_url")
    @Expose
    private String widgetUrl;
    @SerializedName("is_enable_invitation")
    @Expose
    private Boolean isEnableInvitation;
    @SerializedName("is_enable_coupon")
    @Expose
    private Boolean isEnableCoupon;
    @SerializedName("currency_code")
    @Expose
    private String currencyCode;
    @SerializedName("currency_prefix")
    @Expose
    private String currencyPrefix;
    @SerializedName("seating_type")
    @Expose
    private Integer seatingType;
    @SerializedName("seating_type_name")
    @Expose
    private String seatingTypeName;
    @SerializedName("status_group")
    @Expose
    private Integer statusGroup;
    @SerializedName("status_group_name")
    @Expose
    private String statusGroupName;
    @SerializedName("tickets")
    @Expose
    private List<Ticket> tickets = null;
    @SerializedName("fees")
    @Expose
    private List<Object> fees = null;
    @SerializedName("payments")
    @Expose
    private List<Payment> payments = null;
    @SerializedName("installments")
    @Expose
    private List<Object> installments = null;

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    public Integer getIdSchedule() {
        return idSchedule;
    }

    public void setIdSchedule(Integer idSchedule) {
        this.idSchedule = idSchedule;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Boolean getIsUniqueEmail() {
        return isUniqueEmail;
    }

    public void setIsUniqueEmail(Boolean isUniqueEmail) {
        this.isUniqueEmail = isUniqueEmail;
    }

    public Integer getMaxTransaction() {
        return maxTransaction;
    }

    public void setMaxTransaction(Integer maxTransaction) {
        this.maxTransaction = maxTransaction;
    }

    public String getWidgetCode() {
        return widgetCode;
    }

    public void setWidgetCode(String widgetCode) {
        this.widgetCode = widgetCode;
    }

    public String getWidgetUrl() {
        return widgetUrl;
    }

    public void setWidgetUrl(String widgetUrl) {
        this.widgetUrl = widgetUrl;
    }

    public Boolean getIsEnableInvitation() {
        return isEnableInvitation;
    }

    public void setIsEnableInvitation(Boolean isEnableInvitation) {
        this.isEnableInvitation = isEnableInvitation;
    }

    public Boolean getIsEnableCoupon() {
        return isEnableCoupon;
    }

    public void setIsEnableCoupon(Boolean isEnableCoupon) {
        this.isEnableCoupon = isEnableCoupon;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyPrefix() {
        return currencyPrefix;
    }

    public void setCurrencyPrefix(String currencyPrefix) {
        this.currencyPrefix = currencyPrefix;
    }

    public Integer getSeatingType() {
        return seatingType;
    }

    public void setSeatingType(Integer seatingType) {
        this.seatingType = seatingType;
    }

    public String getSeatingTypeName() {
        return seatingTypeName;
    }

    public void setSeatingTypeName(String seatingTypeName) {
        this.seatingTypeName = seatingTypeName;
    }

    public Integer getStatusGroup() {
        return statusGroup;
    }

    public void setStatusGroup(Integer statusGroup) {
        this.statusGroup = statusGroup;
    }

    public String getStatusGroupName() {
        return statusGroupName;
    }

    public void setStatusGroupName(String statusGroupName) {
        this.statusGroupName = statusGroupName;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public List<Object> getFees() {
        return fees;
    }

    public void setFees(List<Object> fees) {
        this.fees = fees;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public List<Object> getInstallments() {
        return installments;
    }

    public void setInstallments(List<Object> installments) {
        this.installments = installments;
    }


}
