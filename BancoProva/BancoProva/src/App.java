import Classes.Pessoa;
import Classes.Telefone;

public class App {
    public static void main(String[] args) {
      
        Pessoa primeiraPessoa = new Pessoa();
        Pessoa segundaPessoa = new Pessoa();

        segundaPessoa.setNome("Itachi");

        Telefone primeiroTelefone = new Telefone();
        Telefone segundoTelefone = new Telefone(55, 988888888);

        segundaPessoa.setTelefone(segundoTelefone);

        System.out.println(primeiraPessoa.toString());

        System.out.println("Nome da segunda pessoa é: " + segundaPessoa.getNome() + ", O número de telefone é: (" + segundaPessoa.getTelefone().getDDD() + ") " + segundaPessoa.getTelefone().getNumero());

////////////////////////////////////////////////////////////////////////////////////////////

        Monitor mon = new Monitor("Tela Power", 1900, "muito bom para programar");

        System.out.println(mon.toString());
    }
}