package Entidades.Automoveis;

public class Veiculo{
    protected String _placa;
    protected String _modelo;
    private String _marca;
    private int _ano;
    private String _cor;
    private String _proprietario;
    private int _capTanque;
    private String _tipoFreio;

	public Veiculo(String placa, String modelo, String marca, int ano, String cor, String proprietario, int capTanque, String tipoFreio) {
		_placa = placa;
		_modelo = modelo;
		_marca = marca;
		_ano= ano;
		_cor = cor;
		_proprietario = proprietario;
		_capTanque = capTanque;
		_tipoFreio = tipoFreio;
	}

	public String getPlaca() {
		return _placa;
	}

	public void setPlaca(String placa) {
		_placa = placa;
	}

	public String getModelo() {
		return _modelo;
	}

	public void setModelo(String modelo) {
		_modelo = modelo;
	}

	public String getMarca() {
		return _marca;
	}

	public void setMarca(String marca) {
		_marca = marca;
	}

	public int getAno() {
		return _ano;
	}

	public void setAno(int ano) {
		_ano = ano;
	}

	public String getCor() {
		return _cor;
	}

	public void setCor(String cor) {
		_cor = cor;
	}

	public String getProprietario() {
		return _proprietario;
	}

	public void setProprietario(String proprietario) {
		_proprietario = proprietario;
	}
    
	public int getCapTanque() {
		return _capTanque;
	}

	public void setCapTanque(int capTanque) {
		_capTanque = capTanque;
	}

	public String getTipoFreio() {
		return _tipoFreio;
	}

	public void setTipoFreio(String tipoFreio) {
		_tipoFreio = tipoFreio;
	}
	
	@Override
	public String toString() {
		return "Veiculo - Placa: " + _placa + ", Modelo: " + _modelo + ", Marca: " + _marca + ", Ano: " + _ano + ", Cor: " + _cor + ", Proprietário: " + _proprietario + ", CapTanque: " + _capTanque + ", TipoFreio: " + _tipoFreio;
	}
}