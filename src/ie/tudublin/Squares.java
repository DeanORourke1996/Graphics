package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class Squares extends InterfaceObject {

    PApplet ui;

    public Squares(PApplet _ui) {
        super(_ui, null);
        this.ui = _ui;
    }

    public void update() {

    }

    public void render() {
        //ui.smooth();
        ui.noFill();
        ui.stroke(0, 202, 47);
        ui.rectMode(CENTER);
        ui.rect(ui.width/2, ui.height/2 - 20, 300, 300);
    }
}
