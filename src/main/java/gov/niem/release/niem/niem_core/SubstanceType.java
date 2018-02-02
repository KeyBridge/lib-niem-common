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
@XmlType(name = "SubstanceType", propOrder = {
  "substanceCategoryAbstract",
  "substanceAbstract",
  "substanceContainerDescriptionText",
  "substanceQuantityMeasure",
  "substanceCompositionDescriptionText",
  "substanceFormText",
  "substanceFoundDescriptionText",
  "substanceAugmentationPoint"
})
@XmlSeeAlso({
  DrugType.class
})
public class SubstanceType
  extends ItemType {

  @XmlElementRef(name = "SubstanceCategoryAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> substanceCategoryAbstract;
  @XmlElementRef(name = "SubstanceAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> substanceAbstract;
  @XmlElement(name = "SubstanceContainerDescriptionText", nillable = true)
  protected List<TextType> substanceContainerDescriptionText;
  @XmlElement(name = "SubstanceQuantityMeasure", nillable = true)
  protected List<SubstanceMeasureType> substanceQuantityMeasure;
  @XmlElement(name = "SubstanceCompositionDescriptionText", nillable = true)
  protected List<TextType> substanceCompositionDescriptionText;
  @XmlElement(name = "SubstanceFormText", nillable = true)
  protected List<TextType> substanceFormText;
  @XmlElement(name = "SubstanceFoundDescriptionText", nillable = true)
  protected List<TextType> substanceFoundDescriptionText;
  @XmlElement(name = "SubstanceAugmentationPoint")
  protected List<Object> substanceAugmentationPoint;

  public List<JAXBElement<?>> getSubstanceCategoryAbstract() {
    if (substanceCategoryAbstract == null) {
      substanceCategoryAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.substanceCategoryAbstract;
  }

  public List<JAXBElement<?>> getSubstanceAbstract() {
    if (substanceAbstract == null) {
      substanceAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.substanceAbstract;
  }

  public List<TextType> getSubstanceContainerDescriptionText() {
    if (substanceContainerDescriptionText == null) {
      substanceContainerDescriptionText = new ArrayList<TextType>();
    }
    return this.substanceContainerDescriptionText;
  }

  public List<SubstanceMeasureType> getSubstanceQuantityMeasure() {
    if (substanceQuantityMeasure == null) {
      substanceQuantityMeasure = new ArrayList<SubstanceMeasureType>();
    }
    return this.substanceQuantityMeasure;
  }

  public List<TextType> getSubstanceCompositionDescriptionText() {
    if (substanceCompositionDescriptionText == null) {
      substanceCompositionDescriptionText = new ArrayList<TextType>();
    }
    return this.substanceCompositionDescriptionText;
  }

  public List<TextType> getSubstanceFormText() {
    if (substanceFormText == null) {
      substanceFormText = new ArrayList<TextType>();
    }
    return this.substanceFormText;
  }

  public List<TextType> getSubstanceFoundDescriptionText() {
    if (substanceFoundDescriptionText == null) {
      substanceFoundDescriptionText = new ArrayList<TextType>();
    }
    return this.substanceFoundDescriptionText;
  }

  public List<Object> getSubstanceAugmentationPoint() {
    if (substanceAugmentationPoint == null) {
      substanceAugmentationPoint = new ArrayList<Object>();
    }
    return this.substanceAugmentationPoint;
  }

}
