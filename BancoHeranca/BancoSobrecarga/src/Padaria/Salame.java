package Padaria;

import Enum.TipoSalame;

public class Salame extends Produto{

    public Salame(String nome, float preco, String marca, TipoSalame tipo) {
        super(nome, preco, marca);
        _tipo = tipo;
    }
    
        private TipoSalame _tipo;
    
    @Override
    public void descricao() {
        System.out.println("Salame: " + _tipo + ", preço unit: R$ " + PrecoUnidade);
    }
}