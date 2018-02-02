/* 
 * Copyright 2018 Key Bridge.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package gov.niem.release.niem.niem_core;

import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonNameType", propOrder = {
  "personNamePrefixText",
  "personGivenName",
  "personMiddleName",
  "personSurName",
  "personNameSuffixText",
  "personMaidenName",
  "personFullName",
  "personNameCategoryAbstract",
  "personNameSalutationText",
  "personOfficialGivenName",
  "personPreferredName",
  "personSurNamePrefixText",
  "personNameAugmentationPoint"
})
public class PersonNameType
  extends ObjectType {

  @XmlElement(name = "PersonNamePrefixText", nillable = true)
  protected List<TextType> personNamePrefixText;
  @XmlElement(name = "PersonGivenName", nillable = true)
  protected List<PersonNameTextType> personGivenName;
  @XmlElement(name = "PersonMiddleName", nillable = true)
  protected List<PersonNameTextType> personMiddleName;
  @XmlElement(name = "PersonSurName", nillable = true)
  protected List<PersonNameTextType> personSurName;
  @XmlElement(name = "PersonNameSuffixText", nillable = true)
  protected List<TextType> personNameSuffixText;
  @XmlElement(name = "PersonMaidenName", nillable = true)
  protected List<PersonNameTextType> personMaidenName;
  @XmlElement(name = "PersonFullName", nillable = true)
  protected List<PersonNameTextType> personFullName;
  @XmlElementRef(name = "PersonNameCategoryAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> personNameCategoryAbstract;
  @XmlElement(name = "PersonNameSalutationText", nillable = true)
  protected List<TextType> personNameSalutationText;
  @XmlElement(name = "PersonOfficialGivenName", nillable = true)
  protected List<PersonNameTextType> personOfficialGivenName;
  @XmlElement(name = "PersonPreferredName", nillable = true)
  protected List<TextType> personPreferredName;
  @XmlElement(name = "PersonSurNamePrefixText", nillable = true)
  protected List<TextType> personSurNamePrefixText;
  @XmlElement(name = "PersonNameAugmentationPoint")
  protected List<Object> personNameAugmentationPoint;
  @XmlAttribute(name = "personNameCommentText", namespace = "http://release.niem.gov/niem/niem-core/4.0/")
  protected String personNameCommentText;

  public List<TextType> getPersonNamePrefixText() {
    if (personNamePrefixText == null) {
      personNamePrefixText = new ArrayList<TextType>();
    }
    return this.personNamePrefixText;
  }

  public List<PersonNameTextType> getPersonGivenName() {
    if (personGivenName == null) {
      personGivenName = new ArrayList<PersonNameTextType>();
    }
    return this.personGivenName;
  }

  public List<PersonNameTextType> getPersonMiddleName() {
    if (personMiddleName == null) {
      personMiddleName = new ArrayList<PersonNameTextType>();
    }
    return this.personMiddleName;
  }

  public List<PersonNameTextType> getPersonSurName() {
    if (personSurName == null) {
      personSurName = new ArrayList<PersonNameTextType>();
    }
    return this.personSurName;
  }

  public List<TextType> getPersonNameSuffixText() {
    if (personNameSuffixText == null) {
      personNameSuffixText = new ArrayList<TextType>();
    }
    return this.personNameSuffixText;
  }

  public List<PersonNameTextType> getPersonMaidenName() {
    if (personMaidenName == null) {
      personMaidenName = new ArrayList<PersonNameTextType>();
    }
    return this.personMaidenName;
  }

  public List<PersonNameTextType> getPersonFullName() {
    if (personFullName == null) {
      personFullName = new ArrayList<PersonNameTextType>();
    }
    return this.personFullName;
  }

  public List<JAXBElement<?>> getPersonNameCategoryAbstract() {
    if (personNameCategoryAbstract == null) {
      personNameCategoryAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.personNameCategoryAbstract;
  }

  public List<TextType> getPersonNameSalutationText() {
    if (personNameSalutationText == null) {
      personNameSalutationText = new ArrayList<TextType>();
    }
    return this.personNameSalutationText;
  }

  public List<PersonNameTextType> getPersonOfficialGivenName() {
    if (personOfficialGivenName == null) {
      personOfficialGivenName = new ArrayList<PersonNameTextType>();
    }
    return this.personOfficialGivenName;
  }

  public List<TextType> getPersonPreferredName() {
    if (personPreferredName == null) {
      personPreferredName = new ArrayList<TextType>();
    }
    return this.personPreferredName;
  }

  public List<TextType> getPersonSurNamePrefixText() {
    if (personSurNamePrefixText == null) {
      personSurNamePrefixText = new ArrayList<TextType>();
    }
    return this.personSurNamePrefixText;
  }

  public List<Object> getPersonNameAugmentationPoint() {
    if (personNameAugmentationPoint == null) {
      personNameAugmentationPoint = new ArrayList<Object>();
    }
    return this.personNameAugmentationPoint;
  }

  public String getPersonNameCommentText() {
    return personNameCommentText;
  }

  public void setPersonNameCommentText(String value) {
    this.personNameCommentText = value;
  }

}
