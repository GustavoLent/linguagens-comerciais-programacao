package Exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicio01 {
  public static String Run(String name) {
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
}
