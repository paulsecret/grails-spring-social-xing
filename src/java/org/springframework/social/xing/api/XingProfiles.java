
package org.springframework.social.xing.api;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by json2pojo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class XingProfiles {

  private List<XingProfile> users;

  public List<XingProfile> getUsers() {
    return users;
  }
  
  public void setUsers(List<XingProfile> users) {
    this.users = users;
  }

}
