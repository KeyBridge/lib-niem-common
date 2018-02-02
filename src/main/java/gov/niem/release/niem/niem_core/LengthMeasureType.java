package gov.niem.release.niem.niem_core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LengthMeasureType", propOrder = {
  "lengthUnitAbstract",
  "lengthMeasureAugmentationPoint"
})
public class LengthMeasureType
  extends MeasureType {

  @XmlElementRef(name = "LengthUnitAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> lengthUnitAbstract;
  @XmlElement(name = "LengthMeasureAugmentationPoint")
  protected List<Object> lengthMeasureAugmentationPoint;

  public List<JAXBElement<?>> getLengthUnitAbstract() {
    if (lengthUnitAbstract == null) {
      lengthUnitAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.lengthUnitAbstract;
  }

  public List<Object> getLengthMeasureAugmentationPoint() {
    if (lengthMeasureAugmentationPoint == null) {
      lengthMeasureAugmentationPoint = new ArrayList<Object>();
    }
    return this.lengthMeasureAugmentationPoint;
  }

}
