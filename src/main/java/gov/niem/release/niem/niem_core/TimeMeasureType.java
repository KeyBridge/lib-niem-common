package gov.niem.release.niem.niem_core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeMeasureType", propOrder = {
  "timeUnitAbstract",
  "timeMeasureAugmentationPoint"
})
public class TimeMeasureType
  extends MeasureType {

  @XmlElementRef(name = "TimeUnitAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> timeUnitAbstract;
  @XmlElement(name = "TimeMeasureAugmentationPoint")
  protected List<Object> timeMeasureAugmentationPoint;

  public List<JAXBElement<?>> getTimeUnitAbstract() {
    if (timeUnitAbstract == null) {
      timeUnitAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.timeUnitAbstract;
  }

  public List<Object> getTimeMeasureAugmentationPoint() {
    if (timeMeasureAugmentationPoint == null) {
      timeMeasureAugmentationPoint = new ArrayList<Object>();
    }
    return this.timeMeasureAugmentationPoint;
  }

}
