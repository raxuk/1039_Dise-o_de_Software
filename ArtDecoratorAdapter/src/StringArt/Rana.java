package StringArt;

import java.util.ArrayList;
import java.util.List;

public class Rana extends StringArt {
    @Override
    public String dibujo() {
        List<String> rana = new ArrayList<String>();
        rana.add("       __   __");
        rana.add("      /  \\ /  \\");
        rana.add("     | @) | @) |");
        rana.add("    /           \\");
        rana.add("    \\ \\____  __//");
        rana.add("     \\_    ||  /");
        rana.add("___   /    ||  \\  ___");
        rana.add("\\   \\|     ()   |/  /");
        rana.add(" \\   |          |  /");
        rana.add("  \\   \\  \\  /  /  /");
        rana.add("  /   /   \\/   \\  \\");
        rana.add("  UUU  UUU  UUU UUU");

        StringBuilder ranaString = new StringBuilder();
        for (String s : rana)
            ranaString.append(s).append("\n");

        return ranaString.toString();
    }
}