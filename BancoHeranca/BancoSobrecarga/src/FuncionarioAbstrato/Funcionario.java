package FuncionarioAbstrato;

public abstract class Funcionario {

	public Funcionario(String nome, float salario) {
		Nome = nome;
		Salario = salario;
	}

	protected String Nome;
	protected float Salario;
	
	public abstract float calcularSalario();

	@Override
	public String toString() {
		return "Nome do funcionário" + Nome + ", salário:" + Salario;
	}
}