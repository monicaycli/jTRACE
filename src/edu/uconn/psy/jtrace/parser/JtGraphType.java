//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.08.25 at 01:29:02 EDT 
//


package edu.uconn.psy.jtrace.parser;


/**
 * Java content class for jtGraphType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/tedstrauss/SVN/jtrace/trunk/src/edu/uconn/psy/jtrace/jTRACESchema.xsd line 1095)
 * <p>
 * <pre>
 * &lt;complexType name="jtGraphType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="report" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelInput" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spread" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fromLeft" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="toRight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="labels">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="data">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="row" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="d" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface JtGraphType {


    /**
     * Gets the value of the spread property.
     * 
     */
    int getSpread();

    /**
     * Sets the value of the spread property.
     * 
     */
    void setSpread(int value);

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link edu.uconn.psy.jtrace.parser.JtGraphType.DataType}
     */
    edu.uconn.psy.jtrace.parser.JtGraphType.DataType getData();

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.uconn.psy.jtrace.parser.JtGraphType.DataType}
     */
    void setData(edu.uconn.psy.jtrace.parser.JtGraphType.DataType value);

    /**
     * Gets the value of the modelInput property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getModelInput();

    /**
     * Sets the value of the modelInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setModelInput(java.lang.String value);

    /**
     * Gets the value of the labels property.
     * 
     * @return
     *     possible object is
     *     {@link edu.uconn.psy.jtrace.parser.JtGraphType.LabelsType}
     */
    edu.uconn.psy.jtrace.parser.JtGraphType.LabelsType getLabels();

    /**
     * Sets the value of the labels property.
     * 
     * @param value
     *     allowed object is
     *     {@link edu.uconn.psy.jtrace.parser.JtGraphType.LabelsType}
     */
    void setLabels(edu.uconn.psy.jtrace.parser.JtGraphType.LabelsType value);

    /**
     * Gets the value of the report property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getReport();

    /**
     * Sets the value of the report property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setReport(java.lang.String value);

    /**
     * Gets the value of the toRight property.
     * 
     */
    int getToRight();

    /**
     * Sets the value of the toRight property.
     * 
     */
    void setToRight(int value);

    /**
     * Gets the value of the fromLeft property.
     * 
     */
    int getFromLeft();

    /**
     * Sets the value of the fromLeft property.
     * 
     */
    void setFromLeft(int value);

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getTitle();

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setTitle(java.lang.String value);


    /**
     * Java content class for anonymous complex type.
     * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/tedstrauss/SVN/jtrace/trunk/src/edu/uconn/psy/jtrace/jTRACESchema.xsd line 1111)
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="row" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="d" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     */
    public interface DataType {


        /**
         * Gets the value of the Row property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the Row property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRow().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link edu.uconn.psy.jtrace.parser.JtGraphType.DataType.RowType}
         * 
         */
        java.util.List getRow();


        /**
         * Java content class for anonymous complex type.
         * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/tedstrauss/SVN/jtrace/trunk/src/edu/uconn/psy/jtrace/jTRACESchema.xsd line 1114)
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="d" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         */
        public interface RowType {


            /**
             * Gets the value of the D property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the D property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getD().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link java.math.BigDecimal}
             * 
             */
            java.util.List getD();

            /**
             * Gets the value of the label property.
             * 
             * @return
             *     possible object is
             *     {@link java.lang.String}
             */
            java.lang.String getLabel();

            /**
             * Sets the value of the label property.
             * 
             * @param value
             *     allowed object is
             *     {@link java.lang.String}
             */
            void setLabel(java.lang.String value);

        }

    }


    /**
     * Java content class for anonymous complex type.
     * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/tedstrauss/SVN/jtrace/trunk/src/edu/uconn/psy/jtrace/jTRACESchema.xsd line 1104)
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     */
    public interface LabelsType {


        /**
         * Gets the value of the Label property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the Label property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLabel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link java.lang.String}
         * 
         */
        java.util.List getLabel();

    }

}
