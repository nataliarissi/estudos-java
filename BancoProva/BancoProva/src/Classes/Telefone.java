package Classes;

public class Telefone {
    private int DDD;
    private int Numero;

    public Telefone(){
    }

    public Telefone(int ddd, int numero){
        DDD = ddd;
        Numero = numero;
    }

    public void configurarTelefone(int ddd, int numero){
        DDD = ddd;
        Numero = numero;
    }

    public int getDDD(){
        return DDD;
    }

    public void setDDD(int ddd){
        DDD = ddd;
    }

    public int getNumero(){
        return Numero;
    }

    public void setNumero(int numero){
        Numero = numero;
    }

    @Override
    public String toString(){
        return "O número de telefone é: (" + DDD + "), " + Numero;
    }
}