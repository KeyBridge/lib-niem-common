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

import gov.niem.release.niem.proxy.xsd.String;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressGridType", propOrder = {
  "addressGridID",
  "addressGridText",
  "addressGridAugmentationPoint"
})
public class AddressGridType
  extends ObjectType {

  @XmlElement(name = "AddressGridID", nillable = true)
  protected List<String> addressGridID;
  @XmlElement(name = "AddressGridText", nillable = true)
  protected List<TextType> addressGridText;
  @XmlElement(name = "AddressGridAugmentationPoint")
  protected List<Object> addressGridAugmentationPoint;

  public List<String> getAddressGridID() {
    if (addressGridID == null) {
      addressGridID = new ArrayList<String>();
    }
    return this.addressGridID;
  }

  public List<TextType> getAddressGridText() {
    if (addressGridText == null) {
      addressGridText = new ArrayList<TextType>();
    }
    return this.addressGridText;
  }

  public List<Object> getAddressGridAugmentationPoint() {
    if (addressGridAugmentationPoint == null) {
      addressGridAugmentationPoint = new ArrayList<Object>();
    }
    return this.addressGridAugmentationPoint;
  }

}
