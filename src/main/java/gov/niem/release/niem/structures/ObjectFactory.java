package gov.niem.release.niem.structures;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

  private final static QName _ObjectAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/structures/4.0/", "ObjectAugmentationPoint");
  private final static QName _AssociationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/structures/4.0/", "AssociationAugmentationPoint");

  public ObjectFactory() {
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/structures/4.0/", name = "ObjectAugmentationPoint")
  public JAXBElement<Object> createObjectAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_ObjectAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/structures/4.0/", name = "AssociationAugmentationPoint")
  public JAXBElement<Object> createAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_AssociationAugmentationPoint_QNAME, Object.class, null, value);
  }

}
