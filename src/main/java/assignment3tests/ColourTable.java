package assignment3tests;

import java.awt.Color;
import java.util.ArrayList;

public class ColourTable {
    public int capacity;
    public ArrayList<Color> colours;

    public ColourTable(int paletteCapacity) {
        if (paletteCapacity != 2 & paletteCapacity != 4 & paletteCapacity != 8 & paletteCapacity != 16 & paletteCapacity != 32 & paletteCapacity != 64 & paletteCapacity != 128 & paletteCapacity != 256 & paletteCapacity != 512 & paletteCapacity != 1024) {
            throw new ArithmeticException("Number of colours in the palette must be 2, 4, 8, 16, 32, 64, 128, 256, 512 or 1024");
        }
        else {
            capacity = paletteCapacity;
            colours = new ArrayList<>();
        }
    }

    public void add(String colourString) {
        String[] rgb = colourString.split(",");
        Color colour = new Color(Integer.parseInt((rgb[0])), Integer.parseInt((rgb[1])), Integer.parseInt((rgb[2])));
        colours.add(colour);
    }
}
