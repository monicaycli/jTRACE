/*
 * BaseParametersDialog.java
 *
 * Created on July 3, 2005, 1:59 PM
 */

package edu.uconn.psy.jtrace.UI;
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.awt.*;
import edu.uconn.psy.jtrace.Model.*;
import org.jdesktop.layout.GroupLayout;
/**
 *
 * @author tedstrauss
 */
public class BaseParametersDialog extends JDialog{
    private TraceParam param;
    /** Creates a new instance of BaseParametersDialog */
    public BaseParametersDialog(Frame owner,TraceParam _param){
        super(owner,"Base Parameters",true);
        param=_param;
        initComponents();        
    }
    private void initComponents(){        
        setSize(700,700);
        java.awt.GridBagConstraints gridBagConstraints;        
        getContentPane().setLayout(new java.awt.GridBagLayout());                
        
        toolbar = new JToolBar();
        toolbar.setFloatable(false);
        
        space = new JLabel("     ");
        okbutton = new JButton();
        //okbutton.setPreferredSize(new java.awt.Dimension(60, 40));        
        okbutton.setText("Ok");        
        cancelbutton = new JButton();
        //cancelbutton.setPreferredSize(new java.awt.Dimension(60, 40));        
        cancelbutton.setText("Cancel");
        toolbar.add(space);        
        toolbar.add(okbutton);
        toolbar.add(cancelbutton);
        
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        //gridBagConstraints.weighty = 0.3;
        getContentPane().add(toolbar, gridBagConstraints);
        
        parameterspanel = new ParametersPanel(param);
        parameterspanel.setPreferredSize(new java.awt.Dimension(700, 650));
        parameterspanel.setMinimumSize(new java.awt.Dimension(120, 70));
        parameterspanel.setMaximumSize(new java.awt.Dimension(1000, 900));        
        
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.weighty = 1;
        getContentPane().add(parameterspanel, gridBagConstraints);        
        
    }
    public JButton getDoneButton(){
        return okbutton;
    }
    public JButton getCancelButton(){
        return cancelbutton;
    }
    public TraceParam getParameters(){
        param = parameterspanel.getParameters();
        return param;
    }
    
    private JToolBar toolbar;
    private JLabel space;
    private JButton okbutton;
    private JButton cancelbutton;
    private ParametersPanel parameterspanel;
    
}
