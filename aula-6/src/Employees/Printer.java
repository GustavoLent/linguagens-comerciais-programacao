package Employees;

public class Printer {
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_BLUE = "\u001B[34m";

    public void success(String text) {
        System.out.println(ANSI_GREEN + text + ANSI_RESET);
    }

    public void error(String text) {
        System.out.println(ANSI_RED + text + ANSI_RESET);
    }

    public void neutral(String text) {
        System.out.println(ANSI_BLUE + text + ANSI_RESET);
    }
}
