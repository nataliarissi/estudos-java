package Ingressos;

public class IngressoPista extends Ingresso{

    public IngressoPista(float valor, String descricao) {
        super(40, "Ingresso Pista (na pista)");
    }

    @Override
    public String toString(){
        return "Valor do ingresso Pista: " + Valor + ", descrição: " + Descricao;
    }
}