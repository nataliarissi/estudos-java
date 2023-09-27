package Entidades.Casa;

public class Porta {
	private String _cor;
	private int _tamanho;
	
	public Porta(String cor, int tamanho) {
		_cor = cor;
		_tamanho = tamanho;
	}
	
	public String getCor() {
		return _cor;
	}
	
	public void setCor(String cor) {
		_cor = cor;
	}

	public int getTamanho() {
		return _tamanho;
	}

	public void setTamanho(int tamanho) {
		_tamanho = tamanho;
	}
	
	@Override
	public String toString() {
		return "Cor da porta: " + _cor + ", tamanho: " + _tamanho;
	}

}