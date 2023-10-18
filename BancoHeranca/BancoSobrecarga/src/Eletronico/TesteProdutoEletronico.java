package Eletronico;

public class TesteProdutoEletronico {

	public static void main(String[] args) {
		Televisao televisao = new Televisao("Tv do quarto", 1000f, "Sonic", 80, "LCD");
		Radio radio = new Radio("Rádio Power", 200, "JBL", 20);
		Videogame videogame = new Videogame("PlayStation 5", 4000, "Microsoft", 2);
		
		System.out.println(televisao);
		System.out.println(radio);
		System.out.println(videogame);
	}
}