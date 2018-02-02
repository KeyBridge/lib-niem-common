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
@XmlType(name = "InstantMessengerType", propOrder = {
  "instantMessengerServiceName",
  "instantMessengerScreenID",
  "instantMessengerAugmentationPoint"
})
public class InstantMessengerType
  extends ObjectType {

  @XmlElement(name = "InstantMessengerServiceName", nillable = true)
  protected List<TextType> instantMessengerServiceName;
  @XmlElement(name = "InstantMessengerScreenID", nillable = true)
  protected List<String> instantMessengerScreenID;
  @XmlElement(name = "InstantMessengerAugmentationPoint")
  protected List<Object> instantMessengerAugmentationPoint;

  public List<TextType> getInstantMessengerServiceName() {
    if (instantMessengerServiceName == null) {
      instantMessengerServiceName = new ArrayList<TextType>();
    }
    return this.instantMessengerServiceName;
  }

  public List<String> getInstantMessengerScreenID() {
    if (instantMessengerScreenID == null) {
      instantMessengerScreenID = new ArrayList<String>();
    }
    return this.instantMessengerScreenID;
  }

  public List<Object> getInstantMessengerAugmentationPoint() {
    if (instantMessengerAugmentationPoint == null) {
      instantMessengerAugmentationPoint = new ArrayList<Object>();
    }
    return this.instantMessengerAugmentationPoint;
  }

}
