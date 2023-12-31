package Veiculos;

public class Moto extends Veiculo {

	public Moto(String placa, String modelo, String marca, int ano, 
		String cor, String proprietario, int capTanque,
		String tipoFreio, int cilindrada, String tipoMoto, 
		String tipoPartida, boolean carenagem) {
		
		super(placa, modelo, marca, ano, cor, proprietario, capTanque, 
		tipoFreio);
		_cilindrada = cilindrada;
		_tipoMoto = tipoMoto;
		_tipoPartida = tipoPartida;
		_carenagem = carenagem;
	}

	private int _cilindrada;
	private String _tipoMoto;
	private String _tipoPartida;
	private boolean _carenagem;

	public int getCilindrada() {
		return _cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		_cilindrada = cilindrada;
	}

	public String getTipoMoto() {
		return _tipoMoto;
	}

	public void setTipoMoto(String tipoMoto) {
		_tipoMoto = tipoMoto;
	}

	public String getTipoPartida() {
		return _tipoPartida;
	}

	public void setTipoPartida(String tipoPartida) {
		_tipoPartida = tipoPartida;
	}

	public boolean isCarenagem() {
		return _carenagem;
	}

	public void setCarenagem(boolean carenagem) {
		_carenagem = carenagem;
	}

	@Override
	public String toString() {
		return "Cilindrada: " + _cilindrada 
				+ ", Tipo de Moto: " + _tipoMoto 
				+ ", Tipo de Partida: " + _tipoPartida
				+ ", Carenagem: " + _carenagem 
				+ ", Modelo: " + Modelo 
				+ ", Marca: " + Marca 
				+ ", Ano: " + Ano 
				+ ", Cor: " + Cor 
				+ ", Proprietário: " + Proprietario 
				+ ", Capacidade do Tanque: " + CapTanque 
				+ ", Tipo de Freio: " + TipoFreio
				+ ", getPlaca(): " + getPlaca();
	}		
}