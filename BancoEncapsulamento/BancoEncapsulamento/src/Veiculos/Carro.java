package Veiculos;

public class Carro {
    private String Nome;
    private int Potencia;

    public String GetNome(){
        return Nome;
    }

    public void SetNome(String nome){
        Nome = nome;
    }

    public int GetPotencia(){
        return Potencia;
    }

    public void SetPotencia(int potencia){
        Potencia = potencia;
 
    }

    @Override
    public String toString(){
        return "Nome: " + GetNome() + ", Potência: " + GetPotencia();
    }
}
