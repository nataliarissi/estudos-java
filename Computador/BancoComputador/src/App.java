public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Computador comp = new Computador();

        System.out.println("Digite o nome do computador: ");
        String nome = scanner.next();
        System.out.println("Digite o clock: ");
        int clock = scanner.nextInt();

        comp.Nome = nome;
        comp.Clock = clock;

        // comp.mostraNomeComputador();
        // comp.mostraClock();

        System.out.println(comp);
    }
}

// Método 
// 1. instanciar que nem scanner 
// 2. colocar nome varrável + função aonde o método está