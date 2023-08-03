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
            
            case 2 : operacoes.Emprestimo();
                     break;

            case 3 : operacoes.Listar();
                     break;

            case 4 : operacoes.Sair();
                     break;
        }

    }while(escolha!=4);
 }
}