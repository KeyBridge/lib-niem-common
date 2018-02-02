package gov.niem.release.niem.niem_core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntangibleItemType", propOrder = {
  "intangibleItemCategoryAbstract",
  "intellectualItemBusinessAreaText",
  "intangibleItemAugmentationPoint"
})
@XmlSeeAlso({
  IntellectualPropertyType.class
})
public class IntangibleItemType
  extends ItemType {

  @XmlElement(name = "IntangibleItemCategoryAbstract")
  protected List<Object> intangibleItemCategoryAbstract;
  @XmlElement(name = "IntellectualItemBusinessAreaText", nillable = true)
  protected List<TextType> intellectualItemBusinessAreaText;
  @XmlElement(name = "IntangibleItemAugmentationPoint")
  protected List<Object> intangibleItemAugmentationPoint;

  public List<Object> getIntangibleItemCategoryAbstract() {
    if (intangibleItemCategoryAbstract == null) {
      intangibleItemCategoryAbstract = new ArrayList<Object>();
    }
    return this.intangibleItemCategoryAbstract;
  }

  public List<TextType> getIntellectualItemBusinessAreaText() {
    if (intellectualItemBusinessAreaText == null) {
      intellectualItemBusinessAreaText = new ArrayList<TextType>();
    }
    return this.intellectualItemBusinessAreaText;
  }

  public List<Object> getIntangibleItemAugmentationPoint() {
    if (intangibleItemAugmentationPoint == null) {
      intangibleItemAugmentationPoint = new ArrayList<Object>();
    }
    return this.intangibleItemAugmentationPoint;
  }

}
