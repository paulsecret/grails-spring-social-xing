
package org.springframework.social.xing.api;


import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by json2pojo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PhotoUrls {

  private String large;
  @JsonProperty("mini_thumb")
  private String miniThumb;
  private String thumb;
  @JsonProperty("medium_thumb")
  private String mediumThumb;
  @JsonProperty("maxi_thumb")
  private String maxiThumb;


  public String getLarge() {
    return large;
  }
  
  public void setLarge(String large) {
    this.large = large;
  }

  public String getMiniThumb() {
    return miniThumb;
  }
  
  public void setMiniThumb(String miniThumb) {
    this.miniThumb = miniThumb;
  }

  public String getThumb() {
    return thumb;
  }
  
  public void setThumb(String thumb) {
    this.thumb = thumb;
  }

  public String getMediumThumb() {
    return mediumThumb;
  }
  
  public void setMediumThumb(String mediumThumb) {
    this.mediumThumb = mediumThumb;
  }

  public String getMaxiThumb() {
    return maxiThumb;
  }
  
  public void setMaxiThumb(String maxiThumb) {
    this.maxiThumb = maxiThumb;
  }

}
