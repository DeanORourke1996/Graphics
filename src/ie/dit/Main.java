package ie.dit;

public class Main {

    public void asteroids(){
        String[] a = {"MAIN"};
        processing.core.PApplet.runSketch(a, new Game());
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.asteroids();
    }
}
