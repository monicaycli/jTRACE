/*
 * Action.java
 *
 * Created on May 2, 2005, 7:12 PM
 */

package edu.uconn.psy.jtrace.Model.Scripting;
import edu.uconn.psy.jtrace.Model.*;
import edu.uconn.psy.jtrace.Model.Scripting.*;

/**
 *
 * @author tedstrauss
 */
public class Action extends Expression{
    String name;
    Primitive[] arguments;
    public Action(String _name,Primitive[] arg){        
        name=_name;
        arguments=arg;    
    }
    public Object clone(){
        Primitive[] _arg= new Primitive[arguments.length];
        for(int i=0;i<arguments.length;i++){
            if(arguments[i]==null){ 
                _arg[i] = null;
                continue;
            }
            _arg[i] = (Primitive)arguments[i].clone();        
        }
        return new Action(name, _arg);
    }
    public String name(){return name;}
    public void setName(String _n){name=_n;}
    
    public Primitive[] arguments(){return arguments;}        
    public void setArguments(Primitive[] arg){
        arguments=arg;        
    }
    public String XMLTag(){
        String result="";
        result+="<action>";
        result+="<"+name+">";
        /*
        <xsd:element name="new-window">
        <xsd:element name="cancel-script">                        
        <xsd:element name="set-root-directory">
        <xsd:element name="set-cycles-per-sim">
        <xsd:element name="load-sim-from-file">
        <xsd:element name="set-lexicon">
        <xsd:element name="set-parameters">
        <xsd:element name="set-a-parameter">
        <xsd:element name="reset-graph-defaults">
        <xsd:element name="set-graph-domain">
        <xsd:element name="set-watch-type">
        <xsd:element name="set-watch-top-n">
        <xsd:element name="set-watch-items">
        <xsd:element name="set-analysis-type">
        <xsd:element name="set-choice-type">
        <xsd:element name="set-content-type">
        <xsd:element name="set-k-value">
        <xsd:element name="set-alignment">
        <xsd:element name="add-one-analysis-item">
        <xsd:element name="remove-one-analysis-item">
        <xsd:element name="set-graph-x-axis-bounds">
        <xsd:element name="set-graph-y-axis-bounds">
        <xsd:element name="set-graph-title">
        <xsd:element name="set-graph-x-axis-label">
        <xsd:element name="set-graph-y-axis-label">
        <xsd:element name="set-graph-input-position">
        <xsd:element name="save-parameters-to-jt">
        <xsd:element name="save-parameters-to-txt">
        <xsd:element name="save-simulation-to-jt">
        <xsd:element name="save-simulation-to-txt">
        <xsd:element name="save-graph-to-png">
        <xsd:element name="save-graph-to-txt">
        <xsd:element name="save-script">                        
         */
        if(name.equals("save-parameters-to-jt")||
           name.equals("save-parameters-to-txt")||
           name.equals("save-simulation-to-jt")||     
           name.equals("save-simulation-to-txt")||
           name.equals("save-graph-to-png")||     
           name.equals("save-graph-to-txt")||
           name.equals("save-script")||     
           name.equals("load-sim-from-file")){
           result+=arguments[0].XMLTag();
        }
        else if(name.equals("new-window")||
           name.equals("cancel-script")||
           name.equals("add-silence-to-input-edges")||
           name.equals("reset-graph-defaults")){
           result+="<arg>n/a</arg>";
        }
        else if(name.equals("set-root-directory")){
            result+="<directory>"+arguments[0].textValue().value()+"</directory>";
        }
        else if(name.equals("set-cycles-per-sim")){
            result+="<cycles>"+arguments[0].intValue().value()+"</cycles>";
        }
        else if(name.equals("set-lexicon")){
            result+=arguments[0].XMLTag();
        }
        else if(name.equals("set-parameters")){
            result+=arguments[0].XMLTag();
        }
        else if(name.equals("set-a-parameter")){
            result+="<parameter-name>"+arguments[0].XMLTag()+"</parameter-name>";
            result+="<value>"+arguments[0].XMLTag()+"</value>";
        }
        else if(name.equals("set-graph-domain")){
            result+="<domain>"+((Text)arguments[0]).value()+"</domain>";
        }
        else if(name.equals("set-watch-type")){
            result+="<type>"+((Text)arguments[0]).value()+"</type>";
        }
        else if(name.equals("set-watch-top-n")){
            result+="<N>"+arguments[0].intValue().value()+"</N>";
        }
        else if(name.equals("set-watch-items")){
            result+=arguments[0].XMLTag();
        }
        else if(name.equals("set-analysis-type")){
            result+="<type>"+((Text)arguments[0]).value()+"</type>";
        }
        else if(name.equals("set-choice-type")){
            result+="<type>"+((Text)arguments[0]).value()+"</type>";
        }
        else if(name.equals("set-content-type")){
            result+="<type>"+((Text)arguments[0]).value()+"</type>";
        }
        else if(name.equals("set-k-value")){        
            result+="<exponent>"+arguments[0].intValue().value()+"</exponent>";
        }
        else if(name.equals("set-alignment")){
            result+="<alignment>"+arguments[0].intValue().value()+"</alignment>";
        }
        else if(name.equals("add-one-analysis-item")){ 
            result+="<arg>"+arguments[0].textValue().value()+"</arg>";
        }
        else if(name.equals("remove-one-analysis-item")){
            result+="<arg>"+arguments[0].textValue().value()+"</arg>";
        }
        else if(name.equals("set-graph-x-axis-bounds")){
            result+="<left-bound>"+arguments[0].decimalValue().value()+"</left-bound>";
            result+="<right-bound>"+arguments[1].decimalValue().value()+"</right-bound>";            
        }
        else if(name.equals("set-graph-y-axis-bounds")){
            result+="<lower-bound>"+arguments[0].decimalValue().value()+"</lower-bound>";
            result+="<upper-bound>"+arguments[1].decimalValue().value()+"</upper-bound>";            
        }
        else if(name.equals("set-graph-title")){
            result+="<title>"+arguments[0].textValue().value()+"</title>";
        }
        else if(name.equals("set-graph-x-axis-label")){
            result+="<label>"+arguments[0].textValue().value()+"</label>";
        }
        else if(name.equals("set-graph-y-axis-label")){
            result+="<label>"+arguments[0].textValue().value()+"</label>";
        }
        else if(name.equals("set-graph-input-position")){
            result+="<position>"+arguments[0].intValue().value()+"</position>";
        }
        else if(name.equals("write-to-a-file")){
            result+="<content>"+arguments[0].XMLTag()+"</content>";
            result+=arguments[1].XMLTag();
        }
        result+="</"+name+">";
        result+="</action>";
        return result;
    }
}
