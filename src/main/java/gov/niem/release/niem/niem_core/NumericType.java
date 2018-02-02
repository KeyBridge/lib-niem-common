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

import gov.niem.release.niem.proxy.xsd.Decimal;
import java.math.BigDecimal;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumericType")
@XmlSeeAlso({
  QuantityType.class
})
public class NumericType
  extends Decimal {

  @XmlAttribute(name = "confidencePercent", namespace = "http://release.niem.gov/niem/niem-core/4.0/")
  protected BigDecimal confidencePercent;
  @XmlAttribute(name = "toleranceNumeric", namespace = "http://release.niem.gov/niem/niem-core/4.0/")
  protected BigDecimal toleranceNumeric;

  public BigDecimal getConfidencePercent() {
    return confidencePercent;
  }

  public void setConfidencePercent(BigDecimal value) {
    this.confidencePercent = value;
  }

  public BigDecimal getToleranceNumeric() {
    return toleranceNumeric;
  }

  public void setToleranceNumeric(BigDecimal value) {
    this.toleranceNumeric = value;
  }

}
