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
@XmlType(name = "HighwayType", propOrder = {
  "highwayFullText",
  "highwayName",
  "highwayID",
  "highwayPositionText",
  "highwayAugmentationPoint"
})
public class HighwayType
  extends ObjectType {

  @XmlElement(name = "HighwayFullText", nillable = true)
  protected List<TextType> highwayFullText;
  @XmlElement(name = "HighwayName", nillable = true)
  protected List<TextType> highwayName;
  @XmlElement(name = "HighwayID", nillable = true)
  protected List<String> highwayID;
  @XmlElement(name = "HighwayPositionText", nillable = true)
  protected List<TextType> highwayPositionText;
  @XmlElement(name = "HighwayAugmentationPoint")
  protected List<Object> highwayAugmentationPoint;

  public List<TextType> getHighwayFullText() {
    if (highwayFullText == null) {
      highwayFullText = new ArrayList<TextType>();
    }
    return this.highwayFullText;
  }

  public List<TextType> getHighwayName() {
    if (highwayName == null) {
      highwayName = new ArrayList<TextType>();
    }
    return this.highwayName;
  }

  public List<String> getHighwayID() {
    if (highwayID == null) {
      highwayID = new ArrayList<String>();
    }
    return this.highwayID;
  }

  public List<TextType> getHighwayPositionText() {
    if (highwayPositionText == null) {
      highwayPositionText = new ArrayList<TextType>();
    }
    return this.highwayPositionText;
  }

  public List<Object> getHighwayAugmentationPoint() {
    if (highwayAugmentationPoint == null) {
      highwayAugmentationPoint = new ArrayList<Object>();
    }
    return this.highwayAugmentationPoint;
  }

}
