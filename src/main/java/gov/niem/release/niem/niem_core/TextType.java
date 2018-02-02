package gov.niem.release.niem.niem_core;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextType")
@XmlSeeAlso({
  ProperNameTextType.class,
  SoftwareNameType.class
})
public class TextType
  extends gov.niem.release.niem.proxy.xsd.String {

  @XmlAttribute(name = "partialIndicator", namespace = "http://release.niem.gov/niem/niem-core/4.0/")
  protected Boolean partialIndicator;
  @XmlAttribute(name = "truncationIndicator", namespace = "http://release.niem.gov/niem/niem-core/4.0/")
  protected Boolean truncationIndicator;
  @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
  protected java.lang.String lang;

  public Boolean isPartialIndicator() {
    return partialIndicator;
  }

  public void setPartialIndicator(Boolean value) {
    this.partialIndicator = value;
  }

  public Boolean isTruncationIndicator() {
    return truncationIndicator;
  }

  public void setTruncationIndicator(Boolean value) {
    this.truncationIndicator = value;
  }

  public java.lang.String getLang() {
    return lang;
  }

  public void setLang(java.lang.String value) {
    this.lang = value;
  }

}
