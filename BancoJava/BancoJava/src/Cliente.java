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
        return "Nome: " + Nome + ", Salário: " + Salario + ", Empréstimo: " + Emprestimo;
    }
}