/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.awt.Polygon;
import java.awt.image.BufferedImage;

/**
 *
 * @author root
 */
public class MenuItem {
    BufferedImage Icon;
    String Name;
    Polygon IconPoly;
    int number;

    public BufferedImage getIcon() {
        return Icon;
    }

    public void setIcon(BufferedImage Icon) {
        this.Icon = Icon;
    }
    
    public void onClick(){
        
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Polygon getIconPoly() {
        return IconPoly;
    }

    public void setIconPoly(Polygon IconPoly) {
        this.IconPoly = IconPoly;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        //now that we have the number we can calculate the polygon.
        
            int[] xPoints =
            {
                number * 30,
                (number + 1) * 30,
                (number + 1) * 30,
                number * 30
            };

            int[] yPoints =
            {
                00,
                00,
                30,
                30
            };
          IconPoly =  new Polygon(xPoints, yPoints, 4);
    }
    
}
