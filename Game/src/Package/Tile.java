package Package;
import java.util.Random;

public enum Tile {
    STONE(c.WHITE_BG,"　"),
    GRASS(c.GREEN_BG,"　"),
    LAVA(c.RED_BG,"🔥")
    ;

    private final c color;
    private final String emoji;
    Tile(c color, String emoji) {
        this.color = color;
        this.emoji = emoji;
    }

    @Override
    public String toString() {
        return color+"";
    }

    public String emoji() {
        return emoji;
    }

    //Because I don't want to create a new Tile[] and Random every time I call Tile.random()
    private static final Tile[] TileArray = Tile.values();
    private static final Random rng = new Random();

    public static Tile random() {
        return TileArray[rng.nextInt(TileArray.length)];
    }
}
