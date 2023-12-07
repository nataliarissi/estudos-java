import java.util.ArrayList;

abstract class Item {
    public Item(String nome, String descricao) {
        Nome = nome;
        Descricao = descricao;
    }

    protected String Nome;
    protected String Descricao;

    public abstract double calculoPreco();
}