package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.Decimal;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AngularMeasureType", propOrder = {
  "angularDegreeValue",
  "angularMinuteValue",
  "angularSecondValue",
  "angularMeasureAugmentationPoint"
})
public class AngularMeasureType
  extends ObjectType {

  @XmlElement(name = "AngularDegreeValue", nillable = true)
  protected List<Decimal> angularDegreeValue;
  @XmlElement(name = "AngularMinuteValue", nillable = true)
  protected List<AngularMinuteType> angularMinuteValue;
  @XmlElement(name = "AngularSecondValue", nillable = true)
  protected List<AngularSecondType> angularSecondValue;
  @XmlElement(name = "AngularMeasureAugmentationPoint")
  protected List<Object> angularMeasureAugmentationPoint;

  public List<Decimal> getAngularDegreeValue() {
    if (angularDegreeValue == null) {
      angularDegreeValue = new ArrayList<Decimal>();
    }
    return this.angularDegreeValue;
  }

  public List<AngularMinuteType> getAngularMinuteValue() {
    if (angularMinuteValue == null) {
      angularMinuteValue = new ArrayList<AngularMinuteType>();
    }
    return this.angularMinuteValue;
  }

  public List<AngularSecondType> getAngularSecondValue() {
    if (angularSecondValue == null) {
      angularSecondValue = new ArrayList<AngularSecondType>();
    }
    return this.angularSecondValue;
  }

  public List<Object> getAngularMeasureAugmentationPoint() {
    if (angularMeasureAugmentationPoint == null) {
      angularMeasureAugmentationPoint = new ArrayList<Object>();
    }
    return this.angularMeasureAugmentationPoint;
  }

}
