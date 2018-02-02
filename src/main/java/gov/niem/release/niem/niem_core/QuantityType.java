package gov.niem.release.niem.niem_core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityType")
public class QuantityType
  extends NumericType {

  @XmlAttribute(name = "quantityUnitText", namespace = "http://release.niem.gov/niem/niem-core/4.0/")
  protected String quantityUnitText;

  public String getQuantityUnitText() {
    return quantityUnitText;
  }

  public void setQuantityUnitText(String value) {
    this.quantityUnitText = value;
  }

}
