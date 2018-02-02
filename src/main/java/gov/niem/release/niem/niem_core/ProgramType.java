package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.Boolean;
import gov.niem.release.niem.proxy.xsd.NonNegativeInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgramType", propOrder = {
  "programPerson",
  "programAction",
  "programCapacityQuantity",
  "programCondition",
  "programFacility",
  "programPubliclyRunIndicator",
  "programPurposeText",
  "programReferral",
  "programAdministrator",
  "programRelease",
  "programSupervisor",
  "programResidentialIndicator",
  "programSupervisedIndicator",
  "programAugmentationPoint"
})
public class ProgramType
  extends ActivityType {

  @XmlElement(name = "ProgramPerson", nillable = true)
  protected List<PersonType> programPerson;
  @XmlElement(name = "ProgramAction", nillable = true)
  protected List<ActivityType> programAction;
  @XmlElement(name = "ProgramCapacityQuantity", nillable = true)
  protected List<NonNegativeInteger> programCapacityQuantity;
  @XmlElement(name = "ProgramCondition", nillable = true)
  protected List<ConditionType> programCondition;
  @XmlElement(name = "ProgramFacility", nillable = true)
  protected List<FacilityType> programFacility;
  @XmlElement(name = "ProgramPubliclyRunIndicator", nillable = true)
  protected List<Boolean> programPubliclyRunIndicator;
  @XmlElement(name = "ProgramPurposeText", nillable = true)
  protected List<TextType> programPurposeText;
  @XmlElement(name = "ProgramReferral", nillable = true)
  protected List<ReferralType> programReferral;
  @XmlElement(name = "ProgramAdministrator", nillable = true)
  protected List<EntityType> programAdministrator;
  @XmlElement(name = "ProgramRelease", nillable = true)
  protected List<ReleaseType> programRelease;
  @XmlElement(name = "ProgramSupervisor", nillable = true)
  protected List<EntityType> programSupervisor;
  @XmlElement(name = "ProgramResidentialIndicator", nillable = true)
  protected List<Boolean> programResidentialIndicator;
  @XmlElement(name = "ProgramSupervisedIndicator", nillable = true)
  protected List<Boolean> programSupervisedIndicator;
  @XmlElement(name = "ProgramAugmentationPoint")
  protected List<Object> programAugmentationPoint;

  public List<PersonType> getProgramPerson() {
    if (programPerson == null) {
      programPerson = new ArrayList<PersonType>();
    }
    return this.programPerson;
  }

  public List<ActivityType> getProgramAction() {
    if (programAction == null) {
      programAction = new ArrayList<ActivityType>();
    }
    return this.programAction;
  }

  public List<NonNegativeInteger> getProgramCapacityQuantity() {
    if (programCapacityQuantity == null) {
      programCapacityQuantity = new ArrayList<NonNegativeInteger>();
    }
    return this.programCapacityQuantity;
  }

  public List<ConditionType> getProgramCondition() {
    if (programCondition == null) {
      programCondition = new ArrayList<ConditionType>();
    }
    return this.programCondition;
  }

  public List<FacilityType> getProgramFacility() {
    if (programFacility == null) {
      programFacility = new ArrayList<FacilityType>();
    }
    return this.programFacility;
  }

  public List<Boolean> getProgramPubliclyRunIndicator() {
    if (programPubliclyRunIndicator == null) {
      programPubliclyRunIndicator = new ArrayList<Boolean>();
    }
    return this.programPubliclyRunIndicator;
  }

  public List<TextType> getProgramPurposeText() {
    if (programPurposeText == null) {
      programPurposeText = new ArrayList<TextType>();
    }
    return this.programPurposeText;
  }

  public List<ReferralType> getProgramReferral() {
    if (programReferral == null) {
      programReferral = new ArrayList<ReferralType>();
    }
    return this.programReferral;
  }

  public List<EntityType> getProgramAdministrator() {
    if (programAdministrator == null) {
      programAdministrator = new ArrayList<EntityType>();
    }
    return this.programAdministrator;
  }

  public List<ReleaseType> getProgramRelease() {
    if (programRelease == null) {
      programRelease = new ArrayList<ReleaseType>();
    }
    return this.programRelease;
  }

  public List<EntityType> getProgramSupervisor() {
    if (programSupervisor == null) {
      programSupervisor = new ArrayList<EntityType>();
    }
    return this.programSupervisor;
  }

  public List<Boolean> getProgramResidentialIndicator() {
    if (programResidentialIndicator == null) {
      programResidentialIndicator = new ArrayList<Boolean>();
    }
    return this.programResidentialIndicator;
  }

  public List<Boolean> getProgramSupervisedIndicator() {
    if (programSupervisedIndicator == null) {
      programSupervisedIndicator = new ArrayList<Boolean>();
    }
    return this.programSupervisedIndicator;
  }

  public List<Object> getProgramAugmentationPoint() {
    if (programAugmentationPoint == null) {
      programAugmentationPoint = new ArrayList<Object>();
    }
    return this.programAugmentationPoint;
  }

}
