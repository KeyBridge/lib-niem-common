package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JurisdictionType", propOrder = {
  "jurisdictionAbstract",
  "locationCityName",
  "locationCountry",
  "locationCountyAbstract",
  "locationState",
  "jurisdictionIdentification",
  "jurisdictionAugmentationPoint"
})
public class JurisdictionType
  extends ObjectType {

  @XmlElementRef(name = "JurisdictionAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> jurisdictionAbstract;
  @XmlElement(name = "LocationCityName", nillable = true)
  protected List<ProperNameTextType> locationCityName;
  @XmlElement(name = "LocationCountry", nillable = true)
  protected List<CountryType> locationCountry;
  @XmlElementRef(name = "LocationCountyAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> locationCountyAbstract;
  @XmlElement(name = "LocationState", nillable = true)
  protected List<StateType> locationState;
  @XmlElement(name = "JurisdictionIdentification", nillable = true)
  protected List<IdentificationType> jurisdictionIdentification;
  @XmlElement(name = "JurisdictionAugmentationPoint")
  protected List<Object> jurisdictionAugmentationPoint;

  public List<JAXBElement<?>> getJurisdictionAbstract() {
    if (jurisdictionAbstract == null) {
      jurisdictionAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.jurisdictionAbstract;
  }

  public List<ProperNameTextType> getLocationCityName() {
    if (locationCityName == null) {
      locationCityName = new ArrayList<ProperNameTextType>();
    }
    return this.locationCityName;
  }

  public List<CountryType> getLocationCountry() {
    if (locationCountry == null) {
      locationCountry = new ArrayList<CountryType>();
    }
    return this.locationCountry;
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

  public List<IdentificationType> getJurisdictionIdentification() {
    if (jurisdictionIdentification == null) {
      jurisdictionIdentification = new ArrayList<IdentificationType>();
    }
    return this.jurisdictionIdentification;
  }

  public List<Object> getJurisdictionAugmentationPoint() {
    if (jurisdictionAugmentationPoint == null) {
      jurisdictionAugmentationPoint = new ArrayList<Object>();
    }
    return this.jurisdictionAugmentationPoint;
  }

}
