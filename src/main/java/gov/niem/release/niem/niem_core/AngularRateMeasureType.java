package gov.niem.release.niem.niem_core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AngularRateMeasureType", propOrder = {
  "angularRateUnitAbstract",
  "angularRateMeasureAugmentationPoint"
})
public class AngularRateMeasureType
  extends MeasureType {

  @XmlElement(name = "AngularRateUnitAbstract")
  protected List<Object> angularRateUnitAbstract;
  @XmlElement(name = "AngularRateMeasureAugmentationPoint")
  protected List<Object> angularRateMeasureAugmentationPoint;

  public List<Object> getAngularRateUnitAbstract() {
    if (angularRateUnitAbstract == null) {
      angularRateUnitAbstract = new ArrayList<Object>();
    }
    return this.angularRateUnitAbstract;
  }

  public List<Object> getAngularRateMeasureAugmentationPoint() {
    if (angularRateMeasureAugmentationPoint == null) {
      angularRateMeasureAugmentationPoint = new ArrayList<Object>();
    }
    return this.angularRateMeasureAugmentationPoint;
  }

}
