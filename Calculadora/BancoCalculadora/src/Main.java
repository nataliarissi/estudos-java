import java.util.Scanner;

import Classes.Calculadora;

public class Main {
    public static void main(String[] args) throws Exception {    
        Scanner entrada = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        int escolha;
        do{
        System.out.println("Calculadora");
        System.out.println("Digite o valor do primeiro número");
        int a = entrada.nextInt();
        System.out.println("Digite o valor do segundo número");
        int b = entrada.nextInt();
        System.out.println("Digite sua escolha:  1.Adição  2.Subtração  3.Histórico  4.Sair");
        escolha = entrada.nextInt();
            
        switch(escolha){

            case 1: int resultadoSoma = calc.Somar(a, b);
                    System.out.println("Resultado da soma: " + resultadoSoma);
                    break;

            case 2: int resultadoSubtracao = calc.Subtrair(a, b);
                    System.out.println("Resultado da subtração: " + resultadoSubtracao);
                    break;

            case 3: System.out.println("Resultado: " + calc.ultimoResultado() + calc.ultimaOperacao());
                    break;

            case 4: return;
            }
        }while(escolha != 4);
    }
}

