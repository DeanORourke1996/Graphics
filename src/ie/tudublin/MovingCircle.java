package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class MovingCircle extends InterfaceObject {
    // fields
    private float dx = 1;
    private float diameter;
    private float radius;

    private PApplet ui;

    public MovingCircle(PApplet _ui, PVector _pos, float _diameter) {
        super(_ui, _pos);
        this.ui = _ui;
        this.diameter = _diameter;
        radius = diameter / 2;
    }

    public void render() {
        ui.stroke(255);
        ui.noFill();
        ui.ellipse(pos.x, pos.y, diameter, diameter);
        ui.fill(255);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.text("I am a moving circle", pos.x, pos.y);
    }

    public void update() {
        pos.x += dx;
        if ((pos.x > ui.width - radius) || (pos.x < radius)) {
            dx *= -1;
        }
    }
}

