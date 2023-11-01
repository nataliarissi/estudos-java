package Eletronico;

import Enum.ModeloRadio;
import Enum.ModeloTv;
import Enum.ModeloVideoGame;

public class TesteProdutoEletronico {

	public static void main(String[] args) {
		Televisao primeiraTelevisao = new Televisao("Tv do quarto", 1000f, "Sonic", 80,ModeloTv.LCD);
		Televisao segundaTelevisao = new Televisao("Tv da sala de estar", 2800f, "Power", 120,ModeloTv.OLED);
		Televisao terceiraTelevisao = new Televisao("Tv do carro", 880f, "Black", 200,ModeloTv.QLED);

		Radio primeiroRadio = new Radio("Rádio Power", 200, "Xiaomi", 1080, ModeloRadio.HOME);
		Radio segundoRadio = new Radio("Rádio Black", 800, "Nokia", 20, ModeloRadio.PORTATIL);
		Radio terceiroRadio = new Radio("Rádio Up", 550, "JBL", 20, ModeloRadio.VEICULAR);

		Videogame primeiroVideogame = new Videogame("PlayStation 5", 8800, "Microsoft", ModeloVideoGame.Dois);
		Videogame segundoVideogame = new Videogame("PlayStation 4", 7800, "Microsoft", ModeloVideoGame.Um);
		Videogame terceiroVideogame = new Videogame("PlayStation 3", 4110, "Microsoft", ModeloVideoGame.Quatro);
		Videogame quartoVideogame = new Videogame("PlayStation 2", 2800, "Microsoft", ModeloVideoGame.Tres);

		System.out.println(primeiraTelevisao);
		System.out.println(segundaTelevisao);
		System.out.println(terceiraTelevisao);

		System.out.println(primeiroRadio);
		System.out.println(segundoRadio);
		System.out.println(terceiroRadio);

		System.out.println(primeiroVideogame);
		System.out.println(segundoVideogame);
		System.out.println(terceiroVideogame);
		System.out.println(quartoVideogame);
	}
}