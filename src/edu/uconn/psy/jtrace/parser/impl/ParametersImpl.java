//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.08.25 at 01:29:02 EDT 
//


package edu.uconn.psy.jtrace.parser.impl;

public class ParametersImpl
    extends edu.uconn.psy.jtrace.parser.impl.JtParametersTypeImpl
    implements edu.uconn.psy.jtrace.parser.Parameters, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, edu.uconn.psy.jtrace.parser.impl.runtime.UnmarshallableObject, edu.uconn.psy.jtrace.parser.impl.runtime.XMLSerializable, edu.uconn.psy.jtrace.parser.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (edu.uconn.psy.jtrace.parser.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (edu.uconn.psy.jtrace.parser.Parameters.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://xml.netbeans.org/examples/targetNS";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "parameters";
    }

    public edu.uconn.psy.jtrace.parser.impl.runtime.UnmarshallingEventHandler createUnmarshaller(edu.uconn.psy.jtrace.parser.impl.runtime.UnmarshallingContext context) {
        return new edu.uconn.psy.jtrace.parser.impl.ParametersImpl.Unmarshaller(context);
    }

    public void serializeBody(edu.uconn.psy.jtrace.parser.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://xml.netbeans.org/examples/targetNS", "parameters");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeBody(context);
        context.endElement();
    }

    public void serializeAttributes(edu.uconn.psy.jtrace.parser.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(edu.uconn.psy.jtrace.parser.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (edu.uconn.psy.jtrace.parser.Parameters.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Lj"
+"ava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xppp\u0000sr\u0000\u001fcom.sun.msv.gra"
+"mmar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.BinaryExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~\u0000\u0004ppsr\u0000 com.sun.msv.g"
+"rammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryE"
+"xp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004ppsr\u0000\u001dcom.sun.msv.grammar.Choi"
+"ceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\bppsq\u0000~\u0000\rppsq\u0000~\u0000\rppsq\u0000~\u0000\rppsq\u0000~\u0000\rppsq\u0000~"
+"\u0000\rppsq\u0000~\u0000\rppsq\u0000~\u0000\rsr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp"
+"\u0000psq\u0000~\u0000\u0000q\u0000~\u0000\u0017p\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\nq\u0000~\u0000\u0017psr\u0000 com.sun.msv.grammar.A"
+"ttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004q\u0000~\u0000"
+"\u0017psr\u00002com.sun.msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq\u0000~\u0000\u0016\u0001psr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000co"
+"m.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000"
+"~\u0000\u0004q\u0000~\u0000\u001fpsr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L"
+"\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000&xq\u0000~\u0000!t\u0000"
+"4edu.uconn.psy.jtrace.parser.JtParametersType.Lexicont\u0000+http"
+"://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u0000q\u0000~\u0000\u0017p\u0000sq\u0000~\u0000\rpp"
+"sq\u0000~\u0000\nq\u0000~\u0000\u0017psq\u0000~\u0000\u001bq\u0000~\u0000\u0017pq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%t\u00006edu.uconn.ps"
+"y.jtrace.parser.JtParametersType.Phonologyq\u0000~\u0000)q\u0000~\u0000$sq\u0000~\u0000\u0000pp"
+"\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\nq\u0000~\u0000\u0017psq\u0000~\u0000\u001bq\u0000~\u0000\u0017pq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%t\u00008edu"
+".uconn.psy.jtrace.parser.JtParametersType.StringParamq\u0000~\u0000)sq"
+"\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\nq\u0000~\u0000\u0017psq\u0000~\u0000\u001bq\u0000~\u0000\u0017pq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%"
+"t\u00005edu.uconn.psy.jtrace.parser.JtParametersType.IntParamq\u0000~\u0000"
+")sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\nq\u0000~\u0000\u0017psq\u0000~\u0000\u001bq\u0000~\u0000\u0017pq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000"
+"~\u0000%t\u00009edu.uconn.psy.jtrace.parser.JtParametersType.DecimalPa"
+"ramq\u0000~\u0000)sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\nq\u0000~\u0000\u0017psq\u0000~\u0000\u001bq\u0000~\u0000\u0017pq\u0000~\u0000\u001eq\u0000~\u0000\"q"
+"\u0000~\u0000$sq\u0000~\u0000%t\u0000;edu.uconn.psy.jtrace.parser.JtParametersType.St"
+"ringParamRepq\u0000~\u0000)sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\nq\u0000~\u0000\u0017psq\u0000~\u0000\u001bq\u0000~\u0000\u0017pq\u0000"
+"~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%t\u00008edu.uconn.psy.jtrace.parser.JtParamete"
+"rsType.IntParamRepq\u0000~\u0000)sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\nq\u0000~\u0000\u0017psq\u0000~\u0000\u001bq\u0000"
+"~\u0000\u0017pq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%t\u0000<edu.uconn.psy.jtrace.parser.JtPa"
+"rametersType.DecimalParamRepq\u0000~\u0000)sq\u0000~\u0000\rppsq\u0000~\u0000\u001bq\u0000~\u0000\u0017psr\u0000\u001bcom"
+".sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/data"
+"type/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/Stri"
+"ngPair;xq\u0000~\u0000\u0004ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com"
+".sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceU"
+"riq\u0000~\u0000&L\u0000\btypeNameq\u0000~\u0000&L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype"
+"/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSche"
+"mat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$C"
+"ollapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpacePro"
+"cessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullSe"
+"tExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004ppsr\u0000\u001bcom.sun.msv.util.StringPai"
+"r\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000&L\u0000\fnamespaceURIq\u0000~\u0000&xpq\u0000~\u0000aq\u0000~\u0000"
+"`sq\u0000~\u0000%t\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instanceq\u0000"
+"~\u0000$sq\u0000~\u0000%t\u0000\nparameterst\u0000)http://xml.netbeans.org/examples/ta"
+"rgetNSsr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bex"
+"pTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr"
+"\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000"
+"\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/Expre"
+"ssionPool;xp\u0000\u0000\u0000\u001b\u0001pq\u0000~\u0000\u001aq\u0000~\u0000,q\u0000~\u00002q\u0000~\u00008q\u0000~\u0000>q\u0000~\u0000Dq\u0000~\u0000Jq\u0000~\u0000\u000fq\u0000"
+"~\u0000Pq\u0000~\u0000\u0013q\u0000~\u0000\tq\u0000~\u0000\u0014q\u0000~\u0000\u0010q\u0000~\u0000\u0015q\u0000~\u0000\u000eq\u0000~\u0000Tq\u0000~\u0000\u0011q\u0000~\u0000\u0019q\u0000~\u0000+q\u0000~\u00001q\u0000"
+"~\u00007q\u0000~\u0000=q\u0000~\u0000Cq\u0000~\u0000Iq\u0000~\u0000Oq\u0000~\u0000\u0012q\u0000~\u0000\fx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends edu.uconn.psy.jtrace.parser.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(edu.uconn.psy.jtrace.parser.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(edu.uconn.psy.jtrace.parser.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return edu.uconn.psy.jtrace.parser.impl.ParametersImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        if (("parameters" == ___local)&&("http://xml.netbeans.org/examples/targetNS" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  1 :
                        if (("lexicon" == ___local)&&("http://xml.netbeans.org/examples/targetNS" == ___uri)) {
                            spawnHandlerFromEnterElement((((edu.uconn.psy.jtrace.parser.impl.JtParametersTypeImpl)edu.uconn.psy.jtrace.parser.impl.ParametersImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("phonology" == ___local)&&("http://xml.netbeans.org/examples/targetNS" == ___uri)) {
                            spawnHandlerFromEnterElement((((edu.uconn.psy.jtrace.parser.impl.JtParametersTypeImpl)edu.uconn.psy.jtrace.parser.impl.ParametersImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("StringParam" == ___local)&&("http://xml.netbeans.org/examples/targetNS" == ___uri)) {
                            spawnHandlerFromEnterElement((((edu.uconn.psy.jtrace.parser.impl.JtParametersTypeImpl)edu.uconn.psy.jtrace.parser.impl.ParametersImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("IntParam" == ___local)&&("http://xml.netbeans.org/examples/targetNS" == ___uri)) {
                            spawnHandlerFromEnterElement((((edu.uconn.psy.jtrace.parser.impl.JtParametersTypeImpl)edu.uconn.psy.jtrace.parser.impl.ParametersImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("DecimalParam" == ___local)&&("http://xml.netbeans.org/examples/targetNS" == ___uri)) {
                            spawnHandlerFromEnterElement((((edu.uconn.psy.jtrace.parser.impl.JtParametersTypeImpl)edu.uconn.psy.jtrace.parser.impl.ParametersImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("StringParamRep" == ___local)&&("http://xml.netbeans.org/examples/targetNS" == ___uri)) {
                            spawnHandlerFromEnterElement((((edu.uconn.psy.jtrace.parser.impl.JtParametersTypeImpl)edu.uconn.psy.jtrace.parser.impl.ParametersImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("IntParamRep" == ___local)&&("http://xml.netbeans.org/examples/targetNS" == ___uri)) {
                            spawnHandlerFromEnterElement((((edu.uconn.psy.jtrace.parser.impl.JtParametersTypeImpl)edu.uconn.psy.jtrace.parser.impl.ParametersImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("DecimalParamRep" == ___local)&&("http://xml.netbeans.org/examples/targetNS" == ___uri)) {
                            spawnHandlerFromEnterElement((((edu.uconn.psy.jtrace.parser.impl.JtParametersTypeImpl)edu.uconn.psy.jtrace.parser.impl.ParametersImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((edu.uconn.psy.jtrace.parser.impl.JtParametersTypeImpl)edu.uconn.psy.jtrace.parser.impl.ParametersImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  2 :
                        if (("parameters" == ___local)&&("http://xml.netbeans.org/examples/targetNS" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  1 :
                        spawnHandlerFromLeaveElement((((edu.uconn.psy.jtrace.parser.impl.JtParametersTypeImpl)edu.uconn.psy.jtrace.parser.impl.ParametersImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        spawnHandlerFromEnterAttribute((((edu.uconn.psy.jtrace.parser.impl.JtParametersTypeImpl)edu.uconn.psy.jtrace.parser.impl.ParametersImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        spawnHandlerFromLeaveAttribute((((edu.uconn.psy.jtrace.parser.impl.JtParametersTypeImpl)edu.uconn.psy.jtrace.parser.impl.ParametersImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  1 :
                            spawnHandlerFromText((((edu.uconn.psy.jtrace.parser.impl.JtParametersTypeImpl)edu.uconn.psy.jtrace.parser.impl.ParametersImpl.this).new Unmarshaller(context)), 2, value);
                            return ;
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
