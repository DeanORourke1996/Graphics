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

        rectMode(CENTER);
        PVector size = new PVector(150, 150);
        PVector pos = new PVector((float)(width / 4.25) - size.x, 0);
        headL = new HeadingTabs(this, pos, size);

        size = new PVector(800, 150);
        pos = new PVector((width/2) , 0);
        headCenter = new HeadingTabs(this, pos, size);

        size = new PVector(130, 150);
        pos = new PVector(width - (float)(width / 4.25) , 0);
        headR = new HeadingTabs(this, pos, size);

    }

    public void draw() {
        headL.render();
        headCenter.render();
        headR.render();
    }
}


