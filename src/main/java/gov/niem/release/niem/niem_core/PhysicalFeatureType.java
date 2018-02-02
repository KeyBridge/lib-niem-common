package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalFeatureType", propOrder = {
  "physicalFeatureGeneralCategoryText",
  "physicalFeatureCategoryAbstract",
  "physicalFeatureDescriptionText",
  "physicalFeatureImage",
  "physicalFeatureLocationText",
  "physicalFeatureAugmentationPoint"
})
public class PhysicalFeatureType
  extends ObjectType {

  @XmlElement(name = "PhysicalFeatureGeneralCategoryText", nillable = true)
  protected List<TextType> physicalFeatureGeneralCategoryText;
  @XmlElementRef(name = "PhysicalFeatureCategoryAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> physicalFeatureCategoryAbstract;
  @XmlElement(name = "PhysicalFeatureDescriptionText", nillable = true)
  protected List<TextType> physicalFeatureDescriptionText;
  @XmlElement(name = "PhysicalFeatureImage", nillable = true)
  protected List<ImageType> physicalFeatureImage;
  @XmlElement(name = "PhysicalFeatureLocationText", nillable = true)
  protected List<TextType> physicalFeatureLocationText;
  @XmlElement(name = "PhysicalFeatureAugmentationPoint")
  protected List<Object> physicalFeatureAugmentationPoint;

  public List<TextType> getPhysicalFeatureGeneralCategoryText() {
    if (physicalFeatureGeneralCategoryText == null) {
      physicalFeatureGeneralCategoryText = new ArrayList<TextType>();
    }
    return this.physicalFeatureGeneralCategoryText;
  }

  public List<JAXBElement<?>> getPhysicalFeatureCategoryAbstract() {
    if (physicalFeatureCategoryAbstract == null) {
      physicalFeatureCategoryAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.physicalFeatureCategoryAbstract;
  }

  public List<TextType> getPhysicalFeatureDescriptionText() {
    if (physicalFeatureDescriptionText == null) {
      physicalFeatureDescriptionText = new ArrayList<TextType>();
    }
    return this.physicalFeatureDescriptionText;
  }

  public List<ImageType> getPhysicalFeatureImage() {
    if (physicalFeatureImage == null) {
      physicalFeatureImage = new ArrayList<ImageType>();
    }
    return this.physicalFeatureImage;
  }

  public List<TextType> getPhysicalFeatureLocationText() {
    if (physicalFeatureLocationText == null) {
      physicalFeatureLocationText = new ArrayList<TextType>();
    }
    return this.physicalFeatureLocationText;
  }

  public List<Object> getPhysicalFeatureAugmentationPoint() {
    if (physicalFeatureAugmentationPoint == null) {
      physicalFeatureAugmentationPoint = new ArrayList<Object>();
    }
    return this.physicalFeatureAugmentationPoint;
  }

}
