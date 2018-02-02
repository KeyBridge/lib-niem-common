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
@XmlType(name = "InjuryType", propOrder = {
  "injuryCategoryAbstract",
  "injuryLocationAbstract",
  "injuryDate",
  "injuryDescriptionText",
  "injuryCauserAbstract",
  "injurySustainer",
  "injurySeverityAbstract",
  "injuryAugmentationPoint"
})
public class InjuryType
  extends ObjectType {

  @XmlElementRef(name = "InjuryCategoryAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> injuryCategoryAbstract;
  @XmlElementRef(name = "InjuryLocationAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> injuryLocationAbstract;
  @XmlElement(name = "InjuryDate", nillable = true)
  protected List<DateType> injuryDate;
  @XmlElement(name = "InjuryDescriptionText", nillable = true)
  protected List<TextType> injuryDescriptionText;
  @XmlElementRef(name = "InjuryCauserAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> injuryCauserAbstract;
  @XmlElement(name = "InjurySustainer", nillable = true)
  protected List<PersonType> injurySustainer;
  @XmlElementRef(name = "InjurySeverityAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> injurySeverityAbstract;
  @XmlElement(name = "InjuryAugmentationPoint")
  protected List<Object> injuryAugmentationPoint;

  public List<JAXBElement<?>> getInjuryCategoryAbstract() {
    if (injuryCategoryAbstract == null) {
      injuryCategoryAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.injuryCategoryAbstract;
  }

  public List<JAXBElement<?>> getInjuryLocationAbstract() {
    if (injuryLocationAbstract == null) {
      injuryLocationAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.injuryLocationAbstract;
  }

  public List<DateType> getInjuryDate() {
    if (injuryDate == null) {
      injuryDate = new ArrayList<DateType>();
    }
    return this.injuryDate;
  }

  public List<TextType> getInjuryDescriptionText() {
    if (injuryDescriptionText == null) {
      injuryDescriptionText = new ArrayList<TextType>();
    }
    return this.injuryDescriptionText;
  }

  public List<JAXBElement<?>> getInjuryCauserAbstract() {
    if (injuryCauserAbstract == null) {
      injuryCauserAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.injuryCauserAbstract;
  }

  public List<PersonType> getInjurySustainer() {
    if (injurySustainer == null) {
      injurySustainer = new ArrayList<PersonType>();
    }
    return this.injurySustainer;
  }

  public List<JAXBElement<?>> getInjurySeverityAbstract() {
    if (injurySeverityAbstract == null) {
      injurySeverityAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.injurySeverityAbstract;
  }

  public List<Object> getInjuryAugmentationPoint() {
    if (injuryAugmentationPoint == null) {
      injuryAugmentationPoint = new ArrayList<Object>();
    }
    return this.injuryAugmentationPoint;
  }

}
