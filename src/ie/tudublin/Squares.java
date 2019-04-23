package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class Squares extends InterfaceObject {

    PApplet ui;

    public Squares(PApplet _ui, PVector _pos, PVector _size) {
        super(_ui, _pos);

    }

    public void update() {
        float r = 1;
    }

    public void render() {
        ui.smooth();
        ui.stroke(0, 202, 47);
        ui.rectMode(CORNER);
        ui.rect(width - 50, (float)(height/2)-50, 40, 40);
    }
}
