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
@XmlType(name = "PermitType", propOrder = {
  "permitIdentification",
  "permitCategoryAbstract",
  "permitRenewalDate",
  "permitStartDate",
  "permitUsageText",
  "permitAugmentationPoint"
})
public class PermitType
  extends ObjectType {

  @XmlElement(name = "PermitIdentification", nillable = true)
  protected List<IdentificationType> permitIdentification;
  @XmlElementRef(name = "PermitCategoryAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> permitCategoryAbstract;
  @XmlElement(name = "PermitRenewalDate", nillable = true)
  protected List<DateType> permitRenewalDate;
  @XmlElement(name = "PermitStartDate", nillable = true)
  protected List<DateType> permitStartDate;
  @XmlElement(name = "PermitUsageText", nillable = true)
  protected List<TextType> permitUsageText;
  @XmlElement(name = "PermitAugmentationPoint")
  protected List<Object> permitAugmentationPoint;

  public List<IdentificationType> getPermitIdentification() {
    if (permitIdentification == null) {
      permitIdentification = new ArrayList<IdentificationType>();
    }
    return this.permitIdentification;
  }

  public List<JAXBElement<?>> getPermitCategoryAbstract() {
    if (permitCategoryAbstract == null) {
      permitCategoryAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.permitCategoryAbstract;
  }

  public List<DateType> getPermitRenewalDate() {
    if (permitRenewalDate == null) {
      permitRenewalDate = new ArrayList<DateType>();
    }
    return this.permitRenewalDate;
  }

  public List<DateType> getPermitStartDate() {
    if (permitStartDate == null) {
      permitStartDate = new ArrayList<DateType>();
    }
    return this.permitStartDate;
  }

  public List<TextType> getPermitUsageText() {
    if (permitUsageText == null) {
      permitUsageText = new ArrayList<TextType>();
    }
    return this.permitUsageText;
  }

  public List<Object> getPermitAugmentationPoint() {
    if (permitAugmentationPoint == null) {
      permitAugmentationPoint = new ArrayList<Object>();
    }
    return this.permitAugmentationPoint;
  }

}
