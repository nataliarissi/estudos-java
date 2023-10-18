package FuncionarioEscolar;

public class TestePessoa {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario("Luke", 1200f);
		Professor professor = new Professor("Sakura", 1800f);
		Diretor diretor = new Diretor("Itachi", 2000f);
		
		System.out.println(funcionario.getSalario());
		System.out.println(professor.getSalario());
		System.out.println(diretor.getSalario());
	}

}