package Eletronico;

public class Radio extends ProdutoEletronico {
	private int _potenciaRMS;

	public Radio(String nome, float preco, String marca, int potenciaRMS) {
		super(nome, preco, marca);
		_potenciaRMS = potenciaRMS;
	}

	public int getPotenciaRMS() {
		return _potenciaRMS;
	}

	public void setPotenciaRMS(int potenciaRMS) {
		_potenciaRMS = potenciaRMS;
	}

	@Override
	public String toString() {
		return "PotênciaRMS do rádio: " + _potenciaRMS + ", nome: " + Nome + ", preço: " + Preco + ", marca: " + Marca;
	}
	
}