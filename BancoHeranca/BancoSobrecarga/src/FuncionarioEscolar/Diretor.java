package FuncionarioEscolar;

public class Diretor extends Funcionario {

	public Diretor(String nome, float salario) {
		super(nome, salario);
	}

	public float getSalario() {
		float adicional = Salario * 20/100;
		return Salario + adicional;
	}
}