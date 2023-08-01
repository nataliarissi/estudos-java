//2.
//área de um quadrado e escrever na tela - ler lado A e lado B 
// Ler valores, calcular e jogar na tela resultado
package Exercicios.Aula01;
import java.util.Scanner;
public class Exercicio2{

	public static void main(String[] args){
	Scanner entrada = new Scanner(System.in);

	System.out.print("Medida lado 1: ");
	float base = entrada.nextFloat();
	System.out.print("Medida lado 2: ");
	float altura = entrada.nextFloat();
	float resultado = base*altura;
//	System.out.println(base*altura); só imprimir na tela
	System.out.println("Área do quadrado: " + resultado);
//armazenar na variável e usar depois no decorrer do código

 }
}
