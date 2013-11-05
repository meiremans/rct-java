/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import menu.ItemRoad;
import menu.MenuItem;

/**
 *
 * @author root
 */
public class Menu {
     ArrayList<MenuItem> Menu;
    public Menu(){
        
         Menu = new ArrayList<>();  
         ItemRoad itRoad = new ItemRoad();
         addtomenu(itRoad);//Make the menu here
         
    }
    private void addtomenu(MenuItem mt){
        int number = Menu.size();
        mt.setNumber(number);
        Menu.add(mt);
    }
    
    public boolean isClicked(int x,int y){
        boolean isClicked = false;
        for (MenuItem mt:Menu){
         if(mt.getIconPoly().contains(x,y)){
             mt.onClick();//probly useless, maybe not
             isClicked = true;
         }
        }
        return isClicked;
                
    }
    
    public void draw(Graphics g,int x, int y){
        for (MenuItem mt:Menu){
          g.drawImage(mt.getIcon(), mt.getNumber() * 30, 0, null);
        
        }
          for (MenuItem mt:Menu){
              if(mt.getIconPoly().contains(x, y)){
           g.setColor(Color.YELLOW);
        g.drawPolygon(mt.getIconPoly());
              }
        }
        
    }
 
}
