package ie.dit;

import processing.core.PVector;
import processing.core.PApplet;
import java.util.ArrayList;


public class Asteroid extends aGameObject {
    // fields
    float oL = 0.05f;
    private float radius;
    private int stage;
    private float spin;
    private float dampn = 1;
    private int col = 100;

    // constructor
    public Asteroid(Game asteroids, float _x, float _y, float _radius, PVector _rotation, PVector _pos, PVector _velocity, int _stage){ // overloading
        super(asteroids, _x, _y, _rotation, _pos);
        this.radius = _radius;
        this.stage = _stage;
        this.pos = _pos; // from abstract class
        float angle = random(2 * PI);
        velocity = new PVector(cos(angle), sin(angle));
        velocity.mult((50 * 50)/(radius*radius));
        velocity.mult(sqrt(stage + 2));
        velocity.mult(dampn);
        angle = random(2 * PI);
        rotation = new PVector(cos(angle), sin(angle));
        spin = (float)(Math.random()*oL-oL/2);
        int rnd = (int)(Math.random()*3);
    }

    // asteroid methods
    public void spher(float x, float y){
        pushMatrix();
        translate(x,y);
        rotate((float)(Math.atan2(rotation.y, rotation.x)));
        ellipse(0, 0, (float)2.1*radius, (float)1.9 * radius);
        popMatrix();
    }

    public void rotate(PVector v, float thetha){
        float xT = v.x;
        v.x = v.x*cos(thetha) - v.y*sin(thetha);
        v.y = xT*sin(thetha) + v.y*cos(thetha);
    }

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
        fill(col);
        spher(pos.x, pos.y);
        if(pos.x < radius){
            spher(pos.x + width, pos.y);
        } else if(pos.x > width-radius){
            spher(pos.x - width, pos.y);
        }

        if(pos.y < radius){
            spher(pos.x, pos.y + height);
        } else if(pos.x > height-radius){
            spher(pos.x, pos.y - height);
        }
    }

    public void update(){
        pos.add(velocity);
        rotate(rotation, spin);
    }



}
