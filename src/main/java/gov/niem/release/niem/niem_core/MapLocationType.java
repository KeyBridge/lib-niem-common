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
@XmlType(name = "MapLocationType", propOrder = {
  "mapCoordinateFullText",
  "mapDate",
  "mapElevationCoordinateText",
  "mapHorizontalCoordinateText",
  "mapLocationDescriptionText",
  "mapName",
  "mapPageID",
  "mapQuadrantText",
  "mapVersionID",
  "mapVerticalCoordinateText",
  "mapLocationAugmentationPoint"
})
public class MapLocationType
  extends ObjectType {

  @XmlElement(name = "MapCoordinateFullText", nillable = true)
  protected List<TextType> mapCoordinateFullText;
  @XmlElement(name = "MapDate", nillable = true)
  protected List<DateType> mapDate;
  @XmlElement(name = "MapElevationCoordinateText", nillable = true)
  protected List<TextType> mapElevationCoordinateText;
  @XmlElement(name = "MapHorizontalCoordinateText", nillable = true)
  protected List<TextType> mapHorizontalCoordinateText;
  @XmlElement(name = "MapLocationDescriptionText", nillable = true)
  protected List<TextType> mapLocationDescriptionText;
  @XmlElement(name = "MapName", nillable = true)
  protected List<TextType> mapName;
  @XmlElement(name = "MapPageID", nillable = true)
  protected List<String> mapPageID;
  @XmlElement(name = "MapQuadrantText", nillable = true)
  protected List<TextType> mapQuadrantText;
  @XmlElement(name = "MapVersionID", nillable = true)
  protected List<String> mapVersionID;
  @XmlElement(name = "MapVerticalCoordinateText", nillable = true)
  protected List<TextType> mapVerticalCoordinateText;
  @XmlElement(name = "MapLocationAugmentationPoint")
  protected List<Object> mapLocationAugmentationPoint;

  public List<TextType> getMapCoordinateFullText() {
    if (mapCoordinateFullText == null) {
      mapCoordinateFullText = new ArrayList<TextType>();
    }
    return this.mapCoordinateFullText;
  }

  public List<DateType> getMapDate() {
    if (mapDate == null) {
      mapDate = new ArrayList<DateType>();
    }
    return this.mapDate;
  }

  public List<TextType> getMapElevationCoordinateText() {
    if (mapElevationCoordinateText == null) {
      mapElevationCoordinateText = new ArrayList<TextType>();
    }
    return this.mapElevationCoordinateText;
  }

  public List<TextType> getMapHorizontalCoordinateText() {
    if (mapHorizontalCoordinateText == null) {
      mapHorizontalCoordinateText = new ArrayList<TextType>();
    }
    return this.mapHorizontalCoordinateText;
  }

  public List<TextType> getMapLocationDescriptionText() {
    if (mapLocationDescriptionText == null) {
      mapLocationDescriptionText = new ArrayList<TextType>();
    }
    return this.mapLocationDescriptionText;
  }

  public List<TextType> getMapName() {
    if (mapName == null) {
      mapName = new ArrayList<TextType>();
    }
    return this.mapName;
  }

  public List<String> getMapPageID() {
    if (mapPageID == null) {
      mapPageID = new ArrayList<String>();
    }
    return this.mapPageID;
  }

  public List<TextType> getMapQuadrantText() {
    if (mapQuadrantText == null) {
      mapQuadrantText = new ArrayList<TextType>();
    }
    return this.mapQuadrantText;
  }

  public List<String> getMapVersionID() {
    if (mapVersionID == null) {
      mapVersionID = new ArrayList<String>();
    }
    return this.mapVersionID;
  }

  public List<TextType> getMapVerticalCoordinateText() {
    if (mapVerticalCoordinateText == null) {
      mapVerticalCoordinateText = new ArrayList<TextType>();
    }
    return this.mapVerticalCoordinateText;
  }

  public List<Object> getMapLocationAugmentationPoint() {
    if (mapLocationAugmentationPoint == null) {
      mapLocationAugmentationPoint = new ArrayList<Object>();
    }
    return this.mapLocationAugmentationPoint;
  }

}
