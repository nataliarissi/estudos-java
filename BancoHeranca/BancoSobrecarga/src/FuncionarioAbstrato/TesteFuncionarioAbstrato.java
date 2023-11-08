package FuncionarioAbstrato;

public class TesteFuncionarioAbstrato {

	public static void main(String[] args) {
		Diretor diretor = new Diretor("Natália", 1000f);
		Professor professor = new Professor("Luke", 1000f);

		System.out.println("Salario Diretor: " + diretor.calcularSalario());
		System.out.println("Salario Prof: " + professor.calcularSalario());
	}
}