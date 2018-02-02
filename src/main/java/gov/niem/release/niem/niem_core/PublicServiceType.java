package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.AnyURI;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicServiceType", propOrder = {
  "publicServiceName",
  "publicServiceDescriptionText",
  "publicServiceCategoryAbstract",
  "publicServiceLanguageAbstract",
  "publicServiceWebsiteURI",
  "publicServiceChannelText",
  "publicServiceLocation",
  "publicServiceRequiredService",
  "publicServiceRelatedService",
  "publicServiceInputResourceDocument",
  "publicServiceOutputResourceDocument",
  "publicServiceRelatedLocation",
  "publicServiceAvailabilitySchedule",
  "publicServiceAugmentationPoint"
})
public class PublicServiceType
  extends ObjectType {

  @XmlElement(name = "PublicServiceName", nillable = true)
  protected List<TextType> publicServiceName;
  @XmlElement(name = "PublicServiceDescriptionText", nillable = true)
  protected List<TextType> publicServiceDescriptionText;
  @XmlElementRef(name = "PublicServiceCategoryAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> publicServiceCategoryAbstract;
  @XmlElementRef(name = "PublicServiceLanguageAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> publicServiceLanguageAbstract;
  @XmlElement(name = "PublicServiceWebsiteURI", nillable = true)
  protected List<AnyURI> publicServiceWebsiteURI;
  @XmlElement(name = "PublicServiceChannelText", nillable = true)
  protected List<TextType> publicServiceChannelText;
  @XmlElement(name = "PublicServiceLocation", nillable = true)
  protected List<LocationType> publicServiceLocation;
  @XmlElement(name = "PublicServiceRequiredService", nillable = true)
  protected List<PublicServiceType> publicServiceRequiredService;
  @XmlElement(name = "PublicServiceRelatedService", nillable = true)
  protected List<PublicServiceType> publicServiceRelatedService;
  @XmlElement(name = "PublicServiceInputResourceDocument", nillable = true)
  protected List<DocumentType> publicServiceInputResourceDocument;
  @XmlElement(name = "PublicServiceOutputResourceDocument", nillable = true)
  protected List<DocumentType> publicServiceOutputResourceDocument;
  @XmlElement(name = "PublicServiceRelatedLocation", nillable = true)
  protected List<LocationType> publicServiceRelatedLocation;
  @XmlElement(name = "PublicServiceAvailabilitySchedule", nillable = true)
  protected List<ScheduleType> publicServiceAvailabilitySchedule;
  @XmlElement(name = "PublicServiceAugmentationPoint")
  protected List<Object> publicServiceAugmentationPoint;

  public List<TextType> getPublicServiceName() {
    if (publicServiceName == null) {
      publicServiceName = new ArrayList<TextType>();
    }
    return this.publicServiceName;
  }

  public List<TextType> getPublicServiceDescriptionText() {
    if (publicServiceDescriptionText == null) {
      publicServiceDescriptionText = new ArrayList<TextType>();
    }
    return this.publicServiceDescriptionText;
  }

  public List<JAXBElement<?>> getPublicServiceCategoryAbstract() {
    if (publicServiceCategoryAbstract == null) {
      publicServiceCategoryAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.publicServiceCategoryAbstract;
  }

  public List<JAXBElement<?>> getPublicServiceLanguageAbstract() {
    if (publicServiceLanguageAbstract == null) {
      publicServiceLanguageAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.publicServiceLanguageAbstract;
  }

  public List<AnyURI> getPublicServiceWebsiteURI() {
    if (publicServiceWebsiteURI == null) {
      publicServiceWebsiteURI = new ArrayList<AnyURI>();
    }
    return this.publicServiceWebsiteURI;
  }

  public List<TextType> getPublicServiceChannelText() {
    if (publicServiceChannelText == null) {
      publicServiceChannelText = new ArrayList<TextType>();
    }
    return this.publicServiceChannelText;
  }

  public List<LocationType> getPublicServiceLocation() {
    if (publicServiceLocation == null) {
      publicServiceLocation = new ArrayList<LocationType>();
    }
    return this.publicServiceLocation;
  }

  public List<PublicServiceType> getPublicServiceRequiredService() {
    if (publicServiceRequiredService == null) {
      publicServiceRequiredService = new ArrayList<PublicServiceType>();
    }
    return this.publicServiceRequiredService;
  }

  public List<PublicServiceType> getPublicServiceRelatedService() {
    if (publicServiceRelatedService == null) {
      publicServiceRelatedService = new ArrayList<PublicServiceType>();
    }
    return this.publicServiceRelatedService;
  }

  public List<DocumentType> getPublicServiceInputResourceDocument() {
    if (publicServiceInputResourceDocument == null) {
      publicServiceInputResourceDocument = new ArrayList<DocumentType>();
    }
    return this.publicServiceInputResourceDocument;
  }

  public List<DocumentType> getPublicServiceOutputResourceDocument() {
    if (publicServiceOutputResourceDocument == null) {
      publicServiceOutputResourceDocument = new ArrayList<DocumentType>();
    }
    return this.publicServiceOutputResourceDocument;
  }

  public List<LocationType> getPublicServiceRelatedLocation() {
    if (publicServiceRelatedLocation == null) {
      publicServiceRelatedLocation = new ArrayList<LocationType>();
    }
    return this.publicServiceRelatedLocation;
  }

  public List<ScheduleType> getPublicServiceAvailabilitySchedule() {
    if (publicServiceAvailabilitySchedule == null) {
      publicServiceAvailabilitySchedule = new ArrayList<ScheduleType>();
    }
    return this.publicServiceAvailabilitySchedule;
  }

  public List<Object> getPublicServiceAugmentationPoint() {
    if (publicServiceAugmentationPoint == null) {
      publicServiceAugmentationPoint = new ArrayList<Object>();
    }
    return this.publicServiceAugmentationPoint;
  }

}
