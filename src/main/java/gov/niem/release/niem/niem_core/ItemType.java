package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.Boolean;
import gov.niem.release.niem.proxy.xsd.Decimal;
import gov.niem.release.niem.proxy.xsd.GYear;
import gov.niem.release.niem.proxy.xsd.String;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemType", propOrder = {
  "itemName",
  "itemActionText",
  "itemBarCodeIdentification",
  "itemConditionText",
  "itemDealerIdentification",
  "itemDescriptionText",
  "itemDisposition",
  "itemOtherIdentification",
  "itemOwner",
  "itemOwnerAppliedID",
  "itemOwnerPurchasedValue",
  "itemPossessionDescriptionText",
  "itemPossessor",
  "itemReceiptIdentification",
  "itemRFIdentification",
  "itemSerialIdentification",
  "itemStateIdentification",
  "itemStatus",
  "itemUsageText",
  "itemValue",
  "itemVisibleID",
  "weaponIndicator",
  "weaponUsageIndicator",
  "conveyanceSalesTaxPercent",
  "itemAgeMeasure",
  "itemBinary",
  "itemBrandName",
  "itemCategoryAbstract",
  "itemColorAbstract",
  "itemCurrentResaleValue",
  "itemFirstSoldYearDate",
  "itemHeightMeasure",
  "itemImage",
  "itemLeaseIndicator",
  "itemLengthMeasure",
  "itemMakeName",
  "itemModelName",
  "itemModelYearDate",
  "itemOwnershipCategoryText",
  "itemQuantity",
  "itemRentalIndicator",
  "itemSizeDescriptionText",
  "itemStyleAbstract",
  "itemWeightMeasure",
  "itemWidthMeasure",
  "itemAugmentationPoint"
})
@XmlSeeAlso({
  DeviceType.class,
  SubstanceType.class,
  IntangibleItemType.class,
  RealEstateType.class,
  SecuritiesType.class,
  ConveyanceType.class
})
public class ItemType
  extends ObjectType {

  @XmlElement(name = "ItemName", nillable = true)
  protected List<TextType> itemName;
  @XmlElement(name = "ItemActionText", nillable = true)
  protected List<TextType> itemActionText;
  @XmlElement(name = "ItemBarCodeIdentification", nillable = true)
  protected List<IdentificationType> itemBarCodeIdentification;
  @XmlElement(name = "ItemConditionText", nillable = true)
  protected List<TextType> itemConditionText;
  @XmlElement(name = "ItemDealerIdentification", nillable = true)
  protected List<IdentificationType> itemDealerIdentification;
  @XmlElement(name = "ItemDescriptionText", nillable = true)
  protected List<TextType> itemDescriptionText;
  @XmlElement(name = "ItemDisposition", nillable = true)
  protected List<ItemDispositionType> itemDisposition;
  @XmlElement(name = "ItemOtherIdentification", nillable = true)
  protected List<IdentificationType> itemOtherIdentification;
  @XmlElement(name = "ItemOwner", nillable = true)
  protected List<EntityType> itemOwner;
  @XmlElement(name = "ItemOwnerAppliedID", nillable = true)
  protected List<String> itemOwnerAppliedID;
  @XmlElement(name = "ItemOwnerPurchasedValue", nillable = true)
  protected List<ItemValueType> itemOwnerPurchasedValue;
  @XmlElement(name = "ItemPossessionDescriptionText", nillable = true)
  protected List<TextType> itemPossessionDescriptionText;
  @XmlElement(name = "ItemPossessor", nillable = true)
  protected List<EntityType> itemPossessor;
  @XmlElement(name = "ItemReceiptIdentification", nillable = true)
  protected List<IdentificationType> itemReceiptIdentification;
  @XmlElement(name = "ItemRFIdentification", nillable = true)
  protected List<IdentificationType> itemRFIdentification;
  @XmlElement(name = "ItemSerialIdentification", nillable = true)
  protected List<IdentificationType> itemSerialIdentification;
  @XmlElement(name = "ItemStateIdentification", nillable = true)
  protected List<IdentificationType> itemStateIdentification;
  @XmlElement(name = "ItemStatus", nillable = true)
  protected List<StatusType> itemStatus;
  @XmlElement(name = "ItemUsageText", nillable = true)
  protected List<TextType> itemUsageText;
  @XmlElement(name = "ItemValue", nillable = true)
  protected List<ItemValueType> itemValue;
  @XmlElement(name = "ItemVisibleID", nillable = true)
  protected List<String> itemVisibleID;
  @XmlElement(name = "WeaponIndicator", nillable = true)
  protected List<Boolean> weaponIndicator;
  @XmlElement(name = "WeaponUsageIndicator", nillable = true)
  protected List<Boolean> weaponUsageIndicator;
  @XmlElement(name = "ConveyanceSalesTaxPercent", nillable = true)
  protected List<Decimal> conveyanceSalesTaxPercent;
  @XmlElement(name = "ItemAgeMeasure", nillable = true)
  protected List<TimeMeasureType> itemAgeMeasure;
  @XmlElement(name = "ItemBinary", nillable = true)
  protected List<BinaryType> itemBinary;
  @XmlElement(name = "ItemBrandName", nillable = true)
  protected List<ProperNameTextType> itemBrandName;
  @XmlElementRef(name = "ItemCategoryAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> itemCategoryAbstract;
  @XmlElementRef(name = "ItemColorAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> itemColorAbstract;
  @XmlElement(name = "ItemCurrentResaleValue", nillable = true)
  protected List<ItemValueType> itemCurrentResaleValue;
  @XmlElement(name = "ItemFirstSoldYearDate", nillable = true)
  protected List<GYear> itemFirstSoldYearDate;
  @XmlElement(name = "ItemHeightMeasure", nillable = true)
  protected List<LengthMeasureType> itemHeightMeasure;
  @XmlElement(name = "ItemImage", nillable = true)
  protected List<ImageType> itemImage;
  @XmlElement(name = "ItemLeaseIndicator", nillable = true)
  protected List<Boolean> itemLeaseIndicator;
  @XmlElement(name = "ItemLengthMeasure", nillable = true)
  protected List<LengthMeasureType> itemLengthMeasure;
  @XmlElement(name = "ItemMakeName", nillable = true)
  protected List<ProperNameTextType> itemMakeName;
  @XmlElement(name = "ItemModelName", nillable = true)
  protected List<ProperNameTextType> itemModelName;
  @XmlElement(name = "ItemModelYearDate", nillable = true)
  protected List<GYear> itemModelYearDate;
  @XmlElement(name = "ItemOwnershipCategoryText", nillable = true)
  protected List<TextType> itemOwnershipCategoryText;
  @XmlElement(name = "ItemQuantity", nillable = true)
  protected List<QuantityType> itemQuantity;
  @XmlElement(name = "ItemRentalIndicator", nillable = true)
  protected List<Boolean> itemRentalIndicator;
  @XmlElement(name = "ItemSizeDescriptionText", nillable = true)
  protected List<TextType> itemSizeDescriptionText;
  @XmlElementRef(name = "ItemStyleAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> itemStyleAbstract;
  @XmlElement(name = "ItemWeightMeasure", nillable = true)
  protected List<WeightMeasureType> itemWeightMeasure;
  @XmlElement(name = "ItemWidthMeasure", nillable = true)
  protected List<LengthMeasureType> itemWidthMeasure;
  @XmlElement(name = "ItemAugmentationPoint")
  protected List<Object> itemAugmentationPoint;

  public List<TextType> getItemName() {
    if (itemName == null) {
      itemName = new ArrayList<TextType>();
    }
    return this.itemName;
  }

  public List<TextType> getItemActionText() {
    if (itemActionText == null) {
      itemActionText = new ArrayList<TextType>();
    }
    return this.itemActionText;
  }

  public List<IdentificationType> getItemBarCodeIdentification() {
    if (itemBarCodeIdentification == null) {
      itemBarCodeIdentification = new ArrayList<IdentificationType>();
    }
    return this.itemBarCodeIdentification;
  }

  public List<TextType> getItemConditionText() {
    if (itemConditionText == null) {
      itemConditionText = new ArrayList<TextType>();
    }
    return this.itemConditionText;
  }

  public List<IdentificationType> getItemDealerIdentification() {
    if (itemDealerIdentification == null) {
      itemDealerIdentification = new ArrayList<IdentificationType>();
    }
    return this.itemDealerIdentification;
  }

  public List<TextType> getItemDescriptionText() {
    if (itemDescriptionText == null) {
      itemDescriptionText = new ArrayList<TextType>();
    }
    return this.itemDescriptionText;
  }

  public List<ItemDispositionType> getItemDisposition() {
    if (itemDisposition == null) {
      itemDisposition = new ArrayList<ItemDispositionType>();
    }
    return this.itemDisposition;
  }

  public List<IdentificationType> getItemOtherIdentification() {
    if (itemOtherIdentification == null) {
      itemOtherIdentification = new ArrayList<IdentificationType>();
    }
    return this.itemOtherIdentification;
  }

  public List<EntityType> getItemOwner() {
    if (itemOwner == null) {
      itemOwner = new ArrayList<EntityType>();
    }
    return this.itemOwner;
  }

  public List<String> getItemOwnerAppliedID() {
    if (itemOwnerAppliedID == null) {
      itemOwnerAppliedID = new ArrayList<String>();
    }
    return this.itemOwnerAppliedID;
  }

  public List<ItemValueType> getItemOwnerPurchasedValue() {
    if (itemOwnerPurchasedValue == null) {
      itemOwnerPurchasedValue = new ArrayList<ItemValueType>();
    }
    return this.itemOwnerPurchasedValue;
  }

  public List<TextType> getItemPossessionDescriptionText() {
    if (itemPossessionDescriptionText == null) {
      itemPossessionDescriptionText = new ArrayList<TextType>();
    }
    return this.itemPossessionDescriptionText;
  }

  public List<EntityType> getItemPossessor() {
    if (itemPossessor == null) {
      itemPossessor = new ArrayList<EntityType>();
    }
    return this.itemPossessor;
  }

  public List<IdentificationType> getItemReceiptIdentification() {
    if (itemReceiptIdentification == null) {
      itemReceiptIdentification = new ArrayList<IdentificationType>();
    }
    return this.itemReceiptIdentification;
  }

  public List<IdentificationType> getItemRFIdentification() {
    if (itemRFIdentification == null) {
      itemRFIdentification = new ArrayList<IdentificationType>();
    }
    return this.itemRFIdentification;
  }

  public List<IdentificationType> getItemSerialIdentification() {
    if (itemSerialIdentification == null) {
      itemSerialIdentification = new ArrayList<IdentificationType>();
    }
    return this.itemSerialIdentification;
  }

  public List<IdentificationType> getItemStateIdentification() {
    if (itemStateIdentification == null) {
      itemStateIdentification = new ArrayList<IdentificationType>();
    }
    return this.itemStateIdentification;
  }

  public List<StatusType> getItemStatus() {
    if (itemStatus == null) {
      itemStatus = new ArrayList<StatusType>();
    }
    return this.itemStatus;
  }

  public List<TextType> getItemUsageText() {
    if (itemUsageText == null) {
      itemUsageText = new ArrayList<TextType>();
    }
    return this.itemUsageText;
  }

  public List<ItemValueType> getItemValue() {
    if (itemValue == null) {
      itemValue = new ArrayList<ItemValueType>();
    }
    return this.itemValue;
  }

  public List<String> getItemVisibleID() {
    if (itemVisibleID == null) {
      itemVisibleID = new ArrayList<String>();
    }
    return this.itemVisibleID;
  }

  public List<Boolean> getWeaponIndicator() {
    if (weaponIndicator == null) {
      weaponIndicator = new ArrayList<Boolean>();
    }
    return this.weaponIndicator;
  }

  public List<Boolean> getWeaponUsageIndicator() {
    if (weaponUsageIndicator == null) {
      weaponUsageIndicator = new ArrayList<Boolean>();
    }
    return this.weaponUsageIndicator;
  }

  public List<Decimal> getConveyanceSalesTaxPercent() {
    if (conveyanceSalesTaxPercent == null) {
      conveyanceSalesTaxPercent = new ArrayList<Decimal>();
    }
    return this.conveyanceSalesTaxPercent;
  }

  public List<TimeMeasureType> getItemAgeMeasure() {
    if (itemAgeMeasure == null) {
      itemAgeMeasure = new ArrayList<TimeMeasureType>();
    }
    return this.itemAgeMeasure;
  }

  public List<BinaryType> getItemBinary() {
    if (itemBinary == null) {
      itemBinary = new ArrayList<BinaryType>();
    }
    return this.itemBinary;
  }

  public List<ProperNameTextType> getItemBrandName() {
    if (itemBrandName == null) {
      itemBrandName = new ArrayList<ProperNameTextType>();
    }
    return this.itemBrandName;
  }

  public List<JAXBElement<?>> getItemCategoryAbstract() {
    if (itemCategoryAbstract == null) {
      itemCategoryAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.itemCategoryAbstract;
  }

  public List<JAXBElement<?>> getItemColorAbstract() {
    if (itemColorAbstract == null) {
      itemColorAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.itemColorAbstract;
  }

  public List<ItemValueType> getItemCurrentResaleValue() {
    if (itemCurrentResaleValue == null) {
      itemCurrentResaleValue = new ArrayList<ItemValueType>();
    }
    return this.itemCurrentResaleValue;
  }

  public List<GYear> getItemFirstSoldYearDate() {
    if (itemFirstSoldYearDate == null) {
      itemFirstSoldYearDate = new ArrayList<GYear>();
    }
    return this.itemFirstSoldYearDate;
  }

  public List<LengthMeasureType> getItemHeightMeasure() {
    if (itemHeightMeasure == null) {
      itemHeightMeasure = new ArrayList<LengthMeasureType>();
    }
    return this.itemHeightMeasure;
  }

  public List<ImageType> getItemImage() {
    if (itemImage == null) {
      itemImage = new ArrayList<ImageType>();
    }
    return this.itemImage;
  }

  public List<Boolean> getItemLeaseIndicator() {
    if (itemLeaseIndicator == null) {
      itemLeaseIndicator = new ArrayList<Boolean>();
    }
    return this.itemLeaseIndicator;
  }

  public List<LengthMeasureType> getItemLengthMeasure() {
    if (itemLengthMeasure == null) {
      itemLengthMeasure = new ArrayList<LengthMeasureType>();
    }
    return this.itemLengthMeasure;
  }

  public List<ProperNameTextType> getItemMakeName() {
    if (itemMakeName == null) {
      itemMakeName = new ArrayList<ProperNameTextType>();
    }
    return this.itemMakeName;
  }

  public List<ProperNameTextType> getItemModelName() {
    if (itemModelName == null) {
      itemModelName = new ArrayList<ProperNameTextType>();
    }
    return this.itemModelName;
  }

  public List<GYear> getItemModelYearDate() {
    if (itemModelYearDate == null) {
      itemModelYearDate = new ArrayList<GYear>();
    }
    return this.itemModelYearDate;
  }

  public List<TextType> getItemOwnershipCategoryText() {
    if (itemOwnershipCategoryText == null) {
      itemOwnershipCategoryText = new ArrayList<TextType>();
    }
    return this.itemOwnershipCategoryText;
  }

  public List<QuantityType> getItemQuantity() {
    if (itemQuantity == null) {
      itemQuantity = new ArrayList<QuantityType>();
    }
    return this.itemQuantity;
  }

  public List<Boolean> getItemRentalIndicator() {
    if (itemRentalIndicator == null) {
      itemRentalIndicator = new ArrayList<Boolean>();
    }
    return this.itemRentalIndicator;
  }

  public List<TextType> getItemSizeDescriptionText() {
    if (itemSizeDescriptionText == null) {
      itemSizeDescriptionText = new ArrayList<TextType>();
    }
    return this.itemSizeDescriptionText;
  }

  public List<JAXBElement<?>> getItemStyleAbstract() {
    if (itemStyleAbstract == null) {
      itemStyleAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.itemStyleAbstract;
  }

  public List<WeightMeasureType> getItemWeightMeasure() {
    if (itemWeightMeasure == null) {
      itemWeightMeasure = new ArrayList<WeightMeasureType>();
    }
    return this.itemWeightMeasure;
  }

  public List<LengthMeasureType> getItemWidthMeasure() {
    if (itemWidthMeasure == null) {
      itemWidthMeasure = new ArrayList<LengthMeasureType>();
    }
    return this.itemWidthMeasure;
  }

  public List<Object> getItemAugmentationPoint() {
    if (itemAugmentationPoint == null) {
      itemAugmentationPoint = new ArrayList<Object>();
    }
    return this.itemAugmentationPoint;
  }

}
