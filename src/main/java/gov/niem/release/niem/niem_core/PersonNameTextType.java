package gov.niem.release.niem.niem_core;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonNameTextType")
public class PersonNameTextType
  extends ProperNameTextType {

  @XmlAttribute(name = "personNameInitialIndicator", namespace = "http://release.niem.gov/niem/niem-core/4.0/")
  protected Boolean personNameInitialIndicator;
  @XmlAttribute(name = "sequenceID", namespace = "http://release.niem.gov/niem/niem-core/4.0/")
  protected BigInteger sequenceID;

  public Boolean isPersonNameInitialIndicator() {
    return personNameInitialIndicator;
  }

  public void setPersonNameInitialIndicator(Boolean value) {
    this.personNameInitialIndicator = value;
  }

  public BigInteger getSequenceID() {
    return sequenceID;
  }

  public void setSequenceID(BigInteger value) {
    this.sequenceID = value;
  }

}
