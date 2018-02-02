package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusType", propOrder = {
  "statusAbstract",
  "statusCommentText",
  "statusDescriptionText",
  "statusIssuerIdentification",
  "statusIssuerText",
  "statusDate",
  "statusAugmentationPoint"
})
public class StatusType
  extends ObjectType {

  @XmlElementRef(name = "StatusAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> statusAbstract;
  @XmlElement(name = "StatusCommentText", nillable = true)
  protected List<TextType> statusCommentText;
  @XmlElement(name = "StatusDescriptionText", nillable = true)
  protected List<TextType> statusDescriptionText;
  @XmlElement(name = "StatusIssuerIdentification", nillable = true)
  protected List<IdentificationType> statusIssuerIdentification;
  @XmlElement(name = "StatusIssuerText", nillable = true)
  protected List<TextType> statusIssuerText;
  @XmlElement(name = "StatusDate", nillable = true)
  protected List<DateType> statusDate;
  @XmlElement(name = "StatusAugmentationPoint")
  protected List<Object> statusAugmentationPoint;

  public List<JAXBElement<?>> getStatusAbstract() {
    if (statusAbstract == null) {
      statusAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.statusAbstract;
  }

  public List<TextType> getStatusCommentText() {
    if (statusCommentText == null) {
      statusCommentText = new ArrayList<TextType>();
    }
    return this.statusCommentText;
  }

  public List<TextType> getStatusDescriptionText() {
    if (statusDescriptionText == null) {
      statusDescriptionText = new ArrayList<TextType>();
    }
    return this.statusDescriptionText;
  }

  public List<IdentificationType> getStatusIssuerIdentification() {
    if (statusIssuerIdentification == null) {
      statusIssuerIdentification = new ArrayList<IdentificationType>();
    }
    return this.statusIssuerIdentification;
  }

  public List<TextType> getStatusIssuerText() {
    if (statusIssuerText == null) {
      statusIssuerText = new ArrayList<TextType>();
    }
    return this.statusIssuerText;
  }

  public List<DateType> getStatusDate() {
    if (statusDate == null) {
      statusDate = new ArrayList<DateType>();
    }
    return this.statusDate;
  }

  public List<Object> getStatusAugmentationPoint() {
    if (statusAugmentationPoint == null) {
      statusAugmentationPoint = new ArrayList<Object>();
    }
    return this.statusAugmentationPoint;
  }

}
