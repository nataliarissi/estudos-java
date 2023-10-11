package Veiculos;

public class Veiculo {
	private String _placa;
	protected String Modelo;
	protected String Marca;
	protected int Ano;
	protected String Cor; 
	protected String Proprietario; 
	protected int CapTanque;
	protected String TipoFreio;
	
	public Veiculo(String placa, String modelo, String marca, 
			int ano, String cor, String proprietario, int capTanque,
			String tipoFreio) {
		_placa = placa;
		Modelo = modelo;
		Marca = marca;
		Ano = ano;
		Cor = cor;
		Proprietario = proprietario;
		CapTanque = capTanque;
		TipoFreio = tipoFreio;
	}

	public String getPlaca() {
		return _placa;
	}

	public void setPlaca(String placa) {
		_placa = placa;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public int getAno() {
		return Ano;
	}

	public void setAno(int ano) {
		Ano = ano;
	}
	
	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public String getProprietario() {
		return Proprietario;
	}

	public void setProprietario(String proprietario) {
		Proprietario = proprietario;
	}

	public int getCapTanque() {
		return CapTanque;
	}

	public void setCapTanque(int capTanque) {
		CapTanque = capTanque;
	}

	public String getTipoFreio() {
		return TipoFreio;
	}

	public void setTipoFreio(String tipoFreio) {
		TipoFreio = tipoFreio;
	}
	
	@Override
	public String toString() {
		return "Placa do Veiculo: " + _placa + ", Modelo: " + Modelo + ", Marca: " + Marca + ", Ano: " + Ano + ", Cor:" + Cor
				+ ", Proprietário: " + Proprietario + ", Capacidade do Tanque: " + CapTanque + ", Tipo de Freio:" + TipoFreio;
	}
}