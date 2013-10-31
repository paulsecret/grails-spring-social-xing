
package org.springframework.social.xing.api;


import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by json2pojo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class School {

  private String name;
  private String degree;
  private Object notes;
  private Object subject;
  @JsonProperty("begin_date")
  private String beginDate;
  @JsonProperty("end_date")
  private String endDate;


  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  public String getDegree() {
    return degree;
  }
  
  public void setDegree(String degree) {
    this.degree = degree;
  }

  public Object getNotes() {
    return notes;
  }
  
  public void setNotes(Object notes) {
    this.notes = notes;
  }

  public Object getSubject() {
    return subject;
  }
  
  public void setSubject(Object subject) {
    this.subject = subject;
  }

  public String getBeginDate() {
    return beginDate;
  }
  
  public void setBeginDate(String beginDate) {
    this.beginDate = beginDate;
  }

  public String getEndDate() {
    return endDate;
  }
  
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

}
