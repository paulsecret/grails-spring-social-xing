
package org.springframework.social.xing.api;


import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by json2pojo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TimeZone {

  private String name;
  @JsonProperty("utc_offset")
  private Double utcOffset;


  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  public Double getUtcOffset() {
    return utcOffset;
  }
  
  public void setUtcOffset(Double utcOffset) {
    this.utcOffset = utcOffset;
  }

}
