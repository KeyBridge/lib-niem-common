package gov.niem.release.niem.niem_core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonAssociationType")
@XmlSeeAlso({
  PersonUnionAssociationType.class
})
public class PersonAssociationType
  extends AssociationType {

}
