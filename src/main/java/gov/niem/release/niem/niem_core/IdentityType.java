package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentityType", propOrder = {
  "identityCharacteristics",
  "identityCreationDate",
  "identityCreationEventText",
  "identityTerminationDate",
  "identityTerminationEventText",
  "identityAugmentationPoint"
})
public class IdentityType
  extends ObjectType {

  @XmlElement(name = "IdentityCharacteristics", nillable = true)
  protected List<PersonType> identityCharacteristics;
  @XmlElement(name = "IdentityCreationDate", nillable = true)
  protected List<DateType> identityCreationDate;
  @XmlElement(name = "IdentityCreationEventText", nillable = true)
  protected List<TextType> identityCreationEventText;
  @XmlElement(name = "IdentityTerminationDate", nillable = true)
  protected List<DateType> identityTerminationDate;
  @XmlElement(name = "IdentityTerminationEventText", nillable = true)
  protected List<TextType> identityTerminationEventText;
  @XmlElement(name = "IdentityAugmentationPoint")
  protected List<Object> identityAugmentationPoint;

  public List<PersonType> getIdentityCharacteristics() {
    if (identityCharacteristics == null) {
      identityCharacteristics = new ArrayList<PersonType>();
    }
    return this.identityCharacteristics;
  }

  public List<DateType> getIdentityCreationDate() {
    if (identityCreationDate == null) {
      identityCreationDate = new ArrayList<DateType>();
    }
    return this.identityCreationDate;
  }

  public List<TextType> getIdentityCreationEventText() {
    if (identityCreationEventText == null) {
      identityCreationEventText = new ArrayList<TextType>();
    }
    return this.identityCreationEventText;
  }

  public List<DateType> getIdentityTerminationDate() {
    if (identityTerminationDate == null) {
      identityTerminationDate = new ArrayList<DateType>();
    }
    return this.identityTerminationDate;
  }

  public List<TextType> getIdentityTerminationEventText() {
    if (identityTerminationEventText == null) {
      identityTerminationEventText = new ArrayList<TextType>();
    }
    return this.identityTerminationEventText;
  }

  public List<Object> getIdentityAugmentationPoint() {
    if (identityAugmentationPoint == null) {
      identityAugmentationPoint = new ArrayList<Object>();
    }
    return this.identityAugmentationPoint;
  }

}
