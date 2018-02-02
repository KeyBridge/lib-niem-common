package gov.niem.release.niem.niem_core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumptionRateMeasureType", propOrder = {
  "consumptionRateUnitAbstract",
  "consumptionRateMeasureAugmentationPoint"
})
public class ConsumptionRateMeasureType
  extends MeasureType {

  @XmlElement(name = "ConsumptionRateUnitAbstract")
  protected List<Object> consumptionRateUnitAbstract;
  @XmlElement(name = "ConsumptionRateMeasureAugmentationPoint")
  protected List<Object> consumptionRateMeasureAugmentationPoint;

  public List<Object> getConsumptionRateUnitAbstract() {
    if (consumptionRateUnitAbstract == null) {
      consumptionRateUnitAbstract = new ArrayList<Object>();
    }
    return this.consumptionRateUnitAbstract;
  }

  public List<Object> getConsumptionRateMeasureAugmentationPoint() {
    if (consumptionRateMeasureAugmentationPoint == null) {
      consumptionRateMeasureAugmentationPoint = new ArrayList<Object>();
    }
    return this.consumptionRateMeasureAugmentationPoint;
  }

}
