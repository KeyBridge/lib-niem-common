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
@XmlType(name = "PersonEncounterType", propOrder = {
  "personArmedIndicator",
  "personAssaultedOfficerIndicator",
  "personPossessCreditCardIndicator",
  "personFraudulentIdentificationIndicator",
  "personJuvenileClaimedIndicator",
  "personJuvenileVerifiedIndicator",
  "encounterClassification",
  "encounterCommentText",
  "fingerprintTakenIndicator",
  "personEncounterLocation",
  "personEncounterAugmentationPoint"
})
public class PersonEncounterType
  extends ActivityType {

  @XmlElement(name = "PersonArmedIndicator", nillable = true)
  protected List<Boolean> personArmedIndicator;
  @XmlElement(name = "PersonAssaultedOfficerIndicator", nillable = true)
  protected List<Boolean> personAssaultedOfficerIndicator;
  @XmlElement(name = "PersonPossessCreditCardIndicator", nillable = true)
  protected List<Boolean> personPossessCreditCardIndicator;
  @XmlElement(name = "PersonFraudulentIdentificationIndicator", nillable = true)
  protected List<Boolean> personFraudulentIdentificationIndicator;
  @XmlElement(name = "PersonJuvenileClaimedIndicator", nillable = true)
  protected List<Boolean> personJuvenileClaimedIndicator;
  @XmlElement(name = "PersonJuvenileVerifiedIndicator", nillable = true)
  protected List<Boolean> personJuvenileVerifiedIndicator;
  @XmlElement(name = "EncounterClassification", nillable = true)
  protected List<EncounterClassificationType> encounterClassification;
  @XmlElement(name = "EncounterCommentText", nillable = true)
  protected List<TextType> encounterCommentText;
  @XmlElement(name = "FingerprintTakenIndicator", nillable = true)
  protected List<Boolean> fingerprintTakenIndicator;
  @XmlElement(name = "PersonEncounterLocation", nillable = true)
  protected List<LocationType> personEncounterLocation;
  @XmlElement(name = "PersonEncounterAugmentationPoint")
  protected List<Object> personEncounterAugmentationPoint;

  public List<Boolean> getPersonArmedIndicator() {
    if (personArmedIndicator == null) {
      personArmedIndicator = new ArrayList<Boolean>();
    }
    return this.personArmedIndicator;
  }

  public List<Boolean> getPersonAssaultedOfficerIndicator() {
    if (personAssaultedOfficerIndicator == null) {
      personAssaultedOfficerIndicator = new ArrayList<Boolean>();
    }
    return this.personAssaultedOfficerIndicator;
  }

  public List<Boolean> getPersonPossessCreditCardIndicator() {
    if (personPossessCreditCardIndicator == null) {
      personPossessCreditCardIndicator = new ArrayList<Boolean>();
    }
    return this.personPossessCreditCardIndicator;
  }

  public List<Boolean> getPersonFraudulentIdentificationIndicator() {
    if (personFraudulentIdentificationIndicator == null) {
      personFraudulentIdentificationIndicator = new ArrayList<Boolean>();
    }
    return this.personFraudulentIdentificationIndicator;
  }

  public List<Boolean> getPersonJuvenileClaimedIndicator() {
    if (personJuvenileClaimedIndicator == null) {
      personJuvenileClaimedIndicator = new ArrayList<Boolean>();
    }
    return this.personJuvenileClaimedIndicator;
  }

  public List<Boolean> getPersonJuvenileVerifiedIndicator() {
    if (personJuvenileVerifiedIndicator == null) {
      personJuvenileVerifiedIndicator = new ArrayList<Boolean>();
    }
    return this.personJuvenileVerifiedIndicator;
  }

  public List<EncounterClassificationType> getEncounterClassification() {
    if (encounterClassification == null) {
      encounterClassification = new ArrayList<EncounterClassificationType>();
    }
    return this.encounterClassification;
  }

  public List<TextType> getEncounterCommentText() {
    if (encounterCommentText == null) {
      encounterCommentText = new ArrayList<TextType>();
    }
    return this.encounterCommentText;
  }

  public List<Boolean> getFingerprintTakenIndicator() {
    if (fingerprintTakenIndicator == null) {
      fingerprintTakenIndicator = new ArrayList<Boolean>();
    }
    return this.fingerprintTakenIndicator;
  }

  public List<LocationType> getPersonEncounterLocation() {
    if (personEncounterLocation == null) {
      personEncounterLocation = new ArrayList<LocationType>();
    }
    return this.personEncounterLocation;
  }

  public List<Object> getPersonEncounterAugmentationPoint() {
    if (personEncounterAugmentationPoint == null) {
      personEncounterAugmentationPoint = new ArrayList<Object>();
    }
    return this.personEncounterAugmentationPoint;
  }

}
