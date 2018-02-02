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
@XmlType(name = "ItemDispositionType", propOrder = {
  "itemDispositionAbstract",
  "itemDispositionLocation",
  "item",
  "itemHoldingOrganization",
  "itemMovingOrganization",
  "itemDispositionAugmentationPoint"
})
public class ItemDispositionType
  extends DispositionType {

  @XmlElement(name = "ItemDispositionAbstract")
  protected List<Object> itemDispositionAbstract;
  @XmlElement(name = "ItemDispositionLocation", nillable = true)
  protected List<LocationType> itemDispositionLocation;
  @XmlElement(name = "Item", nillable = true)
  protected List<ItemType> item;
  @XmlElement(name = "ItemHoldingOrganization", nillable = true)
  protected List<OrganizationType> itemHoldingOrganization;
  @XmlElement(name = "ItemMovingOrganization", nillable = true)
  protected List<OrganizationType> itemMovingOrganization;
  @XmlElement(name = "ItemDispositionAugmentationPoint")
  protected List<Object> itemDispositionAugmentationPoint;

  public List<Object> getItemDispositionAbstract() {
    if (itemDispositionAbstract == null) {
      itemDispositionAbstract = new ArrayList<Object>();
    }
    return this.itemDispositionAbstract;
  }

  public List<LocationType> getItemDispositionLocation() {
    if (itemDispositionLocation == null) {
      itemDispositionLocation = new ArrayList<LocationType>();
    }
    return this.itemDispositionLocation;
  }

  public List<ItemType> getItem() {
    if (item == null) {
      item = new ArrayList<ItemType>();
    }
    return this.item;
  }

  public List<OrganizationType> getItemHoldingOrganization() {
    if (itemHoldingOrganization == null) {
      itemHoldingOrganization = new ArrayList<OrganizationType>();
    }
    return this.itemHoldingOrganization;
  }

  public List<OrganizationType> getItemMovingOrganization() {
    if (itemMovingOrganization == null) {
      itemMovingOrganization = new ArrayList<OrganizationType>();
    }
    return this.itemMovingOrganization;
  }

  public List<Object> getItemDispositionAugmentationPoint() {
    if (itemDispositionAugmentationPoint == null) {
      itemDispositionAugmentationPoint = new ArrayList<Object>();
    }
    return this.itemDispositionAugmentationPoint;
  }

}
