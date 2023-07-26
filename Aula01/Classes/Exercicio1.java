/*
LISTA EXERCÍCIOS AULA01
*/
1. + 1.1
package Aula01;
import java.util.Scanner;
public class Exercicio1{

	public static void main(String[] args){
	System.out.println("Nome: Natália");
	System.out.println("End: Rua Itachi, 021");

	Scanner entrada = new Scanner(Sytem.in);
//	entrada.next(); //coletar string
//	entrada.netInt(); //coletar inteiro
	System.out.print("Nome: ");
	String nome = entrada.next();
	System.out.print("Idade: ");
	int idade = entrada.nextInt();

	System.out.println("Nome: " + nome + ", Idade: " + idade);
 }
}