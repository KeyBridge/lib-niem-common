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
@XmlType(name = "DisciplinaryActionType", propOrder = {
  "disciplinaryActionPerson",
  "disciplinaryActionAssigner",
  "disciplinaryActionCommunityService",
  "disciplinaryActionEnforcer",
  "disciplinaryActionCounseling",
  "disciplinaryActionFee",
  "disciplinaryActionProgram",
  "disciplinaryActionRestitution",
  "disciplinaryActionAugmentationPoint"
})
public class DisciplinaryActionType
  extends ActivityType {

  @XmlElement(name = "DisciplinaryActionPerson", nillable = true)
  protected List<PersonType> disciplinaryActionPerson;
  @XmlElement(name = "DisciplinaryActionAssigner", nillable = true)
  protected List<EntityType> disciplinaryActionAssigner;
  @XmlElement(name = "DisciplinaryActionCommunityService", nillable = true)
  protected List<ActivityType> disciplinaryActionCommunityService;
  @XmlElement(name = "DisciplinaryActionEnforcer", nillable = true)
  protected List<EntityType> disciplinaryActionEnforcer;
  @XmlElement(name = "DisciplinaryActionCounseling", nillable = true)
  protected List<ActivityType> disciplinaryActionCounseling;
  @XmlElement(name = "DisciplinaryActionFee", nillable = true)
  protected List<ObligationType> disciplinaryActionFee;
  @XmlElement(name = "DisciplinaryActionProgram", nillable = true)
  protected List<ProgramType> disciplinaryActionProgram;
  @XmlElement(name = "DisciplinaryActionRestitution", nillable = true)
  protected List<ObligationType> disciplinaryActionRestitution;
  @XmlElement(name = "DisciplinaryActionAugmentationPoint")
  protected List<Object> disciplinaryActionAugmentationPoint;

  public List<PersonType> getDisciplinaryActionPerson() {
    if (disciplinaryActionPerson == null) {
      disciplinaryActionPerson = new ArrayList<PersonType>();
    }
    return this.disciplinaryActionPerson;
  }

  public List<EntityType> getDisciplinaryActionAssigner() {
    if (disciplinaryActionAssigner == null) {
      disciplinaryActionAssigner = new ArrayList<EntityType>();
    }
    return this.disciplinaryActionAssigner;
  }

  public List<ActivityType> getDisciplinaryActionCommunityService() {
    if (disciplinaryActionCommunityService == null) {
      disciplinaryActionCommunityService = new ArrayList<ActivityType>();
    }
    return this.disciplinaryActionCommunityService;
  }

  public List<EntityType> getDisciplinaryActionEnforcer() {
    if (disciplinaryActionEnforcer == null) {
      disciplinaryActionEnforcer = new ArrayList<EntityType>();
    }
    return this.disciplinaryActionEnforcer;
  }

  public List<ActivityType> getDisciplinaryActionCounseling() {
    if (disciplinaryActionCounseling == null) {
      disciplinaryActionCounseling = new ArrayList<ActivityType>();
    }
    return this.disciplinaryActionCounseling;
  }

  public List<ObligationType> getDisciplinaryActionFee() {
    if (disciplinaryActionFee == null) {
      disciplinaryActionFee = new ArrayList<ObligationType>();
    }
    return this.disciplinaryActionFee;
  }

  public List<ProgramType> getDisciplinaryActionProgram() {
    if (disciplinaryActionProgram == null) {
      disciplinaryActionProgram = new ArrayList<ProgramType>();
    }
    return this.disciplinaryActionProgram;
  }

  public List<ObligationType> getDisciplinaryActionRestitution() {
    if (disciplinaryActionRestitution == null) {
      disciplinaryActionRestitution = new ArrayList<ObligationType>();
    }
    return this.disciplinaryActionRestitution;
  }

  public List<Object> getDisciplinaryActionAugmentationPoint() {
    if (disciplinaryActionAugmentationPoint == null) {
      disciplinaryActionAugmentationPoint = new ArrayList<Object>();
    }
    return this.disciplinaryActionAugmentationPoint;
  }

}
