package Eletronico;

import Enum.ModeloRadio;

public class Radio extends ProdutoEletronico {

	public Radio(String nome, float preco, String marca, int potenciaRMS, ModeloRadio modeloRadio) {
		super(nome, preco, marca);
		_potenciaRMS = potenciaRMS;
		this.modeloRadio = modeloRadio;
	}

	private int _potenciaRMS;
	private ModeloRadio modeloRadio;

	@Override
	public String toString() {
		return "PotênciaRMS do rádio: " + _potenciaRMS 
				+ ", nome: " + Nome 
				+ ", preço: " + Preco 
				+ ", marca: " + Marca
				+ ", modelo: " + modeloRadio;
	}
	
}