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

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;

/**
 * Within NIEM, metadata is defined as "data about data." This may include
 * information such as the security of a piece of data or the source of the
 * data. These pieces of metadata may be composed into a metadata type. The
 * types of data to which metadata may be applied may be constrained.
 * <p>
 * A metadata type describes data about data, that is, information that is not
 * descriptive of objects and their relationships, but is descriptive of the
 * data itself. It is useful to provide a general mechanism for data about data.
 * This provides required flexibility to precisely represent information.
 * <p>
 * A metadata type establishes a specific, named aggregation of data about data.
 * Any type derived from structures:MetadataType is a metadata type. Metadata
 * types should not be derived from other metadata types. Such metadata types
 * should be used asis and additional metadata types defined for additional
 * content.
 * <p>
 * There are limitations on the meaning of a metadata element in an instance; it
 * does not establish existence of an object, nor is it a property of its
 * containing object.
 *
 * @author Key Bridge
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataType")
public abstract class MetadataType {

  /**
   * A NIEM-conformant instance XML document may use XML IDs to identify objects
   * within it; The NIEM XML ID is an attribute structures:id of type xs:ID.
   * These IDs are not assumed by NIEM to have any universal significance; they
   * need only be unique within the XML document. The use of an ID is required
   * only when an object must be referenced within the document. NIEM recognizes
   * no correlation between these local IDs and any URI.
   */
  @XmlAttribute(name = "id", namespace = "http://release.niem.gov/niem/structures/4.0/")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlID
  @XmlSchemaType(name = "ID")
  protected String id;
  /**
   * A reference to another element in the current message. This enables the use
   * of references to data in place of directly-contained data, which loops in
   * data graphs, as well as for multiple relationships to be defined to a
   * single object. This mechanism uses XML IDs and IDREFs as provided by the
   * XML Schema language. As this document defines the mechanism, a
   * structures:ref attribute may refer to a structures:id; this reference means
   * that the element that has the structures:ref attribute refers to the
   * element that has the structures:id attribute.
   */
  @XmlAttribute(name = "ref", namespace = "http://release.niem.gov/niem/structures/4.0/")
  @XmlIDREF
  @XmlSchemaType(name = "IDREF")
  protected Object ref;
  /**
   * In NIEM, an exchange is generally adhoc. That is, a message may be
   * generated without any persistence. It exists only to exchange data and may
   * not have any universal meaning beyond that specific exchange. As such, a
   * message may or may not have a URI as an identifier. NIEM was designed with
   * the assumption that a given exchange need not have any unique identifier;
   * NIEM does not require a unique identifier. NIEM also does not require any
   * object (data instance) to be identified by a URI. This differs from RDF, in
   * which all entities (other than literal values) are identified by globally
   * meaningful URIs.
   */
  @XmlAttribute(name = "uri", namespace = "http://release.niem.gov/niem/structures/4.0/")
  @XmlSchemaType(name = "anyURI")
  protected String uri;
  /**
   * Other attributes associated with this object entry.
   */
  @XmlAnyAttribute
  private Map<QName, String> otherAttributes;

  public String getId() {
    return id;
  }

  public void setId(String value) {
    this.id = value;
  }

  public Object getRef() {
    return ref;
  }

  public void setRef(Object value) {
    this.ref = value;
  }

  public String getUri() {
    return uri;
  }

  public void setUri(String value) {
    this.uri = value;
  }

  public Map<QName, String> getOtherAttributes() {
    if (otherAttributes == null) {
      otherAttributes = new HashMap<>();
    }
    return otherAttributes;
  }

  public MetadataType withOtherAttribute(QName qName, String attribute) {
    getOtherAttributes().put(qName, attribute);
    return this;
  }

}
