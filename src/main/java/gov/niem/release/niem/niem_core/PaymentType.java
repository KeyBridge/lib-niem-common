/* 
 * Copyright 2018 Key Bridge.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
