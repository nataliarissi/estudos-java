package Ingressos;

public class Show {

	public static void main(String[] args) {
        IngressoBackStage ingressoBackStage = new IngressoBackStage(0, null);
        IngressoPista ingressoPista = new IngressoPista(0, null);
        IngressoVip ingressoVip = new IngressoVip(0, null);

        System.out.println(ingressoBackStage.toString());
        System.out.println(ingressoPista.toString());
        System.out.println(ingressoVip.toString());
    }
}