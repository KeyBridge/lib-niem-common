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
@XmlType(name = "ContactRadioType", propOrder = {
  "contactRadioCategoryText",
  "contactRadioChannelText",
  "contactRadioCallSignID",
  "contactRadioAugmentationPoint"
})
public class ContactRadioType
  extends ObjectType {

  @XmlElement(name = "ContactRadioCategoryText", nillable = true)
  protected List<TextType> contactRadioCategoryText;
  @XmlElement(name = "ContactRadioChannelText", nillable = true)
  protected List<TextType> contactRadioChannelText;
  @XmlElement(name = "ContactRadioCallSignID", nillable = true)
  protected List<String> contactRadioCallSignID;
  @XmlElement(name = "ContactRadioAugmentationPoint")
  protected List<Object> contactRadioAugmentationPoint;

  public List<TextType> getContactRadioCategoryText() {
    if (contactRadioCategoryText == null) {
      contactRadioCategoryText = new ArrayList<TextType>();
    }
    return this.contactRadioCategoryText;
  }

  public List<TextType> getContactRadioChannelText() {
    if (contactRadioChannelText == null) {
      contactRadioChannelText = new ArrayList<TextType>();
    }
    return this.contactRadioChannelText;
  }

  public List<String> getContactRadioCallSignID() {
    if (contactRadioCallSignID == null) {
      contactRadioCallSignID = new ArrayList<String>();
    }
    return this.contactRadioCallSignID;
  }

  public List<Object> getContactRadioAugmentationPoint() {
    if (contactRadioAugmentationPoint == null) {
      contactRadioAugmentationPoint = new ArrayList<Object>();
    }
    return this.contactRadioAugmentationPoint;
  }

}
