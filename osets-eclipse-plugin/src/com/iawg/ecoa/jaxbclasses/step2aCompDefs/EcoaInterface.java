//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.20 at 08:12:02 AM BST 
//

package com.iawg.ecoa.jaxbclasses.step2aCompDefs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Interface complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Interface">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/opencsa/sca/200912}Interface">
 *       &lt;attribute name="syntax" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="qos" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Interface", namespace = "http://www.ecoa.technology/sca")
public class EcoaInterface extends Interface {

	@XmlAttribute(name = "syntax", required = true)
	@XmlSchemaType(name = "anyURI")
	protected String syntax;
	@XmlAttribute(name = "qos")
	@XmlSchemaType(name = "anyURI")
	protected String qos;

	/**
	 * Gets the value of the syntax property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSyntax() {
		return syntax;
	}

	/**
	 * Sets the value of the syntax property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSyntax(String value) {
		this.syntax = value;
	}

	/**
	 * Gets the value of the qos property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getQos() {
		return qos;
	}

	/**
	 * Sets the value of the qos property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setQos(String value) {
		this.qos = value;
	}

}
