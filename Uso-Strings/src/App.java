import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // AnalizePhrase();

        // String funnyString = GetFunnyString("nesteestilo");
        // System.out.println(funnyString);

        // boolean validLicensePlate1 = CheckLicensePlate("ABC-1234");
        // boolean validLicensePlate2 = CheckLicensePlate("ABC1D23");

        // boolean validLicensePlate3 = CheckLicensePlate("ABaD-a234");
        // boolean validLicensePlate4 = CheckLicensePlate("ABaDa234");

        // System.out.println(validLicensePlate1);
        // System.out.println(validLicensePlate2);
        // System.out.println(validLicensePlate3);
        // System.out.println(validLicensePlate4);

        // String capitalized = CapitalizeName("joão da silva júnior");
        // String alternated = ConcatStringsAlternating("aaa1", "bbbbbb2");
        // System.out.println(alternated);

        boolean palindrome = IsPalindrome("SUBINOONIBUS");
    }

    public static void AnalizePhrase() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Frase: ");
        String frase = scan.nextLine();
        scan.close();

        List<String> palavras = Arrays.asList(frase.split(" "));
        String maiorPalavra = "";

        for (String palavra : palavras) {
            if (palavra.length() > maiorPalavra.length()) {
                maiorPalavra = palavra;
            }
        }

        System.out.println("Quantidade de palavras da frase: " + palavras.size());
        System.out.println("A maior palavra é \"" + maiorPalavra + "\" com " + maiorPalavra.length() + " caracteres.");

    }

    public static String GetFunnyString(String originalString) {
        String funnyString = "";
        String upperCasedString = originalString.toUpperCase();
        String lowerCasedString = originalString.toLowerCase();

        boolean shouldUpper = false;
        for (int i = 0; i < originalString.length(); i++) {
            if (shouldUpper) {
                funnyString += upperCasedString.charAt(i);
                shouldUpper = false;
            } else {
                funnyString += lowerCasedString.charAt(i);
                shouldUpper = true;
            }
        }

        return funnyString;
    }

    public static boolean CheckLicensePlate(String licensePlate) {
        boolean oldFormat = licensePlate.matches("[A-Z]{3}-[\\d]{4}");
        boolean newFormat = licensePlate.matches("[A-Z]{3}[\\dA-Z]{2}[\\d]{2}");

        return oldFormat || newFormat;
    }

    public static String CapitalizeName(String name) {
        List<String> parts = Arrays.asList(name.split(" "));
        List<String> uncapitalize = Arrays.asList("da", "de", "do");

        ArrayList<String> res = new ArrayList<String>();

        for (String part : parts) {

            if (uncapitalize.contains(part)) {
                res.add(part.toLowerCase().trim());
                continue;
            }

            StringBuffer buffer = new StringBuffer(part.toLowerCase());
            buffer.setCharAt(0, Character.toUpperCase(buffer.charAt(0)));

            res.add(buffer.toString().trim());
        }

        return String.join(" ", res);
    }

    public static String ConcatStringsAlternating(String str1, String str2) {
        int max = str1.length() > str2.length() ? str1.length() : str2.length();
        String res = "";

        for (int i = 0; i < max; i++) {
            String str1Char = i < str1.length() ? Character.toString(str1.charAt(i)) : "";
            String str2Char = i < str2.length() ? Character.toString(str2.charAt(i)) : "";

            res += str1Char + str2Char;
        }

        return res;
    }

    public static boolean IsPalindrome(String str) {
        StringBuffer buffer = new StringBuffer(str);
        return buffer.reverse().toString().equals(str);
    }
}
