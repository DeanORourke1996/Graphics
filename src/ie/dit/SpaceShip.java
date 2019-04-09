package ie.dit;

import processing.core.PVector;

import java.util.ArrayList;

public class SpaceShip extends aGameObject {
    // fields
    private PVector acceleration;
    private float size;
    private int fireRate;
    private float toPass;
    private int ammo;

    // constructor
    public SpaceShip(AsteroidsGame asteroids) {
        super(asteroids, 0, 0, null, null);
        pos = new PVector(width / 2, height - 50);
        acceleration = new PVector(0, 0);
        velocity = new PVector(0, 0);
        rotation = new PVector(0, 1);
    }

    // implement methods from abstract class

    public void render() {

    }

    public void update() {
        
    }

    // getters & setters
    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public int getFireRate() {
        return fireRate;
    }

    public void setFireRate(int fireRate) {
        this.fireRate = fireRate;
    }

    public float getToPass() {
        return toPass;
    }

    public void setToPass(float toPass) {
        this.toPass = toPass;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }
}
