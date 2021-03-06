//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.06 at 09:11:41 AM IST 
//

package tech.ecoa.osets.model.intf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the tech.ecoa.osets.model.intf package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _ServiceDefinition_QNAME = new QName("http://www.ecoa.technology/interface-1.0", "serviceDefinition");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: tech.ecoa.osets.model.intf
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link Use }
	 * 
	 */
	public Use createUse() {
		return new Use();
	}

	/**
	 * Create an instance of {@link ServiceDefinition }
	 * 
	 */
	public ServiceDefinition createServiceDefinition() {
		return new ServiceDefinition();
	}

	/**
	 * Create an instance of {@link Data }
	 * 
	 */
	public Data createData() {
		return new Data();
	}

	/**
	 * Create an instance of {@link RequestResponse }
	 * 
	 */
	public RequestResponse createRequestResponse() {
		return new RequestResponse();
	}

	/**
	 * Create an instance of {@link Event }
	 * 
	 */
	public Event createEvent() {
		return new Event();
	}

	/**
	 * Create an instance of {@link Parameter }
	 * 
	 */
	public Parameter createParameter() {
		return new Parameter();
	}

	/**
	 * Create an instance of {@link Operations }
	 * 
	 */
	public Operations createOperations() {
		return new Operations();
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link ServiceDefinition }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.ecoa.technology/interface-1.0", name = "serviceDefinition")
	public JAXBElement<ServiceDefinition> createServiceDefinition(ServiceDefinition value) {
		return new JAXBElement<ServiceDefinition>(_ServiceDefinition_QNAME, ServiceDefinition.class, null, value);
	}

}
