package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.Boolean;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObligationType", propOrder = {
  "obligationTotalAbstract",
  "obligationDueAbstract",
  "obligationPaidAbstract",
  "obligationCompleteIndicator",
  "obligationComplianceIndicator",
  "obligationDueDate",
  "obligationExemption",
  "obligationExemptionIndicator",
  "obligationPaidDate",
  "obligationProgressDescriptionText",
  "obligationRequirementDescriptionText",
  "obligationCategoryText",
  "obligationEntity",
  "obligationRecipient",
  "obligationRecurrence",
  "obligationAugmentationPoint"
})
public class ObligationType
  extends ObjectType {

  @XmlElementRef(name = "ObligationTotalAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> obligationTotalAbstract;
  @XmlElementRef(name = "ObligationDueAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> obligationDueAbstract;
  @XmlElementRef(name = "ObligationPaidAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> obligationPaidAbstract;
  @XmlElement(name = "ObligationCompleteIndicator", nillable = true)
  protected List<Boolean> obligationCompleteIndicator;
  @XmlElement(name = "ObligationComplianceIndicator", nillable = true)
  protected List<Boolean> obligationComplianceIndicator;
  @XmlElement(name = "ObligationDueDate", nillable = true)
  protected List<DateType> obligationDueDate;
  @XmlElement(name = "ObligationExemption", nillable = true)
  protected List<ObligationExemptionType> obligationExemption;
  @XmlElement(name = "ObligationExemptionIndicator", nillable = true)
  protected List<Boolean> obligationExemptionIndicator;
  @XmlElement(name = "ObligationPaidDate", nillable = true)
  protected List<DateType> obligationPaidDate;
  @XmlElement(name = "ObligationProgressDescriptionText", nillable = true)
  protected List<TextType> obligationProgressDescriptionText;
  @XmlElement(name = "ObligationRequirementDescriptionText", nillable = true)
  protected List<TextType> obligationRequirementDescriptionText;
  @XmlElement(name = "ObligationCategoryText", nillable = true)
  protected List<TextType> obligationCategoryText;
  @XmlElement(name = "ObligationEntity", nillable = true)
  protected List<EntityType> obligationEntity;
  @XmlElement(name = "ObligationRecipient", nillable = true)
  protected List<EntityType> obligationRecipient;
  @XmlElement(name = "ObligationRecurrence", nillable = true)
  protected List<ObligationRecurrenceType> obligationRecurrence;
  @XmlElement(name = "ObligationAugmentationPoint")
  protected List<Object> obligationAugmentationPoint;

  public List<JAXBElement<?>> getObligationTotalAbstract() {
    if (obligationTotalAbstract == null) {
      obligationTotalAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.obligationTotalAbstract;
  }

  public List<JAXBElement<?>> getObligationDueAbstract() {
    if (obligationDueAbstract == null) {
      obligationDueAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.obligationDueAbstract;
  }

  public List<JAXBElement<?>> getObligationPaidAbstract() {
    if (obligationPaidAbstract == null) {
      obligationPaidAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.obligationPaidAbstract;
  }

  public List<Boolean> getObligationCompleteIndicator() {
    if (obligationCompleteIndicator == null) {
      obligationCompleteIndicator = new ArrayList<Boolean>();
    }
    return this.obligationCompleteIndicator;
  }

  public List<Boolean> getObligationComplianceIndicator() {
    if (obligationComplianceIndicator == null) {
      obligationComplianceIndicator = new ArrayList<Boolean>();
    }
    return this.obligationComplianceIndicator;
  }

  public List<DateType> getObligationDueDate() {
    if (obligationDueDate == null) {
      obligationDueDate = new ArrayList<DateType>();
    }
    return this.obligationDueDate;
  }

  public List<ObligationExemptionType> getObligationExemption() {
    if (obligationExemption == null) {
      obligationExemption = new ArrayList<ObligationExemptionType>();
    }
    return this.obligationExemption;
  }

  public List<Boolean> getObligationExemptionIndicator() {
    if (obligationExemptionIndicator == null) {
      obligationExemptionIndicator = new ArrayList<Boolean>();
    }
    return this.obligationExemptionIndicator;
  }

  public List<DateType> getObligationPaidDate() {
    if (obligationPaidDate == null) {
      obligationPaidDate = new ArrayList<DateType>();
    }
    return this.obligationPaidDate;
  }

  public List<TextType> getObligationProgressDescriptionText() {
    if (obligationProgressDescriptionText == null) {
      obligationProgressDescriptionText = new ArrayList<TextType>();
    }
    return this.obligationProgressDescriptionText;
  }

  public List<TextType> getObligationRequirementDescriptionText() {
    if (obligationRequirementDescriptionText == null) {
      obligationRequirementDescriptionText = new ArrayList<TextType>();
    }
    return this.obligationRequirementDescriptionText;
  }

  public List<TextType> getObligationCategoryText() {
    if (obligationCategoryText == null) {
      obligationCategoryText = new ArrayList<TextType>();
    }
    return this.obligationCategoryText;
  }

  public List<EntityType> getObligationEntity() {
    if (obligationEntity == null) {
      obligationEntity = new ArrayList<EntityType>();
    }
    return this.obligationEntity;
  }

  public List<EntityType> getObligationRecipient() {
    if (obligationRecipient == null) {
      obligationRecipient = new ArrayList<EntityType>();
    }
    return this.obligationRecipient;
  }

  public List<ObligationRecurrenceType> getObligationRecurrence() {
    if (obligationRecurrence == null) {
      obligationRecurrence = new ArrayList<ObligationRecurrenceType>();
    }
    return this.obligationRecurrence;
  }

  public List<Object> getObligationAugmentationPoint() {
    if (obligationAugmentationPoint == null) {
      obligationAugmentationPoint = new ArrayList<Object>();
    }
    return this.obligationAugmentationPoint;
  }

}
