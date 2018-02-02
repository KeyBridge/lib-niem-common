package gov.niem.release.niem.niem_core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationHeightMeasureType", propOrder = {
  "locationHeightVerticalDatumAbstract",
  "locationHeightMeasureAugmentationPoint"
})
public class LocationHeightMeasureType
  extends MeasureType {

  @XmlElementRef(name = "LocationHeightVerticalDatumAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> locationHeightVerticalDatumAbstract;
  @XmlElement(name = "LocationHeightMeasureAugmentationPoint")
  protected List<Object> locationHeightMeasureAugmentationPoint;

  public List<JAXBElement<?>> getLocationHeightVerticalDatumAbstract() {
    if (locationHeightVerticalDatumAbstract == null) {
      locationHeightVerticalDatumAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.locationHeightVerticalDatumAbstract;
  }

  public List<Object> getLocationHeightMeasureAugmentationPoint() {
    if (locationHeightMeasureAugmentationPoint == null) {
      locationHeightMeasureAugmentationPoint = new ArrayList<Object>();
    }
    return this.locationHeightMeasureAugmentationPoint;
  }

}
