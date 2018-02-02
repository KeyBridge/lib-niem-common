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

import gov.niem.release.niem.proxy.xsd.Boolean;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonDisunionType", propOrder = {
  "personDisunionDecreeIndicator",
  "personDisunionPendingIndicator",
  "personDisunionReasonText",
  "personDisunionAugmentationPoint"
})
public class PersonDisunionType
  extends ActivityType {

  @XmlElement(name = "PersonDisunionDecreeIndicator", nillable = true)
  protected List<Boolean> personDisunionDecreeIndicator;
  @XmlElement(name = "PersonDisunionPendingIndicator", nillable = true)
  protected List<Boolean> personDisunionPendingIndicator;
  @XmlElement(name = "PersonDisunionReasonText", nillable = true)
  protected List<TextType> personDisunionReasonText;
  @XmlElement(name = "PersonDisunionAugmentationPoint")
  protected List<Object> personDisunionAugmentationPoint;

  public List<Boolean> getPersonDisunionDecreeIndicator() {
    if (personDisunionDecreeIndicator == null) {
      personDisunionDecreeIndicator = new ArrayList<Boolean>();
    }
    return this.personDisunionDecreeIndicator;
  }

  public List<Boolean> getPersonDisunionPendingIndicator() {
    if (personDisunionPendingIndicator == null) {
      personDisunionPendingIndicator = new ArrayList<Boolean>();
    }
    return this.personDisunionPendingIndicator;
  }

  public List<TextType> getPersonDisunionReasonText() {
    if (personDisunionReasonText == null) {
      personDisunionReasonText = new ArrayList<TextType>();
    }
    return this.personDisunionReasonText;
  }

  public List<Object> getPersonDisunionAugmentationPoint() {
    if (personDisunionAugmentationPoint == null) {
      personDisunionAugmentationPoint = new ArrayList<Object>();
    }
    return this.personDisunionAugmentationPoint;
  }

}
