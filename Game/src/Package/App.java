package Package;

import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.Files;

public class App {
    //emojis:　🐑🔥💥🌋
    public static Tile[][] World = new Tile[][] {
        {Tile.random(),Tile.random(),Tile.random(),Tile.random(),Tile.random(),Tile.random()},
        {Tile.random(),Tile.random(),Tile.random(),Tile.random(),Tile.random(),Tile.random()},
        {Tile.random(),Tile.random(),Tile.random(),Tile.random(),Tile.random(),Tile.random()},
        {Tile.random(),Tile.random(),Tile.random(),Tile.random(),Tile.random(),Tile.random()},
    };

    public static void main(String[] args) throws IOException, Exception { //Needed, *apparently* *idk wat im doing*
        Sheep sheep1 = new Sheep(0,0);
        Sheep sheep2 = new Sheep(1,2);

        Path fileName = Path.of("/workspaces/ShepGame_v0.1/Game/Input.txt");
        boolean stop = false;
        while (!stop) {
            String file_content = Files.readString(fileName);
            Sheep tempShepRef = Sheep.LIST.get(0);
            
            if (!file_content.equals("")) {
                switch (file_content) {
                    case "w": tempShepRef.moveUp(1); break;
                    case "a": tempShepRef.moveRight(-1); break;
                    case "s": tempShepRef.moveUp(-1); break;
                    case "d": tempShepRef.moveRight(-1); break;
                    case "c": stop = true; System.out.println("Stopping"); break;
                }
                printWorld();
            }

            Files.writeString(fileName,"");
            Thread.sleep(100); //10Hz
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
