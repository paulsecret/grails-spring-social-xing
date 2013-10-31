
package org.springframework.social.xing.api;




import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by json2pojo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InstantMessagingAccounts {

  private String skype;
  private String googletalk;


  public String getSkype() {
    return skype;
  }
  
  public void setSkype(String skype) {
    this.skype = skype;
  }

  public String getGoogletalk() {
    return googletalk;
  }
  
  public void setGoogletalk(String googletalk) {
    this.googletalk = googletalk;
  }

}
