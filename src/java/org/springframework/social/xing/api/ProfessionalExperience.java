
package org.springframework.social.xing.api;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by json2pojo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProfessionalExperience {

  @JsonProperty("primary_company")
  private PrimaryCompany primaryCompany;
  @JsonProperty("non_primary_companies")
  private List<NonPrimaryCompanie> nonPrimaryCompanies;
  private List<Award> awards;


  public PrimaryCompany getPrimaryCompany() {
    return primaryCompany;
  }
  
  public void setPrimaryCompany(PrimaryCompany primaryCompany) {
    this.primaryCompany = primaryCompany;
  }

  public List<NonPrimaryCompanie> getNonPrimaryCompanies() {
    return nonPrimaryCompanies;
  }
  
  public void setNonPrimaryCompanies(List<NonPrimaryCompanie> nonPrimaryCompanies) {
    this.nonPrimaryCompanies = nonPrimaryCompanies;
  }

  public List<Award> getAwards() {
    return awards;
  }
  
  public void setAwards(List<Award> awards) {
    this.awards = awards;
  }

}
