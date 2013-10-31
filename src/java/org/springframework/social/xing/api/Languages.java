
package org.springframework.social.xing.api;




import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by json2pojo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Languages {

  private String de;
  private String en;
  private Object fr;
  private String zh;


  public String getDe() {
    return de;
  }
  
  public void setDe(String de) {
    this.de = de;
  }

  public String getEn() {
    return en;
  }
  
  public void setEn(String en) {
    this.en = en;
  }

  public Object getFr() {
    return fr;
  }
  
  public void setFr(Object fr) {
    this.fr = fr;
  }

  public String getZh() {
    return zh;
  }
  
  public void setZh(String zh) {
    this.zh = zh;
  }

}
