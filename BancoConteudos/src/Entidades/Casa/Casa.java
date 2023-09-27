package Entidades.Casa;

import java.util.ArrayList;

public class Casa {
	private float _tamanhoEmMetros;
	private ArrayList<Porta> portas;
	private ArrayList<Janela> janelas;
	   
	public Casa (float tamanhoEmMetros) {
		_tamanhoEmMetros = tamanhoEmMetros;
		this.portas = new ArrayList<Porta>();
		this.janelas = new ArrayList<Janela>();
	}
	
	public void AdicionarPorta(Porta p) {
		this.portas.add(p);
	}

	public void AdicionarJanela(Janela j) {
		this.janelas.add(j);
	}

	public void ListarJanelas_() {
		for (Janela minhaQueridaJanela : this.janelas) {
			System.out.println(minhaQueridaJanela);
		}
	}

	public String ListarJanelas() {
		String janelas = "";
		for (Janela j : this.janelas) {
			janelas = janelas + j + "\n";
		}
		return janelas;
	}

	public void ListarPortas_() {
		for (Porta minhaQueridaPorta : this.portas) {
			System.out.println(minhaQueridaPorta);
		}
	}

	public String ListarPortas() {
		String portas = "";
		for (Porta p : this.portas) {
			portas += p + "\n";
		}
		return portas;
	}

	public float getTamanhoEmMetros() {
		return _tamanhoEmMetros;
	}

	public void setTamanhoEmMetros(float tamanhoEmMetros) {
		_tamanhoEmMetros = tamanhoEmMetros;
	}

	@Override
	public String toString() {
		return "Tamanho Em Metros: " + _tamanhoEmMetros + "m2" + "\nPortas: " + ListarPortas() + ", Janelas: " + ListarJanelas();
	}
	   
}