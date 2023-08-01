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

    public static void Emprestimo(){

    }

    public static void Listar(){

    }

    public static void Sair(){

    }

    
}
// Cadastro de cliente de um banco, onde é possível realizar as operações descritas 
// abaixo. (cadastro somente de 1 cliente).
// Operação "cadastrar": armazenar seu nome e salário. Não aceitar valor negativo, mostrando 
// mensagem de erro.
// Operação "empréstimo": se salário for maior que 500, mostrar a mensagem "crédito liberado", e 
// o valor do empréstimo, baseado na fórmula (salário * 0.05). Se não for possível, mostrar
// mensagem "empréstimo não liberado".
// Operação "listar": mostrar o nome, salário e o valor do empréstimo (caso ele tenha).
// Operação "sair": sair da aplicação
// Importante: o programa somente pode encerrar se selecionar a operação "sair". Cada operação 
// deve ser executada em uma função. Faça um menu para selecionar as operações