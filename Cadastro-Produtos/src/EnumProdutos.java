import Produtos.*;

public enum EnumProdutos {
    BEBIDA, PADARIA;

    public Produto GetClass() {

        // this will refer to the object SMALL
        switch (this) {
            case BEBIDA:
                return new Bebida();

            default:
                return new Produto();
        }
    }
}
