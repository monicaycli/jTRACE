//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.08.25 at 01:29:02 EDT 
//


package edu.uconn.psy.jtrace.parser;


/**
 * Java content class for jtFileNameType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/tedstrauss/SVN/jtrace/trunk/src/edu/uconn/psy/jtrace/jTRACESchema.xsd line 301)
 * <p>
 * <pre>
 * &lt;complexType name="jtFileNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="absolute-path" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="relative-path" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface JtFileNameType {


    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getName();

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setName(java.lang.String value);

    /**
     * Gets the value of the absolutePath property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getAbsolutePath();

    /**
     * Sets the value of the absolutePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setAbsolutePath(java.lang.String value);

    /**
     * Gets the value of the relativePath property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getRelativePath();

    /**
     * Sets the value of the relativePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setRelativePath(java.lang.String value);

}