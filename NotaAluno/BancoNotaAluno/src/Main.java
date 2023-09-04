import java.util.Scanner;

import Classe.NotaAluno;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Calcular a média do aluno");
        System.out.println("Digite o nome do aluno");
        String nomeAluno = entrada.next();
        System.out.println("Digite a primeira nota do aluno");
        float nota1 = entrada.nextFloat();
        System.out.println("Digite a segunda nota do aluno");
        float nota2 = entrada.nextFloat();
       
        NotaAluno nota = new NotaAluno(nomeAluno, nota1, nota2);

        System.out.println(nota.mostraNomeAluno() + ", Média do aluno: " + nota.mediaDoAluno());
        nota.statusAluno();

        // NotaAluno primeiraNota = new NotaAluno(nomeAluno, nota1, nota2);
        // NotaAluno segundaNota = new NotaAluno("Luke", 8, 9);

        // System.out.println(primeiraNota.mostraNomeAluno() + ", Média do aluno: " + primeiraNota.mediaDoAluno());
        // primeiraNota.statusAluno();
        // System.out.println(segundaNota.mostraNomeAluno() + ", Média do aluno: " + segundaNota.mediaDoAluno());
        // segundaNota.statusAluno();
    }
}