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
@XmlType(name = "StreetType", propOrder = {
  "streetFullText",
  "streetNumberText",
  "streetPredirectionalText",
  "streetName",
  "streetCategoryText",
  "streetPostdirectionalText",
  "streetExtensionText",
  "streetAugmentationPoint"
})
public class StreetType
  extends ObjectType {

  @XmlElement(name = "StreetFullText", nillable = true)
  protected List<TextType> streetFullText;
  @XmlElement(name = "StreetNumberText", nillable = true)
  protected List<TextType> streetNumberText;
  @XmlElement(name = "StreetPredirectionalText", nillable = true)
  protected List<TextType> streetPredirectionalText;
  @XmlElement(name = "StreetName", nillable = true)
  protected List<ProperNameTextType> streetName;
  @XmlElement(name = "StreetCategoryText", nillable = true)
  protected List<TextType> streetCategoryText;
  @XmlElement(name = "StreetPostdirectionalText", nillable = true)
  protected List<TextType> streetPostdirectionalText;
  @XmlElement(name = "StreetExtensionText", nillable = true)
  protected List<TextType> streetExtensionText;
  @XmlElement(name = "StreetAugmentationPoint")
  protected List<Object> streetAugmentationPoint;

  public List<TextType> getStreetFullText() {
    if (streetFullText == null) {
      streetFullText = new ArrayList<TextType>();
    }
    return this.streetFullText;
  }

  public List<TextType> getStreetNumberText() {
    if (streetNumberText == null) {
      streetNumberText = new ArrayList<TextType>();
    }
    return this.streetNumberText;
  }

  public List<TextType> getStreetPredirectionalText() {
    if (streetPredirectionalText == null) {
      streetPredirectionalText = new ArrayList<TextType>();
    }
    return this.streetPredirectionalText;
  }

  public List<ProperNameTextType> getStreetName() {
    if (streetName == null) {
      streetName = new ArrayList<ProperNameTextType>();
    }
    return this.streetName;
  }

  public List<TextType> getStreetCategoryText() {
    if (streetCategoryText == null) {
      streetCategoryText = new ArrayList<TextType>();
    }
    return this.streetCategoryText;
  }

  public List<TextType> getStreetPostdirectionalText() {
    if (streetPostdirectionalText == null) {
      streetPostdirectionalText = new ArrayList<TextType>();
    }
    return this.streetPostdirectionalText;
  }

  public List<TextType> getStreetExtensionText() {
    if (streetExtensionText == null) {
      streetExtensionText = new ArrayList<TextType>();
    }
    return this.streetExtensionText;
  }

  public List<Object> getStreetAugmentationPoint() {
    if (streetAugmentationPoint == null) {
      streetAugmentationPoint = new ArrayList<Object>();
    }
    return this.streetAugmentationPoint;
  }

}
