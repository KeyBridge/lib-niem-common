package gov.niem.release.niem.niem_core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManifestType", propOrder = {
  "manifestCategoryAbstract",
  "manifestTransmittedDate",
  "manifestAugmentationPoint"
})
public class ManifestType
  extends DocumentType {

  @XmlElementRef(name = "ManifestCategoryAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> manifestCategoryAbstract;
  @XmlElement(name = "ManifestTransmittedDate", nillable = true)
  protected List<DateType> manifestTransmittedDate;
  @XmlElement(name = "ManifestAugmentationPoint")
  protected List<Object> manifestAugmentationPoint;

  public List<JAXBElement<?>> getManifestCategoryAbstract() {
    if (manifestCategoryAbstract == null) {
      manifestCategoryAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.manifestCategoryAbstract;
  }

  public List<DateType> getManifestTransmittedDate() {
    if (manifestTransmittedDate == null) {
      manifestTransmittedDate = new ArrayList<DateType>();
    }
    return this.manifestTransmittedDate;
  }

  public List<Object> getManifestAugmentationPoint() {
    if (manifestAugmentationPoint == null) {
      manifestAugmentationPoint = new ArrayList<Object>();
    }
    return this.manifestAugmentationPoint;
  }

}
