package gov.niem.release.niem.niem_core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemAuditEventType", propOrder = {
  "systemOperatingModeAbstract",
  "systemUserNameAbstract",
  "systemAuditEventAugmentationPoint"
})
public class SystemAuditEventType
  extends ActivityType {

  @XmlElementRef(name = "SystemOperatingModeAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> systemOperatingModeAbstract;
  @XmlElementRef(name = "SystemUserNameAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> systemUserNameAbstract;
  @XmlElement(name = "SystemAuditEventAugmentationPoint")
  protected List<Object> systemAuditEventAugmentationPoint;

  public List<JAXBElement<?>> getSystemOperatingModeAbstract() {
    if (systemOperatingModeAbstract == null) {
      systemOperatingModeAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.systemOperatingModeAbstract;
  }

  public List<JAXBElement<?>> getSystemUserNameAbstract() {
    if (systemUserNameAbstract == null) {
      systemUserNameAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.systemUserNameAbstract;
  }

  public List<Object> getSystemAuditEventAugmentationPoint() {
    if (systemAuditEventAugmentationPoint == null) {
      systemAuditEventAugmentationPoint = new ArrayList<Object>();
    }
    return this.systemAuditEventAugmentationPoint;
  }

}
