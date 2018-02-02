package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.Boolean;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonDisunionType", propOrder = {
  "personDisunionDecreeIndicator",
  "personDisunionPendingIndicator",
  "personDisunionReasonText",
  "personDisunionAugmentationPoint"
})
public class PersonDisunionType
  extends ActivityType {

  @XmlElement(name = "PersonDisunionDecreeIndicator", nillable = true)
  protected List<Boolean> personDisunionDecreeIndicator;
  @XmlElement(name = "PersonDisunionPendingIndicator", nillable = true)
  protected List<Boolean> personDisunionPendingIndicator;
  @XmlElement(name = "PersonDisunionReasonText", nillable = true)
  protected List<TextType> personDisunionReasonText;
  @XmlElement(name = "PersonDisunionAugmentationPoint")
  protected List<Object> personDisunionAugmentationPoint;

  public List<Boolean> getPersonDisunionDecreeIndicator() {
    if (personDisunionDecreeIndicator == null) {
      personDisunionDecreeIndicator = new ArrayList<Boolean>();
    }
    return this.personDisunionDecreeIndicator;
  }

  public List<Boolean> getPersonDisunionPendingIndicator() {
    if (personDisunionPendingIndicator == null) {
      personDisunionPendingIndicator = new ArrayList<Boolean>();
    }
    return this.personDisunionPendingIndicator;
  }

  public List<TextType> getPersonDisunionReasonText() {
    if (personDisunionReasonText == null) {
      personDisunionReasonText = new ArrayList<TextType>();
    }
    return this.personDisunionReasonText;
  }

  public List<Object> getPersonDisunionAugmentationPoint() {
    if (personDisunionAugmentationPoint == null) {
      personDisunionAugmentationPoint = new ArrayList<Object>();
    }
    return this.personDisunionAugmentationPoint;
  }

}
