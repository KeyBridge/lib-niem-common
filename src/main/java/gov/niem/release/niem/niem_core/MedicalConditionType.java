package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.Boolean;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicalConditionType", propOrder = {
  "medicalConditionDoctor",
  "medicalConditionText",
  "medicalConditionCauseText",
  "medicalConditionDescriptionText",
  "medicalConditionPresentIndicator",
  "medicalConditionSeverityText",
  "medicalConditionDateRange",
  "medicalConditionAugmentationPoint"
})
public class MedicalConditionType
  extends ObjectType {

  @XmlElement(name = "MedicalConditionDoctor", nillable = true)
  protected List<PersonType> medicalConditionDoctor;
  @XmlElement(name = "MedicalConditionText", nillable = true)
  protected List<TextType> medicalConditionText;
  @XmlElement(name = "MedicalConditionCauseText", nillable = true)
  protected List<TextType> medicalConditionCauseText;
  @XmlElement(name = "MedicalConditionDescriptionText", nillable = true)
  protected List<TextType> medicalConditionDescriptionText;
  @XmlElement(name = "MedicalConditionPresentIndicator", nillable = true)
  protected List<Boolean> medicalConditionPresentIndicator;
  @XmlElement(name = "MedicalConditionSeverityText", nillable = true)
  protected List<TextType> medicalConditionSeverityText;
  @XmlElement(name = "MedicalConditionDateRange", nillable = true)
  protected List<DateRangeType> medicalConditionDateRange;
  @XmlElement(name = "MedicalConditionAugmentationPoint")
  protected List<Object> medicalConditionAugmentationPoint;

  public List<PersonType> getMedicalConditionDoctor() {
    if (medicalConditionDoctor == null) {
      medicalConditionDoctor = new ArrayList<PersonType>();
    }
    return this.medicalConditionDoctor;
  }

  public List<TextType> getMedicalConditionText() {
    if (medicalConditionText == null) {
      medicalConditionText = new ArrayList<TextType>();
    }
    return this.medicalConditionText;
  }

  public List<TextType> getMedicalConditionCauseText() {
    if (medicalConditionCauseText == null) {
      medicalConditionCauseText = new ArrayList<TextType>();
    }
    return this.medicalConditionCauseText;
  }

  public List<TextType> getMedicalConditionDescriptionText() {
    if (medicalConditionDescriptionText == null) {
      medicalConditionDescriptionText = new ArrayList<TextType>();
    }
    return this.medicalConditionDescriptionText;
  }

  public List<Boolean> getMedicalConditionPresentIndicator() {
    if (medicalConditionPresentIndicator == null) {
      medicalConditionPresentIndicator = new ArrayList<Boolean>();
    }
    return this.medicalConditionPresentIndicator;
  }

  public List<TextType> getMedicalConditionSeverityText() {
    if (medicalConditionSeverityText == null) {
      medicalConditionSeverityText = new ArrayList<TextType>();
    }
    return this.medicalConditionSeverityText;
  }

  public List<DateRangeType> getMedicalConditionDateRange() {
    if (medicalConditionDateRange == null) {
      medicalConditionDateRange = new ArrayList<DateRangeType>();
    }
    return this.medicalConditionDateRange;
  }

  public List<Object> getMedicalConditionAugmentationPoint() {
    if (medicalConditionAugmentationPoint == null) {
      medicalConditionAugmentationPoint = new ArrayList<Object>();
    }
    return this.medicalConditionAugmentationPoint;
  }

}
