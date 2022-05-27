package Produtos;

public class Bebida extends Produto {
    private String volume;

    public Bebida() {
        super();
    }

    public Bebida(String nome, float valor, String volume) {
        super(nome, valor);
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    @Override
    public String ToString() {
        return nome + ", R$" + valor + ", " + volume;
    }
}
