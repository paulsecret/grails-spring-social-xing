
package org.springframework.social.xing.api;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by json2pojo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EducationalBackground {

  private List<School> schools;
  private List<String> qualifications;


  public List<School> getSchools() {
    return schools;
  }
  
  public void setSchools(List<School> schools) {
    this.schools = schools;
  }

  public List<String> getQualifications() {
    return qualifications;
  }
  
  public void setQualifications(List<String> qualifications) {
    this.qualifications = qualifications;
  }

}
