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
@XmlType(name = "ContactRadioType", propOrder = {
  "contactRadioCategoryText",
  "contactRadioChannelText",
  "contactRadioCallSignID",
  "contactRadioAugmentationPoint"
})
public class ContactRadioType
  extends ObjectType {

  @XmlElement(name = "ContactRadioCategoryText", nillable = true)
  protected List<TextType> contactRadioCategoryText;
  @XmlElement(name = "ContactRadioChannelText", nillable = true)
  protected List<TextType> contactRadioChannelText;
  @XmlElement(name = "ContactRadioCallSignID", nillable = true)
  protected List<String> contactRadioCallSignID;
  @XmlElement(name = "ContactRadioAugmentationPoint")
  protected List<Object> contactRadioAugmentationPoint;

  public List<TextType> getContactRadioCategoryText() {
    if (contactRadioCategoryText == null) {
      contactRadioCategoryText = new ArrayList<TextType>();
    }
    return this.contactRadioCategoryText;
  }

  public List<TextType> getContactRadioChannelText() {
    if (contactRadioChannelText == null) {
      contactRadioChannelText = new ArrayList<TextType>();
    }
    return this.contactRadioChannelText;
  }

  public List<String> getContactRadioCallSignID() {
    if (contactRadioCallSignID == null) {
      contactRadioCallSignID = new ArrayList<String>();
    }
    return this.contactRadioCallSignID;
  }

  public List<Object> getContactRadioAugmentationPoint() {
    if (contactRadioAugmentationPoint == null) {
      contactRadioAugmentationPoint = new ArrayList<Object>();
    }
    return this.contactRadioAugmentationPoint;
  }

}
