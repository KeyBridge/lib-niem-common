package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StateType", propOrder = {
  "stateRepresentation",
  "stateAugmentationPoint"
})
public class StateType
  extends ObjectType {

  @XmlElementRef(name = "StateRepresentation", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> stateRepresentation;
  @XmlElement(name = "StateAugmentationPoint")
  protected List<Object> stateAugmentationPoint;

  public List<JAXBElement<?>> getStateRepresentation() {
    if (stateRepresentation == null) {
      stateRepresentation = new ArrayList<JAXBElement<?>>();
    }
    return this.stateRepresentation;
  }

  public List<Object> getStateAugmentationPoint() {
    if (stateAugmentationPoint == null) {
      stateAugmentationPoint = new ArrayList<Object>();
    }
    return this.stateAugmentationPoint;
  }

}
