
package org.springframework.social.xing.api;


import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by json2pojo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BusinessAddress {

  private String city;
  private String country;
  @JsonProperty("zip_code")
  private String zipCode;
  private String street;
  private String phone;
  private String fax;
  private String province;
  private String email;
  @JsonProperty("mobile_phone")
  private String mobilePhone;


  public String getCity() {
    return city;
  }
  
  public void setCity(String city) {
    this.city = city;
  }

  public String getCountry() {
    return country;
  }
  
  public void setCountry(String country) {
    this.country = country;
  }

  public String getZipCode() {
    return zipCode;
  }
  
  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public String getStreet() {
    return street;
  }
  
  public void setStreet(String street) {
    this.street = street;
  }

  public String getPhone() {
    return phone;
  }
  
  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getFax() {
    return fax;
  }
  
  public void setFax(String fax) {
    this.fax = fax;
  }

  public String getProvince() {
    return province;
  }
  
  public void setProvince(String province) {
    this.province = province;
  }

  public String getEmail() {
    return email;
  }
  
  public void setEmail(String email) {
    this.email = email;
  }

  public String getMobilePhone() {
    return mobilePhone;
  }
  
  public void setMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
  }

}
