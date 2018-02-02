package gov.niem.release.niem.codes.hl7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReligionCodeType", propOrder = {
  "value"
})
public class ReligionCodeType {

  @XmlValue
  protected ReligionCodeSimpleType value;
  @XmlAttribute(name = "id", namespace = "http://release.niem.gov/niem/structures/4.0/")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlID
  @XmlSchemaType(name = "ID")
  protected String id;
  @XmlAttribute(name = "ref", namespace = "http://release.niem.gov/niem/structures/4.0/")
  @XmlIDREF
  @XmlSchemaType(name = "IDREF")
  protected Object ref;
  @XmlAttribute(name = "uri", namespace = "http://release.niem.gov/niem/structures/4.0/")
  @XmlSchemaType(name = "anyURI")
  protected String uri;
  @XmlAttribute(name = "metadata", namespace = "http://release.niem.gov/niem/structures/4.0/")
  @XmlIDREF
  @XmlSchemaType(name = "IDREFS")
  protected List<Object> metadata;
  @XmlAttribute(name = "relationshipMetadata", namespace = "http://release.niem.gov/niem/structures/4.0/")
  @XmlIDREF
  @XmlSchemaType(name = "IDREFS")
  protected List<Object> relationshipMetadata;
  @XmlAnyAttribute
  private Map<QName, String> otherAttributes = new HashMap<QName, String>();

  public ReligionCodeSimpleType getValue() {
    return value;
  }

  public void setValue(ReligionCodeSimpleType value) {
    this.value = value;
  }

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

  public Map<QName, String> getOtherAttributes() {
    return otherAttributes;
  }

}
