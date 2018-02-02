package gov.niem.release.niem.niem_core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemperatureMeasureType", propOrder = {
  "temperatureUnitAbstract",
  "temperatureMeasureAugmentationPoint"
})
public class TemperatureMeasureType
  extends MeasureType {

  @XmlElementRef(name = "TemperatureUnitAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> temperatureUnitAbstract;
  @XmlElement(name = "TemperatureMeasureAugmentationPoint")
  protected List<Object> temperatureMeasureAugmentationPoint;

  public List<JAXBElement<?>> getTemperatureUnitAbstract() {
    if (temperatureUnitAbstract == null) {
      temperatureUnitAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.temperatureUnitAbstract;
  }

  public List<Object> getTemperatureMeasureAugmentationPoint() {
    if (temperatureMeasureAugmentationPoint == null) {
      temperatureMeasureAugmentationPoint = new ArrayList<Object>();
    }
    return this.temperatureMeasureAugmentationPoint;
  }

}
