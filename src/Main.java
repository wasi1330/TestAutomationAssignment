import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch ="";

        System.out.println("This program translates English to Morse and Morse to english");
        System.out.println("=============================================================");
        System.out.println("Enter 1 to translate English to Morse");
        System.out.println("Enter 2 to translate Morse to English");
        System.out.println("Enter 0 to exit");

        while (!ch.equals("0"))
        {
            System.out.printf("%n");
            System.out.println("Enter your choice:");
            ch = sc.nextLine();

            if (ch.equals("1")){
                System.out.println("Enter English character/s");
                String str=sc.nextLine();

                boolean chk = Morse.isAlphaNumeric(str);
                if (chk){System.out.println("Morse code of "+ str +" = "+Morse.englishToMorse(str));}
                else{System.out.println("Enter valid characters A-Z 0-9 . , ? ");}
            }
            else if (ch.equals("2")){
                System.out.println("Enter Morse code");
                String str=sc.nextLine(); 
                boolean chk = Morse.isMorseCode(str);
                if (chk){System.out.println("Morse code " + str+ " to English = " +Morse.morseToEnglish(str));}
                else {System.out.println("Enter valid characters * and -");}

            }
            else {
                if (!ch.equals("0")){
                    System.out.println("Enter a valid choice");
                }
            }
        }

    }
}