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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemIdentificationType", propOrder = {
  "systemName",
  "systemIdentificationAugmentationPoint"
})
public class SystemIdentificationType
  extends IdentificationType {

  @XmlElement(name = "SystemName", nillable = true)
  protected List<TextType> systemName;
  @XmlElement(name = "SystemIdentificationAugmentationPoint")
  protected List<Object> systemIdentificationAugmentationPoint;

  public List<TextType> getSystemName() {
    if (systemName == null) {
      systemName = new ArrayList<TextType>();
    }
    return this.systemName;
  }

  public List<Object> getSystemIdentificationAugmentationPoint() {
    if (systemIdentificationAugmentationPoint == null) {
      systemIdentificationAugmentationPoint = new ArrayList<Object>();
    }
    return this.systemIdentificationAugmentationPoint;
  }

}
