package Classe;

public class NotaFiscal {
    public String NomeItem1;
    public String NomeItem2;
    public float PrecoItem1;
    public float PrecoItem2;

    public NotaFiscal(String nomeItem1, String nomeItem2, float precoItem1, float precoItem2){
        NomeItem1 = nomeItem1;
        NomeItem2 = nomeItem2;
        PrecoItem1 = precoItem1;
        PrecoItem2 = precoItem2;
    }

    public float calculaNotaFiscal(){
        float calculo = PrecoItem1 + PrecoItem2;
        return calculo;
    }

    public String mostraNomeItem1(){
        return NomeItem1;
    }

    public String mostraNomeItem2(){
        return NomeItem2;
    }
}