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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericEntityType", propOrder = {
  "entityName",
  "entityContactInformation",
  "entityDescriptionText",
  "genericEntityAugmentationPoint"
})
public class GenericEntityType
  extends ObjectType {

  @XmlElement(name = "EntityName", nillable = true)
  protected List<TextType> entityName;
  @XmlElement(name = "EntityContactInformation", nillable = true)
  protected List<ContactInformationType> entityContactInformation;
  @XmlElement(name = "EntityDescriptionText", nillable = true)
  protected List<TextType> entityDescriptionText;
  @XmlElement(name = "GenericEntityAugmentationPoint")
  protected List<Object> genericEntityAugmentationPoint;

  public List<TextType> getEntityName() {
    if (entityName == null) {
      entityName = new ArrayList<TextType>();
    }
    return this.entityName;
  }

  public List<ContactInformationType> getEntityContactInformation() {
    if (entityContactInformation == null) {
      entityContactInformation = new ArrayList<ContactInformationType>();
    }
    return this.entityContactInformation;
  }

  public List<TextType> getEntityDescriptionText() {
    if (entityDescriptionText == null) {
      entityDescriptionText = new ArrayList<TextType>();
    }
    return this.entityDescriptionText;
  }

  public List<Object> getGenericEntityAugmentationPoint() {
    if (genericEntityAugmentationPoint == null) {
      genericEntityAugmentationPoint = new ArrayList<Object>();
    }
    return this.genericEntityAugmentationPoint;
  }

}
