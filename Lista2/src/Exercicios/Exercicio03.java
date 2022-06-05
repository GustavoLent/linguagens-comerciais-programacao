package Exercicios;

public class Exercicio03 {
  public static boolean Run(String str) {
    StringBuffer buffer = new StringBuffer(str);
    return buffer.reverse().toString().equals(str);
  }
}
