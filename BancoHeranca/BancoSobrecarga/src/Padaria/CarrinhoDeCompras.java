package Padaria;

import java.util.ArrayList;

public class CarrinhoDeCompras {

    public CarrinhoDeCompras() {
        itens = new ArrayList<>();
    }

    private ArrayList<ItemNoCarrinho> itens;

    public void adicionarItem(Produto produto, int quantidade) {
        float subtotal = quantidade * produto.PrecoUnidade;
        ItemNoCarrinho item = new ItemNoCarrinho(quantidade, produto, subtotal);
        itens.add(item);
    }

    public float totalDaCompra() {
        float total = 0;
        for (ItemNoCarrinho item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void listarProdutos() {
        System.out.println("Produtos no Carrinho:");

        for (ItemNoCarrinho item : itens) {
            System.out.println(item.toString());
        }

        System.out.println("Total da Compra: R$" + totalDaCompra());
    }
}

