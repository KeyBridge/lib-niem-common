package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.Duration;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateType", propOrder = {
  "dateRepresentation",
  "dateAccuracyAbstract",
  "dateMarginOfErrorDuration",
  "dateAugmentationPoint"
})
public class DateType
  extends ObjectType {

  @XmlElementRef(name = "DateRepresentation", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> dateRepresentation;
  @XmlElement(name = "DateAccuracyAbstract")
  protected Object dateAccuracyAbstract;
  @XmlElement(name = "DateMarginOfErrorDuration", nillable = true)
  protected Duration dateMarginOfErrorDuration;
  @XmlElement(name = "DateAugmentationPoint")
  protected List<Object> dateAugmentationPoint;

  public List<JAXBElement<?>> getDateRepresentation() {
    if (dateRepresentation == null) {
      dateRepresentation = new ArrayList<JAXBElement<?>>();
    }
    return this.dateRepresentation;
  }

  public Object getDateAccuracyAbstract() {
    return dateAccuracyAbstract;
  }

  public void setDateAccuracyAbstract(Object value) {
    this.dateAccuracyAbstract = value;
  }

  public Duration getDateMarginOfErrorDuration() {
    return dateMarginOfErrorDuration;
  }

  public void setDateMarginOfErrorDuration(Duration value) {
    this.dateMarginOfErrorDuration = value;
  }

  public List<Object> getDateAugmentationPoint() {
    if (dateAugmentationPoint == null) {
      dateAugmentationPoint = new ArrayList<Object>();
    }
    return this.dateAugmentationPoint;
  }

}
