package gov.niem.release.niem.niem_core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumeMeasureType", propOrder = {
  "volumeUnitAbstract",
  "volumeMeasureAugmentationPoint"
})
public class VolumeMeasureType
  extends MeasureType {

  @XmlElementRef(name = "VolumeUnitAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> volumeUnitAbstract;
  @XmlElement(name = "VolumeMeasureAugmentationPoint")
  protected List<Object> volumeMeasureAugmentationPoint;

  public List<JAXBElement<?>> getVolumeUnitAbstract() {
    if (volumeUnitAbstract == null) {
      volumeUnitAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.volumeUnitAbstract;
  }

  public List<Object> getVolumeMeasureAugmentationPoint() {
    if (volumeMeasureAugmentationPoint == null) {
      volumeMeasureAugmentationPoint = new ArrayList<Object>();
    }
    return this.volumeMeasureAugmentationPoint;
  }

}
