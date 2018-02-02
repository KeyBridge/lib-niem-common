package gov.niem.release.niem.niem_core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AircraftType", propOrder = {
  "aircraftTailIdentification",
  "aircraftMakeAbstract",
  "aircraftModelAbstract",
  "aircraftStyleAbstract",
  "aircraftFuselageColorAbstract",
  "aircraftWingColorAbstract",
  "aircraftBaseAirport",
  "aircraftAugmentationPoint"
})
public class AircraftType
  extends ConveyanceType {

  @XmlElement(name = "AircraftTailIdentification", nillable = true)
  protected List<IdentificationType> aircraftTailIdentification;
  @XmlElement(name = "AircraftMakeAbstract")
  protected List<Object> aircraftMakeAbstract;
  @XmlElement(name = "AircraftModelAbstract")
  protected List<Object> aircraftModelAbstract;
  @XmlElement(name = "AircraftStyleAbstract")
  protected List<Object> aircraftStyleAbstract;
  @XmlElementRef(name = "AircraftFuselageColorAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> aircraftFuselageColorAbstract;
  @XmlElementRef(name = "AircraftWingColorAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> aircraftWingColorAbstract;
  @XmlElement(name = "AircraftBaseAirport", nillable = true)
  protected List<AirportType> aircraftBaseAirport;
  @XmlElement(name = "AircraftAugmentationPoint")
  protected List<Object> aircraftAugmentationPoint;

  public List<IdentificationType> getAircraftTailIdentification() {
    if (aircraftTailIdentification == null) {
      aircraftTailIdentification = new ArrayList<IdentificationType>();
    }
    return this.aircraftTailIdentification;
  }

  public List<Object> getAircraftMakeAbstract() {
    if (aircraftMakeAbstract == null) {
      aircraftMakeAbstract = new ArrayList<Object>();
    }
    return this.aircraftMakeAbstract;
  }

  public List<Object> getAircraftModelAbstract() {
    if (aircraftModelAbstract == null) {
      aircraftModelAbstract = new ArrayList<Object>();
    }
    return this.aircraftModelAbstract;
  }

  public List<Object> getAircraftStyleAbstract() {
    if (aircraftStyleAbstract == null) {
      aircraftStyleAbstract = new ArrayList<Object>();
    }
    return this.aircraftStyleAbstract;
  }

  public List<JAXBElement<?>> getAircraftFuselageColorAbstract() {
    if (aircraftFuselageColorAbstract == null) {
      aircraftFuselageColorAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.aircraftFuselageColorAbstract;
  }

  public List<JAXBElement<?>> getAircraftWingColorAbstract() {
    if (aircraftWingColorAbstract == null) {
      aircraftWingColorAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.aircraftWingColorAbstract;
  }

  public List<AirportType> getAircraftBaseAirport() {
    if (aircraftBaseAirport == null) {
      aircraftBaseAirport = new ArrayList<AirportType>();
    }
    return this.aircraftBaseAirport;
  }

  public List<Object> getAircraftAugmentationPoint() {
    if (aircraftAugmentationPoint == null) {
      aircraftAugmentationPoint = new ArrayList<Object>();
    }
    return this.aircraftAugmentationPoint;
  }

}
