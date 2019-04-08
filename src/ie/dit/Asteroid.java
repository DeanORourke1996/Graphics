package ie.dit;

import processing.core.PVector;
import java.util.ArrayList;
import static java.lang.Math.*;

public class Asteroid extends aGameObject {
    // fields
    PVector rotation;
    PVector velocity;
    float oL = 0.05f;
    private float radius;
    private int stage;
    private float spin;
    private float dampn = 1;

    // constructor
    public Asteroid(Game asteroids, float _x, float _y, float _radius, PVector _pos, int _stage){ // overloading
        super(asteroids, _x, _y, _radius, _pos);
        this.radius = _radius;
        this.stage = _stage;
        pos = _pos;
        float angle = (float)(random() * (((2*PI)-1)+1)+1); // randomize
        rotation = new PVector((float)cos(angle), (float)sin(angle));
        velocity.mult((50*50)/(radius*radius));
        velocity.mult((float)sqrt(stage + 2));
        velocity.mult(dampn);
        angle = (float)(random() * (((2*PI)-1)+1)+1); // re-randomize
        rotation = new PVector((float)cos(angle), (float)sin(angle));
        spin = (float)(Math.random()*oL - oL/2);
        int rnd = (int)(Math.random()*3);
    }

    // asteroid methods
    public void destroy(ArrayList<Asteroid> asteroids){
        if(radius <= 30){
            asteroids.remove(this);
        } else if(radius < 33){
            for(int i=0; i<2; i++){
                float angle;
            }
        }
    }

    // implement methods from abstract class

    public void render(){

    }

    public void update(){

    }



}
