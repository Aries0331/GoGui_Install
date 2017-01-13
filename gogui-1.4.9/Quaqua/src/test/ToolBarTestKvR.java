/*
 * @(#)ToolBarTestKvR.java  
 *
 * Copyright (c) 2004-2010 Werner Randelshofer, Immensee, Switzerland.
 * All rights reserved.
 *
 * You may not use, copy or modify this file, except in compliance with the
 * license agreement you entered into with Werner Randelshofer.
 * For details see accompanying license terms.
 */
package test;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Window;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.plaf.FontUIResource;

/**
 * ToolBarTestKvR.
 *
 * @author  Werner Randelshofer
 * @version $Id: ToolBarTestKvR.java 417 2011-08-04 07:32:38Z wrandelshofer $
 */
public class ToolBarTestKvR extends javax.swing.JPanel {

    private static JToolBar unifiedToolBar;
    private static JToolBar unifiedStatusBar;
    
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
    	System.setProperty("apple.awt.graphics.UseQuartz", "true");
    	System.setProperty("Quaqua.design", "snowleopard");
    	UIManager.setLookAndFeel("ch.randelshofer.quaqua.QuaquaLookAndFeel");
    	
		JFrame f = new JFrame();
		f.getContentPane().setLayout(new BorderLayout());
		f.getContentPane().add(new ToolBarTestKvR(), BorderLayout.CENTER);
		f.setSize(800, 400);
		f.getRootPane().putClientProperty("apple.awt.brushMetalLook", true);
		f.setVisible(true);
		
	}

    /** Creates new form. */
    public ToolBarTestKvR() {
        initComponents();
        setOpaque(true);
        // toolBar.putClientProperty("JToolBar.isRollover", Boolean.TRUE);

        folderButton.putClientProperty("JButton.segmentPosition","middle");
        fileButton.putClientProperty("JButton.segmentPosition","last");
        
        if (unifiedToolBar != null) {
            unifiedToolBarBox.setSelected(true);
            toolBarPanel.remove(toolBar);
            toolBar = unifiedToolBar;
        }
        if (unifiedStatusBar != null) {
            unifiedStatusBarBox.setSelected(true);
            remove(statusBar);
            statusBar = unifiedStatusBar;
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        bottomStyleGroup = new javax.swing.ButtonGroup();
        titleStyleGroup = new javax.swing.ButtonGroup();
        statusBar = new javax.swing.JToolBar();
//        statusLabel = new StatusPanelLabel("Test", true);
        statusLabel = new JLabel("Test");
        toolBarPanel = new javax.swing.JPanel();
        toolBar = new javax.swing.JToolBar();
        folderButton = new javax.swing.JButton();
        fileButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        unifiedToolBarBox = new javax.swing.JCheckBox();
        plainTitleRadio = new javax.swing.JRadioButton();
        unifiedTitleRadio = new javax.swing.JRadioButton();
        gradientTitleRadio = new javax.swing.JRadioButton();
        unifiedStatusBarBox = new javax.swing.JCheckBox();
        plainBottomRadio = new javax.swing.JRadioButton();
        unifiedBottomRadio = new javax.swing.JRadioButton();
        gradientBottomRadio = new javax.swing.JRadioButton();

        setLayout(new java.awt.BorderLayout());

        statusBar.putClientProperty("Quaqua.ToolBar.style", "bottom");
        toolBar.putClientProperty("Quaqua.ToolBar.style", "title");
        statusBar.setFloatable(false);

        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.setBorder(new EmptyBorder(3, 5, 2, 12));
        statusBar.add(p);
        
//        statusLabel.setOpaque(false);
//        statusLabel.setBorder(new EmptyBorder(15, 15, 15, 15));
//        statusLabel.setText("A status bar");
        p.add(statusLabel, BorderLayout.CENTER);
        
        Timer t = new Timer();
        t.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				statusLabel.setText(statusLabel.getText() + "A");
			}
		}, 0, 2000);

        add(statusBar, java.awt.BorderLayout.SOUTH);

        toolBarPanel.setLayout(new java.awt.BorderLayout());

        toolBar.setName("ToolBar with Title"); // NOI18N

        folderButton.setIcon(UIManager.getIcon("FileView.directoryIcon"));
        folderButton.setText("Folder");
        folderButton.setFocusable(false);
        folderButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        folderButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(folderButton);

        fileButton.setIcon(UIManager.getIcon("FileView.fileIcon"));
        fileButton.setText("File");
        fileButton.setFocusable(false);
        fileButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fileButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(fileButton);

        toolBarPanel.add(toolBar, java.awt.BorderLayout.NORTH);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        unifiedToolBarBox.setText("Title tool bar");
        unifiedToolBarBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unifiedToolBarPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel2.add(unifiedToolBarBox, gridBagConstraints);

        titleStyleGroup.add(plainTitleRadio);
        plainTitleRadio.setSelected(true);
        plainTitleRadio.setText("'plain' style");
        plainTitleRadio.setActionCommand("plain");
        plainTitleRadio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                titleStyleChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanel2.add(plainTitleRadio, gridBagConstraints);

        titleStyleGroup.add(unifiedTitleRadio);
        unifiedTitleRadio.setText("unified 'title' style");
        unifiedTitleRadio.setActionCommand("title");
        unifiedTitleRadio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                titleStyleChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanel2.add(unifiedTitleRadio, gridBagConstraints);

        titleStyleGroup.add(gradientTitleRadio);
        gradientTitleRadio.setText("'gradient' style");
        gradientTitleRadio.setActionCommand("gradient");
        gradientTitleRadio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                titleStyleChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanel2.add(gradientTitleRadio, gridBagConstraints);

        unifiedStatusBarBox.setText("Bottom tool bar");
        unifiedStatusBarBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unifiedStatusBarPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 0, 0);
        jPanel2.add(unifiedStatusBarBox, gridBagConstraints);

        bottomStyleGroup.add(plainBottomRadio);
        plainBottomRadio.setSelected(true);
        plainBottomRadio.setText("'plain' style");
        plainBottomRadio.setActionCommand("plain");
        plainBottomRadio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                bottomStyleChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanel2.add(plainBottomRadio, gridBagConstraints);

        bottomStyleGroup.add(unifiedBottomRadio);
        unifiedBottomRadio.setText("unified 'bottom' style");
        unifiedBottomRadio.setActionCommand("bottom");
        unifiedBottomRadio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                bottomStyleChanged(evt);
                statusLabel.setText(statusLabel.getText() + "A");
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanel2.add(unifiedBottomRadio, gridBagConstraints);

        bottomStyleGroup.add(gradientBottomRadio);
        gradientBottomRadio.setText("'gradient' style");
        gradientBottomRadio.setActionCommand("gradient");
        gradientBottomRadio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                bottomStyleChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanel2.add(gradientBottomRadio, gridBagConstraints);

        toolBarPanel.add(jPanel2, java.awt.BorderLayout.CENTER);

        add(toolBarPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void unifiedToolBarPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unifiedToolBarPerformed
        JRootPane rp = SwingUtilities.getRootPane(this);
        JPanel cp = (JPanel) rp.getContentPane();
        
        boolean isUnified=unifiedTitleRadio.isSelected();
        
        if (unifiedToolBarBox.isSelected()) {
            toolBar.setOrientation(JToolBar.HORIZONTAL);
            cp.add(toolBar, BorderLayout.NORTH);
            unifiedToolBar = toolBar;
            toolBar.setFloatable(false);
        } else {
            toolBar.setOrientation(JToolBar.HORIZONTAL);
            toolBarPanel.add(toolBar, BorderLayout.NORTH);
            toolBar.setFloatable(true);
            unifiedToolBar = null;
        }
        cp.revalidate();
        
       Boolean currentUnified=(Boolean) rp.getClientProperty("apple.awt.brushMetalLook");
       if (currentUnified==null)currentUnified=false;
        if (currentUnified!=isUnified) {
        
        rp.putClientProperty("apple.awt.brushMetalLook",//
                isUnified);
        Window f = (Window) rp.getParent();
        f.dispose();
        f.setVisible(true);
        }
       
    }//GEN-LAST:event_unifiedToolBarPerformed

    private void unifiedStatusBarPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unifiedStatusBarPerformed
        JRootPane rp = SwingUtilities.getRootPane(this);
        JPanel cp = (JPanel) rp.getContentPane();
        if (unifiedStatusBarBox.isSelected()) {
            cp.add(statusBar, BorderLayout.SOUTH);
            unifiedStatusBar = statusBar;
        } else {
            add(statusBar, BorderLayout.SOUTH);
            unifiedStatusBar = null;
        }

        cp.revalidate();
        rp.putClientProperty("apple.awt.brushMetalLook",//
                unifiedToolBarBox.isSelected() /*|| unifiedStatusBarBox.isSelected()*/);
        Window f = (Window) rp.getParent();
        f.dispose();
        f.setVisible(true);

    }//GEN-LAST:event_unifiedStatusBarPerformed

    private void titleStyleChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_titleStyleChanged
      toolBar.putClientProperty("Quaqua.ToolBar.style", titleStyleGroup.getSelection().getActionCommand());
      unifiedToolBarPerformed(null);
toolBar.revalidate();
toolBar.repaint();
    }//GEN-LAST:event_titleStyleChanged

    private void bottomStyleChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_bottomStyleChanged
     statusBar.putClientProperty("Quaqua.ToolBar.style", bottomStyleGroup.getSelection().getActionCommand());
statusBar.revalidate();
statusBar.repaint();
    }//GEN-LAST:event_bottomStyleChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bottomStyleGroup;
    private javax.swing.JButton fileButton;
    private javax.swing.JButton folderButton;
    private javax.swing.JRadioButton gradientBottomRadio;
    private javax.swing.JRadioButton gradientTitleRadio;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton plainBottomRadio;
    private javax.swing.JRadioButton plainTitleRadio;
    private javax.swing.JToolBar statusBar;
    private javax.swing.JLabel statusLabel;
    private javax.swing.ButtonGroup titleStyleGroup;
    private javax.swing.JToolBar toolBar;
    private javax.swing.JPanel toolBarPanel;
    private javax.swing.JRadioButton unifiedBottomRadio;
    private javax.swing.JCheckBox unifiedStatusBarBox;
    private javax.swing.JRadioButton unifiedTitleRadio;
    private javax.swing.JCheckBox unifiedToolBarBox;
    // End of variables declaration//GEN-END:variables
    
    private static class StatusPanelLabel extends JLabel {

        private boolean validateRoot;
        
        private boolean etched;
        
        private boolean lozenge;
        
        public StatusPanelLabel(String label) {
            this(label, false);
        }

        public StatusPanelLabel(String label, boolean validateRoot) {
            super(label);
            this.validateRoot = validateRoot;
            setOpaque(false);
            setText(label);
        }

		public void setEtched(boolean etched) {
			this.lozenge = etched;
		}

		@Override
		public void paint(Graphics g) {
			if (false && lozenge) {
				Graphics2D gg = (Graphics2D) g.create();
				gg.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
				gg.setColor(UIManager.getColor("Panel.background"));
				gg.fillRoundRect(0, 0, getWidth() - 4, getHeight(), getHeight(), getHeight());
                                gg.dispose();
			}
			
			super.paint(g);
		}

		@Override
		public void setText(String text) {
                  
			if (text == null || text.length() == 0) {
				setBorder(null);
			} else if (etched) {
				setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 4), 
						new CompoundBorder(new EtchedBorder(EtchedBorder.LOWERED), new EmptyBorder(0, 4, 0, 4))));
			} else if (lozenge) {
				setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 4), new EmptyBorder(2, 8, 2, 7)));
			} else {
				setBorder(new EmptyBorder(0, 0, 0, 4));
			}
			super.setText(text);
		}

		@Override
		public void setFont(Font font) {
            if (font instanceof FontUIResource) {
                super.setFont(new FontUIResource("SansSerif", Font.PLAIN, (int) Math.round(font.getSize2D() * 0.83)));
            } else {
                super.setFont(font);
            }
        }

        /**
         * Override validate root so that when this label changes the
         * revalidation doesn't effect components higher up the tree.
         */
        @Override
		public boolean isValidateRoot() {
            if (validateRoot) {
                return true;
            } else {
                return super.isValidateRoot();
            }
        }

    }
}