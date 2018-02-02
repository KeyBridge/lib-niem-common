package gov.niem.release.niem.niem_core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeightMeasureType", propOrder = {
  "weightUnitAbstract",
  "weightMeasureAugmentationPoint"
})
public class WeightMeasureType
  extends MeasureType {

  @XmlElementRef(name = "WeightUnitAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> weightUnitAbstract;
  @XmlElement(name = "WeightMeasureAugmentationPoint")
  protected List<Object> weightMeasureAugmentationPoint;

  public List<JAXBElement<?>> getWeightUnitAbstract() {
    if (weightUnitAbstract == null) {
      weightUnitAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.weightUnitAbstract;
  }

  public List<Object> getWeightMeasureAugmentationPoint() {
    if (weightMeasureAugmentationPoint == null) {
      weightMeasureAugmentationPoint = new ArrayList<Object>();
    }
    return this.weightMeasureAugmentationPoint;
  }

}
