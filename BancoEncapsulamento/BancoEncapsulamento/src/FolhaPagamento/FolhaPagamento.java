package FolhaPagamento;

public class FolhaPagamento {
    private String PrimeiroNome;
    private float PrimeiroSalario;
    private String SegundoNome;
    private float SegundoSalario;

    public FolhaPagamento(){
        PrimeiroNome = "Nanami";
        PrimeiroSalario = 2700;
        SegundoNome = "Tomoe";
        SegundoSalario = 7000;
    }

    public FolhaPagamento(String primeiroNome, float primeiroSalario, String segundoNome, float segundoSalario){
        PrimeiroNome = primeiroNome;
        PrimeiroSalario = primeiroSalario;
        SegundoNome = segundoNome;
        SegundoSalario = segundoSalario;
    }

    public String getPrimeiroNome(){
        return PrimeiroNome;
    }

    public float getPrimeiroSalario(){
        return PrimeiroSalario;
    }

    public String getSegundoNome(){
        return SegundoNome;
    }

    public float getSegundoSalario(){
        return SegundoSalario;
    }

    public void setPrimeiroNome(String primeiroNome){
        PrimeiroNome = primeiroNome;
    }    

    public void setPrimeiroSalario(float primeiroSalario){
        if(primeiroSalario < 0){
            System.out.println("Valor negativo não é permitido");
        }
        PrimeiroSalario = primeiroSalario;
    }

    public void setSegundoNome(String segundoNome){
        SegundoNome = segundoNome;
    }

    public void setSegundoSalario(float segundoSalario){
         if(segundoSalario < 0){
            System.out.println("Valor negativo não é permitido");
        }
        SegundoSalario = segundoSalario;
    }

    public float totalFolhaPagamento(){
        float resultado = PrimeiroSalario + SegundoSalario;
        return resultado;
    }

    @Override
    public String toString(){
        return "Primeiro nome " + getPrimeiroNome() + ", primeiro salario: " + getPrimeiroSalario() + ", segundo nome: " + getSegundoNome()+ ", segundo salário:" + getSegundoSalario();
    }
}