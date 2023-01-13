package Package;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    //emojis:　🐑🔥💥🌋
    public static Tile[][] World = new Tile[][] {
        {Tile.random(),Tile.random(),Tile.random(),Tile.random(),Tile.random(),Tile.random()},
        {Tile.random(),Tile.random(),Tile.random(),Tile.random(),Tile.random(),Tile.random()},
        {Tile.random(),Tile.random(),Tile.random(),Tile.random(),Tile.random(),Tile.random()},
        {Tile.random(),Tile.random(),Tile.random(),Tile.random(),Tile.random(),Tile.random()},
    };

    public static void main(String[] args) throws Exception { //throws IOException
        Sheep sheep1 = new Sheep(0,0);
        Sheep sheep2 = new Sheep(1,2);

        Path path = Paths.get("/workspaces/ShepGame_v0.1/Game/Input.txt");
        for (int i=0; i<20; i++) {
            Scanner scanner = new Scanner(path);
            String test = scanner.next();
            System.out.println(test);
            scanner.close();
            Thread.sleep(500);
        }
    }

    /**
     * Prints the tile color bg, sheep emojis, fire emojis, calculates collisions
     */
    public static void printWorld() {
        for (int y=0; y<World.length; y++) {
            for (int x=0; x<World[0].length; x++) {

            }
            System.out.println();
        }
        //
    }
}
