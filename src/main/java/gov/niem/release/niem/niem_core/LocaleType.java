package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.String;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocaleType", propOrder = {
  "localeCensusBlockID",
  "localeCensusTractID",
  "localeCommunityName",
  "localeDescriptionText",
  "localeDistrictName",
  "localeEmergencyServicesName",
  "localeFireJurisdictionID",
  "localeJudicialDistrictAbstract",
  "localeJudicialDistrictName",
  "localeNeighborhoodName",
  "localePoliceBeatText",
  "localePoliceGridText",
  "localePoliceJurisdictionID",
  "localeRegionName",
  "localeSubdivisionName",
  "localeZoneName",
  "localeEmergencyServicesJurisdictionID",
  "localeAugmentationPoint"
})
public class LocaleType
  extends ObjectType {

  @XmlElement(name = "LocaleCensusBlockID", nillable = true)
  protected List<String> localeCensusBlockID;
  @XmlElement(name = "LocaleCensusTractID", nillable = true)
  protected List<String> localeCensusTractID;
  @XmlElement(name = "LocaleCommunityName", nillable = true)
  protected List<TextType> localeCommunityName;
  @XmlElement(name = "LocaleDescriptionText", nillable = true)
  protected List<TextType> localeDescriptionText;
  @XmlElement(name = "LocaleDistrictName", nillable = true)
  protected List<TextType> localeDistrictName;
  @XmlElement(name = "LocaleEmergencyServicesName", nillable = true)
  protected List<TextType> localeEmergencyServicesName;
  @XmlElement(name = "LocaleFireJurisdictionID", nillable = true)
  protected List<String> localeFireJurisdictionID;
  @XmlElement(name = "LocaleJudicialDistrictAbstract")
  protected List<Object> localeJudicialDistrictAbstract;
  @XmlElement(name = "LocaleJudicialDistrictName", nillable = true)
  protected List<TextType> localeJudicialDistrictName;
  @XmlElement(name = "LocaleNeighborhoodName", nillable = true)
  protected List<TextType> localeNeighborhoodName;
  @XmlElement(name = "LocalePoliceBeatText", nillable = true)
  protected List<TextType> localePoliceBeatText;
  @XmlElement(name = "LocalePoliceGridText", nillable = true)
  protected List<TextType> localePoliceGridText;
  @XmlElement(name = "LocalePoliceJurisdictionID", nillable = true)
  protected List<String> localePoliceJurisdictionID;
  @XmlElement(name = "LocaleRegionName", nillable = true)
  protected List<TextType> localeRegionName;
  @XmlElement(name = "LocaleSubdivisionName", nillable = true)
  protected List<TextType> localeSubdivisionName;
  @XmlElement(name = "LocaleZoneName", nillable = true)
  protected List<TextType> localeZoneName;
  @XmlElement(name = "LocaleEmergencyServicesJurisdictionID", nillable = true)
  protected List<String> localeEmergencyServicesJurisdictionID;
  @XmlElement(name = "LocaleAugmentationPoint")
  protected List<Object> localeAugmentationPoint;

  public List<String> getLocaleCensusBlockID() {
    if (localeCensusBlockID == null) {
      localeCensusBlockID = new ArrayList<String>();
    }
    return this.localeCensusBlockID;
  }

  public List<String> getLocaleCensusTractID() {
    if (localeCensusTractID == null) {
      localeCensusTractID = new ArrayList<String>();
    }
    return this.localeCensusTractID;
  }

  public List<TextType> getLocaleCommunityName() {
    if (localeCommunityName == null) {
      localeCommunityName = new ArrayList<TextType>();
    }
    return this.localeCommunityName;
  }

  public List<TextType> getLocaleDescriptionText() {
    if (localeDescriptionText == null) {
      localeDescriptionText = new ArrayList<TextType>();
    }
    return this.localeDescriptionText;
  }

  public List<TextType> getLocaleDistrictName() {
    if (localeDistrictName == null) {
      localeDistrictName = new ArrayList<TextType>();
    }
    return this.localeDistrictName;
  }

  public List<TextType> getLocaleEmergencyServicesName() {
    if (localeEmergencyServicesName == null) {
      localeEmergencyServicesName = new ArrayList<TextType>();
    }
    return this.localeEmergencyServicesName;
  }

  public List<String> getLocaleFireJurisdictionID() {
    if (localeFireJurisdictionID == null) {
      localeFireJurisdictionID = new ArrayList<String>();
    }
    return this.localeFireJurisdictionID;
  }

  public List<Object> getLocaleJudicialDistrictAbstract() {
    if (localeJudicialDistrictAbstract == null) {
      localeJudicialDistrictAbstract = new ArrayList<Object>();
    }
    return this.localeJudicialDistrictAbstract;
  }

  public List<TextType> getLocaleJudicialDistrictName() {
    if (localeJudicialDistrictName == null) {
      localeJudicialDistrictName = new ArrayList<TextType>();
    }
    return this.localeJudicialDistrictName;
  }

  public List<TextType> getLocaleNeighborhoodName() {
    if (localeNeighborhoodName == null) {
      localeNeighborhoodName = new ArrayList<TextType>();
    }
    return this.localeNeighborhoodName;
  }

  public List<TextType> getLocalePoliceBeatText() {
    if (localePoliceBeatText == null) {
      localePoliceBeatText = new ArrayList<TextType>();
    }
    return this.localePoliceBeatText;
  }

  public List<TextType> getLocalePoliceGridText() {
    if (localePoliceGridText == null) {
      localePoliceGridText = new ArrayList<TextType>();
    }
    return this.localePoliceGridText;
  }

  public List<String> getLocalePoliceJurisdictionID() {
    if (localePoliceJurisdictionID == null) {
      localePoliceJurisdictionID = new ArrayList<String>();
    }
    return this.localePoliceJurisdictionID;
  }

  public List<TextType> getLocaleRegionName() {
    if (localeRegionName == null) {
      localeRegionName = new ArrayList<TextType>();
    }
    return this.localeRegionName;
  }

  public List<TextType> getLocaleSubdivisionName() {
    if (localeSubdivisionName == null) {
      localeSubdivisionName = new ArrayList<TextType>();
    }
    return this.localeSubdivisionName;
  }

  public List<TextType> getLocaleZoneName() {
    if (localeZoneName == null) {
      localeZoneName = new ArrayList<TextType>();
    }
    return this.localeZoneName;
  }

  public List<String> getLocaleEmergencyServicesJurisdictionID() {
    if (localeEmergencyServicesJurisdictionID == null) {
      localeEmergencyServicesJurisdictionID = new ArrayList<String>();
    }
    return this.localeEmergencyServicesJurisdictionID;
  }

  public List<Object> getLocaleAugmentationPoint() {
    if (localeAugmentationPoint == null) {
      localeAugmentationPoint = new ArrayList<Object>();
    }
    return this.localeAugmentationPoint;
  }

}
