package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class UI extends PApplet {
    MovingCircle[] movingCircle;
    HeadingTabs headR, headL, headCenter;

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


    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(0);
        PVector size = new PVector(100, 100);
        PVector pos = new PVector(10, 0);

        headL = new HeadingTabs(this, pos, )

    }

    public void draw() {

    }
}


