import Celular.Celular;
import FolhaPagamento.FolhaPagamento;
import Pessoa.Pessoa;
import Veiculos.Carro;
import Veiculos.Moto;

public class Main{
    public static void main(String[] args) throws Exception {

        Carro car = new Carro();

        car.SetNome("Ethios");
        car.SetPotencia(1600);

        System.out.println(car.toString());

///////////////////////////////////////////////////

        Celular primeiroCelular = new Celular("Vivo");
        Celular segundoCelular = new Celular();

        // primeiroCelular.setNumeroCelular("(XX) XXXX-XXXX");
        // primeiroCelular.setNumeroCelular("Vivo");
        
        System.out.println(primeiroCelular.toString());
        
        segundoCelular.setNumeroCelular("(XX) XXXXX-XXXX");
        segundoCelular.setOperadora("Claro");

        System.out.println("Número do segundo celular: " + segundoCelular.getNumeroCelular() + ", Operadora: " + segundoCelular.getOperadora());
    
///////////////////////////////////////////////////

        Pessoa primeiraPessoa = new Pessoa();
        Pessoa segundaPessoa = new Pessoa("Nappa Lindão", 1, "Rua Amor da Minha Vida, 969");

        System.out.println(primeiraPessoa.toString());
        System.out.println(segundaPessoa.toString());

///////////////////////////////////////////////////

        Moto moto = new Moto();

        System.out.println(moto.toString());

///////////////////////////////////////////////////

        FolhaPagamento primeiraFolhaPag = new FolhaPagamento();
        FolhaPagamento segundaFolhaPag = new FolhaPagamento("Ayanokoji", 1800, "Kei", 1550);

        System.out.println(primeiraFolhaPag.toString());
        System.out.println(segundaFolhaPag.toString());
        System.out.println("Valor total da primeira folha: " + primeiraFolhaPag.totalFolhaPagamento());
        System.out.println("Valor total da segunda folha: " + segundaFolhaPag.totalFolhaPagamento());
    }
}