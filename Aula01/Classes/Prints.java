/*
exibir em forma gráfica
JOption.Pane - exibição da caixinha que exibe os dados - variaveis texto
showMessageDialog - exibir a string texto (precisa necessariamente de dois argumentos)
*/

package Aula01;

public class Prints {

	public static void main (String[] args) {

	System.out.print("Exemplo de print");

	System.out.println("Exemplo de println" + "com mais isso daqui" + "!");

	System.out.printf("Exemplo de printf\n");

	System.out.printfln();

	Scanner entrada = new Scanner(System.in);

	System.out.print("Entre com uma string: ");
	String var3 = entrada.next(); //colocar uma string

	System.out.print("Entre com um número: ");
	int var1 = entrada.newInt();
	System.out.print("Entre com um número: ");
	int var2 = entrada.newInt();
	System.out.println(var1 + " e " + var2 + " e " + var3); //concatenação
	int var4 = var1 + var2;
//	System.out.println(var1 + var2);
	System.out.println(var4);

	System.out.printf("%d e %d e %s\n", var1, var2, var3);

//esperando um inteiro ser digitado pelo usuário no console
 }
}

/*
= atribuir a variavel ser verdadeira sempre
== comparação
*/