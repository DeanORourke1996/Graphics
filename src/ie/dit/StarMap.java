package ie.dit;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class StarMap extends PApplet {

    private int numLines = 10; // change to suite preference

    public void settings(){
        size(750,750);
    }

    public void setup(){
        background(0);
        drawGrid();
        loadData();
        printStars();
    }

    public void draw(){

    }

    public void drawGrid(){
        // VARS
        float square = 600f;
        float offset = 75f;
        float xy = offset;
        int pos = 5;

        // square
        stroke(255, 0, 255);
        fill(0);
        square(offset, offset, square);
        textAlign(LEFT, CENTER);

        // grid -x
        for(int i=0; i<=numLines; i++){
            stroke(255, 0, 255);
            line(offset, xy, square+offset, xy);
            fill(255, 0, 255);
            text(Integer.toString(pos), offset - 40, xy);
            pos--;
            xy += square / numLines;
        }

        // flash VARS
        pos = -5;
        xy = offset;

        // grid -y
        for(int i=0; i<=numLines; i++){
            stroke(255, 0, 255);
            line(xy, offset, xy, square+offset);
            fill(255, 0, 255);
            text(Integer.toString(pos), xy, offset - 40);
            pos++;
            xy += square / numLines;
        }

    }

    public void loadData(){
        Table table = loadTable("HabHYG15ly.csv", "header");

        for(TableRow row:table.rows()){
            Star star = new Star(row);
            stars.add(star);

        }
    }

    public void printStars(){
        for(Star star:stars){
            System.out.println(star);
        }
    }

    private ArrayList<Star> stars = new ArrayList<>();
}
