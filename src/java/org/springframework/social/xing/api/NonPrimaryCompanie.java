
package org.springframework.social.xing.api;


import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by json2pojo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class NonPrimaryCompanie {

  private String name;
  private String title;
  @JsonProperty("company_size")
  private Object companySize;
  private String tag;
  private Object url;
  @JsonProperty("career_level")
  private Object careerLevel;
  @JsonProperty("begin_date")
  private String beginDate;
  private Object description;
  @JsonProperty("end_date")
  private String endDate;
  private String industry;


  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }

  public Object getCompanySize() {
    return companySize;
  }
  
  public void setCompanySize(Object companySize) {
    this.companySize = companySize;
  }

  public String getTag() {
    return tag;
  }
  
  public void setTag(String tag) {
    this.tag = tag;
  }

  public Object getUrl() {
    return url;
  }
  
  public void setUrl(Object url) {
    this.url = url;
  }

  public Object getCareerLevel() {
    return careerLevel;
  }
  
  public void setCareerLevel(Object careerLevel) {
    this.careerLevel = careerLevel;
  }

  public String getBeginDate() {
    return beginDate;
  }
  
  public void setBeginDate(String beginDate) {
    this.beginDate = beginDate;
  }

  public Object getDescription() {
    return description;
  }
  
  public void setDescription(Object description) {
    this.description = description;
  }

  public String getEndDate() {
    return endDate;
  }
  
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public String getIndustry() {
    return industry;
  }
  
  public void setIndustry(String industry) {
    this.industry = industry;
  }

}
