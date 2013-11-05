/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.image.BufferedImage;
import resources.resourceLoader;

/**
 *
 * @author root
 */
public class Road {
    BufferedImage roadImage;
    int roadX;
    int roadY;
   Polygon TilePolygon;
   
        boolean connectedNorth;
        boolean connectedSouth;
        boolean connectedEast;
        boolean connectedWest;
        
    public Road(int x, int y){
        roadImage = resourceLoader.getPavementTile(2, 0, 64, 32);
        
        connectedNorth = false;
        connectedSouth = false;
        connectedEast = false;
        connectedWest = false;
        
        roadX = x;
        roadY = y;
        
        int[] xPoints ={roadX- 32,roadX - 1, roadX, roadX + 31, roadX + 31, roadX, roadX - 1, roadX - 32};
        int[] yPoints ={roadY - 1, roadY - 16, roadY - 16, roadY - 1, roadY, roadY + 15, roadY + 15,roadY};

        
        TilePolygon = new Polygon(xPoints, yPoints, 8); 
        
    };

    public BufferedImage getRoadImage() {
        return roadImage;
    }

    public void setRoadImage(BufferedImage roadImage) {
        this.roadImage = roadImage;
    }

    public int getRoadX() {
        return roadX;
    }

    public void setRoadX(int roadX) {
        this.roadX = roadX;
    }

    public int getRoadY() {
        return roadY;
    }

    public void setRoadY(int roadY) {
        this.roadY = roadY;
    }

    public Polygon getTilePolygon() {
        return TilePolygon;
    }

    public void setTilePolygon(Polygon TilePolygon) {
        this.TilePolygon = TilePolygon;
    }

    public boolean isConnectedNorth() {
        return connectedNorth;
    }

    public void setConnectedNorth(boolean connectedNorth) {
        this.connectedNorth = connectedNorth;
    }

    public boolean isConnectedSouth() {
        return connectedSouth;
    }

    public void setConnectedSouth(boolean connectedSouth) {
        this.connectedSouth = connectedSouth;
    }

    public boolean isConnectedEast() {
        return connectedEast;
    }

    public void setConnectedEast(boolean connectedEast) {
        this.connectedEast = connectedEast;
    }

    public boolean isConnectedWest() {
        return connectedWest;
    }

    public void setConnectedWest(boolean connectedWest) {
        this.connectedWest = connectedWest;
    }

   
    public void draw(Graphics g){
        g.drawImage(roadImage, roadX, roadY, null);
    } 
        public void Select(Graphics g){
        g.setColor(Color.YELLOW);
        g.drawPolygon(TilePolygon);
    }
        public boolean IsinTile(int x, int y){
        boolean isInTile = false;
           if( TilePolygon.contains(x, y)){
               isInTile = true; 
        }
          
           return isInTile;
    }
    private void ChooseImage(){
        
        
    }
    }
    

