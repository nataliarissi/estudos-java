package FuncionarioEscolar;

public class Professor extends Funcionario {

	public Professor(String nome, float salario) {
		super(nome, salario);
	}
	
	public float getSalario() {
		float adicional = Salario * 15/100;
		return Salario + adicional;
	}
	
}