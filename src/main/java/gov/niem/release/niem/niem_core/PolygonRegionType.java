package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolygonRegionType", propOrder = {
  "polygonCoordinate",
  "polygonRegionAugmentationPoint"
})
public class PolygonRegionType
  extends ObjectType {

  @XmlElement(name = "PolygonCoordinate", nillable = true)
  protected List<Location2DGeospatialCoordinateType> polygonCoordinate;
  @XmlElement(name = "PolygonRegionAugmentationPoint")
  protected List<Object> polygonRegionAugmentationPoint;

  public List<Location2DGeospatialCoordinateType> getPolygonCoordinate() {
    if (polygonCoordinate == null) {
      polygonCoordinate = new ArrayList<Location2DGeospatialCoordinateType>();
    }
    return this.polygonCoordinate;
  }

  public List<Object> getPolygonRegionAugmentationPoint() {
    if (polygonRegionAugmentationPoint == null) {
      polygonRegionAugmentationPoint = new ArrayList<Object>();
    }
    return this.polygonRegionAugmentationPoint;
  }

}
