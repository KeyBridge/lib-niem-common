package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericEntityType", propOrder = {
  "entityName",
  "entityContactInformation",
  "entityDescriptionText",
  "genericEntityAugmentationPoint"
})
public class GenericEntityType
  extends ObjectType {

  @XmlElement(name = "EntityName", nillable = true)
  protected List<TextType> entityName;
  @XmlElement(name = "EntityContactInformation", nillable = true)
  protected List<ContactInformationType> entityContactInformation;
  @XmlElement(name = "EntityDescriptionText", nillable = true)
  protected List<TextType> entityDescriptionText;
  @XmlElement(name = "GenericEntityAugmentationPoint")
  protected List<Object> genericEntityAugmentationPoint;

  public List<TextType> getEntityName() {
    if (entityName == null) {
      entityName = new ArrayList<TextType>();
    }
    return this.entityName;
  }

  public List<ContactInformationType> getEntityContactInformation() {
    if (entityContactInformation == null) {
      entityContactInformation = new ArrayList<ContactInformationType>();
    }
    return this.entityContactInformation;
  }

  public List<TextType> getEntityDescriptionText() {
    if (entityDescriptionText == null) {
      entityDescriptionText = new ArrayList<TextType>();
    }
    return this.entityDescriptionText;
  }

  public List<Object> getGenericEntityAugmentationPoint() {
    if (genericEntityAugmentationPoint == null) {
      genericEntityAugmentationPoint = new ArrayList<Object>();
    }
    return this.genericEntityAugmentationPoint;
  }

}
