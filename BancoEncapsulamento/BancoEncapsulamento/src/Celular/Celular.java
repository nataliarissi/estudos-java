package Celular;

public class Celular {

    private String NumeroCelular;
    private String Operadora;

    public Celular(){
    }

    public Celular(String operadora){
        Operadora = operadora;
        NumeroCelular = "(XX) XXXXX-XXXX";
    }

    public Celular(String numeroCelular, String operadora){
        NumeroCelular = numeroCelular;
        Operadora = operadora;
    }

    public String getNumeroCelular(){
        return NumeroCelular;
        }

    public void setNumeroCelular(String numeroCelular){
        if(numeroCelular == null){
            NumeroCelular = "(XX) XXXXX-XXXX";
            return;
        }
        NumeroCelular = numeroCelular;
    }

    public String getOperadora(){
        return Operadora;
    }

    public void setOperadora(String operadora){
        Operadora = operadora;
    }

    @Override
    public String toString(){
        return "Número do primeiro celular: " + getNumeroCelular() + ", Operadora: " + getOperadora();
    }
}