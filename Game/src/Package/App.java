package Package;

import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.Files;

public class App {
    //emojis:　🐑🔥💥🌋
    public static Tile[][] World = new Tile[][] {
        {Tile.random(),Tile.random(),Tile.random(),Tile.random()},
        {Tile.random(),Tile.random(),Tile.random(),Tile.random()},
        {Tile.random(),Tile.random(),Tile.random(),Tile.random()},
        {Tile.random(),Tile.random(),Tile.random(),Tile.random()},
    };

    public static void main(String[] args) throws IOException, Exception { //Needed, *apparently* *idk wat im doing*
        new Sheep(0,0);
        new Sheep(1,2);

        Path fileName = Path.of("/workspaces/ShepGame_v0.1/Game/Input.txt");
        System.out.printf("%sGo to %s%sInput.txt:0\n%s",c.italic,c.CYAN,c.underline,c.reset);

        boolean stop = false;
        while (!stop && Sheep.LIST().size()!=0) {
            String file_content = Files.readString(fileName);
            Sheep tempShep = Sheep.LIST().get(0);
            
            if (!file_content.equals("")) {//If not empty
                switch (file_content) {
                    case "w": tempShep.moveUp(1); break;
                    case "a": tempShep.moveRight(-1); break;
                    case "s": tempShep.moveUp(-1); break;
                    case "d": tempShep.moveRight(1); break;
                    case "c": stop = true; System.out.println("Stopping"); break;
                }
                if (!stop) {
                    printWorld();
                    System.out.printf("x: %d  y: %d\n\n",tempShep.getX(),tempShep.getY());
                }
                Thread.sleep(100); //10Hz //trying to make vscode not desync isnt working...
                Files.writeString(fileName,"");
            }
        }
        System.out.println("Stopped.");
    }

    /**
     * Prints the tiles, emojis, calculates collisions
     */
    public static void printWorld() {
        for (int y=0; y<World.length; y++) {
            for (int x=0; x<World[0].length; x++) {
                Tile refTile = World[y][x];
                System.out.print(refTile); //toString() prints the ansi color code
                Sheep shep = locateSheep(x, y);
                if (shep!=null) { //if shep is at x,y
                    switch (refTile) {
                        case LAVA: shep.kill(); System.out.print("💥"+c.reset); break;
                        default: System.out.print("🐑"+c.reset);
                    }
                } else { //otherwise
                    System.out.print(refTile.emoji()+c.reset);
                }
            }
            System.out.println();
        }
    }
    /**
     * Checks Sheep.LIST() for a sheep at x,y
     * @param x int
     * @param y int
     * @return Returns Sheep object if found, null if not
     */
    public static Sheep locateSheep(int x, int y) {
        for (Sheep shep : Sheep.LIST()) {
            if (shep.getX()==x && shep.getY()==y)
                return shep;
        }
        return null;
    }
}
