package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.Decimal;
import java.math.BigDecimal;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumericType")
@XmlSeeAlso({
  QuantityType.class
})
public class NumericType
  extends Decimal {

  @XmlAttribute(name = "confidencePercent", namespace = "http://release.niem.gov/niem/niem-core/4.0/")
  protected BigDecimal confidencePercent;
  @XmlAttribute(name = "toleranceNumeric", namespace = "http://release.niem.gov/niem/niem-core/4.0/")
  protected BigDecimal toleranceNumeric;

  public BigDecimal getConfidencePercent() {
    return confidencePercent;
  }

  public void setConfidencePercent(BigDecimal value) {
    this.confidencePercent = value;
  }

  public BigDecimal getToleranceNumeric() {
    return toleranceNumeric;
  }

  public void setToleranceNumeric(BigDecimal value) {
    this.toleranceNumeric = value;
  }

}
