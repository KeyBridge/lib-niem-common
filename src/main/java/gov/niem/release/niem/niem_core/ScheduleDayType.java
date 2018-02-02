package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.Time;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleDayType", propOrder = {
  "scheduleActivityText",
  "scheduleDayAbstract",
  "scheduleDayStatus",
  "scheduleTimeRange",
  "schedulePerson",
  "scheduleDayStartTime",
  "scheduleDayEndTime",
  "scheduleDayAugmentationPoint"
})
public class ScheduleDayType
  extends ObjectType {

  @XmlElement(name = "ScheduleActivityText", nillable = true)
  protected List<TextType> scheduleActivityText;
  @XmlElementRef(name = "ScheduleDayAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> scheduleDayAbstract;
  @XmlElement(name = "ScheduleDayStatus", nillable = true)
  protected List<StatusType> scheduleDayStatus;
  @XmlElement(name = "ScheduleTimeRange", nillable = true)
  protected List<TimeRangeType> scheduleTimeRange;
  @XmlElement(name = "SchedulePerson", nillable = true)
  protected List<PersonType> schedulePerson;
  @XmlElement(name = "ScheduleDayStartTime", nillable = true)
  protected List<Time> scheduleDayStartTime;
  @XmlElement(name = "ScheduleDayEndTime", nillable = true)
  protected List<Time> scheduleDayEndTime;
  @XmlElement(name = "ScheduleDayAugmentationPoint")
  protected List<Object> scheduleDayAugmentationPoint;

  public List<TextType> getScheduleActivityText() {
    if (scheduleActivityText == null) {
      scheduleActivityText = new ArrayList<TextType>();
    }
    return this.scheduleActivityText;
  }

  public List<JAXBElement<?>> getScheduleDayAbstract() {
    if (scheduleDayAbstract == null) {
      scheduleDayAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.scheduleDayAbstract;
  }

  public List<StatusType> getScheduleDayStatus() {
    if (scheduleDayStatus == null) {
      scheduleDayStatus = new ArrayList<StatusType>();
    }
    return this.scheduleDayStatus;
  }

  public List<TimeRangeType> getScheduleTimeRange() {
    if (scheduleTimeRange == null) {
      scheduleTimeRange = new ArrayList<TimeRangeType>();
    }
    return this.scheduleTimeRange;
  }

  public List<PersonType> getSchedulePerson() {
    if (schedulePerson == null) {
      schedulePerson = new ArrayList<PersonType>();
    }
    return this.schedulePerson;
  }

  public List<Time> getScheduleDayStartTime() {
    if (scheduleDayStartTime == null) {
      scheduleDayStartTime = new ArrayList<Time>();
    }
    return this.scheduleDayStartTime;
  }

  public List<Time> getScheduleDayEndTime() {
    if (scheduleDayEndTime == null) {
      scheduleDayEndTime = new ArrayList<Time>();
    }
    return this.scheduleDayEndTime;
  }

  public List<Object> getScheduleDayAugmentationPoint() {
    if (scheduleDayAugmentationPoint == null) {
      scheduleDayAugmentationPoint = new ArrayList<Object>();
    }
    return this.scheduleDayAugmentationPoint;
  }

}
