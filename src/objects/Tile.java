/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.awt.Color;
import java.awt.Graphics;

import java.awt.Polygon;
import java.awt.image.BufferedImage;

/**
 *
 * @author root
 */
public class Tile {

    BufferedImage TilePic;
    int tileX;
    int tileY;
    Polygon TilePolygon;
 

    public BufferedImage getTilePic() {
        return TilePic;
    }

    public void setTilePic(BufferedImage TilePic) {
        this.TilePic = TilePic;
    }

    public int getTileX() {
        return tileX;
    }

    public void setTileX(int tileX) {
        this.tileX = tileX;
    }

    public int getTileY() {
        return tileY;
    }

    public void setTileY(int tileY) {
        this.tileY = tileY;
    }

    public Tile(int x, int y) {
        tileX = x;
        tileY = y;
        int[] xPoints = {tileX - 32, tileX - 1, tileX, tileX + 31, tileX + 31, tileX, tileX - 1, tileX - 32};
        int[] yPoints = {tileY - 1, tileY - 16, tileY - 16, tileY - 1, tileY, tileY + 15, tileY + 15, tileY};

        TilePolygon = new Polygon(xPoints, yPoints, 8);
  



    }

    
    
    public void Select(Graphics g) {
        g.setColor(Color.YELLOW);
        g.drawPolygon(TilePolygon);
    }

    public boolean IsinTile(int x, int y) {
        boolean isInTile = false;
        if (TilePolygon.contains(x, y)) {
            isInTile = true;
        }
        return isInTile;
    }
}
