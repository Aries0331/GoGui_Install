/*
 * @(#)QuaquaColorPreviewPanel.java  
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
import javax.swing.plaf.*;
/**
 * QuaquaColorPreviewPanel.
 *
 * @author  Werner Randelshofer
 * @version $Id: QuaquaColorPreviewPanel.java 363 2010-11-21 17:41:04Z wrandelshofer $
 */
public class QuaquaColorPreviewPanel extends JPanel implements UIResource {
    private final static Color previewBorderColor = new Color(0x949494);
    private final static Color previewBackgroundColor = new Color(0xffffff);
    /** Creates new form. */
    public QuaquaColorPreviewPanel() {
        initComponents();
        //setBorder(new VisualMargin(3,0,3,0));
        setToolTipText("on"); // set dummy text, to switch tooltip on
    }
    
    @Override
    public void paintComponent(Graphics g) {
        Insets insets = getInsets();
        int x = insets.left;
        int y = insets.top;
        int w = getWidth() - insets.left - insets.right;
        int h = getHeight() - insets.top - insets.bottom;
        g.setColor(previewBackgroundColor);
        g.fillRect(x+1,y+1,w-2,h-2);
        g.setColor(previewBorderColor);
        g.drawRect(x,y,w-1,h-1);
        g.setColor(getForeground());
        g.fillRect(x+2,y+2,w-4,h-4);
    }
    
    @Override
    public String getToolTipText(MouseEvent evt) {
        Color color = getForeground();
        return (color == null) ? null : color.getRed()+", "+ color.getGreen() + ", " + color.getBlue();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents

        setLayout(new java.awt.BorderLayout());

        setPreferredSize(new java.awt.Dimension(26, 26));
    }//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    
}
