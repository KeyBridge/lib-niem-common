package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.String;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
  "addressFullText",
  "addressPrivateMailboxText",
  "addressSecondaryUnitText",
  "addressDeliveryPointAbstract",
  "addressRecipientName",
  "locationCityName",
  "locationCountyAbstract",
  "locationState",
  "locationCountry",
  "locationPostalCode",
  "locationPostalExtensionCode",
  "addressUrbanizationName",
  "addressCategoryAbstract",
  "addressAugmentationPoint"
})
public class AddressType
  extends ObjectType {

  @XmlElement(name = "AddressFullText", nillable = true)
  protected List<TextType> addressFullText;
  @XmlElement(name = "AddressPrivateMailboxText", nillable = true)
  protected List<TextType> addressPrivateMailboxText;
  @XmlElement(name = "AddressSecondaryUnitText", nillable = true)
  protected List<TextType> addressSecondaryUnitText;
  @XmlElementRef(name = "AddressDeliveryPointAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> addressDeliveryPointAbstract;
  @XmlElement(name = "AddressRecipientName", nillable = true)
  protected List<TextType> addressRecipientName;
  @XmlElement(name = "LocationCityName", nillable = true)
  protected List<ProperNameTextType> locationCityName;
  @XmlElementRef(name = "LocationCountyAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> locationCountyAbstract;
  @XmlElement(name = "LocationState", nillable = true)
  protected List<StateType> locationState;
  @XmlElement(name = "LocationCountry", nillable = true)
  protected List<CountryType> locationCountry;
  @XmlElement(name = "LocationPostalCode", nillable = true)
  protected List<String> locationPostalCode;
  @XmlElement(name = "LocationPostalExtensionCode", nillable = true)
  protected List<String> locationPostalExtensionCode;
  @XmlElement(name = "AddressUrbanizationName", nillable = true)
  protected List<TextType> addressUrbanizationName;
  @XmlElementRef(name = "AddressCategoryAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> addressCategoryAbstract;
  @XmlElement(name = "AddressAugmentationPoint")
  protected List<Object> addressAugmentationPoint;

  public List<TextType> getAddressFullText() {
    if (addressFullText == null) {
      addressFullText = new ArrayList<TextType>();
    }
    return this.addressFullText;
  }

  public List<TextType> getAddressPrivateMailboxText() {
    if (addressPrivateMailboxText == null) {
      addressPrivateMailboxText = new ArrayList<TextType>();
    }
    return this.addressPrivateMailboxText;
  }

  public List<TextType> getAddressSecondaryUnitText() {
    if (addressSecondaryUnitText == null) {
      addressSecondaryUnitText = new ArrayList<TextType>();
    }
    return this.addressSecondaryUnitText;
  }

  public List<JAXBElement<?>> getAddressDeliveryPointAbstract() {
    if (addressDeliveryPointAbstract == null) {
      addressDeliveryPointAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.addressDeliveryPointAbstract;
  }

  public List<TextType> getAddressRecipientName() {
    if (addressRecipientName == null) {
      addressRecipientName = new ArrayList<TextType>();
    }
    return this.addressRecipientName;
  }

  public List<ProperNameTextType> getLocationCityName() {
    if (locationCityName == null) {
      locationCityName = new ArrayList<ProperNameTextType>();
    }
    return this.locationCityName;
  }

  public List<JAXBElement<?>> getLocationCountyAbstract() {
    if (locationCountyAbstract == null) {
      locationCountyAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.locationCountyAbstract;
  }

  public List<StateType> getLocationState() {
    if (locationState == null) {
      locationState = new ArrayList<StateType>();
    }
    return this.locationState;
  }

  public List<CountryType> getLocationCountry() {
    if (locationCountry == null) {
      locationCountry = new ArrayList<CountryType>();
    }
    return this.locationCountry;
  }

  public List<String> getLocationPostalCode() {
    if (locationPostalCode == null) {
      locationPostalCode = new ArrayList<String>();
    }
    return this.locationPostalCode;
  }

  public List<String> getLocationPostalExtensionCode() {
    if (locationPostalExtensionCode == null) {
      locationPostalExtensionCode = new ArrayList<String>();
    }
    return this.locationPostalExtensionCode;
  }

  public List<TextType> getAddressUrbanizationName() {
    if (addressUrbanizationName == null) {
      addressUrbanizationName = new ArrayList<TextType>();
    }
    return this.addressUrbanizationName;
  }

  public List<JAXBElement<?>> getAddressCategoryAbstract() {
    if (addressCategoryAbstract == null) {
      addressCategoryAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.addressCategoryAbstract;
  }

  public List<Object> getAddressAugmentationPoint() {
    if (addressAugmentationPoint == null) {
      addressAugmentationPoint = new ArrayList<Object>();
    }
    return this.addressAugmentationPoint;
  }

}
