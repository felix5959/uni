package assignment3tests;

public class ColourTable {

    public int numberOfColours;

    public ColourTable(int number) {
        if (number != 2 & number != 4 & number != 8 & number != 16 & number != 32 & number != 64 & number != 128 & number != 256 & number != 512 & number != 1024) {
            throw new ArithmeticException("Number of colours in the palette must be 2, 4, 8, 16, 32, 64, 128, 256, 512 or 1024");
        }
        else {
            numberOfColours = number;
        }
    }
}
