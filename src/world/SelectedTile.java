/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package world;

import java.awt.Graphics;
import java.awt.Polygon;

/**
 *
 * @author root
 */
public class SelectedTile {
    Polygon TilePolygon;
    public SelectedTile(int tileX,int tileY){
      int[] xPoints ={tileX- 32,tileX - 1, tileX, tileX + 31, tileX + 31, tileX, tileX - 1, tileX - 32};
        int[] yPoints ={tileY - 1, tileY - 16, tileY - 16, tileY - 1, tileY, tileY + 15, tileY + 15,tileY};

        TilePolygon = new Polygon(xPoints, yPoints, 8); 
    }
    public void draw(Graphics g){
      g.drawPolygon(TilePolygon);
    }
    
}
