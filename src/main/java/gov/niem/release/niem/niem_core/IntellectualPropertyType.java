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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntellectualPropertyType", propOrder = {
  "intellectualPropertyRegistrationIdentification",
  "intellectualPropertyCreationDate",
  "intellectualPropertyCreationEventText",
  "intellectualPropertyRegistrationDate",
  "intellectualPropertyTerminationDate",
  "intellectualPropertyTerminationEventText",
  "intellectualPropertyAugmentationPoint"
})
public class IntellectualPropertyType
  extends IntangibleItemType {

  @XmlElement(name = "IntellectualPropertyRegistrationIdentification", nillable = true)
  protected List<IdentificationType> intellectualPropertyRegistrationIdentification;
  @XmlElement(name = "IntellectualPropertyCreationDate", nillable = true)
  protected List<DateType> intellectualPropertyCreationDate;
  @XmlElement(name = "IntellectualPropertyCreationEventText", nillable = true)
  protected List<TextType> intellectualPropertyCreationEventText;
  @XmlElement(name = "IntellectualPropertyRegistrationDate", nillable = true)
  protected List<DateType> intellectualPropertyRegistrationDate;
  @XmlElement(name = "IntellectualPropertyTerminationDate", nillable = true)
  protected List<DateType> intellectualPropertyTerminationDate;
  @XmlElement(name = "IntellectualPropertyTerminationEventText", nillable = true)
  protected List<TextType> intellectualPropertyTerminationEventText;
  @XmlElement(name = "IntellectualPropertyAugmentationPoint")
  protected List<Object> intellectualPropertyAugmentationPoint;

  public List<IdentificationType> getIntellectualPropertyRegistrationIdentification() {
    if (intellectualPropertyRegistrationIdentification == null) {
      intellectualPropertyRegistrationIdentification = new ArrayList<IdentificationType>();
    }
    return this.intellectualPropertyRegistrationIdentification;
  }

  public List<DateType> getIntellectualPropertyCreationDate() {
    if (intellectualPropertyCreationDate == null) {
      intellectualPropertyCreationDate = new ArrayList<DateType>();
    }
    return this.intellectualPropertyCreationDate;
  }

  public List<TextType> getIntellectualPropertyCreationEventText() {
    if (intellectualPropertyCreationEventText == null) {
      intellectualPropertyCreationEventText = new ArrayList<TextType>();
    }
    return this.intellectualPropertyCreationEventText;
  }

  public List<DateType> getIntellectualPropertyRegistrationDate() {
    if (intellectualPropertyRegistrationDate == null) {
      intellectualPropertyRegistrationDate = new ArrayList<DateType>();
    }
    return this.intellectualPropertyRegistrationDate;
  }

  public List<DateType> getIntellectualPropertyTerminationDate() {
    if (intellectualPropertyTerminationDate == null) {
      intellectualPropertyTerminationDate = new ArrayList<DateType>();
    }
    return this.intellectualPropertyTerminationDate;
  }

  public List<TextType> getIntellectualPropertyTerminationEventText() {
    if (intellectualPropertyTerminationEventText == null) {
      intellectualPropertyTerminationEventText = new ArrayList<TextType>();
    }
    return this.intellectualPropertyTerminationEventText;
  }

  public List<Object> getIntellectualPropertyAugmentationPoint() {
    if (intellectualPropertyAugmentationPoint == null) {
      intellectualPropertyAugmentationPoint = new ArrayList<Object>();
    }
    return this.intellectualPropertyAugmentationPoint;
  }

}
