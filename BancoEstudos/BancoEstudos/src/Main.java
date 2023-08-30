import Classes.Produto;

public class Main {
    public static void main(String[] args) throws Exception {

        Produto p1 = new Produto("Bolo de Chocolate", 3.5f);
//		System.out.printf("Nome: %s, Preço: %f, Desc.: %s\n",
//		p1.getNome(), p1.getPreco(), p1.getDescricao());
//		
        Produto p2 = new Produto("Bolo de Chocolate", 10f, "Bolo sem Chocolate");
//		System.out.printf("Nome: %s, Preço: %f, Desc.: %s\n",
//		p2.getNome(), p2.getPreco(), p2.getDescricao());

        System.out.println(p1.toString());
        System.out.println(p2);

        //int, float, double, char
        if (p1 == p2)
            System.out.println("Objetos estão no mesmo endereço...");
        else
            System.out.println("Objetos estão em endereços diferentes...");

        if (p1.equals(p2))
            System.out.println("Objetos são iguais...");
        else 
            System.out.println("Objetos são diferentes...");
    }
}