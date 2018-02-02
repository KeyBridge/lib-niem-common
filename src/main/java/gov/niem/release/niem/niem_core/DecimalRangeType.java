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
@XmlType(name = "DecimalRangeType", propOrder = {
  "rangeMinimumDecimalValue",
  "rangeMaximumDecimalValue",
  "decimalRangeAugmentationPoint"
})
public class DecimalRangeType
  extends ObjectType {

  @XmlElement(name = "RangeMinimumDecimalValue", nillable = true)
  protected List<Decimal> rangeMinimumDecimalValue;
  @XmlElement(name = "RangeMaximumDecimalValue", nillable = true)
  protected List<Decimal> rangeMaximumDecimalValue;
  @XmlElement(name = "DecimalRangeAugmentationPoint")
  protected List<Object> decimalRangeAugmentationPoint;

  public List<Decimal> getRangeMinimumDecimalValue() {
    if (rangeMinimumDecimalValue == null) {
      rangeMinimumDecimalValue = new ArrayList<Decimal>();
    }
    return this.rangeMinimumDecimalValue;
  }

  public List<Decimal> getRangeMaximumDecimalValue() {
    if (rangeMaximumDecimalValue == null) {
      rangeMaximumDecimalValue = new ArrayList<Decimal>();
    }
    return this.rangeMaximumDecimalValue;
  }

  public List<Object> getDecimalRangeAugmentationPoint() {
    if (decimalRangeAugmentationPoint == null) {
      decimalRangeAugmentationPoint = new ArrayList<Object>();
    }
    return this.decimalRangeAugmentationPoint;
  }

}
