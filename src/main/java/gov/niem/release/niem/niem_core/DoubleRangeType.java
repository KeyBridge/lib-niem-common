package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.Double;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoubleRangeType", propOrder = {
  "rangeMaximumDoubleValue",
  "rangeMinimumDoubleValue",
  "doubleRangeAugmentationPoint"
})
public class DoubleRangeType
  extends ObjectType {

  @XmlElement(name = "RangeMaximumDoubleValue", nillable = true)
  protected List<Double> rangeMaximumDoubleValue;
  @XmlElement(name = "RangeMinimumDoubleValue", nillable = true)
  protected List<Double> rangeMinimumDoubleValue;
  @XmlElement(name = "DoubleRangeAugmentationPoint")
  protected List<Object> doubleRangeAugmentationPoint;

  public List<Double> getRangeMaximumDoubleValue() {
    if (rangeMaximumDoubleValue == null) {
      rangeMaximumDoubleValue = new ArrayList<Double>();
    }
    return this.rangeMaximumDoubleValue;
  }

  public List<Double> getRangeMinimumDoubleValue() {
    if (rangeMinimumDoubleValue == null) {
      rangeMinimumDoubleValue = new ArrayList<Double>();
    }
    return this.rangeMinimumDoubleValue;
  }

  public List<Object> getDoubleRangeAugmentationPoint() {
    if (doubleRangeAugmentationPoint == null) {
      doubleRangeAugmentationPoint = new ArrayList<Object>();
    }
    return this.doubleRangeAugmentationPoint;
  }

}
