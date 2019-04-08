package ie.dit;

import processing.core.PVector;

public abstract class aGameObject {
    // fields
    protected PVector pos;
    protected PVector forward;
    protected PVector rotation;
    protected float speed;
    protected Game asteroids;

    // constructor
    public aGameObject(Game asteroids, float _x, float y, float _speed, PVector _rotation){
        this.asteroids = asteroids;
        pos = new PVector(_x, y);
        forward = new PVector(0, -1);
        this.speed = _speed;
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
        return forward;
    }

    public void setForward(PVector forward) {
        this.forward = forward;
    }

    public PVector getRotation() {
        return rotation;
    }

    public void setRotation(PVector rotation) {
        this.rotation = rotation;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public Game getAsteroids() {
        return asteroids;
    }

    public void setAsteroids(Game asteroids) {
        this.asteroids = asteroids;
    }
}
