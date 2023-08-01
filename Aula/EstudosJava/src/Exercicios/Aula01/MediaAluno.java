//4.
//3 notas fornecidas de um aluno e calcular média da nota do aluno
package Exercicios.Aula01;

import java.util.Scanner;

public class Exercicio4 extends ClasseComLeitor{
    public static void ExecutarExercicio4(){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Notas Aluno ");
    System.out.println("Digite a primeira nota: ");
    int nota1 = entrada.nextInt();
    System.out.println("Digite a segunda nota: ");
    int nota2 = entrada.nextInt();
    System.out.println("Digite a terceira nota: ");
    int nota3 = entrada.nextInt();

    int media = (nota1 + nota2 + nota3) / 3;
    if(media>=7.0)
        System.out.println("Aprovado");
    else if(media >=5.0 && media < 7.0)
        System.out.println("Recuperação");
    else if (media < 5.0)
        System.out.println("Reprovado"); 
    }

    @Override
    public void ExecutarExercicio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ExecutarExercicio'");
    }
}
