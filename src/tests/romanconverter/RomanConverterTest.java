package tests.romanconverter;

import main.romanconverter.RomanConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanConverterTest {

    @Test
    public void convertToArabic() throws Exception {
        assertEquals(1, RomanConverter.convertToArabic("I"));
        assertEquals(2, RomanConverter.convertToArabic("II"));
        assertEquals(3, RomanConverter.convertToArabic("III"));
    }
}