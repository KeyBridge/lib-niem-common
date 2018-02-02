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

import gov.niem.release.niem.proxy.xsd.AnyURI;
import gov.niem.release.niem.proxy.xsd.String;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectronicAddressType", propOrder = {
  "electronicAddressDescriptionText",
  "macAddressID",
  "iPv4AddressID",
  "iPv6AddressID",
  "urlid",
  "electronicAddressAugmentationPoint"
})
public class ElectronicAddressType
  extends ObjectType {

  @XmlElement(name = "ElectronicAddressDescriptionText", nillable = true)
  protected List<TextType> electronicAddressDescriptionText;
  @XmlElement(name = "MACAddressID", nillable = true)
  protected List<String> macAddressID;
  @XmlElement(name = "IPv4AddressID", nillable = true)
  protected List<String> iPv4AddressID;
  @XmlElement(name = "IPv6AddressID", nillable = true)
  protected List<String> iPv6AddressID;
  @XmlElement(name = "URLID", nillable = true)
  protected List<AnyURI> urlid;
  @XmlElement(name = "ElectronicAddressAugmentationPoint")
  protected List<Object> electronicAddressAugmentationPoint;

  public List<TextType> getElectronicAddressDescriptionText() {
    if (electronicAddressDescriptionText == null) {
      electronicAddressDescriptionText = new ArrayList<TextType>();
    }
    return this.electronicAddressDescriptionText;
  }

  public List<String> getMACAddressID() {
    if (macAddressID == null) {
      macAddressID = new ArrayList<String>();
    }
    return this.macAddressID;
  }

  public List<String> getIPv4AddressID() {
    if (iPv4AddressID == null) {
      iPv4AddressID = new ArrayList<String>();
    }
    return this.iPv4AddressID;
  }

  public List<String> getIPv6AddressID() {
    if (iPv6AddressID == null) {
      iPv6AddressID = new ArrayList<String>();
    }
    return this.iPv6AddressID;
  }

  public List<AnyURI> getURLID() {
    if (urlid == null) {
      urlid = new ArrayList<AnyURI>();
    }
    return this.urlid;
  }

  public List<Object> getElectronicAddressAugmentationPoint() {
    if (electronicAddressAugmentationPoint == null) {
      electronicAddressAugmentationPoint = new ArrayList<Object>();
    }
    return this.electronicAddressAugmentationPoint;
  }

}
