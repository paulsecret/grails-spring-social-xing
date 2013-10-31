
package org.springframework.social.xing.api;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by json2pojo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WebProfiles {

  private List<String> qype;
  @JsonProperty("google_plus")
  private List<String> googlePlus;
  private List<String> blog;
  private List<String> homepage;


  public List<String> getQype() {
    return qype;
  }
  
  public void setQype(List<String> qype) {
    this.qype = qype;
  }

  public List<String> getGooglePlus() {
    return googlePlus;
  }
  
  public void setGooglePlus(List<String> googlePlus) {
    this.googlePlus = googlePlus;
  }

  public List<String> getBlog() {
    return blog;
  }
  
  public void setBlog(List<String> blog) {
    this.blog = blog;
  }

  public List<String> getHomepage() {
    return homepage;
  }
  
  public void setHomepage(List<String> homepage) {
    this.homepage = homepage;
  }

}
