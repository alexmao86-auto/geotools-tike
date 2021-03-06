/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 * 
 *    (C) 2006-2008, Open Source Geospatial Foundation (OSGeo)
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
package org.geotools.gui.swing.map.map2d.stream.handler;

import org.geotools.gui.swing.map.map2d.decoration.*;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

import org.geotools.gui.swing.map.map2d.Map2D;

/**
 * Zoom pan decoration
 * 
 * @author Johann Sorel
 *
 * @source $URL$
 */
public class ZoomPanDecoration extends JComponent implements MapDecoration{

    private final Color borderColor = new Color(0,0,255);
    private final Color fillColor = new Color(0,0,255,60);
    
    private int startx =0;
    private int starty =0;
    private int width = 0;
    private int height = 0;
    private boolean draw = false;
    private boolean fill = false;
    
    public ZoomPanDecoration(){}
    
    public void setFill(boolean fill){
        this.fill = fill;
    }
    
    
    public void setCoord(int sx, int sy, int ex, int ey, boolean draw){
        startx = sx;
        starty = sy;
        width = ex;
        height = ey;
        this.draw = draw;
        repaint();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        if(draw){
                        
            if(fill){
                g.setColor(fillColor);
                g.fillRect(startx, starty, width, height);
            }
            
            g.setColor(borderColor);
            g.drawRect(startx, starty, width, height);
            }
    }

    public void refresh() {
        repaint();
    }

    public JComponent geComponent() {
        return this;
    }

    public void setMap2D(Map2D map) {
        
    }

    public Map2D getMap2D() {
        return null;
    }

    public void dispose() {
    }
}
