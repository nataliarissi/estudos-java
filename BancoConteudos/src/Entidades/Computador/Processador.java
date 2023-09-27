package Entidades.Computador;

public class Processador {
	private float _clock;
	private String _marca;
	
	public Processador(float clock, String marca) {
		_clock = clock;
		_marca = marca;
	}

	public float getClock() {
		return _clock;
	}
    
	public void setClock(float clock) {
		_clock = clock;
	}

	public String getMarca() {
		return _marca;
	}

	public void setMarca(String marca) {
		_marca = marca;
	}
	
	public void statusProcessador() {
		if (_clock > 1000) {
			System.out.println("Computador rápido");
		} else {
			System.out.println("Computador lento");
		}
	}

	@Override
	public String toString() {
		return "Clock do processador: " + _clock + ", marca: " + _marca;
	}
	
}