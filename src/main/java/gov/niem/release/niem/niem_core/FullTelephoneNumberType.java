package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.String;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FullTelephoneNumberType", propOrder = {
  "telephoneNumberFullID",
  "telephoneSuffixID",
  "fullTelephoneNumberAugmentationPoint"
})
public class FullTelephoneNumberType
  extends ObjectType {

  @XmlElement(name = "TelephoneNumberFullID", nillable = true)
  protected List<String> telephoneNumberFullID;
  @XmlElement(name = "TelephoneSuffixID", nillable = true)
  protected List<String> telephoneSuffixID;
  @XmlElement(name = "FullTelephoneNumberAugmentationPoint")
  protected List<Object> fullTelephoneNumberAugmentationPoint;

  public List<String> getTelephoneNumberFullID() {
    if (telephoneNumberFullID == null) {
      telephoneNumberFullID = new ArrayList<String>();
    }
    return this.telephoneNumberFullID;
  }

  public List<String> getTelephoneSuffixID() {
    if (telephoneSuffixID == null) {
      telephoneSuffixID = new ArrayList<String>();
    }
    return this.telephoneSuffixID;
  }

  public List<Object> getFullTelephoneNumberAugmentationPoint() {
    if (fullTelephoneNumberAugmentationPoint == null) {
      fullTelephoneNumberAugmentationPoint = new ArrayList<Object>();
    }
    return this.fullTelephoneNumberAugmentationPoint;
  }

}
