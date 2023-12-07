import Enum.Opcionais;
import Enum.TipoPratoALaCarte;
import Enum.TipoPratoPronto;

public class TesteRestaurante {
    public static void main(String[] args) {
        PratoPronto pratoPronto = new PratoPronto("Prato Delicioso", "Prato ALaMinuta", TipoPratoPronto.ALaMinuta);

        PratoALaCarte primeiroPratoALaCarte = new PratoALaCarte("Prato Fino", "Prato Vegano", TipoPratoALaCarte.Vegano);
        primeiroPratoALaCarte.adicionarOpcional(Opcionais.SaladaExtra);
        primeiroPratoALaCarte.adicionarOpcional(Opcionais.PorcaoArroz);

        PratoALaCarte segundoPratoALaCarte2 = new PratoALaCarte("Prato Especial do Chef", "Strogonoff de Frango", TipoPratoALaCarte.Strogonoff);
        segundoPratoALaCarte2.adicionarOpcional(Opcionais.OvoExtra);
        segundoPratoALaCarte2.adicionarOpcional(Opcionais.PorcaoDeFritas);

        System.out.println("Prato Pronto:");
        System.out.println("Nome: " + pratoPronto.Nome);
        System.out.println("Descrição: " + pratoPronto.Descricao);
        System.out.println("Preço: " + pratoPronto.calculoPreco());

        System.out.println("Primeiro prato a la Carte:");
        System.out.println("Nome: " + primeiroPratoALaCarte.Nome);
        System.out.println("Descrição: " + primeiroPratoALaCarte.Descricao);
        System.out.println("Preço: " + primeiroPratoALaCarte.calculoPreco());
        System.out.println("Opcionais: " + primeiroPratoALaCarte.opcionais);

        System.out.println("Segundo Prato a la Carte:");
        System.out.println("Nome: " + segundoPratoALaCarte2.Nome);
        System.out.println("Descrição: " + segundoPratoALaCarte2.Descricao);
        System.out.println("Preço: " + segundoPratoALaCarte2.calculoPreco());
        System.out.println("Opcionais: " + segundoPratoALaCarte2.opcionais);
    }
}