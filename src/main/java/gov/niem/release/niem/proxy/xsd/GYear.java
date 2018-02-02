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
package gov.niem.release.niem.proxy.xsd;

import gov.niem.release.niem.niem_core.FiscalYearDateType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gYear", propOrder = {
  "value"
})
@XmlSeeAlso({
  FiscalYearDateType.class
})
public class GYear {

  @XmlValue
  @XmlSchemaType(name = "gYear")
  protected XMLGregorianCalendar value;
  @XmlAttribute(name = "id", namespace = "http://release.niem.gov/niem/structures/4.0/")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlID
  @XmlSchemaType(name = "ID")
  protected java.lang.String id;
  @XmlAttribute(name = "ref", namespace = "http://release.niem.gov/niem/structures/4.0/")
  @XmlIDREF
  @XmlSchemaType(name = "IDREF")
  protected Object ref;
  @XmlAttribute(name = "uri", namespace = "http://release.niem.gov/niem/structures/4.0/")
  @XmlSchemaType(name = "anyURI")
  protected java.lang.String uri;
  @XmlAttribute(name = "metadata", namespace = "http://release.niem.gov/niem/structures/4.0/")
  @XmlIDREF
  @XmlSchemaType(name = "IDREFS")
  protected List<Object> metadata;
  @XmlAttribute(name = "relationshipMetadata", namespace = "http://release.niem.gov/niem/structures/4.0/")
  @XmlIDREF
  @XmlSchemaType(name = "IDREFS")
  protected List<Object> relationshipMetadata;
  @XmlAnyAttribute
  private Map<QName, java.lang.String> otherAttributes = new HashMap<QName, java.lang.String>();

  public XMLGregorianCalendar getValue() {
    return value;
  }

  public void setValue(XMLGregorianCalendar value) {
    this.value = value;
  }

  public java.lang.String getId() {
    return id;
  }

  public void setId(java.lang.String value) {
    this.id = value;
  }

  public Object getRef() {
    return ref;
  }

  public void setRef(Object value) {
    this.ref = value;
  }

  public java.lang.String getUri() {
    return uri;
  }

  public void setUri(java.lang.String value) {
    this.uri = value;
  }

  public List<Object> getMetadata() {
    if (metadata == null) {
      metadata = new ArrayList<Object>();
    }
    return this.metadata;
  }

  public List<Object> getRelationshipMetadata() {
    if (relationshipMetadata == null) {
      relationshipMetadata = new ArrayList<Object>();
    }
    return this.relationshipMetadata;
  }

  public Map<QName, java.lang.String> getOtherAttributes() {
    return otherAttributes;
  }

}
