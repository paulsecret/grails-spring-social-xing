
package org.springframework.social.xing.api;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by json2pojo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class XingProfile {

  private String id;
  @JsonProperty("first_name")
  private String firstName;
  @JsonProperty("last_name")
  private String lastName;
  @JsonProperty("display_name")
  private String displayName;
  @JsonProperty("page_name")
  private String pageName;
  private String permalink;
  @JsonProperty("employment_status")
  private String employmentStatus;
  private String gender;
  @JsonProperty("birth_date")
  private BirthDate birthDate;
  @JsonProperty("active_email")
  private String activeEmail;
  @JsonProperty("time_zone")
  private TimeZone timeZone;
  @JsonProperty("premium_services")
  private List<String> premiumServices;
  private List<String> badges;
  private String wants;
  private String haves;
  private String interests;
  @JsonProperty("organisation_member")
  private String organisationMember;
  private Languages languages;
  @JsonProperty("private_address")
  private PrivateAddress privateAddress;
  @JsonProperty("business_address")
  private BusinessAddress businessAddress;
  @JsonProperty("web_profiles")
  private WebProfiles webProfiles;
  @JsonProperty("instant_messaging_accounts")
  private InstantMessagingAccounts instantMessagingAccounts;
  @JsonProperty("professional_experience")
  private ProfessionalExperience professionalExperience;
  @JsonProperty("educational_background")
  private EducationalBackground educationalBackground;
  @JsonProperty("photo_urls")
  private PhotoUrls photoUrls;


  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }
  
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }
  
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getDisplayName() {
    return displayName;
  }
  
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public String getPageName() {
    return pageName;
  }
  
  public void setPageName(String pageName) {
    this.pageName = pageName;
  }

  public String getPermalink() {
    return permalink;
  }
  
  public void setPermalink(String permalink) {
    this.permalink = permalink;
  }

  public String getEmploymentStatus() {
    return employmentStatus;
  }
  
  public void setEmploymentStatus(String employmentStatus) {
    this.employmentStatus = employmentStatus;
  }

  public String getGender() {
    return gender;
  }
  
  public void setGender(String gender) {
    this.gender = gender;
  }

  public BirthDate getBirthDate() {
    return birthDate;
  }
  
  public void setBirthDate(BirthDate birthDate) {
    this.birthDate = birthDate;
  }

  public String getActiveEmail() {
    return activeEmail;
  }
  
  public void setActiveEmail(String activeEmail) {
    this.activeEmail = activeEmail;
  }

  public TimeZone getTimeZone() {
    return timeZone;
  }
  
  public void setTimeZone(TimeZone timeZone) {
    this.timeZone = timeZone;
  }

  public List<String> getPremiumServices() {
    return premiumServices;
  }
  
  public void setPremiumServices(List<String> premiumServices) {
    this.premiumServices = premiumServices;
  }

  public List<String> getBadges() {
    return badges;
  }
  
  public void setBadges(List<String> badges) {
    this.badges = badges;
  }

  public String getWants() {
    return wants;
  }
  
  public void setWants(String wants) {
    this.wants = wants;
  }

  public String getHaves() {
    return haves;
  }
  
  public void setHaves(String haves) {
    this.haves = haves;
  }

  public String getInterests() {
    return interests;
  }
  
  public void setInterests(String interests) {
    this.interests = interests;
  }

  public String getOrganisationMember() {
    return organisationMember;
  }
  
  public void setOrganisationMember(String organisationMember) {
    this.organisationMember = organisationMember;
  }

  public Languages getLanguages() {
    return languages;
  }
  
  public void setLanguages(Languages languages) {
    this.languages = languages;
  }

  public PrivateAddress getPrivateAddress() {
    return privateAddress;
  }
  
  public void setPrivateAddress(PrivateAddress privateAddress) {
    this.privateAddress = privateAddress;
  }

  public BusinessAddress getBusinessAddress() {
    return businessAddress;
  }
  
  public void setBusinessAddress(BusinessAddress businessAddress) {
    this.businessAddress = businessAddress;
  }

  public WebProfiles getWebProfiles() {
    return webProfiles;
  }
  
  public void setWebProfiles(WebProfiles webProfiles) {
    this.webProfiles = webProfiles;
  }

  public InstantMessagingAccounts getInstantMessagingAccounts() {
    return instantMessagingAccounts;
  }
  
  public void setInstantMessagingAccounts(InstantMessagingAccounts instantMessagingAccounts) {
    this.instantMessagingAccounts = instantMessagingAccounts;
  }

  public ProfessionalExperience getProfessionalExperience() {
    return professionalExperience;
  }
  
  public void setProfessionalExperience(ProfessionalExperience professionalExperience) {
    this.professionalExperience = professionalExperience;
  }

  public EducationalBackground getEducationalBackground() {
    return educationalBackground;
  }
  
  public void setEducationalBackground(EducationalBackground educationalBackground) {
    this.educationalBackground = educationalBackground;
  }

  public PhotoUrls getPhotoUrls() {
    return photoUrls;
  }
  
  public void setPhotoUrls(PhotoUrls photoUrls) {
    this.photoUrls = photoUrls;
  }

}
