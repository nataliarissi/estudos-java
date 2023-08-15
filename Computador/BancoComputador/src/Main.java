import java.util.Scanner;

import Classes.Computador;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do computador: ");
        String nome = scanner.next();
        System.out.println("Digite o clock: ");
        int clock = scanner.nextInt();

        Computador comp = new Computador(nome, clock);

        System.out.println(comp.mostraNomeComputador() + comp.mostraClock());
    }
}

// Método 
// 1. instanciar que nem scanner 
// 2. colocar nome varrável + função aonde o método está