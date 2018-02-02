package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInformationType", propOrder = {
  "contactMeansAbstract",
  "contactEntity",
  "contactEntityDescriptionText",
  "contactInformationDescriptionText",
  "contactResponder",
  "contactInformationAvailabilityAbstract",
  "contactInformationAugmentationPoint"
})
public class ContactInformationType
  extends ObjectType {

  @XmlElementRef(name = "ContactMeansAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> contactMeansAbstract;
  @XmlElement(name = "ContactEntity", nillable = true)
  protected List<EntityType> contactEntity;
  @XmlElement(name = "ContactEntityDescriptionText", nillable = true)
  protected List<TextType> contactEntityDescriptionText;
  @XmlElement(name = "ContactInformationDescriptionText", nillable = true)
  protected List<TextType> contactInformationDescriptionText;
  @XmlElement(name = "ContactResponder", nillable = true)
  protected List<PersonType> contactResponder;
  @XmlElementRef(name = "ContactInformationAvailabilityAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> contactInformationAvailabilityAbstract;
  @XmlElement(name = "ContactInformationAugmentationPoint")
  protected List<Object> contactInformationAugmentationPoint;

  public List<JAXBElement<?>> getContactMeansAbstract() {
    if (contactMeansAbstract == null) {
      contactMeansAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.contactMeansAbstract;
  }

  public List<EntityType> getContactEntity() {
    if (contactEntity == null) {
      contactEntity = new ArrayList<EntityType>();
    }
    return this.contactEntity;
  }

  public List<TextType> getContactEntityDescriptionText() {
    if (contactEntityDescriptionText == null) {
      contactEntityDescriptionText = new ArrayList<TextType>();
    }
    return this.contactEntityDescriptionText;
  }

  public List<TextType> getContactInformationDescriptionText() {
    if (contactInformationDescriptionText == null) {
      contactInformationDescriptionText = new ArrayList<TextType>();
    }
    return this.contactInformationDescriptionText;
  }

  public List<PersonType> getContactResponder() {
    if (contactResponder == null) {
      contactResponder = new ArrayList<PersonType>();
    }
    return this.contactResponder;
  }

  public List<JAXBElement<?>> getContactInformationAvailabilityAbstract() {
    if (contactInformationAvailabilityAbstract == null) {
      contactInformationAvailabilityAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.contactInformationAvailabilityAbstract;
  }

  public List<Object> getContactInformationAugmentationPoint() {
    if (contactInformationAugmentationPoint == null) {
      contactInformationAugmentationPoint = new ArrayList<Object>();
    }
    return this.contactInformationAugmentationPoint;
  }

}
