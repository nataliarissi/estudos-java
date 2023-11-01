package EmpresaTelecomunicacoes;

public class Modem {
    
    public Modem(String nome, String modelo, float velocidade, int nroPortarsEth){
        Nome = nome;
        Modelo = modelo;
        Velocidade = velocidade;
        NroPortarsEth = nroPortarsEth;
    }
    
    protected String Nome;
    protected String Modelo;
    protected float Velocidade;
    protected int NroPortarsEth;

    @Override 
    public String toString(){
        return "Nome do Modem: " + Nome 
            + ", modelo: " + Modelo 
            + ", velocidade: " + Velocidade
            + ", número de portasEth: " + NroPortarsEth;
    }
}
