public class App {
    public static void main(String[] args) throws Exception {
        //Scanner scanner = new Scanner(System.in);

        Computador comp = new Computador("Meu computador", 5);
        comp.mostraNomeComputador();
        comp.mostraClock();

        System.out.println(comp);

    }
}

// Método 
// 1. instanciar que nem scanner 
// 2. colocar nome varrável + função aonde o método está