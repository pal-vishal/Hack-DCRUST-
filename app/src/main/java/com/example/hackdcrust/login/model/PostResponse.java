package com.example.hackdcrust.login.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class PostResponse {

    @SerializedName("skills")
    @Expose
    private List<String> skills = new ArrayList<>();
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("isEmployee")
    @Expose
    private Boolean isEmployee;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("phone")
    @Expose
    private Long phone;
    @SerializedName("district")
    @Expose
    private String district;
    @SerializedName("pincode")
    @Expose
    private Integer pincode;
    @SerializedName("uid")
    @Expose
    private String uid;
    @SerializedName("__v")
    @Expose
    private Integer v;

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsEmployee() {
        return isEmployee;
    }

    public void setIsEmployee(Boolean isEmployee) {
        this.isEmployee = isEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public PostResponse(List<String> skills, String id, Boolean isEmployee, String name, Long phone, String district, Integer pincode, String uid, Integer v) {
        this.skills = skills;
        this.id = id;
        this.isEmployee = isEmployee;
        this.name = name;
        this.phone = phone;
        this.district = district;
        this.pincode = pincode;
        this.uid = uid;
        this.v = v;
    }
}