package ie.tudublin;

import processing.core.PApplet;

public class MovingCircle extends InterfaceObject {
    private float dx;
    private float diameter;
    private float radius;
    PApplet ui;

    public MovingCircle(UI ui, float _dx, float _diameter, float _radius) {
        super(ui, null, null, null, null);
        this.dx = _dx;
        this.diameter = _diameter;
        this.radius = _radius;
    }

    public void render() {
        ui.stroke(255);
        ui.noFill();
        ui.ellipse(position.x, position.y, diameter, diameter);
        ui.fill(255);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.text("I am a moving circle", position.x, position.y);

    }

    public void update() {
        position.x += dx;
        if ((position.x > ui.width - radius) || (position.x < radius))
        {
            dx *= -1;
        }
    }
}

