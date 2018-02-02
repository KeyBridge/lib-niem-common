package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelativeLocationType", propOrder = {
  "relativeLocationDescriptionText",
  "relativeLocationDirectionAbstract",
  "relativeLocationDistanceMeasure",
  "relativeLocationHeadingValue",
  "relativeLocationReferencePoint",
  "relativeLocationAugmentationPoint"
})
public class RelativeLocationType
  extends ObjectType {

  @XmlElement(name = "RelativeLocationDescriptionText", nillable = true)
  protected List<TextType> relativeLocationDescriptionText;
  @XmlElementRef(name = "RelativeLocationDirectionAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> relativeLocationDirectionAbstract;
  @XmlElement(name = "RelativeLocationDistanceMeasure", nillable = true)
  protected List<LengthMeasureType> relativeLocationDistanceMeasure;
  @XmlElement(name = "RelativeLocationHeadingValue", nillable = true)
  protected List<RelativeLocationHeadingType> relativeLocationHeadingValue;
  @XmlElement(name = "RelativeLocationReferencePoint", nillable = true)
  protected List<LocationType> relativeLocationReferencePoint;
  @XmlElement(name = "RelativeLocationAugmentationPoint")
  protected List<Object> relativeLocationAugmentationPoint;

  public List<TextType> getRelativeLocationDescriptionText() {
    if (relativeLocationDescriptionText == null) {
      relativeLocationDescriptionText = new ArrayList<TextType>();
    }
    return this.relativeLocationDescriptionText;
  }

  public List<JAXBElement<?>> getRelativeLocationDirectionAbstract() {
    if (relativeLocationDirectionAbstract == null) {
      relativeLocationDirectionAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.relativeLocationDirectionAbstract;
  }

  public List<LengthMeasureType> getRelativeLocationDistanceMeasure() {
    if (relativeLocationDistanceMeasure == null) {
      relativeLocationDistanceMeasure = new ArrayList<LengthMeasureType>();
    }
    return this.relativeLocationDistanceMeasure;
  }

  public List<RelativeLocationHeadingType> getRelativeLocationHeadingValue() {
    if (relativeLocationHeadingValue == null) {
      relativeLocationHeadingValue = new ArrayList<RelativeLocationHeadingType>();
    }
    return this.relativeLocationHeadingValue;
  }

  public List<LocationType> getRelativeLocationReferencePoint() {
    if (relativeLocationReferencePoint == null) {
      relativeLocationReferencePoint = new ArrayList<LocationType>();
    }
    return this.relativeLocationReferencePoint;
  }

  public List<Object> getRelativeLocationAugmentationPoint() {
    if (relativeLocationAugmentationPoint == null) {
      relativeLocationAugmentationPoint = new ArrayList<Object>();
    }
    return this.relativeLocationAugmentationPoint;
  }

}
