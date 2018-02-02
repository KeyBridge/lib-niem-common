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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceType", propOrder = {
  "deviceCategoryAbstract",
  "deviceESNIdentification",
  "deviceIMEIIdentification",
  "deviceElectronicAddress",
  "deviceStoredContactInformation",
  "deviceAugmentationPoint"
})
public class DeviceType
  extends ItemType {

  @XmlElementRef(name = "DeviceCategoryAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> deviceCategoryAbstract;
  @XmlElement(name = "DeviceESNIdentification", nillable = true)
  protected List<IdentificationType> deviceESNIdentification;
  @XmlElement(name = "DeviceIMEIIdentification", nillable = true)
  protected List<IdentificationType> deviceIMEIIdentification;
  @XmlElement(name = "DeviceElectronicAddress", nillable = true)
  protected List<ElectronicAddressType> deviceElectronicAddress;
  @XmlElement(name = "DeviceStoredContactInformation", nillable = true)
  protected List<ContactInformationType> deviceStoredContactInformation;
  @XmlElement(name = "DeviceAugmentationPoint")
  protected List<Object> deviceAugmentationPoint;

  public List<JAXBElement<?>> getDeviceCategoryAbstract() {
    if (deviceCategoryAbstract == null) {
      deviceCategoryAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.deviceCategoryAbstract;
  }

  public List<IdentificationType> getDeviceESNIdentification() {
    if (deviceESNIdentification == null) {
      deviceESNIdentification = new ArrayList<IdentificationType>();
    }
    return this.deviceESNIdentification;
  }

  public List<IdentificationType> getDeviceIMEIIdentification() {
    if (deviceIMEIIdentification == null) {
      deviceIMEIIdentification = new ArrayList<IdentificationType>();
    }
    return this.deviceIMEIIdentification;
  }

  public List<ElectronicAddressType> getDeviceElectronicAddress() {
    if (deviceElectronicAddress == null) {
      deviceElectronicAddress = new ArrayList<ElectronicAddressType>();
    }
    return this.deviceElectronicAddress;
  }

  public List<ContactInformationType> getDeviceStoredContactInformation() {
    if (deviceStoredContactInformation == null) {
      deviceStoredContactInformation = new ArrayList<ContactInformationType>();
    }
    return this.deviceStoredContactInformation;
  }

  public List<Object> getDeviceAugmentationPoint() {
    if (deviceAugmentationPoint == null) {
      deviceAugmentationPoint = new ArrayList<Object>();
    }
    return this.deviceAugmentationPoint;
  }

}
