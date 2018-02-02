package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentStatusDetailsType", propOrder = {
  "documentStatusCategoryAbstract",
  "documentStatusDescriptionText",
  "documentStatusDetailsAugmentationPoint"
})
public class DocumentStatusDetailsType
  extends ObjectType {

  @XmlElement(name = "DocumentStatusCategoryAbstract")
  protected List<Object> documentStatusCategoryAbstract;
  @XmlElement(name = "DocumentStatusDescriptionText", nillable = true)
  protected List<TextType> documentStatusDescriptionText;
  @XmlElement(name = "DocumentStatusDetailsAugmentationPoint")
  protected List<Object> documentStatusDetailsAugmentationPoint;

  public List<Object> getDocumentStatusCategoryAbstract() {
    if (documentStatusCategoryAbstract == null) {
      documentStatusCategoryAbstract = new ArrayList<Object>();
    }
    return this.documentStatusCategoryAbstract;
  }

  public List<TextType> getDocumentStatusDescriptionText() {
    if (documentStatusDescriptionText == null) {
      documentStatusDescriptionText = new ArrayList<TextType>();
    }
    return this.documentStatusDescriptionText;
  }

  public List<Object> getDocumentStatusDetailsAugmentationPoint() {
    if (documentStatusDetailsAugmentationPoint == null) {
      documentStatusDetailsAugmentationPoint = new ArrayList<Object>();
    }
    return this.documentStatusDetailsAugmentationPoint;
  }

}
