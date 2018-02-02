package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.Boolean;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupervisionType", propOrder = {
  "supervisionCurrentIndicator",
  "supervisionCustodyStatus",
  "supervisionFacility",
  "supervisionMandatoryIndicator",
  "supervisionRelease",
  "supervisionPerson",
  "supervisionPersonStatus",
  "supervisionSupervisor",
  "supervisionAugmentationPoint"
})
public class SupervisionType
  extends ActivityType {

  @XmlElement(name = "SupervisionCurrentIndicator", nillable = true)
  protected List<Boolean> supervisionCurrentIndicator;
  @XmlElement(name = "SupervisionCustodyStatus", nillable = true)
  protected List<StatusType> supervisionCustodyStatus;
  @XmlElement(name = "SupervisionFacility", nillable = true)
  protected List<FacilityType> supervisionFacility;
  @XmlElement(name = "SupervisionMandatoryIndicator", nillable = true)
  protected List<Boolean> supervisionMandatoryIndicator;
  @XmlElement(name = "SupervisionRelease", nillable = true)
  protected List<ReleaseType> supervisionRelease;
  @XmlElement(name = "SupervisionPerson", nillable = true)
  protected List<PersonType> supervisionPerson;
  @XmlElement(name = "SupervisionPersonStatus", nillable = true)
  protected List<StatusType> supervisionPersonStatus;
  @XmlElement(name = "SupervisionSupervisor", nillable = true)
  protected List<EntityType> supervisionSupervisor;
  @XmlElement(name = "SupervisionAugmentationPoint")
  protected List<Object> supervisionAugmentationPoint;

  public List<Boolean> getSupervisionCurrentIndicator() {
    if (supervisionCurrentIndicator == null) {
      supervisionCurrentIndicator = new ArrayList<Boolean>();
    }
    return this.supervisionCurrentIndicator;
  }

  public List<StatusType> getSupervisionCustodyStatus() {
    if (supervisionCustodyStatus == null) {
      supervisionCustodyStatus = new ArrayList<StatusType>();
    }
    return this.supervisionCustodyStatus;
  }

  public List<FacilityType> getSupervisionFacility() {
    if (supervisionFacility == null) {
      supervisionFacility = new ArrayList<FacilityType>();
    }
    return this.supervisionFacility;
  }

  public List<Boolean> getSupervisionMandatoryIndicator() {
    if (supervisionMandatoryIndicator == null) {
      supervisionMandatoryIndicator = new ArrayList<Boolean>();
    }
    return this.supervisionMandatoryIndicator;
  }

  public List<ReleaseType> getSupervisionRelease() {
    if (supervisionRelease == null) {
      supervisionRelease = new ArrayList<ReleaseType>();
    }
    return this.supervisionRelease;
  }

  public List<PersonType> getSupervisionPerson() {
    if (supervisionPerson == null) {
      supervisionPerson = new ArrayList<PersonType>();
    }
    return this.supervisionPerson;
  }

  public List<StatusType> getSupervisionPersonStatus() {
    if (supervisionPersonStatus == null) {
      supervisionPersonStatus = new ArrayList<StatusType>();
    }
    return this.supervisionPersonStatus;
  }

  public List<EntityType> getSupervisionSupervisor() {
    if (supervisionSupervisor == null) {
      supervisionSupervisor = new ArrayList<EntityType>();
    }
    return this.supervisionSupervisor;
  }

  public List<Object> getSupervisionAugmentationPoint() {
    if (supervisionAugmentationPoint == null) {
      supervisionAugmentationPoint = new ArrayList<Object>();
    }
    return this.supervisionAugmentationPoint;
  }

}
