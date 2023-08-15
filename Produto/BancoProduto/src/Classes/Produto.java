package Classes;

public class Produto {
    public static String Nome;
    public static float Preco;
    public static String Descricao; 

    public Produto(String nome, float preco, String descricao){
        Nome = nome;
        Preco = preco;
        Descricao = descricao;
    }

    public static String mostraNomeProduto(){
        return "Nome do Produto: " + Nome;
  }

    public String mostraPreco(){
        return ", Descrição do Produto: " + Preco;
  }

    public String mostraDescricaoProduto(){
        return ", Descrição do Produto: " + Descricao;
    }
}
