package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.String;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageType", propOrder = {
  "messageID",
  "messageRecipientAbstract",
  "messageRecipientAddressID",
  "messageReceivedDate",
  "messageSenderAbstract",
  "messageSenderAddressID",
  "messageSentDate",
  "messageSubjectText",
  "messageText",
  "messageAttachmentAbstract",
  "messageCategoryAbstract",
  "messageReferenceID",
  "messageFATCAUsageRestrictionText",
  "messageAugmentationPoint"
})
public class MessageType
  extends ObjectType {

  @XmlElement(name = "MessageID", nillable = true)
  protected List<String> messageID;
  @XmlElementRef(name = "MessageRecipientAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> messageRecipientAbstract;
  @XmlElement(name = "MessageRecipientAddressID", nillable = true)
  protected List<String> messageRecipientAddressID;
  @XmlElement(name = "MessageReceivedDate", nillable = true)
  protected List<DateType> messageReceivedDate;
  @XmlElementRef(name = "MessageSenderAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> messageSenderAbstract;
  @XmlElement(name = "MessageSenderAddressID", nillable = true)
  protected List<String> messageSenderAddressID;
  @XmlElement(name = "MessageSentDate", nillable = true)
  protected List<DateType> messageSentDate;
  @XmlElement(name = "MessageSubjectText", nillable = true)
  protected List<TextType> messageSubjectText;
  @XmlElement(name = "MessageText", nillable = true)
  protected List<TextType> messageText;
  @XmlElementRef(name = "MessageAttachmentAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> messageAttachmentAbstract;
  @XmlElementRef(name = "MessageCategoryAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> messageCategoryAbstract;
  @XmlElement(name = "MessageReferenceID", nillable = true)
  protected List<String> messageReferenceID;
  @XmlElement(name = "MessageFATCAUsageRestrictionText", nillable = true)
  protected List<TextType> messageFATCAUsageRestrictionText;
  @XmlElement(name = "MessageAugmentationPoint")
  protected List<Object> messageAugmentationPoint;

  public List<String> getMessageID() {
    if (messageID == null) {
      messageID = new ArrayList<String>();
    }
    return this.messageID;
  }

  public List<JAXBElement<?>> getMessageRecipientAbstract() {
    if (messageRecipientAbstract == null) {
      messageRecipientAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.messageRecipientAbstract;
  }

  public List<String> getMessageRecipientAddressID() {
    if (messageRecipientAddressID == null) {
      messageRecipientAddressID = new ArrayList<String>();
    }
    return this.messageRecipientAddressID;
  }

  public List<DateType> getMessageReceivedDate() {
    if (messageReceivedDate == null) {
      messageReceivedDate = new ArrayList<DateType>();
    }
    return this.messageReceivedDate;
  }

  public List<JAXBElement<?>> getMessageSenderAbstract() {
    if (messageSenderAbstract == null) {
      messageSenderAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.messageSenderAbstract;
  }

  public List<String> getMessageSenderAddressID() {
    if (messageSenderAddressID == null) {
      messageSenderAddressID = new ArrayList<String>();
    }
    return this.messageSenderAddressID;
  }

  public List<DateType> getMessageSentDate() {
    if (messageSentDate == null) {
      messageSentDate = new ArrayList<DateType>();
    }
    return this.messageSentDate;
  }

  public List<TextType> getMessageSubjectText() {
    if (messageSubjectText == null) {
      messageSubjectText = new ArrayList<TextType>();
    }
    return this.messageSubjectText;
  }

  public List<TextType> getMessageText() {
    if (messageText == null) {
      messageText = new ArrayList<TextType>();
    }
    return this.messageText;
  }

  public List<JAXBElement<?>> getMessageAttachmentAbstract() {
    if (messageAttachmentAbstract == null) {
      messageAttachmentAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.messageAttachmentAbstract;
  }

  public List<JAXBElement<?>> getMessageCategoryAbstract() {
    if (messageCategoryAbstract == null) {
      messageCategoryAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.messageCategoryAbstract;
  }

  public List<String> getMessageReferenceID() {
    if (messageReferenceID == null) {
      messageReferenceID = new ArrayList<String>();
    }
    return this.messageReferenceID;
  }

  public List<TextType> getMessageFATCAUsageRestrictionText() {
    if (messageFATCAUsageRestrictionText == null) {
      messageFATCAUsageRestrictionText = new ArrayList<TextType>();
    }
    return this.messageFATCAUsageRestrictionText;
  }

  public List<Object> getMessageAugmentationPoint() {
    if (messageAugmentationPoint == null) {
      messageAugmentationPoint = new ArrayList<Object>();
    }
    return this.messageAugmentationPoint;
  }

}
