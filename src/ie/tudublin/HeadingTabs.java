package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class HeadingTabs extends InterfaceObject {
    // fields
    private int corners = 12;
    private PApplet ui;
    PVector size;
    private float dx = 1;

    public HeadingTabs(PApplet _ui, PVector _pos, PVector _size){
        super(_ui, _pos);
        this.ui = _ui;
        size = _size;
    }

    public void render() {
        ui.noStroke();
        ui.fill(32, 241, 238);
        ui.rect(pos.x, pos.y, size.x, size.y, 0, 0, corners, corners);
    }

    public void update(int x) {
        
    }
}
