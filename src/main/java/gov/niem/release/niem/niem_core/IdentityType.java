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
@XmlType(name = "IdentityType", propOrder = {
  "identityCharacteristics",
  "identityCreationDate",
  "identityCreationEventText",
  "identityTerminationDate",
  "identityTerminationEventText",
  "identityAugmentationPoint"
})
public class IdentityType
  extends ObjectType {

  @XmlElement(name = "IdentityCharacteristics", nillable = true)
  protected List<PersonType> identityCharacteristics;
  @XmlElement(name = "IdentityCreationDate", nillable = true)
  protected List<DateType> identityCreationDate;
  @XmlElement(name = "IdentityCreationEventText", nillable = true)
  protected List<TextType> identityCreationEventText;
  @XmlElement(name = "IdentityTerminationDate", nillable = true)
  protected List<DateType> identityTerminationDate;
  @XmlElement(name = "IdentityTerminationEventText", nillable = true)
  protected List<TextType> identityTerminationEventText;
  @XmlElement(name = "IdentityAugmentationPoint")
  protected List<Object> identityAugmentationPoint;

  public List<PersonType> getIdentityCharacteristics() {
    if (identityCharacteristics == null) {
      identityCharacteristics = new ArrayList<PersonType>();
    }
    return this.identityCharacteristics;
  }

  public List<DateType> getIdentityCreationDate() {
    if (identityCreationDate == null) {
      identityCreationDate = new ArrayList<DateType>();
    }
    return this.identityCreationDate;
  }

  public List<TextType> getIdentityCreationEventText() {
    if (identityCreationEventText == null) {
      identityCreationEventText = new ArrayList<TextType>();
    }
    return this.identityCreationEventText;
  }

  public List<DateType> getIdentityTerminationDate() {
    if (identityTerminationDate == null) {
      identityTerminationDate = new ArrayList<DateType>();
    }
    return this.identityTerminationDate;
  }

  public List<TextType> getIdentityTerminationEventText() {
    if (identityTerminationEventText == null) {
      identityTerminationEventText = new ArrayList<TextType>();
    }
    return this.identityTerminationEventText;
  }

  public List<Object> getIdentityAugmentationPoint() {
    if (identityAugmentationPoint == null) {
      identityAugmentationPoint = new ArrayList<Object>();
    }
    return this.identityAugmentationPoint;
  }

}
