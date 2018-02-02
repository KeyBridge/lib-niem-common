package gov.niem.release.niem.niem_core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VelocityMeasureType", propOrder = {
  "bearing",
  "velocityMeasureAugmentationPoint"
})
public class VelocityMeasureType
  extends SpeedMeasureType {

  @XmlElement(name = "Bearing", nillable = true)
  protected List<BearingType> bearing;
  @XmlElement(name = "VelocityMeasureAugmentationPoint")
  protected List<Object> velocityMeasureAugmentationPoint;

  public List<BearingType> getBearing() {
    if (bearing == null) {
      bearing = new ArrayList<BearingType>();
    }
    return this.bearing;
  }

  public List<Object> getVelocityMeasureAugmentationPoint() {
    if (velocityMeasureAugmentationPoint == null) {
      velocityMeasureAugmentationPoint = new ArrayList<Object>();
    }
    return this.velocityMeasureAugmentationPoint;
  }

}
