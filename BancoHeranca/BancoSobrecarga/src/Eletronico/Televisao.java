package Eletronico;

import Enum.ModeloTv;

public class Televisao extends ProdutoEletronico {
	
	public Televisao(String nome, float preco, String marca, int tamanho, ModeloTv modeloTv) {
		super(nome, preco, marca);
		_tamanho = tamanho;
		this.modeloTv = modeloTv;
	}

	private int _tamanho;
	private ModeloTv modeloTv;

	@Override
	public String toString() {
		return "Tamanho da televisão: " + _tamanho 
				+ ", tipo: " + modeloTv + ", nome: " 
				+ Nome + ", preco: " 
				+ Preco + ", marca: " 
				+ Marca;
	}
	
}