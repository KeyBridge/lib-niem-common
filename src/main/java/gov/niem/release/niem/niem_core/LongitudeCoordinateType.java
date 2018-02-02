package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LongitudeCoordinateType", propOrder = {
  "longitudeDegreeValue",
  "longitudeMinuteValue",
  "longitudeSecondValue",
  "longitudeCoordinateAugmentationPoint"
})
public class LongitudeCoordinateType
  extends ObjectType {

  @XmlElement(name = "LongitudeDegreeValue", nillable = true)
  protected List<LongitudeDegreeType> longitudeDegreeValue;
  @XmlElement(name = "LongitudeMinuteValue", nillable = true)
  protected List<AngularMinuteType> longitudeMinuteValue;
  @XmlElement(name = "LongitudeSecondValue", nillable = true)
  protected List<AngularSecondType> longitudeSecondValue;
  @XmlElement(name = "LongitudeCoordinateAugmentationPoint")
  protected List<Object> longitudeCoordinateAugmentationPoint;

  public List<LongitudeDegreeType> getLongitudeDegreeValue() {
    if (longitudeDegreeValue == null) {
      longitudeDegreeValue = new ArrayList<LongitudeDegreeType>();
    }
    return this.longitudeDegreeValue;
  }

  public List<AngularMinuteType> getLongitudeMinuteValue() {
    if (longitudeMinuteValue == null) {
      longitudeMinuteValue = new ArrayList<AngularMinuteType>();
    }
    return this.longitudeMinuteValue;
  }

  public List<AngularSecondType> getLongitudeSecondValue() {
    if (longitudeSecondValue == null) {
      longitudeSecondValue = new ArrayList<AngularSecondType>();
    }
    return this.longitudeSecondValue;
  }

  public List<Object> getLongitudeCoordinateAugmentationPoint() {
    if (longitudeCoordinateAugmentationPoint == null) {
      longitudeCoordinateAugmentationPoint = new ArrayList<Object>();
    }
    return this.longitudeCoordinateAugmentationPoint;
  }

}
