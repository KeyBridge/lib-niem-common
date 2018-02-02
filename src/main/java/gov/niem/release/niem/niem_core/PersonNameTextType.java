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

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonNameTextType")
public class PersonNameTextType
  extends ProperNameTextType {

  @XmlAttribute(name = "personNameInitialIndicator", namespace = "http://release.niem.gov/niem/niem-core/4.0/")
  protected Boolean personNameInitialIndicator;
  @XmlAttribute(name = "sequenceID", namespace = "http://release.niem.gov/niem/niem-core/4.0/")
  protected BigInteger sequenceID;

  public Boolean isPersonNameInitialIndicator() {
    return personNameInitialIndicator;
  }

  public void setPersonNameInitialIndicator(Boolean value) {
    this.personNameInitialIndicator = value;
  }

  public BigInteger getSequenceID() {
    return sequenceID;
  }

  public void setSequenceID(BigInteger value) {
    this.sequenceID = value;
  }

}
