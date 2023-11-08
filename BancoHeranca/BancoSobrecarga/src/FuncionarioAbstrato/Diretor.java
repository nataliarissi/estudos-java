package FuncionarioAbstrato;

public class Diretor extends Funcionario {
	
	public Diretor(String nome, float salario) {
		super(nome, salario);
	}

	@Override
	public float calcularSalario() {
		float adicional = Salario * 20/100;
		return Salario + adicional;
	}
}