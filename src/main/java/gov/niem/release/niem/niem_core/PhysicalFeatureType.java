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
@XmlType(name = "PhysicalFeatureType", propOrder = {
  "physicalFeatureGeneralCategoryText",
  "physicalFeatureCategoryAbstract",
  "physicalFeatureDescriptionText",
  "physicalFeatureImage",
  "physicalFeatureLocationText",
  "physicalFeatureAugmentationPoint"
})
public class PhysicalFeatureType
  extends ObjectType {

  @XmlElement(name = "PhysicalFeatureGeneralCategoryText", nillable = true)
  protected List<TextType> physicalFeatureGeneralCategoryText;
  @XmlElementRef(name = "PhysicalFeatureCategoryAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> physicalFeatureCategoryAbstract;
  @XmlElement(name = "PhysicalFeatureDescriptionText", nillable = true)
  protected List<TextType> physicalFeatureDescriptionText;
  @XmlElement(name = "PhysicalFeatureImage", nillable = true)
  protected List<ImageType> physicalFeatureImage;
  @XmlElement(name = "PhysicalFeatureLocationText", nillable = true)
  protected List<TextType> physicalFeatureLocationText;
  @XmlElement(name = "PhysicalFeatureAugmentationPoint")
  protected List<Object> physicalFeatureAugmentationPoint;

  public List<TextType> getPhysicalFeatureGeneralCategoryText() {
    if (physicalFeatureGeneralCategoryText == null) {
      physicalFeatureGeneralCategoryText = new ArrayList<TextType>();
    }
    return this.physicalFeatureGeneralCategoryText;
  }

  public List<JAXBElement<?>> getPhysicalFeatureCategoryAbstract() {
    if (physicalFeatureCategoryAbstract == null) {
      physicalFeatureCategoryAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.physicalFeatureCategoryAbstract;
  }

  public List<TextType> getPhysicalFeatureDescriptionText() {
    if (physicalFeatureDescriptionText == null) {
      physicalFeatureDescriptionText = new ArrayList<TextType>();
    }
    return this.physicalFeatureDescriptionText;
  }

  public List<ImageType> getPhysicalFeatureImage() {
    if (physicalFeatureImage == null) {
      physicalFeatureImage = new ArrayList<ImageType>();
    }
    return this.physicalFeatureImage;
  }

  public List<TextType> getPhysicalFeatureLocationText() {
    if (physicalFeatureLocationText == null) {
      physicalFeatureLocationText = new ArrayList<TextType>();
    }
    return this.physicalFeatureLocationText;
  }

  public List<Object> getPhysicalFeatureAugmentationPoint() {
    if (physicalFeatureAugmentationPoint == null) {
      physicalFeatureAugmentationPoint = new ArrayList<Object>();
    }
    return this.physicalFeatureAugmentationPoint;
  }

}
