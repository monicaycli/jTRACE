/*
 * WordSimGraph.java
 *
 * Created on May 11, 2005, 1:08 PM
 */

package edu.uconn.psy.jtrace.UI;

import java.awt.*;
import java.awt.geom.*;
import java.util.*;
import edu.uconn.psy.jtrace.Model.*;

/**
 *
 * @author harlan
 */
public class WordSimGraph extends AbstractSimGraph
{
    protected String [] wordLabels;
    static final int maxWords = 10;

    /** Creates a new instance of WordSimGraph */
    public WordSimGraph(TraceParam _tp, double [][] _d, int _n, int _i,
            double _min, double _max, String [] _wl) 
    {
        super(_tp, _d, _n, _i, _min, _max);
        
        wordLabels = _wl;
        
        xAxisLabel = "Temporal Alignment";
        yAxisLabel = "Word";
        title = "Word Activations";
        
        if (wordLabels.length > maxWords)
        {
            rows = maxWords;
            data = filterData(data, topN(data, maxWords));        
            wordLabels = filterLabels(wordLabels, topN(data, maxWords));
        }
        
        if (wordLabels.length!=data.length){
            System.out.println("WordSimGraph.init() : "+data.length+" words in data, "+wordLabels.length+" word labels!");                
        }
    }
    
    protected void getFixedSizes(Graphics g)
    {
        super.getFixedSizes(g);
        
        FontMetrics fm;
        
        fm = g.getFontMetrics(fTickLabel);
        szYTickLabel = (int)fm.getStringBounds("^^^^^", g).getWidth();    
        
    }
    
    /** 
     * Over-ride abstract method. X axis is as normal. Y axis plots the word
     * labels.
     */
    protected void plotTicks(Rectangle plotRect, Graphics2D g2)
    {
        int tickLength = (int)(szSmallBuf * .7);
        
        double boxHeight = plotRect.getHeight() / rows;
        double boxWidth = plotRect.getWidth() / cols;
       
        g2.setColor(Color.BLACK);
        g2.setFont(fTickLabel);
        
        // foreach row, plot a tick mark. 
        // foreach col, plot a tick mark.
        // and plot 15 X tick labels
        
        // Y tick labels are difficult:
        // for each phoneme, plot a label and tick mark
        
        // plot if col % colLabelInterval == 0
        int colLabelInterval = (int)(cols / 15);
        
        // foreach row
        for (int row = 0; row < rows; row++)
        {
            // position of the top of each row
            int yPos = (int)Math.round(plotRect.getY() + (row * boxHeight));
            
            // draw the tick mark
            g2.drawLine((int)Math.round(plotRect.getX() - tickLength), yPos, 
                    (int)Math.round(plotRect.getX()), yPos);
            
            // compute the size of this label
            String label = wordLabels[row];
            Rectangle2D labelRect =(g2.getFontMetrics(fTickLabel)).getStringBounds(label, g2);

            // label is right-justified on tickmark and below the tick
            int xLabelPos = (int)Math.round(plotRect.getX() - szSmallBuf - labelRect.getWidth());
            int yLabelPos = (int)Math.round(yPos + labelRect.getHeight());

            //g2.rotate(-java.lang.Math.PI/2, xLabelPos, yLabelPos);
            g2.drawString(label, xLabelPos, yLabelPos);
            //g2.rotate(java.lang.Math.PI/2, xLabelPos, yLabelPos);
            
        }
        
        // this is the same as in AbstractSimGraph
        for (int col = 0; col < cols; col++)
        {
            // position of the left of each column
            int xPos = (int)Math.round(plotRect.getX() + (col * boxWidth));
            
            // draw the tick mark
            g2.drawLine(xPos, (int)Math.round(plotRect.getY() + plotRect.getHeight()),
                    xPos, (int)Math.round(plotRect.getY() + plotRect.getHeight() + tickLength));
            
            if (col % colLabelInterval == 0)
            {
                // compute the size of this label
                String label = Integer.toString(col);
                Rectangle2D labelRect =(g2.getFontMetrics(fTickLabel)).getStringBounds(label, g2);
                
                // lower-left of label is a szSmallBuf + szTickLabel below the plot and centered on its tickmark
                int xLabelPos = (int)Math.round(xPos - labelRect.getWidth() / 2);
                int yLabelPos = (int)Math.round(plotRect.getY() + plotRect.getHeight() + szSmallBuf + szXTickLabel);
                
                g2.drawString(Integer.toString(col), xLabelPos, yLabelPos);
                
            }
        }
    }
    
    public void filterAndDrawData(double[][] d,String[] l){
        if (d != null)
        {
            int [] indexes = topN(d, maxWords);
            data=filterData(d, indexes);        
            wordLabels=filterLabels(l, indexes);
            repaint();                
        }        
    }
    
    static public int[] topN(double[][] data,int n){
       int[] result;
       
       //no need to do max search if less than n words, yo!
       if(data.length<n){ 
           result=new int[data.length];           
           for(int i=0;i<data.length;i++)
               result[i]=i;
           return result;    
       }
       
       result=new int[n];
       
       // max is a mapping from indexes into data to maximum values
       double [] max = new double[data.length];
       
       // maxMap is a mapping from maximum values to indexes into data
       Map maxMap = new HashMap();
       
       // maxValues is sortable list of maxes
       Double [] maxValues = new Double[data.length];
       java.util.Random rand = new java.util.Random();
               
       for(int i=0;i<data.length;i++){
           maxValues[i] = new Double(-100.0);
           for(int j=0;j<data[i].length;j++){
               if (data[i][j] > maxValues[i].doubleValue())
               {
                    maxValues[i] = new Double(data[i][j]);
               }
           }
           
           // make sure there are no duplicates
           if (maxMap.containsKey(maxValues[i]))
           {
               maxValues[i] = new Double(maxValues[i].doubleValue() * (double)(1 + (rand.nextGaussian() * 0.000001d)));
           }
           
           // now store
           maxMap.put(maxValues[i], new Integer(i));
       }
       
       java.util.List maxVList = Arrays.asList(maxValues);
       Collections.sort(maxVList, Collections.reverseOrder());
             
       // put the top n values in the list into the result vector
       Iterator it = maxVList.iterator();
       for (int i = 0; i < n; i++)
       {           
           if (it.hasNext()){
               //System.out.println("top "+n+"\t"+i+"\t"+((Integer)maxMap.get(it.next())).intValue());
               result[i] = ((Integer)maxMap.get(it.next())).intValue();
           }
       }
       
       return result;
    }
    static public double[][] filterData(double[][] data,int[] mask){
        if (data == null)
            return null;
        
        double[][] result=new double[mask.length][data[0].length];
        for(int i=0;i<result.length;i++)
            for(int j=0;j<result[0].length;j++){
               result[i][j]=data[mask[i]][j];
               //System.out.println(mask[i]+" - "+data[mask[i]][j]);
            }
        return result;
    }
    static public String[] filterLabels(String[] lbl,int[] mask){
        String[] result=new String[mask.length];
        for(int i=0;i<result.length;i++)
            result[i]=lbl[mask[i]];
        return result;
    }
    public double[][] filterAndReturnData(double[][] d,String[] l){
        if (d != null)
        {
            int [] indexes = topN(d, maxWords);
            return filterData(d, indexes);                    
        }   
        return null;
    }
    
    /**
     * Getter for property wordLabels.
     * @return Value of property wordLabels.
     */
    public String [] getWordLabels() {

        return this.wordLabels;
    }
    /**
     * Setter for property wordLabels.     
     */
    public void setWordLabels(String[] _l) {

        this.wordLabels = _l;
    }
    
}
