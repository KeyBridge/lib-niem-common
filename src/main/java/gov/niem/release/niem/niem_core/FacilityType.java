package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.NonNegativeInteger;
import gov.niem.release.niem.proxy.xsd.String;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityType", propOrder = {
  "facilityIdentification",
  "facilityName",
  "facilityCategoryAbstract",
  "facilityLocation",
  "facilityContactInformation",
  "facilityContainsItem",
  "facilityCapacityDescriptionText",
  "facilityCapacityQuantity",
  "facilityDescriptionText",
  "facilityMaxOccupancyQuantity",
  "facilityMemberCategoryText",
  "facilityOperatingSchedule",
  "facilityOperationalStatus",
  "facilitySecurityLevelText",
  "facilitySiteDiagram",
  "facilitySystemIPAddressID",
  "facilitySystemIdentification",
  "facilityUsageAbstract",
  "facilityAugmentationPoint"
})
@XmlSeeAlso({
  AirportType.class
})
public class FacilityType
  extends ObjectType {

  @XmlElement(name = "FacilityIdentification", nillable = true)
  protected List<IdentificationType> facilityIdentification;
  @XmlElement(name = "FacilityName", nillable = true)
  protected List<ProperNameTextType> facilityName;
  @XmlElementRef(name = "FacilityCategoryAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> facilityCategoryAbstract;
  @XmlElement(name = "FacilityLocation", nillable = true)
  protected List<LocationType> facilityLocation;
  @XmlElement(name = "FacilityContactInformation", nillable = true)
  protected List<ContactInformationType> facilityContactInformation;
  @XmlElement(name = "FacilityContainsItem", nillable = true)
  protected List<ItemType> facilityContainsItem;
  @XmlElement(name = "FacilityCapacityDescriptionText", nillable = true)
  protected List<TextType> facilityCapacityDescriptionText;
  @XmlElement(name = "FacilityCapacityQuantity", nillable = true)
  protected List<NonNegativeInteger> facilityCapacityQuantity;
  @XmlElement(name = "FacilityDescriptionText", nillable = true)
  protected List<TextType> facilityDescriptionText;
  @XmlElement(name = "FacilityMaxOccupancyQuantity", nillable = true)
  protected List<NonNegativeInteger> facilityMaxOccupancyQuantity;
  @XmlElement(name = "FacilityMemberCategoryText", nillable = true)
  protected List<TextType> facilityMemberCategoryText;
  @XmlElement(name = "FacilityOperatingSchedule", nillable = true)
  protected List<ScheduleType> facilityOperatingSchedule;
  @XmlElement(name = "FacilityOperationalStatus", nillable = true)
  protected List<StatusType> facilityOperationalStatus;
  @XmlElement(name = "FacilitySecurityLevelText", nillable = true)
  protected List<TextType> facilitySecurityLevelText;
  @XmlElement(name = "FacilitySiteDiagram", nillable = true)
  protected List<ImageType> facilitySiteDiagram;
  @XmlElement(name = "FacilitySystemIPAddressID", nillable = true)
  protected List<String> facilitySystemIPAddressID;
  @XmlElement(name = "FacilitySystemIdentification", nillable = true)
  protected List<SystemIdentificationType> facilitySystemIdentification;
  @XmlElementRef(name = "FacilityUsageAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> facilityUsageAbstract;
  @XmlElement(name = "FacilityAugmentationPoint")
  protected List<Object> facilityAugmentationPoint;

  public List<IdentificationType> getFacilityIdentification() {
    if (facilityIdentification == null) {
      facilityIdentification = new ArrayList<IdentificationType>();
    }
    return this.facilityIdentification;
  }

  public List<ProperNameTextType> getFacilityName() {
    if (facilityName == null) {
      facilityName = new ArrayList<ProperNameTextType>();
    }
    return this.facilityName;
  }

  public List<JAXBElement<?>> getFacilityCategoryAbstract() {
    if (facilityCategoryAbstract == null) {
      facilityCategoryAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.facilityCategoryAbstract;
  }

  public List<LocationType> getFacilityLocation() {
    if (facilityLocation == null) {
      facilityLocation = new ArrayList<LocationType>();
    }
    return this.facilityLocation;
  }

  public List<ContactInformationType> getFacilityContactInformation() {
    if (facilityContactInformation == null) {
      facilityContactInformation = new ArrayList<ContactInformationType>();
    }
    return this.facilityContactInformation;
  }

  public List<ItemType> getFacilityContainsItem() {
    if (facilityContainsItem == null) {
      facilityContainsItem = new ArrayList<ItemType>();
    }
    return this.facilityContainsItem;
  }

  public List<TextType> getFacilityCapacityDescriptionText() {
    if (facilityCapacityDescriptionText == null) {
      facilityCapacityDescriptionText = new ArrayList<TextType>();
    }
    return this.facilityCapacityDescriptionText;
  }

  public List<NonNegativeInteger> getFacilityCapacityQuantity() {
    if (facilityCapacityQuantity == null) {
      facilityCapacityQuantity = new ArrayList<NonNegativeInteger>();
    }
    return this.facilityCapacityQuantity;
  }

  public List<TextType> getFacilityDescriptionText() {
    if (facilityDescriptionText == null) {
      facilityDescriptionText = new ArrayList<TextType>();
    }
    return this.facilityDescriptionText;
  }

  public List<NonNegativeInteger> getFacilityMaxOccupancyQuantity() {
    if (facilityMaxOccupancyQuantity == null) {
      facilityMaxOccupancyQuantity = new ArrayList<NonNegativeInteger>();
    }
    return this.facilityMaxOccupancyQuantity;
  }

  public List<TextType> getFacilityMemberCategoryText() {
    if (facilityMemberCategoryText == null) {
      facilityMemberCategoryText = new ArrayList<TextType>();
    }
    return this.facilityMemberCategoryText;
  }

  public List<ScheduleType> getFacilityOperatingSchedule() {
    if (facilityOperatingSchedule == null) {
      facilityOperatingSchedule = new ArrayList<ScheduleType>();
    }
    return this.facilityOperatingSchedule;
  }

  public List<StatusType> getFacilityOperationalStatus() {
    if (facilityOperationalStatus == null) {
      facilityOperationalStatus = new ArrayList<StatusType>();
    }
    return this.facilityOperationalStatus;
  }

  public List<TextType> getFacilitySecurityLevelText() {
    if (facilitySecurityLevelText == null) {
      facilitySecurityLevelText = new ArrayList<TextType>();
    }
    return this.facilitySecurityLevelText;
  }

  public List<ImageType> getFacilitySiteDiagram() {
    if (facilitySiteDiagram == null) {
      facilitySiteDiagram = new ArrayList<ImageType>();
    }
    return this.facilitySiteDiagram;
  }

  public List<String> getFacilitySystemIPAddressID() {
    if (facilitySystemIPAddressID == null) {
      facilitySystemIPAddressID = new ArrayList<String>();
    }
    return this.facilitySystemIPAddressID;
  }

  public List<SystemIdentificationType> getFacilitySystemIdentification() {
    if (facilitySystemIdentification == null) {
      facilitySystemIdentification = new ArrayList<SystemIdentificationType>();
    }
    return this.facilitySystemIdentification;
  }

  public List<JAXBElement<?>> getFacilityUsageAbstract() {
    if (facilityUsageAbstract == null) {
      facilityUsageAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.facilityUsageAbstract;
  }

  public List<Object> getFacilityAugmentationPoint() {
    if (facilityAugmentationPoint == null) {
      facilityAugmentationPoint = new ArrayList<Object>();
    }
    return this.facilityAugmentationPoint;
  }

}
