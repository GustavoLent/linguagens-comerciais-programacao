import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
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
}
