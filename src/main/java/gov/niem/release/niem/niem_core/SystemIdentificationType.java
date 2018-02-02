package gov.niem.release.niem.niem_core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemIdentificationType", propOrder = {
  "systemName",
  "systemIdentificationAugmentationPoint"
})
public class SystemIdentificationType
  extends IdentificationType {

  @XmlElement(name = "SystemName", nillable = true)
  protected List<TextType> systemName;
  @XmlElement(name = "SystemIdentificationAugmentationPoint")
  protected List<Object> systemIdentificationAugmentationPoint;

  public List<TextType> getSystemName() {
    if (systemName == null) {
      systemName = new ArrayList<TextType>();
    }
    return this.systemName;
  }

  public List<Object> getSystemIdentificationAugmentationPoint() {
    if (systemIdentificationAugmentationPoint == null) {
      systemIdentificationAugmentationPoint = new ArrayList<Object>();
    }
    return this.systemIdentificationAugmentationPoint;
  }

}
