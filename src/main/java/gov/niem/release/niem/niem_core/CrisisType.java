package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.AnyURI;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrisisType", propOrder = {
  "crisisIdentification",
  "crisisName",
  "crisisLocation",
  "crisisImage",
  "crisisURLID",
  "crisisDescriptionText",
  "crisisStatus",
  "crisisAugmentationPoint"
})
public class CrisisType
  extends ObjectType {

  @XmlElement(name = "CrisisIdentification", nillable = true)
  protected List<IdentificationType> crisisIdentification;
  @XmlElement(name = "CrisisName", nillable = true)
  protected List<TextType> crisisName;
  @XmlElement(name = "CrisisLocation", nillable = true)
  protected List<LocationType> crisisLocation;
  @XmlElement(name = "CrisisImage", nillable = true)
  protected List<ImageType> crisisImage;
  @XmlElement(name = "CrisisURLID", nillable = true)
  protected List<AnyURI> crisisURLID;
  @XmlElement(name = "CrisisDescriptionText", nillable = true)
  protected List<TextType> crisisDescriptionText;
  @XmlElement(name = "CrisisStatus", nillable = true)
  protected List<StatusType> crisisStatus;
  @XmlElement(name = "CrisisAugmentationPoint")
  protected List<Object> crisisAugmentationPoint;

  public List<IdentificationType> getCrisisIdentification() {
    if (crisisIdentification == null) {
      crisisIdentification = new ArrayList<IdentificationType>();
    }
    return this.crisisIdentification;
  }

  public List<TextType> getCrisisName() {
    if (crisisName == null) {
      crisisName = new ArrayList<TextType>();
    }
    return this.crisisName;
  }

  public List<LocationType> getCrisisLocation() {
    if (crisisLocation == null) {
      crisisLocation = new ArrayList<LocationType>();
    }
    return this.crisisLocation;
  }

  public List<ImageType> getCrisisImage() {
    if (crisisImage == null) {
      crisisImage = new ArrayList<ImageType>();
    }
    return this.crisisImage;
  }

  public List<AnyURI> getCrisisURLID() {
    if (crisisURLID == null) {
      crisisURLID = new ArrayList<AnyURI>();
    }
    return this.crisisURLID;
  }

  public List<TextType> getCrisisDescriptionText() {
    if (crisisDescriptionText == null) {
      crisisDescriptionText = new ArrayList<TextType>();
    }
    return this.crisisDescriptionText;
  }

  public List<StatusType> getCrisisStatus() {
    if (crisisStatus == null) {
      crisisStatus = new ArrayList<StatusType>();
    }
    return this.crisisStatus;
  }

  public List<Object> getCrisisAugmentationPoint() {
    if (crisisAugmentationPoint == null) {
      crisisAugmentationPoint = new ArrayList<Object>();
    }
    return this.crisisAugmentationPoint;
  }

}
