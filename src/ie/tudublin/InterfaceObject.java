package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

// abstract class here...
public abstract class InterfaceObject extends PApplet {
    PVector pos; // x & y
    PApplet ui;

    public InterfaceObject(PApplet ui, PVector _pos){
        pos = _pos;
    }


    // abstract methods
    public abstract void update();
    public abstract void render();
}
