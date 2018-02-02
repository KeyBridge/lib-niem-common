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
