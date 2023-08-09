public class Computador {
    public String Nome;
    public int Clock;

    public void mostraNomeComputador(){
        System.out.println("Nome do computador: " + Nome);
    }

    public void mostraClock(){
        System.out.println("Clock do computador: " + Clock);
    }

    public Computador(String nome, int clock){
        Nome = nome;
        Clock = clock;
    }

    @overridade
    public String ToString(){
        return "Nome do Computador: " + Nome + ", Clock: " + Clock;
    }
}