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
@XmlType(name = "ItemTransactionType", propOrder = {
  "itemSeller",
  "itemPurchasePriceValue",
  "itemBuyer",
  "item",
  "itemTransactionAugmentationPoint"
})
public class ItemTransactionType
  extends ActivityType {

  @XmlElement(name = "ItemSeller", nillable = true)
  protected List<EntityType> itemSeller;
  @XmlElement(name = "ItemPurchasePriceValue", nillable = true)
  protected List<ItemValueType> itemPurchasePriceValue;
  @XmlElement(name = "ItemBuyer", nillable = true)
  protected List<EntityType> itemBuyer;
  @XmlElement(name = "Item", nillable = true)
  protected List<ItemType> item;
  @XmlElement(name = "ItemTransactionAugmentationPoint")
  protected List<Object> itemTransactionAugmentationPoint;

  public List<EntityType> getItemSeller() {
    if (itemSeller == null) {
      itemSeller = new ArrayList<EntityType>();
    }
    return this.itemSeller;
  }

  public List<ItemValueType> getItemPurchasePriceValue() {
    if (itemPurchasePriceValue == null) {
      itemPurchasePriceValue = new ArrayList<ItemValueType>();
    }
    return this.itemPurchasePriceValue;
  }

  public List<EntityType> getItemBuyer() {
    if (itemBuyer == null) {
      itemBuyer = new ArrayList<EntityType>();
    }
    return this.itemBuyer;
  }

  public List<ItemType> getItem() {
    if (item == null) {
      item = new ArrayList<ItemType>();
    }
    return this.item;
  }

  public List<Object> getItemTransactionAugmentationPoint() {
    if (itemTransactionAugmentationPoint == null) {
      itemTransactionAugmentationPoint = new ArrayList<Object>();
    }
    return this.itemTransactionAugmentationPoint;
  }

}
