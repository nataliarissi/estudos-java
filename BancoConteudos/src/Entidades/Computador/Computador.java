package Entidades.Computador;

import java.util.ArrayList;

public class Computador {
	private String _nome;
	private float _preco;
	private Processador cpu;
	private ArrayList<Disco> discos;
	
	public Computador(String nome, float preco, Processador cpu, 
		ArrayList<Disco> discos) {
		_nome = nome;
		_preco = preco;
		this.cpu = cpu;
		this.discos = discos;
	}
	
	public Computador(String nome, float preco, Processador cpu) {
		_nome = nome;
		_preco = preco;
		this.cpu = cpu;
		this.discos = new ArrayList<Disco>();
	}

	public void AdicionarDisco(Disco d) {
		this.discos.add(d);
	}

	public void ListarDiscos() {
		for (Disco d : this.discos) {
			System.out.println(d);
		}
	}
	
	public String getNome() {
		return _nome;
	}

	public void setNome(String nome) {
		_nome = nome;
	}

	public float getPreco() {
		return _preco;
	}

	public void setPreco(float preco) {
		_preco = preco;
	}

	public Processador getCpu() {
		return cpu;
	}

	public void setCpu(Processador cpu) {
		this.cpu = cpu;
	}

	public ArrayList<Disco> getDiscos() {
		return discos;
	}

	public void setDiscos(ArrayList<Disco> discos) {
		this.discos = discos;
	}

	@Override
	public String toString() {
		return "Nome do computador: " + _nome + ", preco=" + _preco + ", cpu=" + cpu + ", discos=" + discos;
	}
	
}