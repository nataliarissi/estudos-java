import java.lang.Math;

public class Operacoes {
    public double A;
    public double B;
    public double C;

    public Operacoes(){

    }

    public double RetornarXPositivo(double a, double b, double c){
        double delta = (Math.pow(b, b) - 4 * a * c);
        double raizDelta = Math.sqrt(delta);
        if(delta >= 0){
            double calculo = (-b + raizDelta) / (2 * a );
            return calculo;
        }
        System.out.println("Inválido");
        return 0;
    }

    public double RetornarXNegativo(double a, double b, double c){
        double delta = (Math.pow(b, b )- 4 * a * c);
        double raizDelta = Math.sqrt(delta);
        if(delta >= 0){
            double calculo = (-b - raizDelta) / (2 * a );           
            return calculo;
        }
        System.out.println("Inválido");
        return 0;
    }

    @Override
        public String toString(){
        return "X positivo: " + RetornarXPositivo(A, B, C) + ", X negativo: " + RetornarXNegativo(A, B, C);
    }
}