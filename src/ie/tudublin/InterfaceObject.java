package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

// abstract class here...
public abstract class InterfaceObject extends PApplet {
    private PVector position;
    private PVector size; // w - h
    private PVector speed;
    private PVector acceleration;

    public InterfaceObject(UI ui, PVector _size, PVector _pos, PVector _speed, PVector _acceleration){
        position = _pos;
        size = _size;
        speed = _speed;
        acceleration = _acceleration;
    }

    // abstract methods
    public abstract void update();
    public abstract void render();
}
