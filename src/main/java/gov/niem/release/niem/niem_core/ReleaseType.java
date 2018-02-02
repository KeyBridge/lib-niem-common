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
@XmlType(name = "ReleaseType", propOrder = {
  "releasePerson",
  "releaseFromLocation",
  "releaseIssuer",
  "releaseItem",
  "releaseRecipient",
  "releaseToLocation",
  "releaseSupervisor",
  "releaseAugmentationPoint"
})
public class ReleaseType
  extends ActivityType {

  @XmlElement(name = "ReleasePerson", nillable = true)
  protected List<PersonType> releasePerson;
  @XmlElement(name = "ReleaseFromLocation", nillable = true)
  protected List<LocationType> releaseFromLocation;
  @XmlElement(name = "ReleaseIssuer", nillable = true)
  protected List<EntityType> releaseIssuer;
  @XmlElement(name = "ReleaseItem", nillable = true)
  protected List<ItemType> releaseItem;
  @XmlElement(name = "ReleaseRecipient", nillable = true)
  protected List<EntityType> releaseRecipient;
  @XmlElement(name = "ReleaseToLocation", nillable = true)
  protected List<LocationType> releaseToLocation;
  @XmlElement(name = "ReleaseSupervisor", nillable = true)
  protected List<EntityType> releaseSupervisor;
  @XmlElement(name = "ReleaseAugmentationPoint")
  protected List<Object> releaseAugmentationPoint;

  public List<PersonType> getReleasePerson() {
    if (releasePerson == null) {
      releasePerson = new ArrayList<PersonType>();
    }
    return this.releasePerson;
  }

  public List<LocationType> getReleaseFromLocation() {
    if (releaseFromLocation == null) {
      releaseFromLocation = new ArrayList<LocationType>();
    }
    return this.releaseFromLocation;
  }

  public List<EntityType> getReleaseIssuer() {
    if (releaseIssuer == null) {
      releaseIssuer = new ArrayList<EntityType>();
    }
    return this.releaseIssuer;
  }

  public List<ItemType> getReleaseItem() {
    if (releaseItem == null) {
      releaseItem = new ArrayList<ItemType>();
    }
    return this.releaseItem;
  }

  public List<EntityType> getReleaseRecipient() {
    if (releaseRecipient == null) {
      releaseRecipient = new ArrayList<EntityType>();
    }
    return this.releaseRecipient;
  }

  public List<LocationType> getReleaseToLocation() {
    if (releaseToLocation == null) {
      releaseToLocation = new ArrayList<LocationType>();
    }
    return this.releaseToLocation;
  }

  public List<EntityType> getReleaseSupervisor() {
    if (releaseSupervisor == null) {
      releaseSupervisor = new ArrayList<EntityType>();
    }
    return this.releaseSupervisor;
  }

  public List<Object> getReleaseAugmentationPoint() {
    if (releaseAugmentationPoint == null) {
      releaseAugmentationPoint = new ArrayList<Object>();
    }
    return this.releaseAugmentationPoint;
  }

}
