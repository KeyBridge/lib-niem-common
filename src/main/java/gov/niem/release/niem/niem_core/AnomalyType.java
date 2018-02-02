package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnomalyType", propOrder = {
  "anomalyCategoryAbstract",
  "anomalyContactInformation",
  "anomalyDateTime",
  "anomalyDescriptionText",
  "anomalyLocation",
  "anomalyAugmentationPoint"
})
public class AnomalyType
  extends ObjectType {

  @XmlElementRef(name = "AnomalyCategoryAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> anomalyCategoryAbstract;
  @XmlElement(name = "AnomalyContactInformation", nillable = true)
  protected List<ContactInformationType> anomalyContactInformation;
  @XmlElement(name = "AnomalyDateTime", nillable = true)
  protected List<DateType> anomalyDateTime;
  @XmlElement(name = "AnomalyDescriptionText", nillable = true)
  protected List<TextType> anomalyDescriptionText;
  @XmlElement(name = "AnomalyLocation", nillable = true)
  protected List<LocationType> anomalyLocation;
  @XmlElement(name = "AnomalyAugmentationPoint")
  protected List<Object> anomalyAugmentationPoint;

  public List<JAXBElement<?>> getAnomalyCategoryAbstract() {
    if (anomalyCategoryAbstract == null) {
      anomalyCategoryAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.anomalyCategoryAbstract;
  }

  public List<ContactInformationType> getAnomalyContactInformation() {
    if (anomalyContactInformation == null) {
      anomalyContactInformation = new ArrayList<ContactInformationType>();
    }
    return this.anomalyContactInformation;
  }

  public List<DateType> getAnomalyDateTime() {
    if (anomalyDateTime == null) {
      anomalyDateTime = new ArrayList<DateType>();
    }
    return this.anomalyDateTime;
  }

  public List<TextType> getAnomalyDescriptionText() {
    if (anomalyDescriptionText == null) {
      anomalyDescriptionText = new ArrayList<TextType>();
    }
    return this.anomalyDescriptionText;
  }

  public List<LocationType> getAnomalyLocation() {
    if (anomalyLocation == null) {
      anomalyLocation = new ArrayList<LocationType>();
    }
    return this.anomalyLocation;
  }

  public List<Object> getAnomalyAugmentationPoint() {
    if (anomalyAugmentationPoint == null) {
      anomalyAugmentationPoint = new ArrayList<Object>();
    }
    return this.anomalyAugmentationPoint;
  }

}
