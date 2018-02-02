package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.UnsignedInt;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnsignedIntegerRangeType", propOrder = {
  "rangeMaximumUnsignedIntegerValue",
  "rangeMinimumUnsignedIntegerValue",
  "unsignedIntegerRangeAugmentationPoint"
})
public class UnsignedIntegerRangeType
  extends ObjectType {

  @XmlElement(name = "RangeMaximumUnsignedIntegerValue", nillable = true)
  protected List<UnsignedInt> rangeMaximumUnsignedIntegerValue;
  @XmlElement(name = "RangeMinimumUnsignedIntegerValue", nillable = true)
  protected List<UnsignedInt> rangeMinimumUnsignedIntegerValue;
  @XmlElement(name = "UnsignedIntegerRangeAugmentationPoint")
  protected List<Object> unsignedIntegerRangeAugmentationPoint;

  public List<UnsignedInt> getRangeMaximumUnsignedIntegerValue() {
    if (rangeMaximumUnsignedIntegerValue == null) {
      rangeMaximumUnsignedIntegerValue = new ArrayList<UnsignedInt>();
    }
    return this.rangeMaximumUnsignedIntegerValue;
  }

  public List<UnsignedInt> getRangeMinimumUnsignedIntegerValue() {
    if (rangeMinimumUnsignedIntegerValue == null) {
      rangeMinimumUnsignedIntegerValue = new ArrayList<UnsignedInt>();
    }
    return this.rangeMinimumUnsignedIntegerValue;
  }

  public List<Object> getUnsignedIntegerRangeAugmentationPoint() {
    if (unsignedIntegerRangeAugmentationPoint == null) {
      unsignedIntegerRangeAugmentationPoint = new ArrayList<Object>();
    }
    return this.unsignedIntegerRangeAugmentationPoint;
  }

}
