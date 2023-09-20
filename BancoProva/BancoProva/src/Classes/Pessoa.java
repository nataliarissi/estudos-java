package Classes;

public class Pessoa{
    private String Nome;
    private Telefone telefone;

    public Pessoa() {
        Nome = "Luke";
        telefone = new Telefone(55, 999999999);
    }

    public Pessoa(String nome, Telefone telefone){
        Nome = nome;
        this.telefone = telefone;
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome da primeira pessoa é: " + Nome + ", " + telefone;
    }
}