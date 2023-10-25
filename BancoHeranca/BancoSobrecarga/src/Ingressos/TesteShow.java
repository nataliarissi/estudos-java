package Ingressos;

public class TesteShow {

	public static void main(String[] args) {
		Ingresso ingresso = new Ingresso(10f, "Ingresso sem classificação");
        IngressoBackStage ingressoBackStage = new IngressoBackStage(0, null);
        IngressoPista ingressoPista = new IngressoPista(0, null);
        IngressoVip ingressoVip = new IngressoVip(0, null);

        // System.out.println(ingressoBackStage.toString());
        // System.out.println(ingressoPista.toString());
        // System.out.println(ingressoVip.toString());
    
        Show show = new Show();
		show.AdicionarIngresso(ingresso);
		show.AdicionarIngresso(ingressoBackStage);
		show.AdicionarIngresso(ingressoPista);
		show.AdicionarIngresso(ingressoVip);
		show.MostrarIngressos();
    }
}