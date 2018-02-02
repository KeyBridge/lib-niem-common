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
package gov.niem.release.niem.structures;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

  private final static QName _ObjectAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/structures/4.0/", "ObjectAugmentationPoint");
  private final static QName _AssociationAugmentationPoint_QNAME = new QName("http://release.niem.gov/niem/structures/4.0/", "AssociationAugmentationPoint");

  public ObjectFactory() {
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/structures/4.0/", name = "ObjectAugmentationPoint")
  public JAXBElement<Object> createObjectAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_ObjectAugmentationPoint_QNAME, Object.class, null, value);
  }

  @XmlElementDecl(namespace = "http://release.niem.gov/niem/structures/4.0/", name = "AssociationAugmentationPoint")
  public JAXBElement<Object> createAssociationAugmentationPoint(Object value) {
    return new JAXBElement<Object>(_AssociationAugmentationPoint_QNAME, Object.class, null, value);
  }

}
