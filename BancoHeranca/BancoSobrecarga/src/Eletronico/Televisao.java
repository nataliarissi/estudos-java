package Eletronico;

public class Televisao extends ProdutoEletronico {
	private int _tamanho;
	private String _tipo; // LCD/LED/OLED
	
	public Televisao(String nome, float preco, String marca, int tamanho, String tipo) {
		super(nome, preco, marca);
		_tamanho = tamanho;
		_tipo = tipo;
	}

	public int getTamanho() {
		return _tamanho;
	}

	public void setTamanho(int tamanho) {
		_tamanho = tamanho;
	}

	public String getTipo() {
		return _tipo;
	}

	public void setTipo(String tipo) {
		_tipo = tipo;
	}

	@Override
	public String toString() {
		return "Tamanho da televisão: " + _tamanho + ", tipo: " + _tipo + ", nome: " + Nome + ", preco: " + Preco + ", marca: " + Marca;
	}
	
}