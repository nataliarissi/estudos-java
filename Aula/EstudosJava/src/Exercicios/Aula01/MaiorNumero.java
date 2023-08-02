//3.
// Verificar maior número digitado e jogar na tela seu valor
package Exercicios.Aula01;

import java.util.Scanner;

public class MaiorNumero {
    public static void ExecutarExercicio(){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Primeiro número: ");
    int variavel1 = entrada.nextInt();
    System.out.println("Segunda número: ");
    int variavel2 = entrada.nextInt();
    if(variavel1 > variavel2)
    System.out.println("Maior número digitado" + variavel1);
    else if(variavel2 > variavel1)
    System.out.println("Maior número digitado" + variavel2);
    }
}
/* 
    Na main se não tivesse o static aqui
    Exercicio3 exercicio3 = new Exercicio3();
    exercicio3.ExecutarExercicio();
 */
