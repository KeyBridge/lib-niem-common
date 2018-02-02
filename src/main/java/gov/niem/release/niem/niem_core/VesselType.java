package gov.niem.release.niem.niem_core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VesselType", propOrder = {
  "vesselMakeAbstract",
  "vesselCategoryAbstract",
  "vesselHullIdentification",
  "vesselHullMaterialAbstract",
  "vesselHullShapeAbstract",
  "vesselPropulsionAbstract",
  "vesselTrailer",
  "vesselAugmentationPoint"
})
public class VesselType
  extends ConveyanceType {

  @XmlElement(name = "VesselMakeAbstract")
  protected List<Object> vesselMakeAbstract;
  @XmlElement(name = "VesselCategoryAbstract")
  protected List<Object> vesselCategoryAbstract;
  @XmlElement(name = "VesselHullIdentification", nillable = true)
  protected List<IdentificationType> vesselHullIdentification;
  @XmlElementRef(name = "VesselHullMaterialAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> vesselHullMaterialAbstract;
  @XmlElementRef(name = "VesselHullShapeAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> vesselHullShapeAbstract;
  @XmlElementRef(name = "VesselPropulsionAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> vesselPropulsionAbstract;
  @XmlElement(name = "VesselTrailer", nillable = true)
  protected List<VehicleType> vesselTrailer;
  @XmlElement(name = "VesselAugmentationPoint")
  protected List<Object> vesselAugmentationPoint;

  public List<Object> getVesselMakeAbstract() {
    if (vesselMakeAbstract == null) {
      vesselMakeAbstract = new ArrayList<Object>();
    }
    return this.vesselMakeAbstract;
  }

  public List<Object> getVesselCategoryAbstract() {
    if (vesselCategoryAbstract == null) {
      vesselCategoryAbstract = new ArrayList<Object>();
    }
    return this.vesselCategoryAbstract;
  }

  public List<IdentificationType> getVesselHullIdentification() {
    if (vesselHullIdentification == null) {
      vesselHullIdentification = new ArrayList<IdentificationType>();
    }
    return this.vesselHullIdentification;
  }

  public List<JAXBElement<?>> getVesselHullMaterialAbstract() {
    if (vesselHullMaterialAbstract == null) {
      vesselHullMaterialAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.vesselHullMaterialAbstract;
  }

  public List<JAXBElement<?>> getVesselHullShapeAbstract() {
    if (vesselHullShapeAbstract == null) {
      vesselHullShapeAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.vesselHullShapeAbstract;
  }

  public List<JAXBElement<?>> getVesselPropulsionAbstract() {
    if (vesselPropulsionAbstract == null) {
      vesselPropulsionAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.vesselPropulsionAbstract;
  }

  public List<VehicleType> getVesselTrailer() {
    if (vesselTrailer == null) {
      vesselTrailer = new ArrayList<VehicleType>();
    }
    return this.vesselTrailer;
  }

  public List<Object> getVesselAugmentationPoint() {
    if (vesselAugmentationPoint == null) {
      vesselAugmentationPoint = new ArrayList<Object>();
    }
    return this.vesselAugmentationPoint;
  }

}
