package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityType", propOrder = {
  "activityIdentification",
  "activityCategoryText",
  "activityDescriptionText",
  "activityName",
  "activityStatus",
  "activityReasonText",
  "activityDisposition",
  "activityContactEntity",
  "activityDate",
  "activityAugmentationPoint"
})
@XmlSeeAlso({
  PersonEncounterType.class,
  ProgramType.class,
  ConditionType.class,
  IncidentType.class,
  PersonDisunionType.class,
  TreatmentType.class,
  ReleaseType.class,
  DisciplinaryActionType.class,
  ReferralType.class,
  SystemAuditEventType.class,
  ItemTransactionType.class,
  AssessmentType.class,
  SupervisionType.class,
  PersonUnionSeparationType.class,
  CaseType.class,
  ProgressType.class
})
public class ActivityType
  extends ObjectType {

  @XmlElement(name = "ActivityIdentification", nillable = true)
  protected List<IdentificationType> activityIdentification;
  @XmlElement(name = "ActivityCategoryText", nillable = true)
  protected List<TextType> activityCategoryText;
  @XmlElement(name = "ActivityDescriptionText", nillable = true)
  protected List<TextType> activityDescriptionText;
  @XmlElement(name = "ActivityName", nillable = true)
  protected List<TextType> activityName;
  @XmlElement(name = "ActivityStatus", nillable = true)
  protected List<StatusType> activityStatus;
  @XmlElement(name = "ActivityReasonText", nillable = true)
  protected List<TextType> activityReasonText;
  @XmlElementRef(name = "ActivityDisposition", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<? extends DispositionType>> activityDisposition;
  @XmlElement(name = "ActivityContactEntity", nillable = true)
  protected List<EntityType> activityContactEntity;
  @XmlElement(name = "ActivityDate", nillable = true)
  protected List<DateType> activityDate;
  @XmlElement(name = "ActivityAugmentationPoint")
  protected List<Object> activityAugmentationPoint;

  public List<IdentificationType> getActivityIdentification() {
    if (activityIdentification == null) {
      activityIdentification = new ArrayList<IdentificationType>();
    }
    return this.activityIdentification;
  }

  public List<TextType> getActivityCategoryText() {
    if (activityCategoryText == null) {
      activityCategoryText = new ArrayList<TextType>();
    }
    return this.activityCategoryText;
  }

  public List<TextType> getActivityDescriptionText() {
    if (activityDescriptionText == null) {
      activityDescriptionText = new ArrayList<TextType>();
    }
    return this.activityDescriptionText;
  }

  public List<TextType> getActivityName() {
    if (activityName == null) {
      activityName = new ArrayList<TextType>();
    }
    return this.activityName;
  }

  public List<StatusType> getActivityStatus() {
    if (activityStatus == null) {
      activityStatus = new ArrayList<StatusType>();
    }
    return this.activityStatus;
  }

  public List<TextType> getActivityReasonText() {
    if (activityReasonText == null) {
      activityReasonText = new ArrayList<TextType>();
    }
    return this.activityReasonText;
  }

  public List<JAXBElement<? extends DispositionType>> getActivityDisposition() {
    if (activityDisposition == null) {
      activityDisposition = new ArrayList<JAXBElement<? extends DispositionType>>();
    }
    return this.activityDisposition;
  }

  public List<EntityType> getActivityContactEntity() {
    if (activityContactEntity == null) {
      activityContactEntity = new ArrayList<EntityType>();
    }
    return this.activityContactEntity;
  }

  public List<DateType> getActivityDate() {
    if (activityDate == null) {
      activityDate = new ArrayList<DateType>();
    }
    return this.activityDate;
  }

  public List<Object> getActivityAugmentationPoint() {
    if (activityAugmentationPoint == null) {
      activityAugmentationPoint = new ArrayList<Object>();
    }
    return this.activityAugmentationPoint;
  }

}
