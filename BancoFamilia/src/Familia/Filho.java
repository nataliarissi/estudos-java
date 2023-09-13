package Familia;

public class Filho {
	private String Nome;

    public Filho(){
    }

	public Filho(String nome) {
		Nome = nome;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	@Override
	public String toString() {
		return "Nome do filho:" + Nome;
	}
}