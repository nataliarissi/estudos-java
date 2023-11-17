package Padaria;

import Enum.TipoDeLeite;
import Enum.TipoDeClassificacaoLeite;

public class Leite extends Produto {

    public Leite(String nome, float preco, String marca, 
        TipoDeLeite tipo, TipoDeClassificacaoLeite classificacao) {
        super(nome, preco, marca);
        _tipo = tipo;
        _classificacao = classificacao;
    }

    private TipoDeLeite _tipo;
    private TipoDeClassificacaoLeite _classificacao;

    @Override
    public void descricao() {
		System.out.println("Leite: " + _tipo + ", preço unit: R$ " + PrecoUnidade + ", marca: " + Marca
		+ ", classificação: " + _classificacao);
    }
}