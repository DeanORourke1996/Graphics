package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;
import java.util.Date;

public class UI extends PApplet {
    private static final int WIDTH = 800;
    private float halfWidth = WIDTH / 2;

    MovingCircle[] movingCircle;
    private HeadingTabs headR, headL, headCenter;

    float diameter = 50;
    private boolean[] keys = new boolean[1024];

    public void keyPressed()
    {
        keys[keyCode] = true;
    }

    public void keyReleased()
    {
        keys[keyCode] = true;
    }

    public boolean checkKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }

    private void drawTabs() {
        int margin = 140;
        rectMode(CENTER);
        PVector size = new PVector(WIDTH, 150);
        PVector pos = new PVector((width/2) , 0);
        headCenter = new HeadingTabs(this, pos, size);

        size = new PVector(200, 150);
        pos = new PVector((headCenter.pos.x - halfWidth - margin), 0);
        headL = new HeadingTabs(this, pos, size);

        size = new PVector(200, 150);
        pos = new PVector((headCenter.pos.x + halfWidth + margin) , 0);
        headR = new HeadingTabs(this, pos, size);
    }

    private void drawGrid() {
        int offset = 40;
        fill(0);
        stroke(32, 241, 238);
        rectMode(CORNER);
        // 55 percent height of page with tabs...
        rect((float)(width / 2) - halfWidth, headCenter.size.y + offset, WIDTH, (float)(height * 0.55));
        rectMode(CENTER);
    }


    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(0);
        drawTabs();
        drawGrid();
    }

    public void draw() {
        headCenter.render();
        headL.render();
        headR.render();
    }
}


