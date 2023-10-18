package Ingressos;

public class IngressoBackStage extends Ingresso{
    
    public IngressoBackStage(float valor, String descricao) {
        super(100, "Ingresso BackStage (perto do palco)");
    }

    @Override
    public String toString(){
        return "Valor do ingresso BackStage: " + Valor + ", descrição: " + Descricao;
    }
}