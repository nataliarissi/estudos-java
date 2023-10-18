package Ingressos;

public class IngressoVip extends Ingresso{

    public IngressoVip(float valor, String descricao) {
        super(70, "Ingresso VIP (frente do palco)");
    }

    @Override
    public String toString(){
        return "Valor do ingresso Vip: " + Valor + ", descrição: " + Descricao;
    }
}