public class Computador {
    public String Nome;
    public int Clock;

    public void mostraNomeComputador(){
        // System.out.println("Digite o nome do computador: ");
        // String nome = scanner.next();
        System.out.println("Nome do computador: " + Nome);
    }

    public void mostraClock(){
        // System.out.println("Digite o clock: ");
        // int clock = scanner.next();
        System.out.println("Clock do computador: " + Clock);
    }

    public Computador(String nome, int clock){
        Nome = nome;
        Clock = clock;
    }

    @override
    public String ToString(){
        String resultado = "Nome do Computador: " + Nome + ". Clock: " + Clock;
    }
}
