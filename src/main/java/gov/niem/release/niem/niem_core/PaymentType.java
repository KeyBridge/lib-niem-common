package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentType", propOrder = {
  "paymentAmount",
  "paymentMethodAbstract",
  "paymentAugmentationPoint"
})
public class PaymentType
  extends ObjectType {

  @XmlElement(name = "PaymentAmount", nillable = true)
  protected List<AmountType> paymentAmount;
  @XmlElementRef(name = "PaymentMethodAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> paymentMethodAbstract;
  @XmlElement(name = "PaymentAugmentationPoint")
  protected List<Object> paymentAugmentationPoint;

  public List<AmountType> getPaymentAmount() {
    if (paymentAmount == null) {
      paymentAmount = new ArrayList<AmountType>();
    }
    return this.paymentAmount;
  }

  public List<JAXBElement<?>> getPaymentMethodAbstract() {
    if (paymentMethodAbstract == null) {
      paymentMethodAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.paymentMethodAbstract;
  }

  public List<Object> getPaymentAugmentationPoint() {
    if (paymentAugmentationPoint == null) {
      paymentAugmentationPoint = new ArrayList<Object>();
    }
    return this.paymentAugmentationPoint;
  }

}
