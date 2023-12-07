import java.util.ArrayList;

import Enum.Opcionais;
import Enum.TipoPratoALaCarte;

class PratoALaCarte extends Item {
    public PratoALaCarte(String nome, String descricao, TipoPratoALaCarte tipoPrato) {
        super(nome, descricao);
        _tipoPrato = tipoPrato;
        opcionais = new ArrayList<>();
    }

    private TipoPratoALaCarte _tipoPrato;
    ArrayList<Opcionais> opcionais;

    public void adicionarOpcional(Opcionais opcional) {
        opcionais.add(opcional);
    }

    @Override
    public double calculoPreco() {
        double precoPadrao = 0;
        switch (_tipoPrato) {
            case ALaMinuta:
                precoPadrao = 32;
                break;
            case Vegano:
                precoPadrao = 17;
                break;
            case Strogonoff:
                precoPadrao = 21;
                break;
        }

        for (Opcionais opcional : opcionais) {
            switch (opcional) {
                case OvoExtra:
                    precoPadrao += 7;
                    break;
                case PorcaoDeFritas:
                    precoPadrao += 12;
                    break;
                case PorcaoArroz:
                    precoPadrao += 9;
                    break;
                case SaladaExtra:
                    precoPadrao += 4;
                    break;
            }
        }
        return precoPadrao;
    }
}