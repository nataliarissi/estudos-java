package FuncionarioEscolar;

public class Funcionario {
	protected String Nome;
	protected float Salario;
	public Funcionario(String nome, float salario) {
		Nome = nome;
		Salario = salario;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public float getSalario() {
		return Salario;
	}
	public void setSalario(float salario) {
		Salario = salario;
	}
	
}
