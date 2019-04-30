package ie.tudublin;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PVector;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UI extends PApplet {
    private static final String DATE_FORMATTER = "HH:mm";
    private static final int INIT_RECT_WIDTH = 400;
    private static final int INIT_RECT_HEIGHT = 200;
    private static final int C_WIDTH = 800;
    private static final int LR_WIDTH = 200;
    private static final int A_HEIGHT = 150;
    private float halfWidth = C_WIDTH / 2;
    private boolean[] keys = new boolean[1024];
    private PVector rectSize = new PVector(INIT_RECT_WIDTH, INIT_RECT_HEIGHT);
    private final PVector rectPos = new PVector(width/2, height/2);

    private LocalDateTime localDateTime = LocalDateTime.now();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMATTER);
    private String formatTime = localDateTime.format(formatter);

    private Squares squares;
    private HeadingTabs headR, headL, headCenter;

    private PFont f;

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
        PVector size = new PVector(C_WIDTH, A_HEIGHT);
        PVector pos = new PVector((float)(width/2) , 0);
        headCenter = new HeadingTabs(this, pos, size);

        size = new PVector(LR_WIDTH, A_HEIGHT);
        pos = new PVector((headCenter.pos.x - halfWidth - margin), 0);
        headL = new HeadingTabs(this, pos, size);

        size = new PVector(LR_WIDTH, A_HEIGHT);
        pos = new PVector((headCenter.pos.x + halfWidth + margin) , 0);
        headR = new HeadingTabs(this, pos, size);


    }

    private void drawGrid() {
        int offset = 100;
        fill(0);
        stroke(32, 241, 238);
        rectMode(CORNER);
        // 55 percent height of page with tabs...
        rect((float)(width / 2) - halfWidth, headCenter.size.y, C_WIDTH, (float)(height * 0.55));
        rectMode(CENTER);


        line(headL.pos.x + (headL.size.x/2), headL.pos.y + offset, headL.pos.x + (headL.size.x/2), (float)(height * 0.80));
        line(headR.pos.x - (headR.size.x/2), headR.pos.y + offset, headR.pos.x - (headR.size.x/2), (float)(height * 0.80));
    }

    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(0);
        frameRate(60);
        f = createFont("Arial", 16, true);
        squares = new Squares(this, rectPos, rectSize);

    }

    private float s = 0.9f;
    private final float dS = 0.115f;
    private float theta = 0;

    public void draw() {
        int offsetX = 5;
        int offsetY = 85;

        drawTabs();
        drawGrid();

        headCenter.render();
        headL.render();
        headR.render();

        textFont(f, 20);
        fill(50);
        text(formatTime, headR.pos.x - (float)LR_WIDTH/2 + offsetX, A_HEIGHT - offsetY);
        text("COV 274207281 - 1", headCenter.pos.x - (float)(C_WIDTH / 2) + offsetX, A_HEIGHT - offsetY);
        text("L - 542", headL.pos.x - (float)(LR_WIDTH/2) + offsetX, A_HEIGHT - offsetY);


//        smooth();
//        noFill();
//        stroke(0, 202, 47);
//        strokeWeight(1.5f);
//        rectMode(CENTER);
//        pushMatrix();
//        translate(width / 2, height / 2 - 20);
//        rotate(radians(theta));
//        for(float i = s; i >= 0.4; i -= dS) {
//            scale(i);
//            rect(0, 0, rectSize.x, rectSize.y);
//        }
//        popMatrix();
//
//        theta += 0.5f;
        squares.render();
    }
}


