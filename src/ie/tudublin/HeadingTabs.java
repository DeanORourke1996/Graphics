package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class HeadingTabs extends InterfaceObject {

    public HeadingTabs(PApplet _ui, PVector _pos){
        super(_ui, _pos);
    }

    public void render() {
        fill(32, 241, 238);
        rect(20, 20, 20, 20);
    }

    public void update() {

    }
}
