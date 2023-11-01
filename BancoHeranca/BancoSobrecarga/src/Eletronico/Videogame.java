package Eletronico;

import Enum.ModeloVideoGame;

public class Videogame extends ProdutoEletronico {

	public Videogame(String nome, float preco, String marca, ModeloVideoGame modeloVideoGame) {
		super(nome, preco, marca);
		this.modeloVideoGame = modeloVideoGame;
	}

		private ModeloVideoGame modeloVideoGame;

	@Override
	public String toString() {
		return "Número de controles do videogame: " + modeloVideoGame 
				+ ", nome: " + Nome 
				+ ", preco: " + Preco 
				+ ", marca: " + Marca;
	}
	
}