package Local;

public class Pessoa {
    private String Nome;
    private Endereco Endereco;
    
    public Pessoa() {
    }

	public Pessoa(String nome, Endereco endereco) {
		Nome = nome;
		Endereco = endereco;
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

	@Override
	public String toString() {
		return "Nome: " + Nome + ", Endereço=" + Endereco;
	}    
}