//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.08.25 at 01:29:02 EDT 
//


package edu.uconn.psy.jtrace.parser.impl;

public class JtLexiconTypeImpl implements edu.uconn.psy.jtrace.parser.JtLexiconType, com.sun.xml.bind.JAXBObject, edu.uconn.psy.jtrace.parser.impl.runtime.UnmarshallableObject, edu.uconn.psy.jtrace.parser.impl.runtime.XMLSerializable, edu.uconn.psy.jtrace.parser.impl.runtime.ValidatableObject
{

    protected java.lang.String _LexiconName;
    protected com.sun.xml.bind.util.ListImpl _Lexeme;
    public final static java.lang.Class version = (edu.uconn.psy.jtrace.parser.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (edu.uconn.psy.jtrace.parser.JtLexiconType.class);
    }

    public java.lang.String getLexiconName() {
        return _LexiconName;
    }

    public void setLexiconName(java.lang.String value) {
        _LexiconName = value;
    }

    protected com.sun.xml.bind.util.ListImpl _getLexeme() {
        if (_Lexeme == null) {
            _Lexeme = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _Lexeme;
    }

    public java.util.List getLexeme() {
        return _getLexeme();
    }

    public edu.uconn.psy.jtrace.parser.impl.runtime.UnmarshallingEventHandler createUnmarshaller(edu.uconn.psy.jtrace.parser.impl.runtime.UnmarshallingContext context) {
        return new edu.uconn.psy.jtrace.parser.impl.JtLexiconTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(edu.uconn.psy.jtrace.parser.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_Lexeme == null)? 0 :_Lexeme.size());
        if (_LexiconName!= null) {
            context.startElement("http://xml.netbeans.org/examples/targetNS", "lexicon-name");
            context.endNamespaceDecls();
            context.endAttributes();
            try {
                context.text(((java.lang.String) _LexiconName), "LexiconName");
            } catch (java.lang.Exception e) {
                edu.uconn.psy.jtrace.parser.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endElement();
        }
        while (idx2 != len2) {
            context.startElement("http://xml.netbeans.org/examples/targetNS", "lexeme");
            int idx_2 = idx2;
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Lexeme.get(idx_2 ++)), "Lexeme");
            context.endNamespaceDecls();
            int idx_3 = idx2;
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Lexeme.get(idx_3 ++)), "Lexeme");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Lexeme.get(idx2 ++)), "Lexeme");
            context.endElement();
        }
    }

    public void serializeAttributes(edu.uconn.psy.jtrace.parser.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_Lexeme == null)? 0 :_Lexeme.size());
        while (idx2 != len2) {
            idx2 += 1;
        }
    }

    public void serializeURIs(edu.uconn.psy.jtrace.parser.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_Lexeme == null)? 0 :_Lexeme.size());
        while (idx2 != len2) {
            idx2 += 1;
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (edu.uconn.psy.jtrace.parser.JtLexiconType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom."
+"sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttr"
+"ibutesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa"
+"\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0000ppsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002"
+"L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003ppsr\u0000#com.sun.m"
+"sv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxr\u0000*com"
+".sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.su"
+"n.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.da"
+"tatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUrit\u0000\u0012Ljava/"
+"lang/String;L\u0000\btypeNameq\u0000~\u0000\u0017L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/dat"
+"atype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XM"
+"LSchemat\u0000\u0006stringsr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProce"
+"ssor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSp"
+"aceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0001sr\u00000com.sun.msv.grammar.Expression"
+"$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003ppsr\u0000\u001bcom.sun.msv.util.St"
+"ringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0017L\u0000\fnamespaceURIq\u0000~\u0000\u0017xpq\u0000"
+"~\u0000\u001bq\u0000~\u0000\u001asq\u0000~\u0000\u0006ppsr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\txq\u0000~\u0000\u0003q\u0000~\u0000\rpsq\u0000~\u0000\u000fppsr\u0000\"com.s"
+"un.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0014q\u0000~\u0000\u001at\u0000\u0005QNames"
+"r\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u001dq\u0000~\u0000 sq\u0000~\u0000!q\u0000~\u0000)q\u0000~\u0000\u001asr\u0000#com.sun.msv.grammar.Si"
+"mpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0017L\u0000\fnamespaceURIq\u0000~\u0000"
+"\u0017xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpt\u0000\u0004typet\u0000)htt"
+"p://www.w3.org/2001/XMLSchema-instancesr\u00000com.sun.msv.gramma"
+"r.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\f\u0001psq\u0000~\u0000"
+"-t\u0000\flexicon-namet\u0000)http://xml.netbeans.org/examples/targetNS"
+"q\u0000~\u00003sr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom."
+"sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003ppsq\u0000~\u0000\b"
+"pp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0006ppsq\u0000~\u00008q\u0000~\u0000\rpsq\u0000~\u0000$q\u0000~\u0000\rpsr\u00002com."
+"sun.msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000"
+"~\u0000\u0003q\u0000~\u00004psr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~"
+"\u0000.q\u0000~\u00003sq\u0000~\u0000-t\u0000(edu.uconn.psy.jtrace.parser.JtLexemeTypet\u0000+h"
+"ttp://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u0006ppsq\u0000~\u0000$q\u0000~\u0000"
+"\rpq\u0000~\u0000&q\u0000~\u0000/q\u0000~\u00003sq\u0000~\u0000-t\u0000\u0006lexemeq\u0000~\u00007sr\u0000\"com.sun.msv.grammar"
+".ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar"
+"/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.Express"
+"ionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006pare"
+"ntt\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000\t\u0001pq\u0000~\u0000\u000eq\u0000~\u0000?q"
+"\u0000~\u0000\u0007q\u0000~\u0000<q\u0000~\u0000:q\u0000~\u0000#q\u0000~\u0000Hq\u0000~\u0000\u0005q\u0000~\u0000>x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends edu.uconn.psy.jtrace.parser.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(edu.uconn.psy.jtrace.parser.impl.runtime.UnmarshallingContext context) {
            super(context, "-------");
        }

        protected Unmarshaller(edu.uconn.psy.jtrace.parser.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return edu.uconn.psy.jtrace.parser.impl.JtLexiconTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        if (("lexeme" == ___local)&&("http://xml.netbeans.org/examples/targetNS" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 4;
                            return ;
                        }
                        break;
                    case  0 :
                        if (("lexicon-name" == ___local)&&("http://xml.netbeans.org/examples/targetNS" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 1;
                            return ;
                        }
                        state = 3;
                        continue outer;
                    case  6 :
                        if (("lexeme" == ___local)&&("http://xml.netbeans.org/examples/targetNS" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 4;
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  4 :
                        if (("phonology" == ___local)&&("http://xml.netbeans.org/examples/targetNS" == ___uri)) {
                            _getLexeme().add(((edu.uconn.psy.jtrace.parser.impl.JtLexemeTypeImpl) spawnChildFromEnterElement((edu.uconn.psy.jtrace.parser.impl.JtLexemeTypeImpl.class), 5, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        break;
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
                        if (("lexicon-name" == ___local)&&("http://xml.netbeans.org/examples/targetNS" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  0 :
                        state = 3;
                        continue outer;
                    case  6 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  5 :
                        if (("lexeme" == ___local)&&("http://xml.netbeans.org/examples/targetNS" == ___uri)) {
                            context.popAttributes();
                            state = 6;
                            return ;
                        }
                        break;
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
                    case  0 :
                        state = 3;
                        continue outer;
                    case  6 :
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
                    case  0 :
                        state = 3;
                        continue outer;
                    case  6 :
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
                            eatText1(value);
                            state = 2;
                            return ;
                        case  0 :
                            state = 3;
                            continue outer;
                        case  6 :
                            revertToParentFromText(value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _LexiconName = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

    }

}
