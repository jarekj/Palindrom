import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrom("jarekkeraj"));
        System.out.println(isPalindrom("jarekeraj"));
        System.out.println(isPalindrom("Ala"));
        System.out.println(isPalindrom("Jarek"));
        System.out.println(isPalindrom("Kobyła ma mały bok"));


    }

    private static boolean isPalindrom(String textIn) {
        String wyraz = textIn.toLowerCase().replace(" ", "");
        char[] charArray = wyraz.toCharArray();
        for (int i = 0; i < wyraz.length()/2; i++) {
            if (charArray[i] != charArray[wyraz.length() - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
