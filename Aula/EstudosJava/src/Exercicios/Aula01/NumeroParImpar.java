//6.
//núnmero de 1 a 100 quais são pares e ímpares na tela

package Exercicios.Aula01;

public class Exercicio6 {
    public static void ExecutarExercicio6(){
        for(int numero = 1 ; numero<=100 ;  numero++){
            String parImpar = numero % 2 == 0 ? "Par" : "Impar"; //ternário
            System.out.println("Resultado: " + numero + "  " + parImpar);
        //     if(numero % 2 == 0)
        //         System.out.println("Número par: " + numero);
        //% é p resto da divisão
        //     else
        //         System.out.println("Número ímpar: " + numero);
      }
    }
}