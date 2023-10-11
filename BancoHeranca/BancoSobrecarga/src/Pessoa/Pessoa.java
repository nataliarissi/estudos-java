package Pessoa;

public class Pessoa {
	protected String Nome;
	protected Endereco Endereco;
	protected int Telefone;
	
	public Pessoa(String nome, Endereco endereco, int telefone) {
		Nome = nome;
		Endereco = endereco;
		Telefone = telefone;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Endereco getEndereco() {
		return Endereco;
	}

	public void setEndereco(Endereco endereco) {
		Endereco = endereco;
	}

	public int getTelefone() {
		return Telefone;
	}

	public void setTelefone(int telefone) {
		Telefone = telefone;
	}

	@Override
	public String toString() {
		return "Nome: " + Nome + ", endereco: " + Endereco + ", telefone: " + Telefone;
	}
	
}