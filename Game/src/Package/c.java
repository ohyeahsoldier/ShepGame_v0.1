package Package;
public enum c {
    reset("\033[0m"),
    bold("\033[1m"),
    dim("\033[2m"),
    italic("\033[3m"),
    underline("\033[4m"), 
    //doesnt work in vscode: //blinking("\033[5m"),
    reverse("\033[7m"), 
    hidden("\033[8m"), 
    strikethrough("\033[9m"),

    // Changes color of the text 
    //NOTE: I can do BLACK("\033[0;30m") to append c.reset to it
    BLACK("\033[30m"),    // BLACK
    RED("\033[31m"),      // RED
    GREEN("\033[32m"),    // GREEN
    YELLOW("\033[33m"),   // YELLOW
    BLUE("\033[34m"),     // BLUE
    MAGENTA("\033[35m"),  // MAGENTA
    CYAN("\033[36m"),     // CYAN
    WHITE("\033[37m"),    // WHITE

    // Changes color of the background -- like a Highlighter
    BLACK_BG("\033[40m"),   // BLACK
    RED_BG("\033[41m"),     // RED
    GREEN_BG("\033[42m"),   // GREEN
    YELLOW_BG("\033[43m"),  // YELLOW
    BLUE_BG("\033[44m"),    // BLUE
    MAGENTA_BG("\033[45m"), // MAGENTA
    CYAN_BG("\033[46m"),    // CYAN
    WHITE_BG("\033[47m"),   // WHITE

    // Changes color of text except "High Intensity"
    BLACK_BRIGHT("\033[90m"),     // BLACK
    RED_BRIGHT("\033[91m"),       // RED
    GREEN_BRIGHT("\033[92m"),     // GREEN
    YELLOW_BRIGHT("\033[93m"),    // YELLOW
    BLUE_BRIGHT("\033[94m"),      // BLUE
    MAGENTA_BRIGHT("\033[95m"),   // MAGENTA
    CYAN_BRIGHT("\033[96m"),      // CYAN
    WHITE_BRIGHT("\033[97m"),     // WHITE

    // Changes color of BackGround except "High Intensity"
    BLACK_BG_BRIGHT("\033[100m"),     // BLACK
    RED_BG_BRIGHT("\033[101m"),       // RED
    GREEN_BG_BRIGHT("\033[102m"),     // GREEN
    YELLOW_BG_BRIGHT("\033[103m"),    // YELLOW
    BLUE_BG_BRIGHT("\033[104m"),      // BLUE
    MAGENTA_BG_BRIGHT("\033[105m"),   // MAGENTA
    CYAN_BG_BRIGHT("\033[106m"),      // CYAN
    WHITE_BG_BRIGHT("\033[107m");     // WHITE

    //Look up what an enum is. This is the constructor and it's State.
    private final String code;
    c(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
