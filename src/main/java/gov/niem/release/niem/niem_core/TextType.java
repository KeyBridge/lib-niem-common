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

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextType")
@XmlSeeAlso({
  ProperNameTextType.class,
  SoftwareNameType.class
})
public class TextType
  extends gov.niem.release.niem.proxy.xsd.String {

  @XmlAttribute(name = "partialIndicator", namespace = "http://release.niem.gov/niem/niem-core/4.0/")
  protected Boolean partialIndicator;
  @XmlAttribute(name = "truncationIndicator", namespace = "http://release.niem.gov/niem/niem-core/4.0/")
  protected Boolean truncationIndicator;
  @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
  protected java.lang.String lang;

  public Boolean isPartialIndicator() {
    return partialIndicator;
  }

  public void setPartialIndicator(Boolean value) {
    this.partialIndicator = value;
  }

  public Boolean isTruncationIndicator() {
    return truncationIndicator;
  }

  public void setTruncationIndicator(Boolean value) {
    this.truncationIndicator = value;
  }

  public java.lang.String getLang() {
    return lang;
  }

  public void setLang(java.lang.String value) {
    this.lang = value;
  }

}
