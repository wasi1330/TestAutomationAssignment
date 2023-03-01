import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MorseTest {

    @Test
    void isAlphaNumeric() {
        String str= "abc ?";

        assertTrue(Morse.isAlphaNumeric(str));
        String str2="l/*-";
        assertFalse(Morse.isAlphaNumeric(str2));
    }
    @Test
    void isMorseCode() {
        String str= "*-";

        assertTrue(Morse.isMorseCode(str));
        String str2="abc ?";
        assertFalse(Morse.isMorseCode(str2));
    }

    @Test
    void morseToEnglish() {
        String str= "**-*";
        assertEquals("F ",Morse.morseToEnglish(str));

        String str2= "**** * *---";
        assertEquals("H E J ",Morse.morseToEnglish(str2));
    }

    @Test
    void englishToMorse() {
        String str= "F";
        assertEquals("**-* ",Morse.englishToMorse(str));

        String str2= "HEj";
        assertEquals("**** * *--- ",Morse.englishToMorse(str2));
    }
}