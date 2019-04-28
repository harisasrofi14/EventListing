package com.example.haris.eventlisting.model.Event;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Child {

    @SerializedName("id_list_payment")
    @Expose
    private Integer idListPayment;
    @SerializedName("id_parent_payment")
    @Expose
    private Integer idParentPayment;
    @SerializedName("payment_name")
    @Expose
    private String paymentName;
    @SerializedName("payment_type")
    @Expose
    private Integer paymentType;
    @SerializedName("payment_type_name")
    @Expose
    private String paymentTypeName;
    @SerializedName("installment_term")
    @Expose
    private Object installmentTerm;
    @SerializedName("payment_vendor")
    @Expose
    private Integer paymentVendor;
    @SerializedName("payment_vendor_name")
    @Expose
    private String paymentVendorName;
    @SerializedName("expired_time_invoice")
    @Expose
    private Integer expiredTimeInvoice;
    @SerializedName("expired_reminder")
    @Expose
    private Integer expiredReminder;
    @SerializedName("payment_custom_percent")
    @Expose
    private Integer paymentCustomPercent;
    @SerializedName("payment_custom_nominal")
    @Expose
    private Integer paymentCustomNominal;
    @SerializedName("payment_info")
    @Expose
    private String paymentInfo;
    @SerializedName("payment_info_ind")
    @Expose
    private String paymentInfoInd;
    @SerializedName("payment_logo")
    @Expose
    private String paymentLogo;
    @SerializedName("status_payment")
    @Expose
    private Integer statusPayment;
    @SerializedName("status_payment_name")
    @Expose
    private String statusPaymentName;
    @SerializedName("id_group")
    @Expose
    private Integer idGroup;
    @SerializedName("payment_custom")
    @Expose
    private Object paymentCustom;
    @SerializedName("childs")
    @Expose
    private List<Object> childs = null;

    public Integer getIdListPayment() {
        return idListPayment;
    }

    public void setIdListPayment(Integer idListPayment) {
        this.idListPayment = idListPayment;
    }

    public Integer getIdParentPayment() {
        return idParentPayment;
    }

    public void setIdParentPayment(Integer idParentPayment) {
        this.idParentPayment = idParentPayment;
    }

    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentTypeName() {
        return paymentTypeName;
    }

    public void setPaymentTypeName(String paymentTypeName) {
        this.paymentTypeName = paymentTypeName;
    }

    public Object getInstallmentTerm() {
        return installmentTerm;
    }

    public void setInstallmentTerm(Object installmentTerm) {
        this.installmentTerm = installmentTerm;
    }

    public Integer getPaymentVendor() {
        return paymentVendor;
    }

    public void setPaymentVendor(Integer paymentVendor) {
        this.paymentVendor = paymentVendor;
    }

    public String getPaymentVendorName() {
        return paymentVendorName;
    }

    public void setPaymentVendorName(String paymentVendorName) {
        this.paymentVendorName = paymentVendorName;
    }

    public Integer getExpiredTimeInvoice() {
        return expiredTimeInvoice;
    }

    public void setExpiredTimeInvoice(Integer expiredTimeInvoice) {
        this.expiredTimeInvoice = expiredTimeInvoice;
    }

    public Integer getExpiredReminder() {
        return expiredReminder;
    }

    public void setExpiredReminder(Integer expiredReminder) {
        this.expiredReminder = expiredReminder;
    }

    public Integer getPaymentCustomPercent() {
        return paymentCustomPercent;
    }

    public void setPaymentCustomPercent(Integer paymentCustomPercent) {
        this.paymentCustomPercent = paymentCustomPercent;
    }

    public Integer getPaymentCustomNominal() {
        return paymentCustomNominal;
    }

    public void setPaymentCustomNominal(Integer paymentCustomNominal) {
        this.paymentCustomNominal = paymentCustomNominal;
    }

    public String getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(String paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public String getPaymentInfoInd() {
        return paymentInfoInd;
    }

    public void setPaymentInfoInd(String paymentInfoInd) {
        this.paymentInfoInd = paymentInfoInd;
    }

    public String getPaymentLogo() {
        return paymentLogo;
    }

    public void setPaymentLogo(String paymentLogo) {
        this.paymentLogo = paymentLogo;
    }

    public Integer getStatusPayment() {
        return statusPayment;
    }

    public void setStatusPayment(Integer statusPayment) {
        this.statusPayment = statusPayment;
    }

    public String getStatusPaymentName() {
        return statusPaymentName;
    }

    public void setStatusPaymentName(String statusPaymentName) {
        this.statusPaymentName = statusPaymentName;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    public Object getPaymentCustom() {
        return paymentCustom;
    }

    public void setPaymentCustom(Object paymentCustom) {
        this.paymentCustom = paymentCustom;
    }

    public List<Object> getChilds() {
        return childs;
    }

    public void setChilds(List<Object> childs) {
        this.childs = childs;
    }

}

