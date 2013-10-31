
package org.springframework.social.xing.api;


import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by json2pojo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Award {

  private String name;
  @JsonProperty("date_awarded")
  private Long dateAwarded;
  private Object url;


  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  public Long getDateAwarded() {
    return dateAwarded;
  }
  
  public void setDateAwarded(Long dateAwarded) {
    this.dateAwarded = dateAwarded;
  }

  public Object getUrl() {
    return url;
  }
  
  public void setUrl(Object url) {
    this.url = url;
  }

}
