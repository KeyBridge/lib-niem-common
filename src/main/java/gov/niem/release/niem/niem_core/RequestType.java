package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestType", propOrder = {
  "requestContactInformation",
  "requestDate",
  "requestDecisionText",
  "requestDescriptionText",
  "requestIdentification",
  "requestText",
  "requestDecisionDate",
  "requestCategoryAbstract",
  "requestStatus",
  "requestAugmentationPoint"
})
public class RequestType
  extends ObjectType {

  @XmlElement(name = "RequestContactInformation", nillable = true)
  protected List<ContactInformationType> requestContactInformation;
  @XmlElement(name = "RequestDate", nillable = true)
  protected List<DateType> requestDate;
  @XmlElement(name = "RequestDecisionText", nillable = true)
  protected List<TextType> requestDecisionText;
  @XmlElement(name = "RequestDescriptionText", nillable = true)
  protected List<TextType> requestDescriptionText;
  @XmlElement(name = "RequestIdentification", nillable = true)
  protected List<IdentificationType> requestIdentification;
  @XmlElement(name = "RequestText", nillable = true)
  protected List<TextType> requestText;
  @XmlElement(name = "RequestDecisionDate", nillable = true)
  protected List<DateType> requestDecisionDate;
  @XmlElementRef(name = "RequestCategoryAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> requestCategoryAbstract;
  @XmlElement(name = "RequestStatus", nillable = true)
  protected List<StatusType> requestStatus;
  @XmlElement(name = "RequestAugmentationPoint")
  protected List<Object> requestAugmentationPoint;

  public List<ContactInformationType> getRequestContactInformation() {
    if (requestContactInformation == null) {
      requestContactInformation = new ArrayList<ContactInformationType>();
    }
    return this.requestContactInformation;
  }

  public List<DateType> getRequestDate() {
    if (requestDate == null) {
      requestDate = new ArrayList<DateType>();
    }
    return this.requestDate;
  }

  public List<TextType> getRequestDecisionText() {
    if (requestDecisionText == null) {
      requestDecisionText = new ArrayList<TextType>();
    }
    return this.requestDecisionText;
  }

  public List<TextType> getRequestDescriptionText() {
    if (requestDescriptionText == null) {
      requestDescriptionText = new ArrayList<TextType>();
    }
    return this.requestDescriptionText;
  }

  public List<IdentificationType> getRequestIdentification() {
    if (requestIdentification == null) {
      requestIdentification = new ArrayList<IdentificationType>();
    }
    return this.requestIdentification;
  }

  public List<TextType> getRequestText() {
    if (requestText == null) {
      requestText = new ArrayList<TextType>();
    }
    return this.requestText;
  }

  public List<DateType> getRequestDecisionDate() {
    if (requestDecisionDate == null) {
      requestDecisionDate = new ArrayList<DateType>();
    }
    return this.requestDecisionDate;
  }

  public List<JAXBElement<?>> getRequestCategoryAbstract() {
    if (requestCategoryAbstract == null) {
      requestCategoryAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.requestCategoryAbstract;
  }

  public List<StatusType> getRequestStatus() {
    if (requestStatus == null) {
      requestStatus = new ArrayList<StatusType>();
    }
    return this.requestStatus;
  }

  public List<Object> getRequestAugmentationPoint() {
    if (requestAugmentationPoint == null) {
      requestAugmentationPoint = new ArrayList<Object>();
    }
    return this.requestAugmentationPoint;
  }

}
