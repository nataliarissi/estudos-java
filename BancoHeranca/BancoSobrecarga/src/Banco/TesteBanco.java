package Banco;

public class TesteBanco {
    public static void main(String[] args) {
        ContaBanco contaBanco = new ContaBanco( "Nat701", 500, 0, 6071, 1800, "Luke");
        System.out.println("Conta Banco");        
        System.out.println(contaBanco.toString());

        System.out.println("Conta Básica");    
        ContaBasica contaBasica = new ContaBasica( "Luk807", 8801, 6200, "Itachi", 8012, 0);
        System.out.println(contaBasica.toString());  

        System.out.println("Conta Padrão");    
        ContaPadrao contaPadrao = new ContaPadrao( "Itc001", 9078, 2200, "Sasuke", 10);
        System.out.println(contaPadrao.toString());

        System.out.println("Conta Premium");    
        ContaPremium contaPremium = new ContaPremium( "Lin701", 8701, 1070, "Sakura", 50);
        System.out.println(contaPremium.toString());
    }
}