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
