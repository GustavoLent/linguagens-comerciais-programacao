package Produtos;

public class Padaria extends Produto {
    private String peso;

    public Padaria() {
        super();
    }

    public Padaria(String nome, float valor, String peso) {
        super(nome, valor);
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    @Override
    public String ToString() {
        return nome + ", R$" + valor + ", " + peso;
    }
}
