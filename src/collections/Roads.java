/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.awt.Graphics;
import java.util.ArrayList;
import objects.Road;

/**
 *
 * @author root
 */
public class Roads {

    ArrayList<Road> Roads;

    public Roads() {
        Roads = new ArrayList<>();

    }

    public void addRoad(Road road) {
        Roads.add(road);
    }

    public void draw(Graphics g) {
        for (Road r : Roads) {
            checkNeighbours(r);
            r.draw(g);
        }
    }
       
    private void checkNeighbours(Road road){
       int i = 0;
        for (Road r : Roads) {      
                if(r.IsinTile(road.getRoadX() + 32, road.getRoadY())){//a value in the tile on the right
                  r.setConnectedEast(true);
                }
                  if(r.IsinTile(road.getRoadX(), road.getRoadY()-16)){//a value in the tile above
                  r.setConnectedNorth(true);
                }
                    if(r.IsinTile(road.getRoadX() +32, road.getRoadY()-16)){//a value in the tile on the left
                  r.setConnectedWest(true);
                }
                         if(r.IsinTile(road.getRoadX() - 32, road.getRoadY())){//a value in the tile down
                  r.setConnectedSouth(true);
                }
              Roads.remove(i);
              Roads.add(i ,r);
                 i++;   
            }
        }
       
        }
    

