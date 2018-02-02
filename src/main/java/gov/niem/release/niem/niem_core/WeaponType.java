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
@XmlType(name = "WeaponType", propOrder = {
  "roleOfItem",
  "weaponUser",
  "weaponInvolvedInActivity",
  "weaponUsageText",
  "weaponAugmentationPoint"
})
public class WeaponType
  extends ObjectType {

  @XmlElement(name = "RoleOfItem", nillable = true)
  protected List<ItemType> roleOfItem;
  @XmlElement(name = "WeaponUser", nillable = true)
  protected List<PersonType> weaponUser;
  @XmlElement(name = "WeaponInvolvedInActivity", nillable = true)
  protected List<ActivityType> weaponInvolvedInActivity;
  @XmlElement(name = "WeaponUsageText", nillable = true)
  protected List<TextType> weaponUsageText;
  @XmlElement(name = "WeaponAugmentationPoint")
  protected List<Object> weaponAugmentationPoint;

  public List<ItemType> getRoleOfItem() {
    if (roleOfItem == null) {
      roleOfItem = new ArrayList<ItemType>();
    }
    return this.roleOfItem;
  }

  public List<PersonType> getWeaponUser() {
    if (weaponUser == null) {
      weaponUser = new ArrayList<PersonType>();
    }
    return this.weaponUser;
  }

  public List<ActivityType> getWeaponInvolvedInActivity() {
    if (weaponInvolvedInActivity == null) {
      weaponInvolvedInActivity = new ArrayList<ActivityType>();
    }
    return this.weaponInvolvedInActivity;
  }

  public List<TextType> getWeaponUsageText() {
    if (weaponUsageText == null) {
      weaponUsageText = new ArrayList<TextType>();
    }
    return this.weaponUsageText;
  }

  public List<Object> getWeaponAugmentationPoint() {
    if (weaponAugmentationPoint == null) {
      weaponAugmentationPoint = new ArrayList<Object>();
    }
    return this.weaponAugmentationPoint;
  }

}
