import java.util.ArrayList;
import java.util.Scanner;

public class Operacoes {
    public Operacoes(){
        Clientes = new ArrayList<Cliente>(); //gerar lista vazia - salvar os dados ao instanciar
        Entrada = new Scanner(System.in);
    }
    public Scanner Entrada;
    ArrayList<Cliente> Clientes;
    public void CadastrarCliente(){
        System.out.println("Nome");
        String nome = Entrada.next();
        System.out.println("Salário");
        double salario = Entrada.nextDouble();
        if(salario < 0){
            System.out.println("Erro");
            return;
        }

        Cliente cliente = new Cliente(nome, salario); //instanciar - passar as variáveis criadas em Cliente
        Clientes.add(cliente); //add item na lista
        System.out.println("Tamanho: " + Clientes.size()); //retorna quantos itens tem no array - colocar num print

    }

    public void Emprestimo(){
        System.out.println("Digite o nome do usuário para realizar o empréstimo:");
        String nome = Entrada.next();
        for(int n=0; n < Clientes.size(); n++){
            Cliente cliente = Clientes.get(n);
        if(nome.equals(cliente.Nome)){ //comparação no java - if
            cliente.Emprestimo = cliente.Salario * 0.05;
            System.out.println("Empréstimo: " + cliente.Emprestimo);
            return;
        }
      }
      System.out.println("Erro");
    }

    public void Listar(){
        System.out.println("Lista de clientes com salário e empréstimos: ");
        for(int n=0; n < Clientes.size(); n++){
            Cliente cliente = Clientes.get(n);
            if(cliente.Emprestimo > 0)
                System.out.println(cliente.toString());
                return;
    }
 }

    public void Sair(){
        System.exit(0);
    }

    
}