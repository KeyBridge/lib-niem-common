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
@XmlType(name = "InstantMessengerType", propOrder = {
  "instantMessengerServiceName",
  "instantMessengerScreenID",
  "instantMessengerAugmentationPoint"
})
public class InstantMessengerType
  extends ObjectType {

  @XmlElement(name = "InstantMessengerServiceName", nillable = true)
  protected List<TextType> instantMessengerServiceName;
  @XmlElement(name = "InstantMessengerScreenID", nillable = true)
  protected List<String> instantMessengerScreenID;
  @XmlElement(name = "InstantMessengerAugmentationPoint")
  protected List<Object> instantMessengerAugmentationPoint;

  public List<TextType> getInstantMessengerServiceName() {
    if (instantMessengerServiceName == null) {
      instantMessengerServiceName = new ArrayList<TextType>();
    }
    return this.instantMessengerServiceName;
  }

  public List<String> getInstantMessengerScreenID() {
    if (instantMessengerScreenID == null) {
      instantMessengerScreenID = new ArrayList<String>();
    }
    return this.instantMessengerScreenID;
  }

  public List<Object> getInstantMessengerAugmentationPoint() {
    if (instantMessengerAugmentationPoint == null) {
      instantMessengerAugmentationPoint = new ArrayList<Object>();
    }
    return this.instantMessengerAugmentationPoint;
  }

}
