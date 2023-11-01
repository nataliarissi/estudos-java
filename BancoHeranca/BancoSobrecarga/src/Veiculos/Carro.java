package Veiculos;

public class Carro extends Veiculo {
	
	public Carro(String placa, String modelo, String marca, 
		int ano, String cor, String proprietario, int capTanque,
		String tipoFreio, int nroPortas, String tipoCambio, 
		String revestBanco, String tipoDirecao, int potencia,
		int lugares, int capPortaMalas) {
		
		super(placa, modelo, marca, ano, cor, proprietario, 
		capTanque, tipoFreio);
		_nroPortas = nroPortas;
		_tipoCambio = tipoCambio;
		_revestBanco = revestBanco;
		_tipoDirecao = tipoDirecao;
		_potencia = potencia;
		_lugares = lugares;
		_capPortaMalas = capPortaMalas;
	}

	private int _nroPortas;
	private String _tipoCambio;
	private String _revestBanco;
	private String _tipoDirecao;
	private int _potencia;
	private int _lugares;
	private int _capPortaMalas;

	public int getNroPortas() {
		return _nroPortas;
	}

	public void setNroPortas(int nroPortas) {
		_nroPortas = nroPortas;
	}

	public String getTipoCambio() {
		return _tipoCambio;
	}

	public void setTipoCambio(String tipoCambio) {
		_tipoCambio = tipoCambio;
	}

	public String getRevestBanco() {
		return _revestBanco;
	}

	public void setRevestBanco(String revestBanco) {
		_revestBanco = revestBanco;
	}

	public String getTipoDirecao() {
		return _tipoDirecao;
	}

	public void setTipoDirecao(String tipoDirecao) {
		_tipoDirecao = tipoDirecao;
	}

	public int getPotencia() {
		return _potencia;
	}

	public void setPotencia(int potencia) {
		_potencia = potencia;
	}

	public int getLugares() {
		return _lugares;
	}

	public void setLugares(int lugares) {
		_lugares = lugares;
	}

	public int getCapPortaMalas() {
		return _capPortaMalas;
	}
	public void setCapPortaMalas(int capPortaMalas) {
		_capPortaMalas = capPortaMalas;
	}

	@Override
	public String toString() {
		return "Número de Portas: " + _nroPortas 
			+ ", Tipo de câmbio: " + _tipoCambio 
			+ ", Revestimento do banco: " + _revestBanco
			+ ", Tipo de Direção: " + _tipoDirecao 
			+ ", Potência: " + _potencia 
			+ ", Lugares: " + _lugares
			+ ", Capo Porta Malas: " + _capPortaMalas 
			+ ", Placa: " + getPlaca() 
			+ ", Modelo:" + Modelo 
			+ ", Marca: " + Marca
			+ ", Ano: " + Ano 
			+ ", Cor: " + Cor 
			+ ", Proprietário: " + Proprietario 
			+ ", CapTanque:" + CapTanque
			+ ", TipoFreio: " + TipoFreio + super.toString();
	}

	public String toStringV2() {
		return super.toString() + "Número de Portas: " + _nroPortas 
			+ ", Tipo de Câmbio: " + _tipoCambio 
			+ ", RevestBanco: " + _revestBanco
			+ ", Tipo de Direção: " + _tipoDirecao 
			+ ", Potência: " + _potencia 
			+ ", Lugares: " + _lugares
			+ ", Capo Porta Malas: " + _capPortaMalas;
	}
	
}