import Entidades.Casa.Casa;
import Entidades.Casa.Janela;
import Entidades.Casa.Porta;
import Entidades.Computador.Computador;
import Entidades.Computador.Disco;
import Entidades.Computador.Processador;

public class App {
    public static void main(String[] args) throws Exception {

		Casa primeiraCasa = new Casa(100f);
		primeiraCasa.AdicionarJanela(new Janela(2));
		primeiraCasa.AdicionarJanela(new Janela(4));
		primeiraCasa.AdicionarJanela(new Janela(7));
		primeiraCasa.AdicionarPorta(new Porta("branca", 3));
		primeiraCasa.AdicionarPorta(new Porta("cinza", 5));
		primeiraCasa.AdicionarPorta(new Porta("preto", 4));
		
		System.out.println(primeiraCasa);
		
		System.out.println("Tamanho da casa: " + primeiraCasa.getTamanhoEmMetros());
		primeiraCasa.ListarJanelas_();
		primeiraCasa.ListarPortas_();

		System.out.println("----------------------------------------------------");

		Processador primeiroProcessador = new Processador(900f, "Power");
		Computador primeiroComputador = new Computador("Notebook trabalho", 7500f, primeiroProcessador);
		primeiroComputador.AdicionarDisco(new Disco(500f, "SSD"));
		
		Disco primeiroDisco = new Disco(2000f, "HDD");
		primeiroComputador.AdicionarDisco(primeiroDisco);
		
		primeiroComputador.ListarDiscos();
		System.out.println(primeiroComputador);
		primeiroComputador.getCpu().statusProcessador();

   }
}