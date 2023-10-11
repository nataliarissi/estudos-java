package Pessoa;

public class Endereco {
	private String _rua;
	private int _nro;
	private String _cidade;
	
	public Endereco(String rua, int nro, String cidade) {
		_rua = rua;
		_nro = nro;
		_cidade = cidade;
	}

	public String getRua() {
		return _rua;
	}

	public void setRua(String rua) {
		_rua = rua;
	}

	public int getNro() {
		return _nro;
	}

	public void setNro(int nro) {
		_nro = nro;
	}

	public String getCidade() {
		return _cidade;
	}

	public void setCidade(String cidade) {
		_cidade = cidade;
	}

	@Override
	public String toString() {
		return "Endereco: " + _rua + ", nro: " + _nro + ", cidade:" + _cidade;
	}
	
}