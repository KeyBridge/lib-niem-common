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
@XmlType(name = "TreatmentType", propOrder = {
  "treatmentText",
  "treatmentProvider",
  "person",
  "treatmentAugmentationPoint"
})
public class TreatmentType
  extends ActivityType {

  @XmlElement(name = "TreatmentText", nillable = true)
  protected List<TextType> treatmentText;
  @XmlElement(name = "TreatmentProvider", nillable = true)
  protected List<EntityType> treatmentProvider;
  @XmlElement(name = "Person", nillable = true)
  protected List<PersonType> person;
  @XmlElement(name = "TreatmentAugmentationPoint")
  protected List<Object> treatmentAugmentationPoint;

  public List<TextType> getTreatmentText() {
    if (treatmentText == null) {
      treatmentText = new ArrayList<TextType>();
    }
    return this.treatmentText;
  }

  public List<EntityType> getTreatmentProvider() {
    if (treatmentProvider == null) {
      treatmentProvider = new ArrayList<EntityType>();
    }
    return this.treatmentProvider;
  }

  public List<PersonType> getPerson() {
    if (person == null) {
      person = new ArrayList<PersonType>();
    }
    return this.person;
  }

  public List<Object> getTreatmentAugmentationPoint() {
    if (treatmentAugmentationPoint == null) {
      treatmentAugmentationPoint = new ArrayList<Object>();
    }
    return this.treatmentAugmentationPoint;
  }

}
