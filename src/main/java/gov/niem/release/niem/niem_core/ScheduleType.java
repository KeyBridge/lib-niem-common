package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.Boolean;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleType", propOrder = {
  "scheduleDay",
  "scheduleDescriptionText",
  "scheduleExceptionsDescriptionText",
  "scheduleNonStopIndicator",
  "scheduleStatus",
  "scheduleAugmentationPoint"
})
public class ScheduleType
  extends ObjectType {

  @XmlElement(name = "ScheduleDay", nillable = true)
  protected List<ScheduleDayType> scheduleDay;
  @XmlElement(name = "ScheduleDescriptionText", nillable = true)
  protected List<TextType> scheduleDescriptionText;
  @XmlElement(name = "ScheduleExceptionsDescriptionText", nillable = true)
  protected List<TextType> scheduleExceptionsDescriptionText;
  @XmlElement(name = "ScheduleNonStopIndicator", nillable = true)
  protected List<Boolean> scheduleNonStopIndicator;
  @XmlElement(name = "ScheduleStatus", nillable = true)
  protected List<StatusType> scheduleStatus;
  @XmlElement(name = "ScheduleAugmentationPoint")
  protected List<Object> scheduleAugmentationPoint;

  public List<ScheduleDayType> getScheduleDay() {
    if (scheduleDay == null) {
      scheduleDay = new ArrayList<ScheduleDayType>();
    }
    return this.scheduleDay;
  }

  public List<TextType> getScheduleDescriptionText() {
    if (scheduleDescriptionText == null) {
      scheduleDescriptionText = new ArrayList<TextType>();
    }
    return this.scheduleDescriptionText;
  }

  public List<TextType> getScheduleExceptionsDescriptionText() {
    if (scheduleExceptionsDescriptionText == null) {
      scheduleExceptionsDescriptionText = new ArrayList<TextType>();
    }
    return this.scheduleExceptionsDescriptionText;
  }

  public List<Boolean> getScheduleNonStopIndicator() {
    if (scheduleNonStopIndicator == null) {
      scheduleNonStopIndicator = new ArrayList<Boolean>();
    }
    return this.scheduleNonStopIndicator;
  }

  public List<StatusType> getScheduleStatus() {
    if (scheduleStatus == null) {
      scheduleStatus = new ArrayList<StatusType>();
    }
    return this.scheduleStatus;
  }

  public List<Object> getScheduleAugmentationPoint() {
    if (scheduleAugmentationPoint == null) {
      scheduleAugmentationPoint = new ArrayList<Object>();
    }
    return this.scheduleAugmentationPoint;
  }

}
