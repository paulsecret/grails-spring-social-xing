
package org.springframework.social.xing.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by json2pojo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BirthDate {

  private Long day;
  private Long month;
  private Long year;


  public Long getDay() {
    return day;
  }
  
  public void setDay(Long day) {
    this.day = day;
  }

  public Long getMonth() {
    return month;
  }
  
  public void setMonth(Long month) {
    this.month = month;
  }

  public Long getYear() {
    return year;
  }
  
  public void setYear(Long year) {
    this.year = year;
  }

}
