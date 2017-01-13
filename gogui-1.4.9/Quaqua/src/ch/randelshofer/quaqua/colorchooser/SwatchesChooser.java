/*
 * @(#)SwatchesChooser.java 
 *
 * Copyright (c) 2005-2010 Werner Randelshofer, Immensee, Switzerland.
 * All rights reserved.
 *
 * You may not use, copy or modify this file, except in compliance with the
 * license agreement you entered into with Werner Randelshofer.
 * For details see accompanying license terms.
 */

package ch.randelshofer.quaqua.colorchooser;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.colorchooser.*;
import javax.swing.plaf.*;
/**
 * SwatchesChooser.
 *
 * @author  Werner Randelshofer
 * @version $Id: SwatchesChooser.java 363 2010-11-21 17:41:04Z wrandelshofer $
 */
public class SwatchesChooser
extends AbstractColorChooserPanel
implements UIResource {
    private SwatchPanel swatchPanel;
    
    
    /** Creates new form. */
    public SwatchesChooser() {
    }
    
    protected void initColors() {
        int[] rawValues = initRawValues();
        int numColors = rawValues.length / 3;
        
        Color[] colors = new Color[numColors];
        for (int i = 0; i < numColors ; i++) {
            int x = i % 31;
            int y = i / 31;
            colors[x * 9 + y % 9] = new Color( rawValues[(i*3)], rawValues[(i*3)+1], rawValues[(i*3)+2] );
        }
        swatchPanel.setColors(colors);
        swatchPanel.setNumSwatches(9, 31);
        swatchPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                Color c = swatchPanel.getColorForLocation(e.getX(), e.getY());
                if (c != null) {
                    setColorToModel(c);
                    }
            }
        });
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        scrollPane = new javax.swing.JScrollPane();

        setLayout(new java.awt.BorderLayout());

        add(scrollPane, java.awt.BorderLayout.CENTER);

    }//GEN-END:initComponents
    
    protected void buildChooser() {
        initComponents();
        swatchPanel = new SwatchPanel();
        initColors();
        scrollPane.setViewportView(swatchPanel);
    }
    
    public String getDisplayName() {
        return UIManager.getString("ColorChooser.colorSwatches");
    }
    
    public Icon getLargeDisplayIcon() {
        return UIManager.getIcon("ColorChooser.colorSwatchesIcon");
    }
    
    public Icon getSmallDisplayIcon() {
        return getLargeDisplayIcon();
    }
    
    public void setColorToModel(Color color) {
        getColorSelectionModel().setSelectedColor(color);
    }
    
    public void updateChooser() {
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
    
    private int[] initRawValues() {
        int[] rawValues = {
            255, 255, 255, // first row.
            204, 255, 255,
            204, 204, 255,
            204, 204, 255,
            204, 204, 255,
            204, 204, 255,
            204, 204, 255,
            204, 204, 255,
            204, 204, 255,
            204, 204, 255,
            204, 204, 255,
            255, 204, 255,
            255, 204, 204,
            255, 204, 204,
            255, 204, 204,
            255, 204, 204,
            255, 204, 204,
            255, 204, 204,
            255, 204, 204,
            255, 204, 204,
            255, 204, 204,
            255, 255, 204,
            204, 255, 204,
            204, 255, 204,
            204, 255, 204,
            204, 255, 204,
            204, 255, 204,
            204, 255, 204,
            204, 255, 204,
            204, 255, 204,
            204, 255, 204,
            204, 204, 204,  // second row.
            153, 255, 255,
            153, 204, 255,
            153, 153, 255,
            153, 153, 255,
            153, 153, 255,
            153, 153, 255,
            153, 153, 255,
            153, 153, 255,
            153, 153, 255,
            204, 153, 255,
            255, 153, 255,
            255, 153, 204,
            255, 153, 153,
            255, 153, 153,
            255, 153, 153,
            255, 153, 153,
            255, 153, 153,
            255, 153, 153,
            255, 153, 153,
            255, 204, 153,
            255, 255, 153,
            204, 255, 153,
            153, 255, 153,
            153, 255, 153,
            153, 255, 153,
            153, 255, 153,
            153, 255, 153,
            153, 255, 153,
            153, 255, 153,
            153, 255, 204,
            204, 204, 204,  // third row
            102, 255, 255,
            102, 204, 255,
            102, 153, 255,
            102, 102, 255,
            102, 102, 255,
            102, 102, 255,
            102, 102, 255,
            102, 102, 255,
            153, 102, 255,
            204, 102, 255,
            255, 102, 255,
            255, 102, 204,
            255, 102, 153,
            255, 102, 102,
            255, 102, 102,
            255, 102, 102,
            255, 102, 102,
            255, 102, 102,
            255, 153, 102,
            255, 204, 102,
            255, 255, 102,
            204, 255, 102,
            153, 255, 102,
            102, 255, 102,
            102, 255, 102,
            102, 255, 102,
            102, 255, 102,
            102, 255, 102,
            102, 255, 153,
            102, 255, 204,
            153, 153, 153, // fourth row
            51, 255, 255,
            51, 204, 255,
            51, 153, 255,
            51, 102, 255,
            51, 51, 255,
            51, 51, 255,
            51, 51, 255,
            102, 51, 255,
            153, 51, 255,
            204, 51, 255,
            255, 51, 255,
            255, 51, 204,
            255, 51, 153,
            255, 51, 102,
            255, 51, 51,
            255, 51, 51,
            255, 51, 51,
            255, 102, 51,
            255, 153, 51,
            255, 204, 51,
            255, 255, 51,
            204, 255, 51,
            153, 244, 51,
            102, 255, 51,
            51, 255, 51,
            51, 255, 51,
            51, 255, 51,
            51, 255, 102,
            51, 255, 153,
            51, 255, 204,
            153, 153, 153, // Fifth row
            0, 255, 255,
            0, 204, 255,
            0, 153, 255,
            0, 102, 255,
            0, 51, 255,
            0, 0, 255,
            51, 0, 255,
            102, 0, 255,
            153, 0, 255,
            204, 0, 255,
            255, 0, 255,
            255, 0, 204,
            255, 0, 153,
            255, 0, 102,
            255, 0, 51,
            255, 0 , 0,
            255, 51, 0,
            255, 102, 0,
            255, 153, 0,
            255, 204, 0,
            255, 255, 0,
            204, 255, 0,
            153, 255, 0,
            102, 255, 0,
            51, 255, 0,
            0, 255, 0,
            0, 255, 51,
            0, 255, 102,
            0, 255, 153,
            0, 255, 204,
            102, 102, 102, // sixth row
            0, 204, 204,
            0, 204, 204,
            0, 153, 204,
            0, 102, 204,
            0, 51, 204,
            0, 0, 204,
            51, 0, 204,
            102, 0, 204,
            153, 0, 204,
            204, 0, 204,
            204, 0, 204,
            204, 0, 204,
            204, 0, 153,
            204, 0, 102,
            204, 0, 51,
            204, 0, 0,
            204, 51, 0,
            204, 102, 0,
            204, 153, 0,
            204, 204, 0,
            204, 204, 0,
            204, 204, 0,
            153, 204, 0,
            102, 204, 0,
            51, 204, 0,
            0, 204, 0,
            0, 204, 51,
            0, 204, 102,
            0, 204, 153,
            0, 204, 204,
            102, 102, 102, // seventh row
            0, 153, 153,
            0, 153, 153,
            0, 153, 153,
            0, 102, 153,
            0, 51, 153,
            0, 0, 153,
            51, 0, 153,
            102, 0, 153,
            153, 0, 153,
            153, 0, 153,
            153, 0, 153,
            153, 0, 153,
            153, 0, 153,
            153, 0, 102,
            153, 0, 51,
            153, 0, 0,
            153, 51, 0,
            153, 102, 0,
            153, 153, 0,
            153, 153, 0,
            153, 153, 0,
            153, 153, 0,
            153, 153, 0,
            102, 153, 0,
            51, 153, 0,
            0, 153, 0,
            0, 153, 51,
            0, 153, 102,
            0, 153, 153,
            0, 153, 153,
            51, 51, 51, // eigth row
            0, 102, 102,
            0, 102, 102,
            0, 102, 102,
            0, 102, 102,
            0, 51, 102,
            0, 0, 102,
            51, 0, 102,
            102, 0, 102,
            102, 0, 102,
            102, 0, 102,
            102, 0, 102,
            102, 0, 102,
            102, 0, 102,
            102, 0, 102,
            102, 0, 51,
            102, 0, 0,
            102, 51, 0,
            102, 102, 0,
            102, 102, 0,
            102, 102, 0,
            102, 102, 0,
            102, 102, 0,
            102, 102, 0,
            102, 102, 0,
            51, 102, 0,
            0, 102, 0,
            0, 102, 51,
            0, 102, 102,
            0, 102, 102,
            0, 102, 102,
            0, 0, 0, // ninth row
            0, 51, 51,
            0, 51, 51,
            0, 51, 51,
            0, 51, 51,
            0, 51, 51,
            0, 0, 51,
            51, 0, 51,
            51, 0, 51,
            51, 0, 51,
            51, 0, 51,
            51, 0, 51,
            51, 0, 51,
            51, 0, 51,
            51, 0, 51,
            51, 0, 51,
            51, 0, 0,
            51, 51, 0,
            51, 51, 0,
            51, 51, 0,
            51, 51, 0,
            51, 51, 0,
            51, 51, 0,
            51, 51, 0,
            51, 51, 0,
            0, 51, 0,
            0, 51, 51,
            0, 51, 51,
            0, 51, 51,
            0, 51, 51,
            51, 51, 51 };
            return rawValues;
    }
}
