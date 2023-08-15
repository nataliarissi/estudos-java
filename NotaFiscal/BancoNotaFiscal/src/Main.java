import java.util.Scanner;

import Classe.NotaFiscal;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Nota Fiscal");
        System.out.println("Digite o nome do primeiro item");
        String nomeItem1 = entrada.next();
        System.out.println("Digite o nome do segundo item");
        String nomeItem2 = entrada.next();
        System.out.println("Digite o preço do primeiro item");
        float precoItem1 = entrada.nextFloat();
        System.out.println("Digite o nome do segundo item");
        float precoItem2 = entrada.nextFloat();

        NotaFiscal nota = new NotaFiscal(nomeItem1, nomeItem2, precoItem1, precoItem2);

        System.out.println("NotaFiscal: " + nota.calculaNotaFiscal() + ", Item 1: "+ nota.mostraNomeItem1() + ", Item 2: " + nota.mostraNomeItem2());
    }
}
//lista + for