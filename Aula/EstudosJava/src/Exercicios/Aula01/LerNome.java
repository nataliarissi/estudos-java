/*
LISTA EXERCÍCIOS AULA01
*/
// 1. + 1.1. Escreva na tela nome e endereço
//ler nome e idade - escrever na tela
package Exercicios.Aula01;
import java.util.Scanner;
public class LerNome{

	public static void main(String[] args){
	System.out.println("Nome: Natália");
	System.out.println("End: Rua Itachi, 021");

	Scanner entrada = new Scanner(System.in);
//	entrada.next(); //coletar string
//	entrada.netInt(); //coletar inteiro
	System.out.print("Nome: ");
	String nome = entrada.next();
	System.out.print("Idade: ");
	int idade = entrada.nextInt();

	System.out.println("Nome: " + nome + ", Idade: " + idade);
 }
}