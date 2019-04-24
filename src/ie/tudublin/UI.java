package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;
import java.util.Date;

public class UI extends PApplet {
    private static final int INIT_RECT_WIDTH = 420;
    private static final int INIT_RECT_HEIGHT = 270;
    private static final int WIDTH = 800;
    private float halfWidth = WIDTH / 2;
    private boolean[] keys = new boolean[1024];
    private PVector rectSize = new PVector(INIT_RECT_WIDTH, INIT_RECT_HEIGHT);
    private final PVector rectPos = new PVector(width/2, height/2);

    private Squares squares;
    private HeadingTabs headR, headL, headCenter;

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
        PVector pos = new PVector((float)(width/2) , 0);
        headCenter = new HeadingTabs(this, pos, size);

        size = new PVector(200, 150);
        pos = new PVector((headCenter.pos.x - halfWidth - margin), 0);
        headL = new HeadingTabs(this, pos, size);

        size = new PVector(200, 150);
        pos = new PVector((headCenter.pos.x + halfWidth + margin) , 0);
        headR = new HeadingTabs(this, pos, size);
    }

    private void drawGrid() {
        int offset = 100;
        fill(0);
        stroke(32, 241, 238);
        rectMode(CORNER);
        // 55 percent height of page with tabs...
        rect((float)(width / 2) - halfWidth, headCenter.size.y, WIDTH, (float)(height * 0.55));
        rectMode(CENTER);

//        line(headL.pos.x + (headL.size.x/2) - 50, headL.pos.y + offset, headL.pos.x + (headL.size.x/2) - 20, (float)(height * 0.55));
//        line(headR.pos.x - (headR.size.x/2) + 50, headR.pos.y + offset, headR.pos.x - (headR.size.x/2) + 20, (float)(height * 0.55));
    }

    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(0);

        squares = new Squares(this, rectPos, rectSize);

        drawTabs();
        drawGrid();
    }

    public void draw() {
        headCenter.render();
        headL.render();
        headR.render();

        squares.render();
        squares.update();
    }
}


