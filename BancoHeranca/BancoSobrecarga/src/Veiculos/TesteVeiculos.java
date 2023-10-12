package Veiculos;

public class TesteVeiculos {

	public static void main(String[] args) {
		Moto moto = new Moto("NAT6601", "180", "Yamaha", 2010, "preto",
				"Luke", 11, "disco", 120, "Street", "elétrica", false);
		System.out.println(moto.getTipoPartida());
		System.out.println(moto.getPlaca());
		System.out.println(moto);
		
		Carro carro = new Carro("ITH7081", "Onix", "Chevrolet ", 2000, "branco", 
				"Itachi", 41, "disco", 7, "manual", "tecido", "manual", 75, 4, 200);
		System.out.println(carro.getPlaca());
		System.out.println(carro.getRevestBanco());
		System.out.println(carro);
	}
}