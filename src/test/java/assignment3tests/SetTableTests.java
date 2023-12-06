package assignment3tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetTableTests {
    @ParameterizedTest
    @ValueSource(ints = {2,4,8,16,32,64,128,256,512,1024})
    public void tableCreation(int value) {
        ColourTable table = new ColourTable(value);
        String[] expected = new String[value];
        assertEquals(expected.length, table.colours.length);
    }
}