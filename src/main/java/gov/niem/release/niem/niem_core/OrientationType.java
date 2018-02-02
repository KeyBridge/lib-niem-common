package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrientationType", propOrder = {
  "azimuthValue",
  "inclinationValue",
  "rollValue",
  "orientationAugmentationPoint"
})
public class OrientationType
  extends ObjectType {

  @XmlElement(name = "AzimuthValue", nillable = true)
  protected List<Degree360Type> azimuthValue;
  @XmlElement(name = "InclinationValue", nillable = true)
  protected List<Degree90PlusMinusType> inclinationValue;
  @XmlElement(name = "RollValue", nillable = true)
  protected List<Degree180PlusMinusType> rollValue;
  @XmlElement(name = "OrientationAugmentationPoint")
  protected List<Object> orientationAugmentationPoint;

  public List<Degree360Type> getAzimuthValue() {
    if (azimuthValue == null) {
      azimuthValue = new ArrayList<Degree360Type>();
    }
    return this.azimuthValue;
  }

  public List<Degree90PlusMinusType> getInclinationValue() {
    if (inclinationValue == null) {
      inclinationValue = new ArrayList<Degree90PlusMinusType>();
    }
    return this.inclinationValue;
  }

  public List<Degree180PlusMinusType> getRollValue() {
    if (rollValue == null) {
      rollValue = new ArrayList<Degree180PlusMinusType>();
    }
    return this.rollValue;
  }

  public List<Object> getOrientationAugmentationPoint() {
    if (orientationAugmentationPoint == null) {
      orientationAugmentationPoint = new ArrayList<Object>();
    }
    return this.orientationAugmentationPoint;
  }

}
