package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class HeadingTabs extends InterfaceObject {
    // fields
    private PApplet ui;
    private PVector size;

    public HeadingTabs(PApplet _ui, PVector _pos, PVector _size){
        super(_ui, _pos);
        this.ui = _ui;
        size = _size;
    }

    public float createGap(float space){
        float offset = (width - (this.pos.x + this.size.x));
    }

    public void render() {
        ui.fill(32, 241, 238);
        ui.rect(pos.x, pos.y, size.x, size.y);
    }

    public void update() {
        float space = ((float)width / 3);
        createGap(space);
    }
}
