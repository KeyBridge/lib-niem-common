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
@XmlType(name = "DirectDialTelephoneNumberType", propOrder = {
  "directDialTelephoneNetworkText",
  "directDialTelephoneNumberID",
  "directDialTelephoneNumberAugmentationPoint"
})
public class DirectDialTelephoneNumberType
  extends ObjectType {

  @XmlElement(name = "DirectDialTelephoneNetworkText", nillable = true)
  protected List<TextType> directDialTelephoneNetworkText;
  @XmlElement(name = "DirectDialTelephoneNumberID", nillable = true)
  protected List<String> directDialTelephoneNumberID;
  @XmlElement(name = "DirectDialTelephoneNumberAugmentationPoint")
  protected List<Object> directDialTelephoneNumberAugmentationPoint;

  public List<TextType> getDirectDialTelephoneNetworkText() {
    if (directDialTelephoneNetworkText == null) {
      directDialTelephoneNetworkText = new ArrayList<TextType>();
    }
    return this.directDialTelephoneNetworkText;
  }

  public List<String> getDirectDialTelephoneNumberID() {
    if (directDialTelephoneNumberID == null) {
      directDialTelephoneNumberID = new ArrayList<String>();
    }
    return this.directDialTelephoneNumberID;
  }

  public List<Object> getDirectDialTelephoneNumberAugmentationPoint() {
    if (directDialTelephoneNumberAugmentationPoint == null) {
      directDialTelephoneNumberAugmentationPoint = new ArrayList<Object>();
    }
    return this.directDialTelephoneNumberAugmentationPoint;
  }

}
