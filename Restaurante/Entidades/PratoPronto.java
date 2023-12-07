import Enum.TipoPratoPronto;

class PratoPronto extends Item {
    public PratoPronto(String nome, String descricao, TipoPratoPronto tipoPrato) {
        super(nome, descricao);
        _tipoPrato = tipoPrato;
    }

    private TipoPratoPronto _tipoPrato;

    @Override
    public double calculoPreco() {

        switch (_tipoPrato) {
            case ALaMinuta:
                return 12;
            case Strogonoff:
                return 29;
            case Vegano:
                return 22;
            default:
                return 0;
        }
    }
}
