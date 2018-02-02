package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.Boolean;
import gov.niem.release.niem.proxy.xsd.String;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionType", propOrder = {
  "conditionGroupID",
  "conditionSetDate",
  "conditionDisciplinaryAction",
  "conditionMandatoryIndicator",
  "conditionViolatedIndicator",
  "conditionViolationText",
  "conditionViolationDate",
  "conditionAugmentationPoint"
})
public class ConditionType
  extends ActivityType {

  @XmlElement(name = "ConditionGroupID", nillable = true)
  protected List<String> conditionGroupID;
  @XmlElement(name = "ConditionSetDate", nillable = true)
  protected List<DateType> conditionSetDate;
  @XmlElement(name = "ConditionDisciplinaryAction", nillable = true)
  protected List<DisciplinaryActionType> conditionDisciplinaryAction;
  @XmlElement(name = "ConditionMandatoryIndicator", nillable = true)
  protected List<Boolean> conditionMandatoryIndicator;
  @XmlElement(name = "ConditionViolatedIndicator", nillable = true)
  protected List<Boolean> conditionViolatedIndicator;
  @XmlElement(name = "ConditionViolationText", nillable = true)
  protected List<TextType> conditionViolationText;
  @XmlElement(name = "ConditionViolationDate", nillable = true)
  protected List<DateType> conditionViolationDate;
  @XmlElement(name = "ConditionAugmentationPoint")
  protected List<Object> conditionAugmentationPoint;

  public List<String> getConditionGroupID() {
    if (conditionGroupID == null) {
      conditionGroupID = new ArrayList<String>();
    }
    return this.conditionGroupID;
  }

  public List<DateType> getConditionSetDate() {
    if (conditionSetDate == null) {
      conditionSetDate = new ArrayList<DateType>();
    }
    return this.conditionSetDate;
  }

  public List<DisciplinaryActionType> getConditionDisciplinaryAction() {
    if (conditionDisciplinaryAction == null) {
      conditionDisciplinaryAction = new ArrayList<DisciplinaryActionType>();
    }
    return this.conditionDisciplinaryAction;
  }

  public List<Boolean> getConditionMandatoryIndicator() {
    if (conditionMandatoryIndicator == null) {
      conditionMandatoryIndicator = new ArrayList<Boolean>();
    }
    return this.conditionMandatoryIndicator;
  }

  public List<Boolean> getConditionViolatedIndicator() {
    if (conditionViolatedIndicator == null) {
      conditionViolatedIndicator = new ArrayList<Boolean>();
    }
    return this.conditionViolatedIndicator;
  }

  public List<TextType> getConditionViolationText() {
    if (conditionViolationText == null) {
      conditionViolationText = new ArrayList<TextType>();
    }
    return this.conditionViolationText;
  }

  public List<DateType> getConditionViolationDate() {
    if (conditionViolationDate == null) {
      conditionViolationDate = new ArrayList<DateType>();
    }
    return this.conditionViolationDate;
  }

  public List<Object> getConditionAugmentationPoint() {
    if (conditionAugmentationPoint == null) {
      conditionAugmentationPoint = new ArrayList<Object>();
    }
    return this.conditionAugmentationPoint;
  }

}
