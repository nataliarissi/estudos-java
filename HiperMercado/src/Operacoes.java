import java.util.ArrayList;
import java.util.Scanner;

import Classes.Distribuidor;

public class Operacoes {
    public ArrayList <Distribuidor> Distribuidores; //atributo
    private Scanner Scanner;

    public Operacoes(){
        Distribuidores = new ArrayList<Distribuidor>(); //dar valor
        Scanner = new Scanner(System.in);
    }

    public void CadastrarDistribuidor(){
        System.out.println("Digite seu Nome: ");
        String nome = Scanner.next();
        System.out.println("Digite seu Email: ");
        String email = Scanner.next();
        System.out.println("Digite seu Ramo: ");
        String ramo = Scanner.next();

        Distribuidor distribuidor = new Distribuidor();
        distribuidor.Nome = nome;
        distribuidor.Email = email;
        distribuidor.Ramo = ramo;

        Distribuidores.add(distribuidor);
    }
}
