package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrossStreetType", propOrder = {
  "crossStreetDescriptionText",
  "crossStreetRelativeLocation",
  "locationStreet",
  "crossStreetAugmentationPoint"
})
public class CrossStreetType
  extends ObjectType {

  @XmlElement(name = "CrossStreetDescriptionText", nillable = true)
  protected List<TextType> crossStreetDescriptionText;
  @XmlElement(name = "CrossStreetRelativeLocation", nillable = true)
  protected List<RelativeLocationType> crossStreetRelativeLocation;
  @XmlElement(name = "LocationStreet", nillable = true)
  protected List<StreetType> locationStreet;
  @XmlElement(name = "CrossStreetAugmentationPoint")
  protected List<Object> crossStreetAugmentationPoint;

  public List<TextType> getCrossStreetDescriptionText() {
    if (crossStreetDescriptionText == null) {
      crossStreetDescriptionText = new ArrayList<TextType>();
    }
    return this.crossStreetDescriptionText;
  }

  public List<RelativeLocationType> getCrossStreetRelativeLocation() {
    if (crossStreetRelativeLocation == null) {
      crossStreetRelativeLocation = new ArrayList<RelativeLocationType>();
    }
    return this.crossStreetRelativeLocation;
  }

  public List<StreetType> getLocationStreet() {
    if (locationStreet == null) {
      locationStreet = new ArrayList<StreetType>();
    }
    return this.locationStreet;
  }

  public List<Object> getCrossStreetAugmentationPoint() {
    if (crossStreetAugmentationPoint == null) {
      crossStreetAugmentationPoint = new ArrayList<Object>();
    }
    return this.crossStreetAugmentationPoint;
  }

}
