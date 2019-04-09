package ie.dit;

import processing.core.PApplet;
import processing.core.PVector;

public abstract class aGameObject extends PApplet {
    // fields
    protected PVector pos;
    protected PVector velocity;
    protected PVector rotation;
    protected Game asteroids;

    // constructor
    public aGameObject(Game asteroids, float _x, float y, PVector _velocity, PVector _rotation){
        this.asteroids = asteroids;
        pos = new PVector(_x, y);
        velocity = new PVector(0, -1);
        velocity = _velocity;
        this.rotation = _rotation;
    }


    // abstract methods
    public abstract void update();
    public abstract void render();

    public PVector getPos() {
        return pos;
    }

    public void setPos(PVector pos) {
        this.pos = pos;
    }

    public PVector getForward() {
        return velocity;
    }

    public void setForward(PVector forward) {
        velocity = forward;
    }

    public PVector getRotation() {
        return rotation;
    }

    public void setRotation(PVector rotation) {
        this.rotation = rotation;
    }

    public PVector getSpeed() {
        return velocity;
    }

    public void setSpeed(float speed) {
        this.velocity = velocity;
    }

    public Game getAsteroids() {
        return asteroids;
    }

    public void setAsteroids(Game asteroids) {
        this.asteroids = asteroids;
    }
}
