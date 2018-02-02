package gov.niem.release.niem.niem_core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoftwareNameType")
public class SoftwareNameType
  extends TextType {

  @XmlAttribute(name = "softwareVersionText", namespace = "http://release.niem.gov/niem/niem-core/4.0/")
  protected String softwareVersionText;

  public String getSoftwareVersionText() {
    return softwareVersionText;
  }

  public void setSoftwareVersionText(String value) {
    this.softwareVersionText = value;
  }

}
