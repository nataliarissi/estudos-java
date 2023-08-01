import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        Operacoes operacoes = new Operacoes();
        int escolha;
    do{    
        System.out.println("Banco");
        System.out.println("Digite a opção 1.Cadastrar  2.Empréstimo  3.Listar  4.Sair");
        escolha = entrada.nextInt();

        switch(escolha){

            case 1 : operacoes.CadastrarCliente();
                     break;
                    
        }

    }while(escolha!=4);
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