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

import gov.niem.release.niem.proxy.xsd.String;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NANPTelephoneNumberType", propOrder = {
  "telephoneAreaCodeID",
  "telephoneExchangeID",
  "telephoneLineID",
  "telephoneSuffixID",
  "nanpTelephoneNumberAugmentationPoint"
})
public class NANPTelephoneNumberType
  extends ObjectType {

  @XmlElement(name = "TelephoneAreaCodeID", nillable = true)
  protected List<String> telephoneAreaCodeID;
  @XmlElement(name = "TelephoneExchangeID", nillable = true)
  protected List<String> telephoneExchangeID;
  @XmlElement(name = "TelephoneLineID", nillable = true)
  protected List<String> telephoneLineID;
  @XmlElement(name = "TelephoneSuffixID", nillable = true)
  protected List<String> telephoneSuffixID;
  @XmlElement(name = "NANPTelephoneNumberAugmentationPoint")
  protected List<Object> nanpTelephoneNumberAugmentationPoint;

  public List<String> getTelephoneAreaCodeID() {
    if (telephoneAreaCodeID == null) {
      telephoneAreaCodeID = new ArrayList<String>();
    }
    return this.telephoneAreaCodeID;
  }

  public List<String> getTelephoneExchangeID() {
    if (telephoneExchangeID == null) {
      telephoneExchangeID = new ArrayList<String>();
    }
    return this.telephoneExchangeID;
  }

  public List<String> getTelephoneLineID() {
    if (telephoneLineID == null) {
      telephoneLineID = new ArrayList<String>();
    }
    return this.telephoneLineID;
  }

  public List<String> getTelephoneSuffixID() {
    if (telephoneSuffixID == null) {
      telephoneSuffixID = new ArrayList<String>();
    }
    return this.telephoneSuffixID;
  }

  public List<Object> getNANPTelephoneNumberAugmentationPoint() {
    if (nanpTelephoneNumberAugmentationPoint == null) {
      nanpTelephoneNumberAugmentationPoint = new ArrayList<Object>();
    }
    return this.nanpTelephoneNumberAugmentationPoint;
  }

}
