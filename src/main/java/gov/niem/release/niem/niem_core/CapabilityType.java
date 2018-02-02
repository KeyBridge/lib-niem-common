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
@XmlType(name = "CapabilityType", propOrder = {
  "capabilityEndDate",
  "capabilityGeneralCategoryText",
  "capabilityIdentification",
  "capabilityName",
  "capabilityStartDate",
  "capabilityCategoryText",
  "capabilityDescriptionText",
  "capabilityIsLimitationIndicator",
  "capabilityAugmentationPoint"
})
public class CapabilityType
  extends ObjectType {

  @XmlElement(name = "CapabilityEndDate", nillable = true)
  protected List<DateType> capabilityEndDate;
  @XmlElement(name = "CapabilityGeneralCategoryText", nillable = true)
  protected List<TextType> capabilityGeneralCategoryText;
  @XmlElement(name = "CapabilityIdentification", nillable = true)
  protected List<IdentificationType> capabilityIdentification;
  @XmlElement(name = "CapabilityName", nillable = true)
  protected List<TextType> capabilityName;
  @XmlElement(name = "CapabilityStartDate", nillable = true)
  protected List<DateType> capabilityStartDate;
  @XmlElement(name = "CapabilityCategoryText", nillable = true)
  protected List<TextType> capabilityCategoryText;
  @XmlElement(name = "CapabilityDescriptionText", nillable = true)
  protected List<TextType> capabilityDescriptionText;
  @XmlElement(name = "CapabilityIsLimitationIndicator", nillable = true)
  protected List<Boolean> capabilityIsLimitationIndicator;
  @XmlElement(name = "CapabilityAugmentationPoint")
  protected List<Object> capabilityAugmentationPoint;

  public List<DateType> getCapabilityEndDate() {
    if (capabilityEndDate == null) {
      capabilityEndDate = new ArrayList<DateType>();
    }
    return this.capabilityEndDate;
  }

  public List<TextType> getCapabilityGeneralCategoryText() {
    if (capabilityGeneralCategoryText == null) {
      capabilityGeneralCategoryText = new ArrayList<TextType>();
    }
    return this.capabilityGeneralCategoryText;
  }

  public List<IdentificationType> getCapabilityIdentification() {
    if (capabilityIdentification == null) {
      capabilityIdentification = new ArrayList<IdentificationType>();
    }
    return this.capabilityIdentification;
  }

  public List<TextType> getCapabilityName() {
    if (capabilityName == null) {
      capabilityName = new ArrayList<TextType>();
    }
    return this.capabilityName;
  }

  public List<DateType> getCapabilityStartDate() {
    if (capabilityStartDate == null) {
      capabilityStartDate = new ArrayList<DateType>();
    }
    return this.capabilityStartDate;
  }

  public List<TextType> getCapabilityCategoryText() {
    if (capabilityCategoryText == null) {
      capabilityCategoryText = new ArrayList<TextType>();
    }
    return this.capabilityCategoryText;
  }

  public List<TextType> getCapabilityDescriptionText() {
    if (capabilityDescriptionText == null) {
      capabilityDescriptionText = new ArrayList<TextType>();
    }
    return this.capabilityDescriptionText;
  }

  public List<Boolean> getCapabilityIsLimitationIndicator() {
    if (capabilityIsLimitationIndicator == null) {
      capabilityIsLimitationIndicator = new ArrayList<Boolean>();
    }
    return this.capabilityIsLimitationIndicator;
  }

  public List<Object> getCapabilityAugmentationPoint() {
    if (capabilityAugmentationPoint == null) {
      capabilityAugmentationPoint = new ArrayList<Object>();
    }
    return this.capabilityAugmentationPoint;
  }

}
