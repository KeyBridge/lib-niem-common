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
