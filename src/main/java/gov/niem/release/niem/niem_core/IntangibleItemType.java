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
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntangibleItemType", propOrder = {
  "intangibleItemCategoryAbstract",
  "intellectualItemBusinessAreaText",
  "intangibleItemAugmentationPoint"
})
@XmlSeeAlso({
  IntellectualPropertyType.class
})
public class IntangibleItemType
  extends ItemType {

  @XmlElement(name = "IntangibleItemCategoryAbstract")
  protected List<Object> intangibleItemCategoryAbstract;
  @XmlElement(name = "IntellectualItemBusinessAreaText", nillable = true)
  protected List<TextType> intellectualItemBusinessAreaText;
  @XmlElement(name = "IntangibleItemAugmentationPoint")
  protected List<Object> intangibleItemAugmentationPoint;

  public List<Object> getIntangibleItemCategoryAbstract() {
    if (intangibleItemCategoryAbstract == null) {
      intangibleItemCategoryAbstract = new ArrayList<Object>();
    }
    return this.intangibleItemCategoryAbstract;
  }

  public List<TextType> getIntellectualItemBusinessAreaText() {
    if (intellectualItemBusinessAreaText == null) {
      intellectualItemBusinessAreaText = new ArrayList<TextType>();
    }
    return this.intellectualItemBusinessAreaText;
  }

  public List<Object> getIntangibleItemAugmentationPoint() {
    if (intangibleItemAugmentationPoint == null) {
      intangibleItemAugmentationPoint = new ArrayList<Object>();
    }
    return this.intangibleItemAugmentationPoint;
  }

}
