/*
 * Copyright 2018 Key Bridge. All rights reserved.
 * Use is subject to license terms.
 *
 * This software code is protected by Copyrights and remains the property of
 * Key Bridge and its suppliers, if any.
 * Key Bridge reserves all rights in and to Copyrights and
 * no license is granted under Copyrights in this Software License Agreement.
 *
 * Key Bridge generally licenses Copyrights for commercialization pursuant to
 * the terms of either a Standard Software Source Code License Agreement or a
 * Standard Product License Agreement. A copy of either Agreement can be
 * obtained upon request from: info@keybridgewireless.com
 *
 * All information contained herein is the property of {project.organization!user}
 * and its suppliers, if any. The intellectual and technical concepts contained
 * herein are proprietary.
 */
package gov.niem.release.niem.structures;

import ch.keybridge.lib.xml.JaxbUtility;
import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.junit.Test;

/**
 *
 * @author Key Bridge
 */
public class MetadataTypeTest {

  public MetadataTypeTest() {
  }

  /**
   * Simple test to create and marshal a java class to see what happens.
   *
   * @throws JAXBException on error
   */
  @Test
  public void testSomeMethod() throws JAXBException {

    Person person = new Person();
    person.setName("Jack Frost");

    person.setId("personId");
    person.setUri("http://person.uri");
    person.withOtherAttribute(new QName("age"), "15");
    person.withOtherAttribute(new QName("height"), "60");
    person.withOtherAttribute(new QName("eyes"), "bleu");
    QName q = new QName("http://food.namespace.uri", "lunch", "fo");
    person.withOtherAttribute(q, "sandwich");
    System.out.println(JaxbUtility.marshal(person));

    /**
     * Check out the IDREF
     */
    Person ofInterest = new Person();
    ofInterest.setRef(person);
    System.out.println(JaxbUtility.marshal(ofInterest));

  }

  @XmlRootElement(name = "Person")
  @XmlType(name = "Person")
  public static class Person extends MetadataType {

    @XmlElement(name = "Name")
    private String name;

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

  }

}
