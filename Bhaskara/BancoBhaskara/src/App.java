import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um número para ser o A: ");
    double a = scanner.nextDouble();
    System.out.println("Digite o número para ser o B: ");
    double b = scanner.nextDouble();
    System.out.println("Digite o número para ser o C: ");
    double c = scanner.nextDouble();
    
    Operacoes bhaskara = new Operacoes();
    bhaskara.A = a;
    bhaskara.B = b;
    bhaskara.C = c;

    System.out.println(bhaskara.toString());
    }
}