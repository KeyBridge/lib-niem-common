package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrivalType", propOrder = {
  "arrivalDate",
  "arrivalEstimatedDate",
  "arrivalLocation",
  "arrivalAugmentationPoint"
})
public class ArrivalType
  extends ObjectType {

  @XmlElement(name = "ArrivalDate", nillable = true)
  protected List<DateType> arrivalDate;
  @XmlElement(name = "ArrivalEstimatedDate", nillable = true)
  protected List<DateType> arrivalEstimatedDate;
  @XmlElement(name = "ArrivalLocation", nillable = true)
  protected List<LocationType> arrivalLocation;
  @XmlElement(name = "ArrivalAugmentationPoint")
  protected List<Object> arrivalAugmentationPoint;

  public List<DateType> getArrivalDate() {
    if (arrivalDate == null) {
      arrivalDate = new ArrayList<DateType>();
    }
    return this.arrivalDate;
  }

  public List<DateType> getArrivalEstimatedDate() {
    if (arrivalEstimatedDate == null) {
      arrivalEstimatedDate = new ArrayList<DateType>();
    }
    return this.arrivalEstimatedDate;
  }

  public List<LocationType> getArrivalLocation() {
    if (arrivalLocation == null) {
      arrivalLocation = new ArrayList<LocationType>();
    }
    return this.arrivalLocation;
  }

  public List<Object> getArrivalAugmentationPoint() {
    if (arrivalAugmentationPoint == null) {
      arrivalAugmentationPoint = new ArrayList<Object>();
    }
    return this.arrivalAugmentationPoint;
  }

}
