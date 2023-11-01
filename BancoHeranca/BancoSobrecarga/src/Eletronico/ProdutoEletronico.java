package Eletronico;

import Enum.ModeloRadio;

public class ProdutoEletronico {
	
	public ProdutoEletronico(String nome, float preco, String marca) {
		Nome = nome;
		Preco = preco;
		Marca = marca;
	}

	protected String Nome;
	protected float Preco;
	protected String Marca;

	@Override
	public String toString() {
		return "Nome do produto eletrônico: " + Nome 
				+ ", preço: " + Preco 
				+ ", marca: " + Marca;
	}
}