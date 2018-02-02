package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BearingType", propOrder = {
  "azimuthAbstract",
  "inclinationAbstract",
  "bearingAugmentationPoint"
})
public class BearingType
  extends ObjectType {

  @XmlElementRef(name = "AzimuthAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> azimuthAbstract;
  @XmlElementRef(name = "InclinationAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> inclinationAbstract;
  @XmlElement(name = "BearingAugmentationPoint")
  protected List<Object> bearingAugmentationPoint;

  public List<JAXBElement<?>> getAzimuthAbstract() {
    if (azimuthAbstract == null) {
      azimuthAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.azimuthAbstract;
  }

  public List<JAXBElement<?>> getInclinationAbstract() {
    if (inclinationAbstract == null) {
      inclinationAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.inclinationAbstract;
  }

  public List<Object> getBearingAugmentationPoint() {
    if (bearingAugmentationPoint == null) {
      bearingAugmentationPoint = new ArrayList<Object>();
    }
    return this.bearingAugmentationPoint;
  }

}
