package com.example.haris.eventlisting.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Payment {
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
    private Object paymentVendor;
    @SerializedName("payment_vendor_name")
    @Expose
    private Object paymentVendorName;
    @SerializedName("expired_time_invoice")
    @Expose
    private Integer expiredTimeInvoice;
    @SerializedName("expired_reminder")
    @Expose
    private Object expiredReminder;
    @SerializedName("payment_custom_percent")
    @Expose
    private Integer paymentCustomPercent;
    @SerializedName("payment_custom_nominal")
    @Expose
    private Integer paymentCustomNominal;
    @SerializedName("payment_info")
    @Expose
    private Object paymentInfo;
    @SerializedName("payment_info_ind")
    @Expose
    private Object paymentInfoInd;
    @SerializedName("payment_logo")
    @Expose
    private Object paymentLogo;
    @SerializedName("status_payment")
    @Expose
    private Integer statusPayment;
    @SerializedName("status_payment_name")
    @Expose
    private String statusPaymentName;
    @SerializedName("payment_custom")
    @Expose
    private Object paymentCustom;
    @SerializedName("childs")
    @Expose
    private List<Child> childs = null;

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

    public Object getPaymentVendor() {
        return paymentVendor;
    }

    public void setPaymentVendor(Object paymentVendor) {
        this.paymentVendor = paymentVendor;
    }

    public Object getPaymentVendorName() {
        return paymentVendorName;
    }

    public void setPaymentVendorName(Object paymentVendorName) {
        this.paymentVendorName = paymentVendorName;
    }

    public Integer getExpiredTimeInvoice() {
        return expiredTimeInvoice;
    }

    public void setExpiredTimeInvoice(Integer expiredTimeInvoice) {
        this.expiredTimeInvoice = expiredTimeInvoice;
    }

    public Object getExpiredReminder() {
        return expiredReminder;
    }

    public void setExpiredReminder(Object expiredReminder) {
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

    public Object getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(Object paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public Object getPaymentInfoInd() {
        return paymentInfoInd;
    }

    public void setPaymentInfoInd(Object paymentInfoInd) {
        this.paymentInfoInd = paymentInfoInd;
    }

    public Object getPaymentLogo() {
        return paymentLogo;
    }

    public void setPaymentLogo(Object paymentLogo) {
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

    public Object getPaymentCustom() {
        return paymentCustom;
    }

    public void setPaymentCustom(Object paymentCustom) {
        this.paymentCustom = paymentCustom;
    }

    public List<Child> getChilds() {
        return childs;
    }

    public void setChilds(List<Child> childs) {
        this.childs = childs;
    }

}
