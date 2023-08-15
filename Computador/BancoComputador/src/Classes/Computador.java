package Classes;

public class Computador {
    public String Nome;
    public int Clock;

    public String mostraNomeComputador(){
        return "Nome do computador: " + Nome;
    }

    public String mostraClock(){
        return ", Clock do computador: " + Clock;
    }

    public Computador(String nome, int clock){
        Nome = nome;
        Clock = clock;
    }
}