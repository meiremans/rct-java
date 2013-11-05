/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package world;

import builders.RoadBuilder;
import collections.Menu;
import collections.Roads;
import collections.Tiles;
import java.awt.Graphics;
import java.awt.Point;
import java.io.IOException;
import objects.Road;
import objects.Tile;
import resources.resourceLoader;

/**
 *
 * @author root
 */
public class World {
    Tiles floor;
    Point mouse;
    Roads AllRoads;
    Menu menu;
    RoadBuilder Roadbuilder;
    public World() throws IOException{
     mouse = new Point(0,0);
             resourceLoader loader = new resourceLoader(); 
             loader.loadImage();
              menu = new Menu();
              AllRoads = new Roads();
               floor = new Tiles(30,30); 
    }
    
     public void draw(Graphics g){
         //Order in whitch they are drawn is important
         
         floor.draw(g,mouse.x,mouse.y);
         AllRoads.draw(g);
         floor.Highlight(g, mouse.x, mouse.y);
          menu.draw(g,mouse.x,mouse.y);
          
           if(Roadbuilder!= null){
          Roadbuilder.draw(g);
          }
        }
     public void mouseMoved(int x,int y){
        mouse = new Point(x, y);
     }
    public void onClick(int x,int y){
        mouse = new Point(x, y);
        
        
        if(menu.isClicked(x, y)){
           Roadbuilder = new RoadBuilder(floor, AllRoads);
        }
        if(Roadbuilder!= null){
        if(Roadbuilder.isClosed(x, y)){
            Roadbuilder = null;
            return;
        }
        
        for (Tile t : floor.getFloor()) {
            
            if (t.IsinTile(x, y)) {
        Road r =  Roadbuilder.buildPavement(t.getTileX()-32, t.getTileY()-16);//steal the x&y from the matching tile, i don't have a clue why it needs to be -32 and -16, but he will take the wrong tile if you don't
        AllRoads.addRoad(r);
            
        }
        
     }
        }
    }
     }

