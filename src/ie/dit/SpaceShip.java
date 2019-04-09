package ie.dit;

public class SpaceShip extends aGameObject {
    // fields
    private float size;
    public int fireRate;
    private float toPass;
    private float ellapsed;
    private int ammo;

    // constructor
    public SpaceShip(Game asteroids, float _x, float _y, float _size){
        super(asteroids, _x, _y, null, null);
        this.size = _size;
        fireRate = 10;
        toPass = 1 / (float) fireRate;
        ammo = 10;
    }

    // implement methods from abstract class

    public void render() {
        // method fields (local)
        float halfSize = size / 2;


        asteroids.pushMatrix();
        asteroids.translate(pos.x, pos.y);
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

    public float getEllapsed() {
        return ellapsed;
    }

    public void setEllapsed(float ellapsed) {
        this.ellapsed = ellapsed;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }
}
