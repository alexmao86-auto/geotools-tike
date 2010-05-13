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
import org.geotools.gui.swing.style.StyleElementEditor;
import org.geotools.map.MapLayer;
import org.geotools.styling.ShadedRelief;
import org.geotools.styling.ShadedReliefImpl;

/**
 * ShadedRelief panel
 * 
 * @author  Johann Sorel
 *
 * @source $URL$
 */
public class JShadedReliefPane extends javax.swing.JPanel implements StyleElementEditor<ShadedRelief>{

    private MapLayer layer = null;
    private ShadedRelief relief = null;

    /** 
     * Creates new form JFillPanel 
     */
    public JShadedReliefPane() {
        initComponents();
    }

    public void setLayer(MapLayer layer) {
        this.layer = layer;
        guiFactor.setLayer(layer);
    }

    public MapLayer getLayer(){
        return layer;
    }
    
    public void setEdited(ShadedRelief relief) {
        this.relief = relief;
        if (relief != null) {
            guiFactor.setExpression(relief.getReliefFactor());
            guiBrightness.setSelected(relief.isBrightnessOnly());
        }
    }

    public ShadedRelief getEdited() {

        if (relief == null) {
            relief = new ShadedReliefImpl();
        }

        apply();
        return relief;
    }

    public void apply() {
        if (relief != null) {
            relief.setBrightnessOnly(guiBrightness.isSelected());
            relief.setReliefFactor(guiFactor.getExpression());
        }
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

        guiFactor = new org.geotools.gui.swing.style.sld.JExpressionPane();
        jLabel1 = new javax.swing.JLabel();
        guiBrightness = new javax.swing.JCheckBox();

        setOpaque(false);

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("org/geotools/gui/swing/style/sld/Bundle"); // NOI18N
        jLabel1.setText(bundle.getString("factor")); // NOI18N

        guiBrightness.setText(bundle.getString("brightnessonly")); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(guiFactor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(guiBrightness)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, guiFactor, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(guiBrightness))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox guiBrightness;
    private org.geotools.gui.swing.style.sld.JExpressionPane guiFactor;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}