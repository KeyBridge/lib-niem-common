package gov.niem.release.niem.niem_core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AngleMeasureType", propOrder = {
  "angleUnitAbstract",
  "angleMeasureAugmentationPoint"
})
public class AngleMeasureType
  extends MeasureType {

  @XmlElement(name = "AngleUnitAbstract")
  protected List<Object> angleUnitAbstract;
  @XmlElement(name = "AngleMeasureAugmentationPoint")
  protected List<Object> angleMeasureAugmentationPoint;

  public List<Object> getAngleUnitAbstract() {
    if (angleUnitAbstract == null) {
      angleUnitAbstract = new ArrayList<Object>();
    }
    return this.angleUnitAbstract;
  }

  public List<Object> getAngleMeasureAugmentationPoint() {
    if (angleMeasureAugmentationPoint == null) {
      angleMeasureAugmentationPoint = new ArrayList<Object>();
    }
    return this.angleMeasureAugmentationPoint;
  }

}
