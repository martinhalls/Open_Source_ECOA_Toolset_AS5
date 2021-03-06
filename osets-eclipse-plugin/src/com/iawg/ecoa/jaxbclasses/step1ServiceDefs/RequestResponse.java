//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.20 at 08:12:01 AM BST 
//

package com.iawg.ecoa.jaxbclasses.step1ServiceDefs;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Use of the "request-response" exchange mechanism.
 * 
 * 
 * <p>
 * Java class for RequestResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="RequestResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ecoa.technology/interface-1.0}Operation">
 *       &lt;sequence>
 *         &lt;element name="input" type="{http://www.ecoa.technology/interface-1.0}Parameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="output" type="{http://www.ecoa.technology/interface-1.0}Parameter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestResponse", propOrder = { "inputs", "outputs" })
public class RequestResponse extends Operation {

	@XmlElement(name = "input")
	protected List<Parameter> inputs;
	@XmlElement(name = "output")
	protected List<Parameter> outputs;

	/**
	 * Gets the value of the inputs property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the inputs property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getInputs().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Parameter
	 * }
	 * 
	 * 
	 */
	public List<Parameter> getInputs() {
		if (inputs == null) {
			inputs = new ArrayList<Parameter>();
		}
		return this.inputs;
	}

	/**
	 * Gets the value of the outputs property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the outputs property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getOutputs().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Parameter
	 * }
	 * 
	 * 
	 */
	public List<Parameter> getOutputs() {
		if (outputs == null) {
			outputs = new ArrayList<Parameter>();
		}
		return this.outputs;
	}

}
