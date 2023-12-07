package assignment3tests;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.awt.Color;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SetTableTests {
    @ParameterizedTest
    @ValueSource(ints = {2,4,8,16,32,64,128,256,512,1024})
    public void tableCreation(int value) {
        ColourTable table = new ColourTable(value);
        Color[] expected = new Color[value];
        assertEquals(expected.length, table.capacity);
    }

    @ParameterizedTest
    @ValueSource(strings = {"255,0,0", "0,255,0", "0,0,255"})
    public void addColour(String value) {
        ColourTable table = new ColourTable(4);
        table.add(value);
        String[] values = value.split(",");
        Color expected = new Color(Integer.parseInt((values[0])), Integer.parseInt((values[1])), Integer.parseInt((values[2])));
        assertEquals(expected, table.colours.get(0));
    }
    @Test
    public void tooManyColours() {
        ColourTable table = new ColourTable(2);
        ArithmeticException expectedException = assertThrows(ArithmeticException.class, table::addThreeColours);
        assertEquals("Palette is full", expectedException.getMessage());
    }

    @ParameterizedTest
    @ValueSource(strings = {"255,0,0"})
    public void addingTheSameColourTwice(String value) {
        ColourTable table = new ColourTable(4);
        table.add(value);
        ArithmeticException expectedException = assertThrows(ArithmeticException.class, () -> table.add(value));
        assertEquals("Colour is already in palette", expectedException.getMessage());
    }
}