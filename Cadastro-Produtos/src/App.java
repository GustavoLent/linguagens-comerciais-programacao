import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Produtos.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<Produto>();
        boolean deveCadastrar = true;

        System.out.println("*** Cadastro de Produtos ***");

        while (deveCadastrar) {
            System.out.print("\tTipo do produto: ");
            String tipo = scan.nextLine();

            System.out.print("\tNome do produto: ");
            String nome = scan.nextLine();

            System.out.print("\tValor do produto: ");
            float valor = scan.nextFloat();
            scan.nextLine();

            Produto produto = new Produto(nome, valor);
            produtos.add(produto);

            System.out.println("\tProduto cadastrado!");

            System.out.print("\tCadastrar próximo? (y, n)");
            deveCadastrar = scan.nextLine().equalsIgnoreCase("y");

            if (deveCadastrar)
                System.out.print("\n");
        }

        System.out.println("\n*** Produtos Cadastrados ***");

        for (Produto produto : produtos) {
            System.out.println("\t" + produto.ToString());
        }

        scan.close();
    }
}
