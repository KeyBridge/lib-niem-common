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
@XmlType(name = "InternationalTelephoneNumberType", propOrder = {
  "telephoneCountryCodeID",
  "telephoneNumberID",
  "telephoneSuffixID",
  "internationalTelephoneNumberAugmentationPoint"
})
public class InternationalTelephoneNumberType
  extends ObjectType {

  @XmlElement(name = "TelephoneCountryCodeID", nillable = true)
  protected List<String> telephoneCountryCodeID;
  @XmlElement(name = "TelephoneNumberID", nillable = true)
  protected List<String> telephoneNumberID;
  @XmlElement(name = "TelephoneSuffixID", nillable = true)
  protected List<String> telephoneSuffixID;
  @XmlElement(name = "InternationalTelephoneNumberAugmentationPoint")
  protected List<Object> internationalTelephoneNumberAugmentationPoint;

  public List<String> getTelephoneCountryCodeID() {
    if (telephoneCountryCodeID == null) {
      telephoneCountryCodeID = new ArrayList<String>();
    }
    return this.telephoneCountryCodeID;
  }

  public List<String> getTelephoneNumberID() {
    if (telephoneNumberID == null) {
      telephoneNumberID = new ArrayList<String>();
    }
    return this.telephoneNumberID;
  }

  public List<String> getTelephoneSuffixID() {
    if (telephoneSuffixID == null) {
      telephoneSuffixID = new ArrayList<String>();
    }
    return this.telephoneSuffixID;
  }

  public List<Object> getInternationalTelephoneNumberAugmentationPoint() {
    if (internationalTelephoneNumberAugmentationPoint == null) {
      internationalTelephoneNumberAugmentationPoint = new ArrayList<Object>();
    }
    return this.internationalTelephoneNumberAugmentationPoint;
  }

}
