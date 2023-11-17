package Padaria;

import Enum.TipoQueijo;

public class Queijo extends Produto{

    public Queijo(String nome, float preco, String marca, TipoQueijo tipo) {
        super(nome, preco, marca);
        _tipo = tipo;
    }

    private TipoQueijo _tipo;

    @Override
	public void descricao() {
		System.out.println("Queijo: " + _tipo + ", preço unit: R$ " + PrecoUnidade);
	}
}