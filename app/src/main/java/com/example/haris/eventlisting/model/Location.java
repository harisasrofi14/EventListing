package com.example.haris.eventlisting.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Location {
    @SerializedName("id_location")
    @Expose
    private Integer idLocation;
    @SerializedName("location_name")
    @Expose
    private String locationName;
    @SerializedName("id_country")
    @Expose
    private Integer idCountry;
    @SerializedName("country_name")
    @Expose
    private String countryName;
    @SerializedName("id_province")
    @Expose
    private Integer idProvince;
    @SerializedName("province_name")
    @Expose
    private String provinceName;
    @SerializedName("id_district")
    @Expose
    private Integer idDistrict;
    @SerializedName("district_name")
    @Expose
    private String districtName;
    @SerializedName("id_region")
    @Expose
    private Integer idRegion;
    @SerializedName("region_name")
    @Expose
    private String regionName;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("postal_code")
    @Expose
    private String postalCode;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("status_location")
    @Expose
    private Integer statusLocation;
    @SerializedName("status_location_name")
    @Expose
    private String statusLocationName;

    public Integer getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(Integer idLocation) {
        this.idLocation = idLocation;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public Integer getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Integer idCountry) {
        this.idCountry = idCountry;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Integer getIdProvince() {
        return idProvince;
    }

    public void setIdProvince(Integer idProvince) {
        this.idProvince = idProvince;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Integer getIdDistrict() {
        return idDistrict;
    }

    public void setIdDistrict(Integer idDistrict) {
        this.idDistrict = idDistrict;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public Integer getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(Integer idRegion) {
        this.idRegion = idRegion;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getStatusLocation() {
        return statusLocation;
    }

    public void setStatusLocation(Integer statusLocation) {
        this.statusLocation = statusLocation;
    }

    public String getStatusLocationName() {
        return statusLocationName;
    }

    public void setStatusLocationName(String statusLocationName) {
        this.statusLocationName = statusLocationName;
    }
}
