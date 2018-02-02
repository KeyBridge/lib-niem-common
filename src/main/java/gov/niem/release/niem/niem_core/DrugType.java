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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DrugType", propOrder = {
  "drugDaysSupplyQuantity",
  "drugStrengthText",
  "deaClassScheduleAbstract",
  "drugCoverageExceptionReasonText",
  "drugAugmentationPoint"
})
public class DrugType
  extends SubstanceType {

  @XmlElement(name = "DrugDaysSupplyQuantity", nillable = true)
  protected List<QuantityType> drugDaysSupplyQuantity;
  @XmlElement(name = "DrugStrengthText", nillable = true)
  protected List<TextType> drugStrengthText;
  @XmlElementRef(name = "DEAClassScheduleAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> deaClassScheduleAbstract;
  @XmlElement(name = "DrugCoverageExceptionReasonText", nillable = true)
  protected List<TextType> drugCoverageExceptionReasonText;
  @XmlElement(name = "DrugAugmentationPoint")
  protected List<Object> drugAugmentationPoint;

  public List<QuantityType> getDrugDaysSupplyQuantity() {
    if (drugDaysSupplyQuantity == null) {
      drugDaysSupplyQuantity = new ArrayList<QuantityType>();
    }
    return this.drugDaysSupplyQuantity;
  }

  public List<TextType> getDrugStrengthText() {
    if (drugStrengthText == null) {
      drugStrengthText = new ArrayList<TextType>();
    }
    return this.drugStrengthText;
  }

  public List<JAXBElement<?>> getDEAClassScheduleAbstract() {
    if (deaClassScheduleAbstract == null) {
      deaClassScheduleAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.deaClassScheduleAbstract;
  }

  public List<TextType> getDrugCoverageExceptionReasonText() {
    if (drugCoverageExceptionReasonText == null) {
      drugCoverageExceptionReasonText = new ArrayList<TextType>();
    }
    return this.drugCoverageExceptionReasonText;
  }

  public List<Object> getDrugAugmentationPoint() {
    if (drugAugmentationPoint == null) {
      drugAugmentationPoint = new ArrayList<Object>();
    }
    return this.drugAugmentationPoint;
  }

}
