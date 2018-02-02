package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CircularRegionType", propOrder = {
  "circularRegionCenterCoordinate",
  "circularRegionRadiusLengthMeasure",
  "circularRegionAugmentationPoint"
})
public class CircularRegionType
  extends ObjectType {

  @XmlElement(name = "CircularRegionCenterCoordinate", nillable = true)
  protected List<Location2DGeospatialCoordinateType> circularRegionCenterCoordinate;
  @XmlElement(name = "CircularRegionRadiusLengthMeasure", nillable = true)
  protected List<LengthMeasureType> circularRegionRadiusLengthMeasure;
  @XmlElement(name = "CircularRegionAugmentationPoint")
  protected List<Object> circularRegionAugmentationPoint;

  public List<Location2DGeospatialCoordinateType> getCircularRegionCenterCoordinate() {
    if (circularRegionCenterCoordinate == null) {
      circularRegionCenterCoordinate = new ArrayList<Location2DGeospatialCoordinateType>();
    }
    return this.circularRegionCenterCoordinate;
  }

  public List<LengthMeasureType> getCircularRegionRadiusLengthMeasure() {
    if (circularRegionRadiusLengthMeasure == null) {
      circularRegionRadiusLengthMeasure = new ArrayList<LengthMeasureType>();
    }
    return this.circularRegionRadiusLengthMeasure;
  }

  public List<Object> getCircularRegionAugmentationPoint() {
    if (circularRegionAugmentationPoint == null) {
      circularRegionAugmentationPoint = new ArrayList<Object>();
    }
    return this.circularRegionAugmentationPoint;
  }

}
