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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentStatusDetailsType", propOrder = {
  "documentStatusCategoryAbstract",
  "documentStatusDescriptionText",
  "documentStatusDetailsAugmentationPoint"
})
public class DocumentStatusDetailsType
  extends ObjectType {

  @XmlElement(name = "DocumentStatusCategoryAbstract")
  protected List<Object> documentStatusCategoryAbstract;
  @XmlElement(name = "DocumentStatusDescriptionText", nillable = true)
  protected List<TextType> documentStatusDescriptionText;
  @XmlElement(name = "DocumentStatusDetailsAugmentationPoint")
  protected List<Object> documentStatusDetailsAugmentationPoint;

  public List<Object> getDocumentStatusCategoryAbstract() {
    if (documentStatusCategoryAbstract == null) {
      documentStatusCategoryAbstract = new ArrayList<Object>();
    }
    return this.documentStatusCategoryAbstract;
  }

  public List<TextType> getDocumentStatusDescriptionText() {
    if (documentStatusDescriptionText == null) {
      documentStatusDescriptionText = new ArrayList<TextType>();
    }
    return this.documentStatusDescriptionText;
  }

  public List<Object> getDocumentStatusDetailsAugmentationPoint() {
    if (documentStatusDetailsAugmentationPoint == null) {
      documentStatusDetailsAugmentationPoint = new ArrayList<Object>();
    }
    return this.documentStatusDetailsAugmentationPoint;
  }

}
