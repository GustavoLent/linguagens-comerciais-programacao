package Produtos;

import java.util.Scanner;

public class Produto {
    String nome;
    float valor;

    public Produto() {
    }

    public Produto(String nome, float valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String ToString() {
        return nome + ": R$" + valor;
    }

    public void fill() {
        Scanner scan = new Scanner(System.in);

        System.out.print("\tNome do produto: ");
        String nome = scan.nextLine();
    }
}
