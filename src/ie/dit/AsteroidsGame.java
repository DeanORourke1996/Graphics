package ie.dit;

import processing.core.PApplet;
import java.util.ArrayList;

public class AsteroidsGame extends PApplet {

    // fields
    public ArrayList<aGameObject> gameObjects;
    public ArrayList<Asteroid> asteroids;

    // create a ship object
    SpaceShip Ship;
    Asteroid asteroid;

    // key control
    private boolean upPressed = false;
    private boolean downPressed = false;
    private boolean aPressed = false;
    private boolean dPressed = false;

    // game environment
    private float shipSpeed = 2;
    private float rotationAngle = .2f;
    private float bulletSpeed = 10;
    private int numAsteroids = 1;

    // peripherals
    private int strRadius = 50;
    private float bgColour = 0;

    // game settings
    int counter;
    int MAX_LIVES = 3;
    int lives;
    int stage = -1;
    int diffCurve = 2;
    int counterLimit = 24 * 2;


    public void settings(){
        size(800, 500);
    }

    public void setup(){
        //font = createFont("Cambria", 32);
        frameRate(24);
        lives = 3;
        asteroids = new ArrayList<>(0);
    }

    public void draw(){
        Ship.render();
    }

    public boolean isUpPressed() {
        return upPressed;
    }

    public boolean isDownPressed() {
        return downPressed;
    }

    public boolean isaPressed() {
        return aPressed;
    }

    public boolean isdPressed() {
        return dPressed;
    }
}
