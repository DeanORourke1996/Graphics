package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class UI extends PApplet {
    Button b;
    MovingCircle mc;
    HeadingTabs ht1;

    PApplet pa = new PApplet();
    PVector pos;

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
        mc = new MovingCircle(this, pos, diameter);
        ht1 = new HeadingTabs(pa, pos);
    }

    public void draw()
    {
        background(0);
        //b.render();

        ht1.render();


        mc.update();
        mc.render();
    }
}


