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
@XmlType(name = "ReferralType", propOrder = {
  "referralActivity",
  "referralIssuer",
  "referralMandatoryIndicator",
  "referralSupervisor",
  "referralItem",
  "referralEntity",
  "referralPerson",
  "referralAugmentationPoint"
})
public class ReferralType
  extends ActivityType {

  @XmlElement(name = "ReferralActivity", nillable = true)
  protected List<ActivityType> referralActivity;
  @XmlElement(name = "ReferralIssuer", nillable = true)
  protected List<EntityType> referralIssuer;
  @XmlElement(name = "ReferralMandatoryIndicator", nillable = true)
  protected List<Boolean> referralMandatoryIndicator;
  @XmlElement(name = "ReferralSupervisor", nillable = true)
  protected List<EntityType> referralSupervisor;
  @XmlElement(name = "ReferralItem", nillable = true)
  protected List<ItemType> referralItem;
  @XmlElement(name = "ReferralEntity", nillable = true)
  protected List<EntityType> referralEntity;
  @XmlElement(name = "ReferralPerson", nillable = true)
  protected List<PersonType> referralPerson;
  @XmlElement(name = "ReferralAugmentationPoint")
  protected List<Object> referralAugmentationPoint;

  public List<ActivityType> getReferralActivity() {
    if (referralActivity == null) {
      referralActivity = new ArrayList<ActivityType>();
    }
    return this.referralActivity;
  }

  public List<EntityType> getReferralIssuer() {
    if (referralIssuer == null) {
      referralIssuer = new ArrayList<EntityType>();
    }
    return this.referralIssuer;
  }

  public List<Boolean> getReferralMandatoryIndicator() {
    if (referralMandatoryIndicator == null) {
      referralMandatoryIndicator = new ArrayList<Boolean>();
    }
    return this.referralMandatoryIndicator;
  }

  public List<EntityType> getReferralSupervisor() {
    if (referralSupervisor == null) {
      referralSupervisor = new ArrayList<EntityType>();
    }
    return this.referralSupervisor;
  }

  public List<ItemType> getReferralItem() {
    if (referralItem == null) {
      referralItem = new ArrayList<ItemType>();
    }
    return this.referralItem;
  }

  public List<EntityType> getReferralEntity() {
    if (referralEntity == null) {
      referralEntity = new ArrayList<EntityType>();
    }
    return this.referralEntity;
  }

  public List<PersonType> getReferralPerson() {
    if (referralPerson == null) {
      referralPerson = new ArrayList<PersonType>();
    }
    return this.referralPerson;
  }

  public List<Object> getReferralAugmentationPoint() {
    if (referralAugmentationPoint == null) {
      referralAugmentationPoint = new ArrayList<Object>();
    }
    return this.referralAugmentationPoint;
  }

}
