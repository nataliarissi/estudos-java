package FuncionarioAbstrato;

public class Professor extends Funcionario {
	
	public Professor(String nome, float salario) {
		super(nome, salario);
	}

	@Override
	public float calcularSalario() {
		float adicional = Salario * 15/100;
		return Salario + adicional;
	}
}