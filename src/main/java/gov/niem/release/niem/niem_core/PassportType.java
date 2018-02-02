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

import gov.niem.release.niem.proxy.xsd.Boolean;
import gov.niem.release.niem.proxy.xsd.String;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassportType", propOrder = {
  "passportNumberIdentification",
  "personName",
  "personBirthDate",
  "personBirthLocation",
  "passportBookIdentification",
  "passportCategoryAbstract",
  "personDigitalImage",
  "personCitizenshipAbstract",
  "passportElectronicIndicator",
  "passportIssuingOrganization",
  "personSexAbstract",
  "passportStolenLostIndicator",
  "passportTransmissionTrackingID",
  "passportAugmentationPoint"
})
public class PassportType
  extends DocumentType {

  @XmlElement(name = "PassportNumberIdentification", nillable = true)
  protected List<IdentificationType> passportNumberIdentification;
  @XmlElement(name = "PersonName", nillable = true)
  protected List<PersonNameType> personName;
  @XmlElement(name = "PersonBirthDate", nillable = true)
  protected List<DateType> personBirthDate;
  @XmlElement(name = "PersonBirthLocation", nillable = true)
  protected List<LocationType> personBirthLocation;
  @XmlElement(name = "PassportBookIdentification", nillable = true)
  protected List<IdentificationType> passportBookIdentification;
  @XmlElementRef(name = "PassportCategoryAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> passportCategoryAbstract;
  @XmlElement(name = "PersonDigitalImage", nillable = true)
  protected List<ImageType> personDigitalImage;
  @XmlElementRef(name = "PersonCitizenshipAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> personCitizenshipAbstract;
  @XmlElement(name = "PassportElectronicIndicator", nillable = true)
  protected List<Boolean> passportElectronicIndicator;
  @XmlElement(name = "PassportIssuingOrganization", nillable = true)
  protected List<OrganizationType> passportIssuingOrganization;
  @XmlElementRef(name = "PersonSexAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> personSexAbstract;
  @XmlElement(name = "PassportStolenLostIndicator", nillable = true)
  protected List<Boolean> passportStolenLostIndicator;
  @XmlElement(name = "PassportTransmissionTrackingID", nillable = true)
  protected List<String> passportTransmissionTrackingID;
  @XmlElement(name = "PassportAugmentationPoint")
  protected List<Object> passportAugmentationPoint;

  public List<IdentificationType> getPassportNumberIdentification() {
    if (passportNumberIdentification == null) {
      passportNumberIdentification = new ArrayList<IdentificationType>();
    }
    return this.passportNumberIdentification;
  }

  public List<PersonNameType> getPersonName() {
    if (personName == null) {
      personName = new ArrayList<PersonNameType>();
    }
    return this.personName;
  }

  public List<DateType> getPersonBirthDate() {
    if (personBirthDate == null) {
      personBirthDate = new ArrayList<DateType>();
    }
    return this.personBirthDate;
  }

  public List<LocationType> getPersonBirthLocation() {
    if (personBirthLocation == null) {
      personBirthLocation = new ArrayList<LocationType>();
    }
    return this.personBirthLocation;
  }

  public List<IdentificationType> getPassportBookIdentification() {
    if (passportBookIdentification == null) {
      passportBookIdentification = new ArrayList<IdentificationType>();
    }
    return this.passportBookIdentification;
  }

  public List<JAXBElement<?>> getPassportCategoryAbstract() {
    if (passportCategoryAbstract == null) {
      passportCategoryAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.passportCategoryAbstract;
  }

  public List<ImageType> getPersonDigitalImage() {
    if (personDigitalImage == null) {
      personDigitalImage = new ArrayList<ImageType>();
    }
    return this.personDigitalImage;
  }

  public List<JAXBElement<?>> getPersonCitizenshipAbstract() {
    if (personCitizenshipAbstract == null) {
      personCitizenshipAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.personCitizenshipAbstract;
  }

  public List<Boolean> getPassportElectronicIndicator() {
    if (passportElectronicIndicator == null) {
      passportElectronicIndicator = new ArrayList<Boolean>();
    }
    return this.passportElectronicIndicator;
  }

  public List<OrganizationType> getPassportIssuingOrganization() {
    if (passportIssuingOrganization == null) {
      passportIssuingOrganization = new ArrayList<OrganizationType>();
    }
    return this.passportIssuingOrganization;
  }

  public List<JAXBElement<?>> getPersonSexAbstract() {
    if (personSexAbstract == null) {
      personSexAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.personSexAbstract;
  }

  public List<Boolean> getPassportStolenLostIndicator() {
    if (passportStolenLostIndicator == null) {
      passportStolenLostIndicator = new ArrayList<Boolean>();
    }
    return this.passportStolenLostIndicator;
  }

  public List<String> getPassportTransmissionTrackingID() {
    if (passportTransmissionTrackingID == null) {
      passportTransmissionTrackingID = new ArrayList<String>();
    }
    return this.passportTransmissionTrackingID;
  }

  public List<Object> getPassportAugmentationPoint() {
    if (passportAugmentationPoint == null) {
      passportAugmentationPoint = new ArrayList<Object>();
    }
    return this.passportAugmentationPoint;
  }

}
