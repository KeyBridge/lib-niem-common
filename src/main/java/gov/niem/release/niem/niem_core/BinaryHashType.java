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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinaryHashType", propOrder = {
  "binaryHashCode",
  "binaryHashFunctionAbstract",
  "binaryHashAugmentationPoint"
})
public class BinaryHashType
  extends ObjectType {

  @XmlElement(name = "BinaryHashCode", nillable = true)
  protected List<String> binaryHashCode;
  @XmlElementRef(name = "BinaryHashFunctionAbstract", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> binaryHashFunctionAbstract;
  @XmlElement(name = "BinaryHashAugmentationPoint")
  protected List<Object> binaryHashAugmentationPoint;

  public List<String> getBinaryHashCode() {
    if (binaryHashCode == null) {
      binaryHashCode = new ArrayList<String>();
    }
    return this.binaryHashCode;
  }

  public List<JAXBElement<?>> getBinaryHashFunctionAbstract() {
    if (binaryHashFunctionAbstract == null) {
      binaryHashFunctionAbstract = new ArrayList<JAXBElement<?>>();
    }
    return this.binaryHashFunctionAbstract;
  }

  public List<Object> getBinaryHashAugmentationPoint() {
    if (binaryHashAugmentationPoint == null) {
      binaryHashAugmentationPoint = new ArrayList<Object>();
    }
    return this.binaryHashAugmentationPoint;
  }

}
