package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.Decimal;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountType", propOrder = {
  "amount",
  "currencyAbstract",
  "amountAugmentationPoint"
})
public class AmountType
  extends ObjectType {

  @XmlElement(name = "Amount", nillable = true)
  protected List<Decimal> amount;
  @XmlElementRef(name = "CurrencyAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> currencyAbstract;
  @XmlElement(name = "AmountAugmentationPoint")
  protected List<Object> amountAugmentationPoint;

  public List<Decimal> getAmount() {
    if (amount == null) {
      amount = new ArrayList<Decimal>();
    }
    return this.amount;
  }

  public List<JAXBElement<?>> getCurrencyAbstract() {
    if (currencyAbstract == null) {
      currencyAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.currencyAbstract;
  }

  public List<Object> getAmountAugmentationPoint() {
    if (amountAugmentationPoint == null) {
      amountAugmentationPoint = new ArrayList<Object>();
    }
    return this.amountAugmentationPoint;
  }

}
