package Classes;
import java.lang.Math;

public class Bhaskara {
    public double A;
    public double B;
    public double C;

    public Bhaskara(double a, double b, double c){
        A = a;
        B = b;
        C = c;
    }

    public double Delta(){
        double delta = (Math.pow(B, 2) - 4 * A * C);
        return delta;     
    }

    public double RetornarXPositivo(){
        double delta = Delta();
        
        if(delta >= 0){
            double calculo = (-B + Math.sqrt(delta)) / (2 * A );
            return calculo;
        }
        System.out.println("Inválido");
        return 0;
    }

    public double RetornarXNegativo(){
        double delta = Delta();

        if(delta >= 0){
            double calculo = (-B - Math.sqrt(delta)) / (2 * A );           
            return calculo;
        }
        System.out.println("Inválido");
        return 0;
    }

    @Override
        public String toString(){
        return "X positivo: " + RetornarXPositivo() + ", X negativo: " + RetornarXNegativo();
    }
}