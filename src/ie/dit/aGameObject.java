package ie.dit;

import processing.core.PApplet;
import processing.core.PVector;

public abstract class aGameObject extends PApplet {
    // fields
    protected PVector pos;
    protected PVector velocity;
    protected PVector rotation;
    protected AsteroidsGame ast;

    // constructor
    public aGameObject(AsteroidsGame ast, float _x, float y, PVector _velocity, PVector _rotation){
        this.ast = ast;
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

    public AsteroidsGame getAsteroids() {
        return ast;
    }

    public void setAsteroids(AsteroidsGame ast) {
        this.ast = ast;
    }
}
