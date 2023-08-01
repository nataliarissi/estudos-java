//10
//Fórmula de Bhaskara 
package Exercicios.Aula01;

import java.util.Scanner;

public class Bhaskara {

    public static void ExecutarExercicio10(){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite o valor para calcular a raiz quadrada");
    System.out.println("Digite um número para ser o a da operação");
    int valor1 = entrada.nextInt();
    System.out.println("Digite um número para ser o b da operação");
    int valor2 = entrada.nextInt();
    System.out.println("Digite um número para ser o c da operação");
    int valor3 = entrada.nextInt();

    double delta = (valor2*valor2)-4*valor1*valor3;
    if(delta>=0){
        double raiz = Math.sqrt(delta);
        double calculo1 = (-valor2-raiz)/(2*valor1);
        double calculo2 = (-valor2+raiz)/(2*valor1);

        System.out.println("Resultado da bhaskara: " + calculo1 + calculo2);
    }
    else
        System.out.println("Inválido");
 } 
}
