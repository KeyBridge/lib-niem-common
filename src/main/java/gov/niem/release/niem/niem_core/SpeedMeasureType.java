package gov.niem.release.niem.niem_core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpeedMeasureType", propOrder = {
  "speedUnitAbstract",
  "speedMeasureAugmentationPoint"
})
@XmlSeeAlso({
  VelocityMeasureType.class
})
public class SpeedMeasureType
  extends MeasureType {

  @XmlElementRef(name = "SpeedUnitAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> speedUnitAbstract;
  @XmlElement(name = "SpeedMeasureAugmentationPoint")
  protected List<Object> speedMeasureAugmentationPoint;

  public List<JAXBElement<?>> getSpeedUnitAbstract() {
    if (speedUnitAbstract == null) {
      speedUnitAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.speedUnitAbstract;
  }

  public List<Object> getSpeedMeasureAugmentationPoint() {
    if (speedMeasureAugmentationPoint == null) {
      speedMeasureAugmentationPoint = new ArrayList<Object>();
    }
    return this.speedMeasureAugmentationPoint;
  }

}
