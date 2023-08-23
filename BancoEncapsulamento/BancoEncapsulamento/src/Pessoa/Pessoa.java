package Pessoa;

public class Pessoa {
    private String Nome;
    private int Idade;
    private String Endereco;

    public Pessoa(){
        Nome = "Luke Lindão";
        Idade = 2;
        Endereco = "Rua dos Anjos, 402";
    }

    public Pessoa(String nome, int idade, String endereco){
        Nome = nome;
        Idade = idade;
        Endereco = endereco;
    }

    public String getNome(){
        return Nome;
    }

    public int getIdade(){
        return Idade;
    }

    public String getEndereco(){
        return Endereco;
    }

    public void setNome(String nome){
        Nome = nome;
    }    

    public void setIdade(int idade){
        Idade = idade;
    }

    public void setEndereco(String endereco){
        Endereco = endereco;
    }

    @Override
    public String toString(){
        return "Nome: " + getNome() + ", Idade: " + getIdade() + ", Endereço: " + getEndereco();
    }
}