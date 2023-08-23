import Celular.Celular;
import Pessoa.Pessoa;
import Veiculos.Carro;

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


    }
}