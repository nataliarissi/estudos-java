package Eletronico;

public class Videogame extends ProdutoEletronico {
	private int _nroControles;

	public Videogame(String nome, float preco, String marca, int nroControles) {
		super(nome, preco, marca);
		_nroControles = nroControles;
	}

	public int getNroControles() {
		return _nroControles;
	}
	
	public void setNroControles(int nroControles) {
		_nroControles = nroControles;
	}

	@Override
	public String toString() {
		return "Número de controles do videogame: " + _nroControles + ", nome: " + Nome + ", preco: " + Preco + ", marca: " + Marca;
	}
	
}