import java.util.Scanner;

public class Exceptions {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void run() {
        Scanner scan = new Scanner(System.in);
        boolean shouldExit = false;

        System.out.println("< Digite um número (ou \"Sair\" > ");
        while (!shouldExit) {
            try {

                System.out.print("> ");
                String input = scan.nextLine();

                if (input.trim().equalsIgnoreCase("sair")) {
                    shouldExit = true;
                    break;
                }

                int num = Integer.parseInt(input);
                System.out.println(ANSI_GREEN + "< Entrada reconhecida: " + num + " >" + ANSI_RESET);

            } catch (java.lang.NumberFormatException e) {
                System.out.println(ANSI_RED + "<!> A entrada deve ser um número válido! Erro: " + e + ANSI_RESET);
            } catch (Exception e) {
                System.out.println("<!> Erro durante a entrada de dados: " + e);

            }
        }

        System.out.println(ANSI_GREEN + "< Saindo... >" + ANSI_RESET);
        scan.close();
    }
}
