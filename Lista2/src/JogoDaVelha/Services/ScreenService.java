package JogoDaVelha.Services;

import java.io.IOException;
import java.io.PrintStream;

public class ScreenService {
  private static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_WHITE = "\u001B[37m";

  public static void clear() {
    try {
      if (System.getProperty("os.name").contains("Windows")) {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
      } else {
        Runtime.getRuntime().exec("clear");
      }
    } catch (IOException | InterruptedException ex) {
      System.out.println("Error cleaning screen: " + ex.toString());
    }
  }

  public static void success(String text) {
    System.out.println(ANSI_GREEN + text + ANSI_RESET);
  }

  public static void error(String text) {
    System.out.println(ANSI_RED + text + ANSI_RESET);
  }

  public static void neutral(String text) {
    System.out.println(ANSI_BLUE + text + ANSI_RESET);
  }

  public static void neutralSameLine(String text) {
    System.out.print(ANSI_BLUE + text + ANSI_RESET);
  }
}
