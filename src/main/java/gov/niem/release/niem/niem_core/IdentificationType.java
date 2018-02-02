package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.String;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationType", propOrder = {
  "identificationID",
  "identificationJurisdiction",
  "identificationCategoryAbstract",
  "identificationCategoryDescriptionText",
  "identificationEffectiveDate",
  "identificationExpirationDate",
  "identificationSourceText",
  "identificationStatus",
  "identificationAugmentationPoint"
})
@XmlSeeAlso({
  SystemIdentificationType.class
})
public class IdentificationType
  extends ObjectType {

  @XmlElement(name = "IdentificationID", nillable = true)
  protected List<String> identificationID;
  @XmlElement(name = "IdentificationJurisdiction", nillable = true)
  protected List<JurisdictionType> identificationJurisdiction;
  @XmlElementRef(name = "IdentificationCategoryAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> identificationCategoryAbstract;
  @XmlElement(name = "IdentificationCategoryDescriptionText", nillable = true)
  protected List<TextType> identificationCategoryDescriptionText;
  @XmlElement(name = "IdentificationEffectiveDate", nillable = true)
  protected List<DateType> identificationEffectiveDate;
  @XmlElement(name = "IdentificationExpirationDate", nillable = true)
  protected List<DateType> identificationExpirationDate;
  @XmlElement(name = "IdentificationSourceText", nillable = true)
  protected List<TextType> identificationSourceText;
  @XmlElement(name = "IdentificationStatus", nillable = true)
  protected List<StatusType> identificationStatus;
  @XmlElement(name = "IdentificationAugmentationPoint")
  protected List<Object> identificationAugmentationPoint;

  public List<String> getIdentificationID() {
    if (identificationID == null) {
      identificationID = new ArrayList<String>();
    }
    return this.identificationID;
  }

  public List<JurisdictionType> getIdentificationJurisdiction() {
    if (identificationJurisdiction == null) {
      identificationJurisdiction = new ArrayList<JurisdictionType>();
    }
    return this.identificationJurisdiction;
  }

  public List<JAXBElement<?>> getIdentificationCategoryAbstract() {
    if (identificationCategoryAbstract == null) {
      identificationCategoryAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.identificationCategoryAbstract;
  }

  public List<TextType> getIdentificationCategoryDescriptionText() {
    if (identificationCategoryDescriptionText == null) {
      identificationCategoryDescriptionText = new ArrayList<TextType>();
    }
    return this.identificationCategoryDescriptionText;
  }

  public List<DateType> getIdentificationEffectiveDate() {
    if (identificationEffectiveDate == null) {
      identificationEffectiveDate = new ArrayList<DateType>();
    }
    return this.identificationEffectiveDate;
  }

  public List<DateType> getIdentificationExpirationDate() {
    if (identificationExpirationDate == null) {
      identificationExpirationDate = new ArrayList<DateType>();
    }
    return this.identificationExpirationDate;
  }

  public List<TextType> getIdentificationSourceText() {
    if (identificationSourceText == null) {
      identificationSourceText = new ArrayList<TextType>();
    }
    return this.identificationSourceText;
  }

  public List<StatusType> getIdentificationStatus() {
    if (identificationStatus == null) {
      identificationStatus = new ArrayList<StatusType>();
    }
    return this.identificationStatus;
  }

  public List<Object> getIdentificationAugmentationPoint() {
    if (identificationAugmentationPoint == null) {
      identificationAugmentationPoint = new ArrayList<Object>();
    }
    return this.identificationAugmentationPoint;
  }

}
