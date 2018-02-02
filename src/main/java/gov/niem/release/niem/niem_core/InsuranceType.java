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

import gov.niem.release.niem.proxy.xsd.Boolean;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceType", propOrder = {
  "insurancePolicyIdentification",
  "insuranceCarrierIdentification",
  "insuranceCarrierName",
  "insuranceActiveIndicator",
  "insuranceCancellationDate",
  "insuranceCertifiedDate",
  "insuranceCoverageCategoryAbstract",
  "insuranceCoveredItem",
  "insuranceEffectiveDateRange",
  "insurancePersonalIndicator",
  "insuranceAugmentationPoint"
})
public class InsuranceType
  extends ObjectType {

  @XmlElement(name = "InsurancePolicyIdentification", nillable = true)
  protected List<IdentificationType> insurancePolicyIdentification;
  @XmlElement(name = "InsuranceCarrierIdentification", nillable = true)
  protected List<IdentificationType> insuranceCarrierIdentification;
  @XmlElement(name = "InsuranceCarrierName", nillable = true)
  protected List<TextType> insuranceCarrierName;
  @XmlElement(name = "InsuranceActiveIndicator", nillable = true)
  protected List<Boolean> insuranceActiveIndicator;
  @XmlElement(name = "InsuranceCancellationDate", nillable = true)
  protected List<DateType> insuranceCancellationDate;
  @XmlElement(name = "InsuranceCertifiedDate", nillable = true)
  protected List<DateType> insuranceCertifiedDate;
  @XmlElementRef(name = "InsuranceCoverageCategoryAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> insuranceCoverageCategoryAbstract;
  @XmlElement(name = "InsuranceCoveredItem", nillable = true)
  protected List<ItemType> insuranceCoveredItem;
  @XmlElement(name = "InsuranceEffectiveDateRange", nillable = true)
  protected List<DateRangeType> insuranceEffectiveDateRange;
  @XmlElement(name = "InsurancePersonalIndicator", nillable = true)
  protected List<Boolean> insurancePersonalIndicator;
  @XmlElement(name = "InsuranceAugmentationPoint")
  protected List<Object> insuranceAugmentationPoint;

  public List<IdentificationType> getInsurancePolicyIdentification() {
    if (insurancePolicyIdentification == null) {
      insurancePolicyIdentification = new ArrayList<IdentificationType>();
    }
    return this.insurancePolicyIdentification;
  }

  public List<IdentificationType> getInsuranceCarrierIdentification() {
    if (insuranceCarrierIdentification == null) {
      insuranceCarrierIdentification = new ArrayList<IdentificationType>();
    }
    return this.insuranceCarrierIdentification;
  }

  public List<TextType> getInsuranceCarrierName() {
    if (insuranceCarrierName == null) {
      insuranceCarrierName = new ArrayList<TextType>();
    }
    return this.insuranceCarrierName;
  }

  public List<Boolean> getInsuranceActiveIndicator() {
    if (insuranceActiveIndicator == null) {
      insuranceActiveIndicator = new ArrayList<Boolean>();
    }
    return this.insuranceActiveIndicator;
  }

  public List<DateType> getInsuranceCancellationDate() {
    if (insuranceCancellationDate == null) {
      insuranceCancellationDate = new ArrayList<DateType>();
    }
    return this.insuranceCancellationDate;
  }

  public List<DateType> getInsuranceCertifiedDate() {
    if (insuranceCertifiedDate == null) {
      insuranceCertifiedDate = new ArrayList<DateType>();
    }
    return this.insuranceCertifiedDate;
  }

  public List<JAXBElement<?>> getInsuranceCoverageCategoryAbstract() {
    if (insuranceCoverageCategoryAbstract == null) {
      insuranceCoverageCategoryAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.insuranceCoverageCategoryAbstract;
  }

  public List<ItemType> getInsuranceCoveredItem() {
    if (insuranceCoveredItem == null) {
      insuranceCoveredItem = new ArrayList<ItemType>();
    }
    return this.insuranceCoveredItem;
  }

  public List<DateRangeType> getInsuranceEffectiveDateRange() {
    if (insuranceEffectiveDateRange == null) {
      insuranceEffectiveDateRange = new ArrayList<DateRangeType>();
    }
    return this.insuranceEffectiveDateRange;
  }

  public List<Boolean> getInsurancePersonalIndicator() {
    if (insurancePersonalIndicator == null) {
      insurancePersonalIndicator = new ArrayList<Boolean>();
    }
    return this.insurancePersonalIndicator;
  }

  public List<Object> getInsuranceAugmentationPoint() {
    if (insuranceAugmentationPoint == null) {
      insuranceAugmentationPoint = new ArrayList<Object>();
    }
    return this.insuranceAugmentationPoint;
  }

}
