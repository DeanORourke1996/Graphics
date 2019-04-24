package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class Squares extends InterfaceObject {

    PApplet ui;
    PVector size;
    private float s = 1;

    public Squares(PApplet _ui, PVector _pos, PVector _size) {
        super(_ui, _pos);
        this.ui = _ui;
        this.size = _size;
    }

    public void update() {
        if(s != 1) {
            s -= 0.1f;
        }
    }

    public void render() {
        ui.pushMatrix();
        ui.smooth();
        ui.noFill();
        ui.stroke(0, 202, 47);
        ui.strokeWeight(1.5f);
        ui.rectMode(CENTER);
        ui.scale(s);
        ui.rect(ui.width/2, ui.height/2 - 20, size.x, size.y);
        ui.popMatrix();

        --s;
    }
}
