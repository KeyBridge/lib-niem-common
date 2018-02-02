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
@XmlType(name = "HighwayType", propOrder = {
  "highwayFullText",
  "highwayName",
  "highwayID",
  "highwayPositionText",
  "highwayAugmentationPoint"
})
public class HighwayType
  extends ObjectType {

  @XmlElement(name = "HighwayFullText", nillable = true)
  protected List<TextType> highwayFullText;
  @XmlElement(name = "HighwayName", nillable = true)
  protected List<TextType> highwayName;
  @XmlElement(name = "HighwayID", nillable = true)
  protected List<String> highwayID;
  @XmlElement(name = "HighwayPositionText", nillable = true)
  protected List<TextType> highwayPositionText;
  @XmlElement(name = "HighwayAugmentationPoint")
  protected List<Object> highwayAugmentationPoint;

  public List<TextType> getHighwayFullText() {
    if (highwayFullText == null) {
      highwayFullText = new ArrayList<TextType>();
    }
    return this.highwayFullText;
  }

  public List<TextType> getHighwayName() {
    if (highwayName == null) {
      highwayName = new ArrayList<TextType>();
    }
    return this.highwayName;
  }

  public List<String> getHighwayID() {
    if (highwayID == null) {
      highwayID = new ArrayList<String>();
    }
    return this.highwayID;
  }

  public List<TextType> getHighwayPositionText() {
    if (highwayPositionText == null) {
      highwayPositionText = new ArrayList<TextType>();
    }
    return this.highwayPositionText;
  }

  public List<Object> getHighwayAugmentationPoint() {
    if (highwayAugmentationPoint == null) {
      highwayAugmentationPoint = new ArrayList<Object>();
    }
    return this.highwayAugmentationPoint;
  }

}
