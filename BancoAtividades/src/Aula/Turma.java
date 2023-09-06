package Aula;

public class Turma {
    private String _nomeTurma;
    private Aluno _primeiroAluno;
    private Aluno _segundoAluno;
    
    public Turma(String nomeTurma, Aluno primeiroAluno, Aluno segundoAluno){
        _nomeTurma = nomeTurma;
        _primeiroAluno = primeiroAluno;
        _segundoAluno = segundoAluno;
    }

    public String getNomeTurma(){
        return _nomeTurma;
    }

    public Aluno getPrimeiroAluno(){
        return _primeiroAluno;
    }

    public Aluno getSegundoAluno(){
        return _segundoAluno;
    }

    public String setNomeTurma(){
        return _nomeTurma;
    }

    public void setPrimeiroAluno(Aluno primeiroAluno){
        _primeiroAluno = primeiroAluno;
    }
    
    public void setSegundoAluno(Aluno segundoAluno){
        _segundoAluno = segundoAluno;
    }

	@Override
	public String toString() {
		return "Turma: " + _nomeTurma + ", Primeiro Aluno: " + _primeiroAluno + ", Segundo Aluno: " + _segundoAluno;
	}
	
}