package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

import java.util.ArrayList;

public class UI extends PApplet {
    MovingCircle mc;
    HeadingTabs[] headings = new HeadingTabs[3];

    float diameter = 50;
    boolean[] keys = new boolean[1024];

    public void keyPressed()
    {
        keys[keyCode] = true;
    }

    public void keyReleased()
    {
        keys[keyCode] = true;
    }

    public boolean checkKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }


    public void settings()
    {
        size(800, 500);
    }

    public void setup() {
        PVector headPos = new PVector(0, 100);
        PVector headSize = new PVector(250, 100);

        for(int i=0; i<2; i++){
            headings[i] = new HeadingTabs(this, headPos, headSize);
        }

        headings[2] = new HeadingTabs(this, headPos, headSize);

    }

    public void draw()
    {

    }
}


