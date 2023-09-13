import java.util.ArrayList;

import Familia.Filho;
import Familia.Mae;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Filho> filhos;
        filhos = new ArrayList<Filho>();

        Filho primeiroFilho = new Filho("Luke");
        Filho segundoFilho = new Filho("Itachi");
        Filho terceiroFilho = new Filho("Madara");
        Filho quartoFilho = new Filho("Sakura");

        filhos.add(primeiroFilho);
        filhos.add(segundoFilho);
        filhos.add(terceiroFilho);
        filhos.add(quartoFilho);

        // System.out.println(filho);

        for(Filho f : filhos){
            System.out.println(f);
        }
        // f vai apontar para cada posição diferente da lista 
        // for(objeto temporario q vai apontar : <lista>)
        // foreach percorre toda estrutura

        Mae mae = new Mae("Nanami" + filhos);
        mae.setFilhos(filhos);
        System.out.println(mae);

        Mae segundaMae = new Mae("Nanami");
        // segundaMae.getFilhos().add(new Filho("Tomoe"));
        segundaMae.adicionarFilho(new Filho("Momozono"));

        System.out.println("-----------------------------------------------------------------");

        ArrayList<String> filhos2;
        filhos2 = new ArrayList<String>();

        String primeiroNome = "Luke é lindo demais";
        String segundoNome = "Itachi é perfeito";

        filhos2.add(primeiroNome);
        filhos2.add(segundoNome);
        filhos2.add("Sakura ama Sasuke");

        for(String filhoAtual : filhos2){
            System.out.println(filhoAtual);
        }
    }
}