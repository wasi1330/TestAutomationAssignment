

public class Morse {
    public static Boolean isAlphaNumeric(String s) {
        return s.matches("^[a-zA-Z0-9., ?]*$");
    }

    public static Boolean isMorseCode(String s) {
        return s.matches("^[* -]*$");
    }
    public static String morseToEnglish(String morseCode)
    {
        StringBuilder str= new StringBuilder();
        String[] array = morseCode.split(" ");

        // Morse code to English
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < code.length; j++) {
                if (array[i].compareTo(code[j]) == 0) {   // when both values are equal returns 0
                    str.append(letter[j]).append(" ");

                }
            }
        }
        return str.toString();
    }
    public static String englishToMorse(String englishLang)
    {
        StringBuilder str= new StringBuilder();

        englishLang=englishLang.toUpperCase();

        for (int i = 0; i < englishLang.length(); i++) {
            for (int j = 0; j < letter.length; j++) {
                if (englishLang.charAt(i) == letter[j]) {
                    str.append(code[j]).append(" ");
                    break;
                }
            }
        }
        return str.toString();
    }

    // store the all the alphabet in an array
    public static char[] letter = { 'A', 'B', 'C', 'D', 'E', 'F',
            'G', 'H', 'I', 'J', 'K', 'L',
            'M', 'N', 'O', 'P', 'Q', 'R',
            'S', 'T', 'U', 'V', 'W', 'X',
            'Y', 'Z', '1', '2', '3', '4',
            '5', '6', '7', '8', '9', '0',
            '.',',','?' };
    // Morse code by indexing
    public static String[] code
            = { "*-",   "-***", "-*-*", "-**",  "*",
            "**-*", "--*",  "****", "**",   "*---",
            "-*-",  "*-**", "--",   "-*",   "---",
            "*--*", "--*-", "*-*",  "***",  "-",
            "**-",  "***-", "*--",  "-**-", "-*--",
            "--**", "*----" ,"**---","***--","****-",
            "*****","-****","--***","---**","----*",
            "-----","*-*-*-","--**--","**--**"};

}
