package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.String;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentType", propOrder = {
  "roleOfItem",
  "equipmentIdentification",
  "equipmentName",
  "equipmentAugmentationPoint"
})
public class EquipmentType
  extends ObjectType {

  @XmlElement(name = "RoleOfItem", nillable = true)
  protected List<ItemType> roleOfItem;
  @XmlElement(name = "EquipmentIdentification", nillable = true)
  protected List<IdentificationType> equipmentIdentification;
  @XmlElement(name = "EquipmentName", nillable = true)
  protected List<String> equipmentName;
  @XmlElement(name = "EquipmentAugmentationPoint")
  protected List<Object> equipmentAugmentationPoint;

  public List<ItemType> getRoleOfItem() {
    if (roleOfItem == null) {
      roleOfItem = new ArrayList<ItemType>();
    }
    return this.roleOfItem;
  }

  public List<IdentificationType> getEquipmentIdentification() {
    if (equipmentIdentification == null) {
      equipmentIdentification = new ArrayList<IdentificationType>();
    }
    return this.equipmentIdentification;
  }

  public List<String> getEquipmentName() {
    if (equipmentName == null) {
      equipmentName = new ArrayList<String>();
    }
    return this.equipmentName;
  }

  public List<Object> getEquipmentAugmentationPoint() {
    if (equipmentAugmentationPoint == null) {
      equipmentAugmentationPoint = new ArrayList<Object>();
    }
    return this.equipmentAugmentationPoint;
  }

}
