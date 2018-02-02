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
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrisisType", propOrder = {
  "crisisIdentification",
  "crisisName",
  "crisisLocation",
  "crisisImage",
  "crisisURLID",
  "crisisDescriptionText",
  "crisisStatus",
  "crisisAugmentationPoint"
})
public class CrisisType
  extends ObjectType {

  @XmlElement(name = "CrisisIdentification", nillable = true)
  protected List<IdentificationType> crisisIdentification;
  @XmlElement(name = "CrisisName", nillable = true)
  protected List<TextType> crisisName;
  @XmlElement(name = "CrisisLocation", nillable = true)
  protected List<LocationType> crisisLocation;
  @XmlElement(name = "CrisisImage", nillable = true)
  protected List<ImageType> crisisImage;
  @XmlElement(name = "CrisisURLID", nillable = true)
  protected List<AnyURI> crisisURLID;
  @XmlElement(name = "CrisisDescriptionText", nillable = true)
  protected List<TextType> crisisDescriptionText;
  @XmlElement(name = "CrisisStatus", nillable = true)
  protected List<StatusType> crisisStatus;
  @XmlElement(name = "CrisisAugmentationPoint")
  protected List<Object> crisisAugmentationPoint;

  public List<IdentificationType> getCrisisIdentification() {
    if (crisisIdentification == null) {
      crisisIdentification = new ArrayList<IdentificationType>();
    }
    return this.crisisIdentification;
  }

  public List<TextType> getCrisisName() {
    if (crisisName == null) {
      crisisName = new ArrayList<TextType>();
    }
    return this.crisisName;
  }

  public List<LocationType> getCrisisLocation() {
    if (crisisLocation == null) {
      crisisLocation = new ArrayList<LocationType>();
    }
    return this.crisisLocation;
  }

  public List<ImageType> getCrisisImage() {
    if (crisisImage == null) {
      crisisImage = new ArrayList<ImageType>();
    }
    return this.crisisImage;
  }

  public List<AnyURI> getCrisisURLID() {
    if (crisisURLID == null) {
      crisisURLID = new ArrayList<AnyURI>();
    }
    return this.crisisURLID;
  }

  public List<TextType> getCrisisDescriptionText() {
    if (crisisDescriptionText == null) {
      crisisDescriptionText = new ArrayList<TextType>();
    }
    return this.crisisDescriptionText;
  }

  public List<StatusType> getCrisisStatus() {
    if (crisisStatus == null) {
      crisisStatus = new ArrayList<StatusType>();
    }
    return this.crisisStatus;
  }

  public List<Object> getCrisisAugmentationPoint() {
    if (crisisAugmentationPoint == null) {
      crisisAugmentationPoint = new ArrayList<Object>();
    }
    return this.crisisAugmentationPoint;
  }

}
