package ie.dit;

public class Main {

    public void DummyTest(){
        String[] a = {"MAIN"};
        processing.core.PApplet.runSketch(a, new DummyTest());
    }

    public void starMap(){
        String[] a = {"MAIN"};
        processing.core.PApplet.runSketch(a, new StarMap());
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.starMap();
        //main.DummyTest();
    }
}
