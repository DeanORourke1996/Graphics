package ie.dit;

import processing.core.PApplet;

public class DummyTest extends PApplet {

    public void settings(){
        size(600, 400);
    }

    public void draw(){
        float col = map(mouseX, 0, 600, 0, 255);
        background(col);
        // ellipse
        fill(250, 118, 222);
        ellipse(mouseX, 200, 64, 64);
    }
}
