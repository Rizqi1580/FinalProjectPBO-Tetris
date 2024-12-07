package mino;

import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics2D;

public class Block extends Rectangle{
    public int x, y;
    public static final int SIZE = 30;
    public Color c;
    
    public Block(Color c){
        this.c = c;
    }
    
    public void draw(Graphics2D g2){
        int margins = 2;
        g2.setColor(c);
        g2.fillRect(x + margins, y + margins, SIZE - (margins * 2), SIZE - (margins * 2));
    }
}