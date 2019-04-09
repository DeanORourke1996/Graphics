package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

// abstract class here...
public abstract class InterfaceObject extends PApplet {
    PVector position;
    PVector size; // w - h
    PVector speed;
    PVector acceleration;

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
