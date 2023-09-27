package Entidades.Computador;

public class Disco {
	private float _capacidade;
	private String _tipo; //SSD ou HD
	
	public Disco(float capacidade, String tipo) {
		_capacidade = capacidade;
		_tipo = tipo;
	}
	
	public float getCapacidade() { return _capacidade; }

	public void setCapacidade(float capacidade) {
		_capacidade = capacidade;
	}

	public String getTipo() {
		return _tipo;
	}
    
	public void setTipo(String tipo) {
		_tipo = tipo;
	}

	@Override
	public String toString() {
		return "Capacidade do disco: " + _capacidade + ", tipo: " + _tipo;
	}
	
}
//ArrayList<tiposDeDados> nome do Array;
//for(Disco d : discos)