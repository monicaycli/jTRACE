/*
 * CommandLineUI.java
 *
 * Created on June 1, 2005, 4:43 PM
 */

package edu.uconn.psy.jtrace.UI;

/**
 *
 * @author tedstrauss
 */
public class CommandLineUI {
    private traceProperties properties;
    edu.uconn.psy.jtrace.Model.Scripting.TraceScript script;
    
    /** Creates a new instance of CommandLineUI */
    public CommandLineUI(String[] args) {
        // set or create properties object
        properties=new traceProperties();    
        properties.situate(null);
        traceProperties.hasGUI=false;            
        java.io.File scriptFile = new java.io.File(args[0]);
        if(scriptFile.exists()&&scriptFile.isFile()&&scriptFile.canRead()){
            try{
                edu.uconn.psy.jtrace.IO.WTFileReader fr = new edu.uconn.psy.jtrace.IO.WTFileReader(scriptFile);
                script = fr.loadJTScript();
                script.setLoadedFileReference(scriptFile);
            }
            catch(Exception e){ 
                e.printStackTrace();
            }            
        }    
        else{
            System.out.print("Unable to load script file");
        }
    }
    public void execute(){
        script.interpret();
    }
    
}
