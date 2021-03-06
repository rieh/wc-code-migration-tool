//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.11.09 at 06:51:57 PM CST 
//

package com.ibm.commerce.qcheck.tools.config;

/*
 *-----------------------------------------------------------------
 * Copyright 2018 Trent Hoeppner
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *-----------------------------------------------------------------
 */

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.ibm.commerce.qcheck.tools.config
 * package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 * @author Trent Hoeppner
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _Setup_QNAME = new QName("http://www.validator.commerce.ibm.com/setup", "setup");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.ibm.commerce.qcheck.tools.config
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link ValidatorDef }
	 * 
	 */
	public ValidatorDef createValidatorDef() {
		return new ValidatorDef();
	}

	/**
	 * Create an instance of {@link Level }
	 * 
	 */
	public Level createLevel() {
		return new Level();
	}

	/**
	 * Create an instance of {@link Config }
	 * 
	 */
	public Config createConfig() {
		return new Config();
	}

	/**
	 * Create an instance of {@link ValidatorInst }
	 * 
	 */
	public ValidatorInst createValidatorInst() {
		return new ValidatorInst();
	}

	/**
	 * Create an instance of {@link Event }
	 * 
	 */
	public Event createEvent() {
		return new Event();
	}

	/**
	 * Create an instance of {@link Setup }
	 * 
	 */
	public Setup createSetup() {
		return new Setup();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Setup
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://www.validator.commerce.ibm.com/setup", name = "setup")
	public JAXBElement<Setup> createSetup(Setup value) {
		return new JAXBElement<Setup>(_Setup_QNAME, Setup.class, null, value);
	}

}
