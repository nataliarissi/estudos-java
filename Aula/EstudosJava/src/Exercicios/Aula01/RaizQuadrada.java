//7.
//Ler valor 'x' e calcular raiz quadrada do número
//Cálculo deve ser feito em uma função e jogar na tela o resultado

package Exercicios.Aula01;

import java.util.Scanner;

public class RaizQuadrada {
 //   Math.sqrt(numero) raiz
 public static void ExecutarExercicio7(){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite o valor para calcular sua raiz quadrada");
    double valor = entrada.nextDouble();
    double calculo = Math.sqrt(valor);
    System.out.println(calculo);
 }
}

// Como chamar na main
// public class Principal {
//     public static void main(String[] args) {
//         Exercicio7.ExecutarExercicio7();
//     }
// }

