public class Cliente {
    public String Nome; //propriedade
    public double Salario;
    public double Emprestimo;

    public Cliente(String nome, double salario){ //construtor
        Nome = nome;
        Salario = salario;
    }

    @Override 
    public String toString(){
        String resultado = "Nome: " + Nome + ", Salário: " + Salario;
        if(Emprestimo > 0){
            resultado += ", Empréstimo: " + Emprestimo;
        }
        return resultado;
    }
}