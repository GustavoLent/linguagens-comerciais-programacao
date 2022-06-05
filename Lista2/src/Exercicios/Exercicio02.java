package Exercicios;

public class Exercicio02 {
  public static String Run(String str1, String str2) {
    int max = str1.length() > str2.length() ? str1.length() : str2.length();
    String res = "";

    for (int i = 0; i < max; i++) {
      String str1Char = i < str1.length() ? Character.toString(str1.charAt(i)) : "";
      String str2Char = i < str2.length() ? Character.toString(str2.charAt(i)) : "";

      res += str1Char + str2Char;
    }

    return res;
  }
}
