package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class UI extends PApplet {
    Button b;
    MovingCircle mc;
    PApplet pa;
    PVector pos = new PVector(width/2,height/2);
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

    public void setup()
    {
        mc = new MovingCircle(this, pos, diameter);
    }

    public void draw()
    {
        background(0);
        //b.render();

        mc.update();
        mc.render();
    }
}


