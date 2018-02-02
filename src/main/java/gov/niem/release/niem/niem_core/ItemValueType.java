package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.Boolean;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemValueType", propOrder = {
  "itemValueAmount",
  "itemValueAssigningMethodAbstract",
  "itemValueDate",
  "itemValueDescriptionText",
  "itemValueTaxIncludedIndicator",
  "itemValueAssigner",
  "itemValueAugmentationPoint"
})
public class ItemValueType
  extends ObjectType {

  @XmlElement(name = "ItemValueAmount", nillable = true)
  protected List<AmountType> itemValueAmount;
  @XmlElementRef(name = "ItemValueAssigningMethodAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> itemValueAssigningMethodAbstract;
  @XmlElement(name = "ItemValueDate", nillable = true)
  protected List<DateType> itemValueDate;
  @XmlElement(name = "ItemValueDescriptionText", nillable = true)
  protected List<TextType> itemValueDescriptionText;
  @XmlElement(name = "ItemValueTaxIncludedIndicator", nillable = true)
  protected List<Boolean> itemValueTaxIncludedIndicator;
  @XmlElement(name = "ItemValueAssigner", nillable = true)
  protected List<EntityType> itemValueAssigner;
  @XmlElement(name = "ItemValueAugmentationPoint")
  protected List<Object> itemValueAugmentationPoint;

  public List<AmountType> getItemValueAmount() {
    if (itemValueAmount == null) {
      itemValueAmount = new ArrayList<AmountType>();
    }
    return this.itemValueAmount;
  }

  public List<JAXBElement<?>> getItemValueAssigningMethodAbstract() {
    if (itemValueAssigningMethodAbstract == null) {
      itemValueAssigningMethodAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.itemValueAssigningMethodAbstract;
  }

  public List<DateType> getItemValueDate() {
    if (itemValueDate == null) {
      itemValueDate = new ArrayList<DateType>();
    }
    return this.itemValueDate;
  }

  public List<TextType> getItemValueDescriptionText() {
    if (itemValueDescriptionText == null) {
      itemValueDescriptionText = new ArrayList<TextType>();
    }
    return this.itemValueDescriptionText;
  }

  public List<Boolean> getItemValueTaxIncludedIndicator() {
    if (itemValueTaxIncludedIndicator == null) {
      itemValueTaxIncludedIndicator = new ArrayList<Boolean>();
    }
    return this.itemValueTaxIncludedIndicator;
  }

  public List<EntityType> getItemValueAssigner() {
    if (itemValueAssigner == null) {
      itemValueAssigner = new ArrayList<EntityType>();
    }
    return this.itemValueAssigner;
  }

  public List<Object> getItemValueAugmentationPoint() {
    if (itemValueAugmentationPoint == null) {
      itemValueAugmentationPoint = new ArrayList<Object>();
    }
    return this.itemValueAugmentationPoint;
  }

}
