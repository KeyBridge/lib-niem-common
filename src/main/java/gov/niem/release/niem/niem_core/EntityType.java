package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityType", propOrder = {
  "entityRepresentation",
  "entityAugmentationPoint"
})
@XmlSeeAlso({
  FinancialAccountHolderType.class
})
public class EntityType
  extends ObjectType {

  @XmlElementRef(name = "EntityRepresentation", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> entityRepresentation;
  @XmlElement(name = "EntityAugmentationPoint")
  protected List<Object> entityAugmentationPoint;

  public List<JAXBElement<?>> getEntityRepresentation() {
    if (entityRepresentation == null) {
      entityRepresentation = new ArrayList<JAXBElement<?>>();
    }
    return this.entityRepresentation;
  }

  public List<Object> getEntityAugmentationPoint() {
    if (entityAugmentationPoint == null) {
      entityAugmentationPoint = new ArrayList<Object>();
    }
    return this.entityAugmentationPoint;
  }

}
