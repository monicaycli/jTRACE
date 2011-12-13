/*
 * VariableIterator.java
 *
 * Created on May 2, 2005, 5:59 PM
 */

package edu.uconn.psy.jtrace.Model.Scripting.impl;
import edu.uconn.psy.jtrace.Model.Scripting.*;
import edu.uconn.psy.jtrace.Model.*;

/**
 *
 * @author tedstrauss
 */
public class IntegerIterator extends edu.uconn.psy.jtrace.Model.Scripting.Iterator{
    String parameterName;
    int numIncrements, currentIncrement;
    int from, to, curr;
    boolean hasNext;
    
    /** Creates a new instance of VariableIterator */
    public IntegerIterator(Expression[] e,String pname,int f, int t, int n) {
        super(e); 
        parameterName=pname;
        from=f;
        to=t;
        if(from>to){ //force an ascending iterator
            from=t;
            to=f;
        }        
        numIncrements=n;
        currentIncrement=0;
        curr=from;
        if(curr<to) hasNext=true;
        else hasNext=false;
        expressions = e;
    }
    public Object clone(){
        Expression[] _e = new Expression[expressions.length];
        for(int i=0;i<expressions.length;i++)
            _e[i] = (Expression)expressions[i].clone();
        return new IntegerIterator(_e,parameterName,from,to,numIncrements);
    }
    
    public edu.uconn.psy.jtrace.Model.Scripting.Expression[] expressions(){
        return expressions;
    }
    public String parameterName(){
        return parameterName;
    }
    public int numberOfIncrements(){
        return numIncrements;
    }
    public int currentIncrement(){
        return currentIncrement;
    }
    public boolean hasNext(){
        return hasNext;
    }
    public Object getCurr(){
        return (new Integer(curr));
    }
    public void iterate(){
        curr+=((to-from)/((float)numIncrements));
        currentIncrement++;
        if(curr<to) hasNext=true;
        else hasNext=false;        
    }    
    public void resetIterator(){
        currentIncrement=0;
        curr=from;
        if(curr<to) hasNext=true;
        else hasNext=false;        
    }
    public String XMLTag(){
        String result="";
        result+="<iterate>";
        result+="<incrementing-value>";
        result+="<target-parameter>"+parameterName+"</target-parameter>";
        result+="<type>integer</type>";
        result+="<from>"+from+"</from>";
        result+="<to>"+to+"</to>";
        result+="<number-of-steps>"+numIncrements+"</number-of-steps>";
        result+="</incrementing-value>";        
        if(null!=expressions){
            for(int i=0;i<expressions.length;i++)
                result += "<instructions>"+expressions[i].XMLTag()+"</instructions>";        
        }
        result+="</iterate>";
        return result;
    }
    public String iteratorType(){
        return "";
    }
    
}
