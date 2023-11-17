package Padaria;

import Enum.TipoDeClassificacaoLeite;
import Enum.TipoDeLeite;
import Enum.TipoPao;
import Enum.TipoQueijo;
import Enum.TipoSalame;

public class TesteProduto {

	public static void main(String[] args) {
		Leite primeiroLeite = new Leite("Leite", 7f, "Vaquinha", 
		TipoDeLeite.DESNATADO, TipoDeClassificacaoLeite.C);
		primeiroLeite.descricao();

		Leite segundoLeite = new Leite("Leite", 11f, "Vaquinha", 
		TipoDeLeite.INTEGRAL, TipoDeClassificacaoLeite.A);
		segundoLeite.descricao();

		Leite terceiroLeite = new Leite("Leite", 22f, "Vaquinha", 
		TipoDeLeite.SEMIDESNATADO, TipoDeClassificacaoLeite.B);
		terceiroLeite.descricao();


		Pao primeiroPao = new Pao("Pão", 3f, "Pãozinho", TipoPao.PaoFrances);
		primeiroPao.descricao();
		 
		Pao segundoPao = new Pao("Pão", 5f, "Pãozinho", TipoPao.Baguete);
		segundoPao.descricao();

		Pao terceiroPao = new Pao("Pão", 8f, "Pãozinho", TipoPao.PaoItaliano);
		terceiroPao.descricao();


		Queijo primeiroQueijo = new Queijo("Queijo", 2f, "Queijinho", TipoQueijo.Colonial);
		primeiroQueijo.descricao();

		Queijo segundoQueijo = new Queijo("Queijo", 3f, "Queijinho", TipoQueijo.Gouda);
		segundoQueijo.descricao();
		
		Queijo terceiroQueijo = new Queijo("Queijo", 4f, "Queijinho", TipoQueijo.Mussarela);
		terceiroQueijo.descricao();

		Queijo quartoQueijo = new Queijo("Queijo", 7f, "Queijinho", TipoQueijo.Lanche);
		quartoQueijo.descricao();


		Salame primeiroSalame = new Salame("Salame", 1f, "Salaminho", TipoSalame.Hamburgues);
		primeiroSalame.descricao();

		Salame segundoSalame = new Salame("Salame", 1f, "Salaminho", TipoSalame.Italiano);
		segundoSalame.descricao();

		Salame terceiroSalame = new Salame("Salame", 1f, "Salaminho", TipoSalame.Milano);
		terceiroSalame.descricao();

		Salame quartoSalame = new Salame("Salame", 1f, "Salaminho", TipoSalame.Salaminho);
		quartoSalame.descricao();


		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

		carrinhoDeCompras.adicionarItem(primeiroLeite, 5);
        carrinhoDeCompras.adicionarItem(terceiroPao, 8);
        carrinhoDeCompras.adicionarItem(segundoQueijo, 10);
        carrinhoDeCompras.adicionarItem(terceiroSalame, 11);

        carrinhoDeCompras.listarProdutos();
	}

}