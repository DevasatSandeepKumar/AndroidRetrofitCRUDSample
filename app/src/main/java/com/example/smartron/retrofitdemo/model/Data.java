
package com.example.smartron.retrofitdemo.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("realm")
    @Expose
    private String realm;
    @SerializedName("userId")
    @Expose
    private String userId;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("secondaryEmail")
    @Expose
    private Object secondaryEmail;
    @SerializedName("phoneNumber")
    @Expose
    private Object phoneNumber;
    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("profilePicEncodeFormat")
    @Expose
    private Object profilePicEncodeFormat;
    @SerializedName("profilePic")
    @Expose
    private Object profilePic;
    @SerializedName("stridelength")
    @Expose
    private Object stridelength;
    @SerializedName("tbands")
    @Expose
    private List<Object> tbands = null;
    @SerializedName("global_version")
    @Expose
    private Integer globalVersion;
    @SerializedName("height")
    @Expose
    private Object height;
    @SerializedName("quota_used_bytes")
    @Expose
    private Integer quotaUsedBytes;
    @SerializedName("dateOfBirth")
    @Expose
    private Object dateOfBirth;
    @SerializedName("weight")
    @Expose
    private Object weight;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealm() {
        return realm;
    }

    public void setRealm(String realm) {
        this.realm = realm;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Object getSecondaryEmail() {
        return secondaryEmail;
    }

    public void setSecondaryEmail(Object secondaryEmail) {
        this.secondaryEmail = secondaryEmail;
    }

    public Object getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Object phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Object getProfilePicEncodeFormat() {
        return profilePicEncodeFormat;
    }

    public void setProfilePicEncodeFormat(Object profilePicEncodeFormat) {
        this.profilePicEncodeFormat = profilePicEncodeFormat;
    }

    public Object getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(Object profilePic) {
        this.profilePic = profilePic;
    }

    public Object getStridelength() {
        return stridelength;
    }

    public void setStridelength(Object stridelength) {
        this.stridelength = stridelength;
    }

    public List<Object> getTbands() {
        return tbands;
    }

    public void setTbands(List<Object> tbands) {
        this.tbands = tbands;
    }

    public Integer getGlobalVersion() {
        return globalVersion;
    }

    public void setGlobalVersion(Integer globalVersion) {
        this.globalVersion = globalVersion;
    }

    public Object getHeight() {
        return height;
    }

    public void setHeight(Object height) {
        this.height = height;
    }

    public Integer getQuotaUsedBytes() {
        return quotaUsedBytes;
    }

    public void setQuotaUsedBytes(Integer quotaUsedBytes) {
        this.quotaUsedBytes = quotaUsedBytes;
    }

    public Object getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Object dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Object getWeight() {
        return weight;
    }

    public void setWeight(Object weight) {
        this.weight = weight;
    }

}
