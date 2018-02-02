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
@XmlType(name = "DispositionType", propOrder = {
  "dispositionCategoryAbstract",
  "dispositionEntity",
  "dispositionDate",
  "dispositionDescriptionText",
  "dispositionReasonText",
  "dispositionReportedAuthorityText",
  "dispositionText",
  "dispositionInstrument",
  "dispositionAugmentationPoint"
})
@XmlSeeAlso({
  ItemDispositionType.class,
  CaseDispositionType.class
})
public class DispositionType
  extends ObjectType {

  @XmlElementRef(name = "DispositionCategoryAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> dispositionCategoryAbstract;
  @XmlElement(name = "DispositionEntity", nillable = true)
  protected List<EntityType> dispositionEntity;
  @XmlElement(name = "DispositionDate", nillable = true)
  protected List<DateType> dispositionDate;
  @XmlElement(name = "DispositionDescriptionText", nillable = true)
  protected List<TextType> dispositionDescriptionText;
  @XmlElement(name = "DispositionReasonText", nillable = true)
  protected List<TextType> dispositionReasonText;
  @XmlElement(name = "DispositionReportedAuthorityText", nillable = true)
  protected List<TextType> dispositionReportedAuthorityText;
  @XmlElement(name = "DispositionText", nillable = true)
  protected List<TextType> dispositionText;
  @XmlElement(name = "DispositionInstrument", nillable = true)
  protected List<DocumentType> dispositionInstrument;
  @XmlElement(name = "DispositionAugmentationPoint")
  protected List<Object> dispositionAugmentationPoint;

  public List<JAXBElement<?>> getDispositionCategoryAbstract() {
    if (dispositionCategoryAbstract == null) {
      dispositionCategoryAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.dispositionCategoryAbstract;
  }

  public List<EntityType> getDispositionEntity() {
    if (dispositionEntity == null) {
      dispositionEntity = new ArrayList<EntityType>();
    }
    return this.dispositionEntity;
  }

  public List<DateType> getDispositionDate() {
    if (dispositionDate == null) {
      dispositionDate = new ArrayList<DateType>();
    }
    return this.dispositionDate;
  }

  public List<TextType> getDispositionDescriptionText() {
    if (dispositionDescriptionText == null) {
      dispositionDescriptionText = new ArrayList<TextType>();
    }
    return this.dispositionDescriptionText;
  }

  public List<TextType> getDispositionReasonText() {
    if (dispositionReasonText == null) {
      dispositionReasonText = new ArrayList<TextType>();
    }
    return this.dispositionReasonText;
  }

  public List<TextType> getDispositionReportedAuthorityText() {
    if (dispositionReportedAuthorityText == null) {
      dispositionReportedAuthorityText = new ArrayList<TextType>();
    }
    return this.dispositionReportedAuthorityText;
  }

  public List<TextType> getDispositionText() {
    if (dispositionText == null) {
      dispositionText = new ArrayList<TextType>();
    }
    return this.dispositionText;
  }

  public List<DocumentType> getDispositionInstrument() {
    if (dispositionInstrument == null) {
      dispositionInstrument = new ArrayList<DocumentType>();
    }
    return this.dispositionInstrument;
  }

  public List<Object> getDispositionAugmentationPoint() {
    if (dispositionAugmentationPoint == null) {
      dispositionAugmentationPoint = new ArrayList<Object>();
    }
    return this.dispositionAugmentationPoint;
  }

}
