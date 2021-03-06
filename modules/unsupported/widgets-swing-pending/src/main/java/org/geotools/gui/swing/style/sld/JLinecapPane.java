/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 * 
 *    (C) 2002-2008, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */
package org.geotools.gui.swing.style.sld;

import java.awt.Component;
import javax.swing.Icon;
import org.geotools.gui.swing.icon.IconBundle;
import org.geotools.map.MapLayer;
import org.geotools.styling.StyleBuilder;
import org.opengis.filter.expression.Expression;

/**
 * Line cap panel
 * 
 * @author  Johann Sorel
 *
 * @source $URL$
 */
public class JLinecapPane extends javax.swing.JPanel {

    private static final Icon ICON_ROUND = IconBundle.getResource().getIcon("16_linecap_round");
    private static final Icon ICON_SQUARE = IconBundle.getResource().getIcon("16_linecap_square");
    private static final Icon ICON_BUTT = IconBundle.getResource().getIcon("16_linecap_butt");
    private static final Icon ICON_EXP = IconBundle.getResource().getIcon("16_expression");
    
    private Expression exp = null;
    private MapLayer layer = null;

    
    public JLinecapPane() {
        initComponents();

        but_round.setSelected(true);
    }

    public void setLayer(MapLayer layer) {
        this.layer = layer;
    }
    
    public MapLayer getLayer(){
        return layer;
    }

    public void setLineCap(Expression exp) {
        this.exp = exp;
        if (exp != null) {
            if (exp.toString().toLowerCase().equals("butt")) {
                but_butt.setContentAreaFilled(true);
                but_round.setContentAreaFilled(false);
                but_square.setContentAreaFilled(false);
                but_butt.setSelected(true);
            } else if (exp.toString().toLowerCase().equals("square")) {
                but_butt.setContentAreaFilled(false);
                but_round.setContentAreaFilled(false);
                but_square.setContentAreaFilled(true);
                but_square.setSelected(true);
            } else if (exp.toString().toLowerCase().equals("round")) {
                but_butt.setContentAreaFilled(false);
                but_round.setContentAreaFilled(true);
                but_square.setContentAreaFilled(false);
                but_round.setSelected(true);
            }
        } else {
            but_butt.setContentAreaFilled(false);
            but_round.setContentAreaFilled(false);
            but_square.setContentAreaFilled(false);
        }
    }

    public Expression getLineCap() {

        if (exp == null) {
            exp = new StyleBuilder().literalExpression("round");
        }
        
        apply();
        return exp;
    }
    
    public void apply(){        
    }
    
    public Component getComponent(){
        return this;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        but_round = new javax.swing.JToggleButton();
        but_butt = new javax.swing.JToggleButton();
        but_square = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();

        setOpaque(false);

        buttonGroup1.add(but_round);
        but_round.setIcon(ICON_ROUND);
        but_round.setBorderPainted(false);
        but_round.setContentAreaFilled(false);
        but_round.setIconTextGap(0);
        but_round.setMargin(new java.awt.Insets(2, 2, 2, 2));
        but_round.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_roundActionPerformed(evt);
            }
        });

        buttonGroup1.add(but_butt);
        but_butt.setIcon(ICON_BUTT);
        but_butt.setBorderPainted(false);
        but_butt.setContentAreaFilled(false);
        but_butt.setIconTextGap(0);
        but_butt.setMargin(new java.awt.Insets(2, 2, 2, 2));
        but_butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_buttActionPerformed(evt);
            }
        });

        buttonGroup1.add(but_square);
        but_square.setIcon(ICON_SQUARE);
        but_square.setBorderPainted(false);
        but_square.setContentAreaFilled(false);
        but_square.setIconTextGap(0);
        but_square.setMargin(new java.awt.Insets(2, 2, 2, 2));
        but_square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_squareActionPerformed(evt);
            }
        });

        jButton1.setIcon(ICON_EXP);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1actionDialogLineCap(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(but_round)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(but_butt)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(but_square)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton1))
        );

        layout.linkSize(new java.awt.Component[] {but_butt, but_round, but_square, jButton1}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(but_round, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(but_butt, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(but_square, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jButton1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(new java.awt.Component[] {but_butt, but_round, but_square, jButton1}, org.jdesktop.layout.GroupLayout.VERTICAL);

    }// </editor-fold>//GEN-END:initComponents
    private void but_squareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_squareActionPerformed
        StyleBuilder sb = new StyleBuilder();
        setLineCap( sb.literalExpression("square"));
    }//GEN-LAST:event_but_squareActionPerformed

    private void jButton1actionDialogLineCap(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1actionDialogLineCap
        JExpressionDialog dialog = new JExpressionDialog();

        dialog.setModal(true);
        dialog.setLocationRelativeTo(jButton1);
        dialog.setLayer(layer);
        dialog.setExpression(exp);
        dialog.setVisible(true);

        exp = dialog.getExpression();

        but_butt.setContentAreaFilled(false);
        but_round.setContentAreaFilled(false);
        but_square.setContentAreaFilled(false);

        but_butt.setSelected(false);
        but_round.setSelected(false);
        but_square.setSelected(false);
    }//GEN-LAST:event_jButton1actionDialogLineCap

    private void but_buttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_buttActionPerformed
        StyleBuilder sb = new StyleBuilder();
        setLineCap(sb.literalExpression("butt"));
    }//GEN-LAST:event_but_buttActionPerformed

    private void but_roundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_roundActionPerformed
        StyleBuilder sb = new StyleBuilder();
        setLineCap(sb.literalExpression("round"));
    }//GEN-LAST:event_but_roundActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton but_butt;
    private javax.swing.JToggleButton but_round;
    private javax.swing.JToggleButton but_square;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
