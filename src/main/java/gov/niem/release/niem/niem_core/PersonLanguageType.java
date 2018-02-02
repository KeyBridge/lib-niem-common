package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.proxy.xsd.Boolean;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonLanguageType", propOrder = {
  "languageAbstract",
  "personComprehendsSpokenLanguageIndicator",
  "personReadsLanguageIndicator",
  "personSpeaksLanguageIndicator",
  "personWritesLanguageIndicator",
  "personLanguageAugmentationPoint"
})
public class PersonLanguageType
  extends ObjectType {

  @XmlElementRef(name = "LanguageAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> languageAbstract;
  @XmlElement(name = "PersonComprehendsSpokenLanguageIndicator", nillable = true)
  protected List<Boolean> personComprehendsSpokenLanguageIndicator;
  @XmlElement(name = "PersonReadsLanguageIndicator", nillable = true)
  protected List<Boolean> personReadsLanguageIndicator;
  @XmlElement(name = "PersonSpeaksLanguageIndicator", nillable = true)
  protected List<Boolean> personSpeaksLanguageIndicator;
  @XmlElement(name = "PersonWritesLanguageIndicator", nillable = true)
  protected List<Boolean> personWritesLanguageIndicator;
  @XmlElement(name = "PersonLanguageAugmentationPoint")
  protected List<Object> personLanguageAugmentationPoint;

  public List<JAXBElement<?>> getLanguageAbstract() {
    if (languageAbstract == null) {
      languageAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.languageAbstract;
  }

  public List<Boolean> getPersonComprehendsSpokenLanguageIndicator() {
    if (personComprehendsSpokenLanguageIndicator == null) {
      personComprehendsSpokenLanguageIndicator = new ArrayList<Boolean>();
    }
    return this.personComprehendsSpokenLanguageIndicator;
  }

  public List<Boolean> getPersonReadsLanguageIndicator() {
    if (personReadsLanguageIndicator == null) {
      personReadsLanguageIndicator = new ArrayList<Boolean>();
    }
    return this.personReadsLanguageIndicator;
  }

  public List<Boolean> getPersonSpeaksLanguageIndicator() {
    if (personSpeaksLanguageIndicator == null) {
      personSpeaksLanguageIndicator = new ArrayList<Boolean>();
    }
    return this.personSpeaksLanguageIndicator;
  }

  public List<Boolean> getPersonWritesLanguageIndicator() {
    if (personWritesLanguageIndicator == null) {
      personWritesLanguageIndicator = new ArrayList<Boolean>();
    }
    return this.personWritesLanguageIndicator;
  }

  public List<Object> getPersonLanguageAugmentationPoint() {
    if (personLanguageAugmentationPoint == null) {
      personLanguageAugmentationPoint = new ArrayList<Object>();
    }
    return this.personLanguageAugmentationPoint;
  }

}
