import java.util.Scanner;

import Classes.Produto;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do Produto");
        String nome = entrada.next();
        System.out.println("Digite o preço do Produto");
        int preco = entrada.nextInt();
        System.out.println("Digite a descrição do Produto");
        String descricao = entrada.next();

        Produto prod = new Produto(nome, preco, descricao);

        System.out.println(prod.mostraNomeProduto() + prod.mostraPreco() + prod.mostraDescricaoProduto());
    }
}