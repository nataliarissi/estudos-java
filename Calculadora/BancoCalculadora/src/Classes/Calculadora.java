package Classes;

import java.util.Scanner;

public class Calculadora {
    Scanner entrada = new Scanner(System.in);

    public int Valor; 
    public String Operacao;

    public Calculadora(){
    }

    public int Somar(int a, int b){
        Operacao = "Soma ";
        Valor = a + b;
        return Valor;
    }

    public int Subtrair(int a, int b){
        Operacao = "Subtração ";
        Valor = a - b;
        return Valor;
    }
    public int ultimoResultado(){
        return Valor;
    }

    public String ultimaOperacao(){
        return ", Último cálculo realizado: " + Operacao;
    }
}