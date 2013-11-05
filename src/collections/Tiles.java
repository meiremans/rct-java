/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import objects.Tile;
import resources.resourceLoader;

/**
 *
 * @author root
 */
public class Tiles {

    BufferedImage StraightTile;
    int tileCountX;
    int TileCountY;
    ArrayList<Tile> floor = new ArrayList<>();

    public Tiles(int x, int y) {

        StraightTile = resourceLoader.getTile(0, 0, 64, 32);
        tileCountX = x;//numbers of tile on X-Axis
        TileCountY = y;//numbers of tile on Y-Axis
        CreateFloor();

    }

    public ArrayList<Tile> getFloor() {
        return floor;
    }

    private void CreateFloor() {
        //first loop for 1 part of the "chessboard"
        for (int i = 1; i < tileCountX + 1; i++) {
            for (int j = 1; j < TileCountY + 1; j++) {
                Tile tile = new Tile(i * 64, j * 32);
                tile.setTilePic(StraightTile);

                floor.add(tile);

            }

        }
        //second loop for 2 part of the "chessboard"
        for (int i = 1; i < tileCountX + 1; i++) {
            for (int j = 1; j < TileCountY + 1; j++) {
                Tile tile = new Tile(i * 64 + 32, j * 32 + 16);
                tile.setTilePic(StraightTile);


                floor.add(tile);

            }

        }

    }

    public BufferedImage getStraightTile() {
        return StraightTile;
    }

    public void draw(Graphics g, int x, int y)//x&y from mouse
    {

        for (Tile t : floor) {
            g.drawImage(t.getTilePic(), (t.getTileX()), (t.getTileY()), null);
        }
    }
 public void Highlight(Graphics g, int x, int y)//x&y from mouse
    {
        for (Tile t : floor) {//painting the Highlight needs to occur AFTER Painting the floor
            if (t.IsinTile(x, y)) {
                t.Select(g);
            }

        }
    }
}
