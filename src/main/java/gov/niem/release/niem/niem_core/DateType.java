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

import gov.niem.release.niem.proxy.xsd.Duration;
import gov.niem.release.niem.structures.ObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateType", propOrder = {
  "dateRepresentation",
  "dateAccuracyAbstract",
  "dateMarginOfErrorDuration",
  "dateAugmentationPoint"
})
public class DateType
  extends ObjectType {

  @XmlElementRef(name = "DateRepresentation", namespace = "http://release.niem.gov/niem/niem-core/4.0/", type = JAXBElement.class, required = false)
  protected List<JAXBElement<?>> dateRepresentation;
  @XmlElement(name = "DateAccuracyAbstract")
  protected Object dateAccuracyAbstract;
  @XmlElement(name = "DateMarginOfErrorDuration", nillable = true)
  protected Duration dateMarginOfErrorDuration;
  @XmlElement(name = "DateAugmentationPoint")
  protected List<Object> dateAugmentationPoint;

  public List<JAXBElement<?>> getDateRepresentation() {
    if (dateRepresentation == null) {
      dateRepresentation = new ArrayList<JAXBElement<?>>();
    }
    return this.dateRepresentation;
  }

  public Object getDateAccuracyAbstract() {
    return dateAccuracyAbstract;
  }

  public void setDateAccuracyAbstract(Object value) {
    this.dateAccuracyAbstract = value;
  }

  public Duration getDateMarginOfErrorDuration() {
    return dateMarginOfErrorDuration;
  }

  public void setDateMarginOfErrorDuration(Duration value) {
    this.dateMarginOfErrorDuration = value;
  }

  public List<Object> getDateAugmentationPoint() {
    if (dateAugmentationPoint == null) {
      dateAugmentationPoint = new ArrayList<Object>();
    }
    return this.dateAugmentationPoint;
  }

}
