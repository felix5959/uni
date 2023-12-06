package assignment3tests;

public class ColourTable {
    public String[] colours;

    public ColourTable(int paletteCapacity) {
        if (paletteCapacity != 2 & paletteCapacity != 4 & paletteCapacity != 8 & paletteCapacity != 16 & paletteCapacity != 32 & paletteCapacity != 64 & paletteCapacity != 128 & paletteCapacity != 256 & paletteCapacity != 512 & paletteCapacity != 1024) {
            throw new ArithmeticException("Number of colours in the palette must be 2, 4, 8, 16, 32, 64, 128, 256, 512 or 1024");
        }
        else {
            colours = new String[paletteCapacity];
        }
    }
}
