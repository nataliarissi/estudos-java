package Entidades.Casa;

public class Janela {
	private int _tamanho;

	public Janela(int tamanho) {
		_tamanho = tamanho;
	}

	public int getTamanho() {
		return _tamanho;
	}

	public void setTamanho(int tamanho) {
		_tamanho = tamanho;
	}

	@Override
	public String toString() {
		return "Tamanho da Janela: " + _tamanho;
	}
	
}