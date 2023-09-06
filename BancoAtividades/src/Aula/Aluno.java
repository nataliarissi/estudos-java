package Aula;

public class Aluno {
    private String Nome;
    private int Nota;

	public Aluno() {
    }

	public Aluno(String nome, int nota) {
		Nome = nome;
		Nota = nota;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getNota() {
		return Nota;
	}

	public void setNota(int nota) {
		Nota = nota;
	}

	@Override
	public String toString() {
		return "Aluno: " + Nome + ", Nota: " + Nota;
	}    
}