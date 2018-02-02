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
@XmlType(name = "SiteType", propOrder = {
  "siteLocation",
  "siteMobileDescriptionText",
  "siteMobileIndicator",
  "siteOwnerEntity",
  "siteSpecialInformationText",
  "siteAugmentationPoint"
})
public class SiteType
  extends ObjectType {

  @XmlElement(name = "SiteLocation", nillable = true)
  protected List<LocationType> siteLocation;
  @XmlElement(name = "SiteMobileDescriptionText", nillable = true)
  protected List<TextType> siteMobileDescriptionText;
  @XmlElement(name = "SiteMobileIndicator", nillable = true)
  protected List<Boolean> siteMobileIndicator;
  @XmlElement(name = "SiteOwnerEntity", nillable = true)
  protected List<EntityType> siteOwnerEntity;
  @XmlElement(name = "SiteSpecialInformationText", nillable = true)
  protected List<TextType> siteSpecialInformationText;
  @XmlElement(name = "SiteAugmentationPoint")
  protected List<Object> siteAugmentationPoint;

  public List<LocationType> getSiteLocation() {
    if (siteLocation == null) {
      siteLocation = new ArrayList<LocationType>();
    }
    return this.siteLocation;
  }

  public List<TextType> getSiteMobileDescriptionText() {
    if (siteMobileDescriptionText == null) {
      siteMobileDescriptionText = new ArrayList<TextType>();
    }
    return this.siteMobileDescriptionText;
  }

  public List<Boolean> getSiteMobileIndicator() {
    if (siteMobileIndicator == null) {
      siteMobileIndicator = new ArrayList<Boolean>();
    }
    return this.siteMobileIndicator;
  }

  public List<EntityType> getSiteOwnerEntity() {
    if (siteOwnerEntity == null) {
      siteOwnerEntity = new ArrayList<EntityType>();
    }
    return this.siteOwnerEntity;
  }

  public List<TextType> getSiteSpecialInformationText() {
    if (siteSpecialInformationText == null) {
      siteSpecialInformationText = new ArrayList<TextType>();
    }
    return this.siteSpecialInformationText;
  }

  public List<Object> getSiteAugmentationPoint() {
    if (siteAugmentationPoint == null) {
      siteAugmentationPoint = new ArrayList<Object>();
    }
    return this.siteAugmentationPoint;
  }

}
