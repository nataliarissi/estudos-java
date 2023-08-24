package Veiculos;

public class Moto {
    private String Nome;
    private String Marca;
    private int Potencia;
    private int Peso;

    public Moto(){
        Nome = "X-ADV";
        Marca = "Honda";
        Potencia = 2100;
        Peso = 1800;
    }

    public Moto(String nome, String marca, int potencia, int peso){
        Nome = nome;
        Marca = marca;
        Potencia = potencia;
        Peso = peso;
    }

    public String getNome(){
        return Nome;
    }

    public String getMarca(){
        return Marca;
    }

    public int getPotencia(){
        return Potencia;
    }

    public int getPeso(){
        return Peso;
    }

    public void setNome(String nome){
        Nome = nome;
    }    

    public void setIdade(String marca){
        Marca = marca;
    }

    public void setPotencia(int potencia){
        Potencia = potencia;
    }

    public void setPeso(int peso){
        Peso = peso;
    }

    @Override
    public String toString(){
        return "Nome da moto: " + getNome() + ", marca: " + getMarca() + ", potência: " + getPotencia() + ", peso:" + getPeso();
    }

}