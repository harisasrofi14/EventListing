package com.example.haris.eventlisting.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Ticket {

    @SerializedName("id_ticket")
    @Expose
    private Integer idTicket;
    @SerializedName("id_ticket_type")
    @Expose
    private Integer idTicketType;
    @SerializedName("ticket_type")
    @Expose
    private String ticketType;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("start_sale")
    @Expose
    private String startSale;
    @SerializedName("end_sale")
    @Expose
    private String endSale;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("quantity")
    @Expose
    private Integer quantity;
    @SerializedName("available")
    @Expose
    private Boolean available;
    @SerializedName("available_qty")
    @Expose
    private Integer availableQty;
    @SerializedName("ticket_seating_chart")
    @Expose
    private Boolean ticketSeatingChart;
    @SerializedName("ticket_color")
    @Expose
    private Object ticketColor;
    @SerializedName("hold_end_date")
    @Expose
    private Object holdEndDate;
    @SerializedName("hold_message")
    @Expose
    private Object holdMessage;
    @SerializedName("status_ticket")
    @Expose
    private Integer statusTicket;
    @SerializedName("status_ticket_name")
    @Expose
    private String statusTicketName;
    @SerializedName("tags")
    @Expose
    private List<Object> tags = null;
    @SerializedName("max_buy_qty")
    @Expose
    private Integer maxBuyQty;

    public Integer getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(Integer idTicket) {
        this.idTicket = idTicket;
    }

    public Integer getIdTicketType() {
        return idTicketType;
    }

    public void setIdTicketType(Integer idTicketType) {
        this.idTicketType = idTicketType;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public String getStartSale() {
        return startSale;
    }

    public void setStartSale(String startSale) {
        this.startSale = startSale;
    }

    public String getEndSale() {
        return endSale;
    }

    public void setEndSale(String endSale) {
        this.endSale = endSale;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Integer getAvailableQty() {
        return availableQty;
    }

    public void setAvailableQty(Integer availableQty) {
        this.availableQty = availableQty;
    }

    public Boolean getTicketSeatingChart() {
        return ticketSeatingChart;
    }

    public void setTicketSeatingChart(Boolean ticketSeatingChart) {
        this.ticketSeatingChart = ticketSeatingChart;
    }

    public Object getTicketColor() {
        return ticketColor;
    }

    public void setTicketColor(Object ticketColor) {
        this.ticketColor = ticketColor;
    }

    public Object getHoldEndDate() {
        return holdEndDate;
    }

    public void setHoldEndDate(Object holdEndDate) {
        this.holdEndDate = holdEndDate;
    }

    public Object getHoldMessage() {
        return holdMessage;
    }

    public void setHoldMessage(Object holdMessage) {
        this.holdMessage = holdMessage;
    }

    public Integer getStatusTicket() {
        return statusTicket;
    }

    public void setStatusTicket(Integer statusTicket) {
        this.statusTicket = statusTicket;
    }

    public String getStatusTicketName() {
        return statusTicketName;
    }

    public void setStatusTicketName(String statusTicketName) {
        this.statusTicketName = statusTicketName;
    }

    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public Integer getMaxBuyQty() {
        return maxBuyQty;
    }

    public void setMaxBuyQty(Integer maxBuyQty) {
        this.maxBuyQty = maxBuyQty;
    }

}
