package Package;
import java.util.ArrayList;

public class Sheep {
    //I want App.java to access LIST, but I dont want App.java to modify LIST.
    //I *could* change to private and add a .GetList() method, but idk if necesarry.
    public static ArrayList<Sheep> LIST = new ArrayList<Sheep>();

    private int x;
    private int y;
    /**
     * Instantiate Sheep object
     * @param x - How far right the sheep is. Int.
     * @param y - How far down the sheep is. Int.
     */
    public Sheep(int x, int y) {
        this.x = x;
        this.y = y;
        LIST.add(this);
    }
    /**
     * Removes sheep from Sheep.LIST. Should get garbaged if no more references.
     */
    public void kill() {
        LIST.remove(this);
        this = null;
    }

    public void moveRight(int x) {
        this.x += x;
    }
    public void moveUp(int y) {
        this.y -= y;
    }
    public int getX() { return x; }
    public int getY() { return y; }
}
