package Classe;

public class NotaAluno {
    public String NomeAluno;
    public float Nota1;
    public float Nota2;

    public NotaAluno(String nomeAluno, float nota1, float nota2){
        NomeAluno = nomeAluno;
        Nota1 = nota1;
        Nota2 = nota2;
    }

    public String mostraNomeAluno(){
        return "Nome do Aluno: " + NomeAluno;
    }

    public void statusAluno(){
        float media = (Nota1 + Nota2) / 2;
        if(media >= 7)
            System.out.println("Staus: Aprovado");
        else if(media >= 5)
            System.out.println("Staus: Em recuperação");
        else 
            System.out.println("Staus: Reprovado");
    }

    public float mediaDoAluno(){
        float resultado = (Nota1 + Nota2) / 2;
        return resultado;
    }

    // @Override
	// public String toString() {
	// 	return "Nome do Aluno: " + NomeAluno + ", primeira nota: R$" + Nota1 + ", segunda nota: " + Nota2;
	// }
}