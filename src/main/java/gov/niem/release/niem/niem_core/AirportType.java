package gov.niem.release.niem.niem_core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirportType", propOrder = {
  "airportCodeAbstract",
  "airportAugmentationPoint"
})
public class AirportType
  extends FacilityType {

  @XmlElementRef(name = "AirportCodeAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> airportCodeAbstract;
  @XmlElement(name = "AirportAugmentationPoint")
  protected List<Object> airportAugmentationPoint;

  public List<JAXBElement<?>> getAirportCodeAbstract() {
    if (airportCodeAbstract == null) {
      airportCodeAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.airportCodeAbstract;
  }

  public List<Object> getAirportAugmentationPoint() {
    if (airportAugmentationPoint == null) {
      airportAugmentationPoint = new ArrayList<Object>();
    }
    return this.airportAugmentationPoint;
  }

}
