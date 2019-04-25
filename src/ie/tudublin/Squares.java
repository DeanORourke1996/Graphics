package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class Squares extends InterfaceObject {

    private PApplet ui;
    private PVector size;
    private float s = 0.9f;
    private final float dS = 0.115f;

    public Squares(PApplet _ui, PVector _pos, PVector _size) {
        super(_ui, _pos);
        this.ui = _ui;
        this.size = _size;
    }

    public void update() {
        if(s < 1 && s >= 0) {
            s -= dS;
        }
    }

    public void render() {
        ui.smooth();
        ui.noFill();
        ui.stroke(0, 202, 47);
        ui.strokeWeight(1.5f);
        ui.rectMode(CENTER);
        ui.pushMatrix();
        ui.translate(ui.width / 2, ui.height / 2 - 20);
        ui.scale(s);
        ui.rect(0, 0, size.x, size.y);
        ui.popMatrix();
    }
}
