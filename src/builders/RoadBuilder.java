/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package builders;

import collections.Roads;
import collections.Tiles;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.image.BufferedImage;
import objects.Road;
import objects.Tile;
import resources.resourceLoader;

/**
 *
 * @author root
 */
public class RoadBuilder extends Builder {
    //ROAD ON GROUND = SPECIAL CASE:don't get painted on the floor, but replaces the floor(not that it matters)
    Tiles floor;
    Roads AllRoads;
    Polygon frame;
    BufferedImage closebtn;
     int[] xPoints;
     int[] yPoints;

    public RoadBuilder(Tiles floor,Roads roads){
         this.floor = floor;
         this.AllRoads = roads;
         
 
         
         int[] x = {50,300,300,50};
         int[] y ={50,50,500,500};
         
         xPoints = x;
         yPoints = y;
                 

        frame = new Polygon(xPoints, yPoints, xPoints.length);
        closebtn = resourceLoader.getCloseButton();
       
         
        
    }
    
    public void draw(Graphics g){
        g.setColor(Color.GRAY);
        g.fillPolygon(frame);
         g.drawPolygon(frame);
         g.drawImage(closebtn, xPoints[1]-40,yPoints[1] +10 , null);
        
    }
    
    public boolean isClosed(int x, int y){
        boolean isClosed = false;
        int[] closeX = {xPoints[1]-40,xPoints[1]-15,xPoints[1]-40,xPoints[1]-15};//close button = 25,(40-25 = 15)
        int[] closeY = {yPoints[1] +10,yPoints[1] +10,yPoints[1] + 35,yPoints[1] +35};
        
       Polygon CloseBtn = new Polygon(closeX,closeY, closeX.length);
       if (CloseBtn.contains(x,y)){
           isClosed = true;
       }
       return isClosed;
    }
   
     public Road buildPavement(int x, int y)
    {
               Road r= new Road(x,y);
               
               
            return r;   
               
           }
     private void checkConnected(){
         
         
         
     }
       }
    
     
     
     
    
    
    

