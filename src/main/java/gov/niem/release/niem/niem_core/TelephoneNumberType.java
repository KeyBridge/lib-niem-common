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
@XmlType(name = "TelephoneNumberType", propOrder = {
  "telephoneNumberAbstract",
  "telephoneNumberCategoryAbstract",
  "telephoneNumberDescriptionText",
  "telephoneNumberAugmentationPoint"
})
public class TelephoneNumberType
  extends ObjectType {

  @XmlElementRef(name = "TelephoneNumberAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> telephoneNumberAbstract;
  @XmlElementRef(name = "TelephoneNumberCategoryAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> telephoneNumberCategoryAbstract;
  @XmlElement(name = "TelephoneNumberDescriptionText", nillable = true)
  protected List<TextType> telephoneNumberDescriptionText;
  @XmlElement(name = "TelephoneNumberAugmentationPoint")
  protected List<Object> telephoneNumberAugmentationPoint;

  public List<JAXBElement<?>> getTelephoneNumberAbstract() {
    if (telephoneNumberAbstract == null) {
      telephoneNumberAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.telephoneNumberAbstract;
  }

  public List<JAXBElement<?>> getTelephoneNumberCategoryAbstract() {
    if (telephoneNumberCategoryAbstract == null) {
      telephoneNumberCategoryAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.telephoneNumberCategoryAbstract;
  }

  public List<TextType> getTelephoneNumberDescriptionText() {
    if (telephoneNumberDescriptionText == null) {
      telephoneNumberDescriptionText = new ArrayList<TextType>();
    }
    return this.telephoneNumberDescriptionText;
  }

  public List<Object> getTelephoneNumberAugmentationPoint() {
    if (telephoneNumberAugmentationPoint == null) {
      telephoneNumberAugmentationPoint = new ArrayList<Object>();
    }
    return this.telephoneNumberAugmentationPoint;
  }

}
