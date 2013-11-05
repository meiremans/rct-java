/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import builders.RoadBuilder;
import collections.Roads;
import collections.Tiles;
import java.awt.Polygon;
import java.awt.image.BufferedImage;
import resources.resourceLoader;

/**
 *
 * @author root
 */
public class ItemRoad extends MenuItem{
    
    public ItemRoad(){
        super();
        Icon = resourceLoader.getButtonImg(1, 1);
        Name = "Road Builder";
    }

    public BufferedImage getIcon() {
        return Icon;
    }

    public void setIcon(BufferedImage Icon) {
        this.Icon = Icon;
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
    
   
    public void onClick(Tiles floor, Roads roads){
        RoadBuilder rb = new RoadBuilder(floor, roads);
        
        
    }
    
    
    
}
