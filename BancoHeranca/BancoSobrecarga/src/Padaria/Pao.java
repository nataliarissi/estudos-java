package Padaria;

import Enum.TipoPao;

public class Pao extends Produto{

    public Pao(String nome, float preco, String marca, TipoPao tipo) {
        super(nome, preco, marca);
		_tipo = tipo;
    }
    
    private TipoPao _tipo;

	@Override
	public void descricao() {
		System.out.println("Pão: " + _tipo + ", preço unit: R$ " + PrecoUnidade + ", marca: " + Marca);
	}
}