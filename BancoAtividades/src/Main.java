//composição de classes - relacionamento

import Aula.Aluno;
import Aula.Turma;
import Familia.Filho;
import Familia.Mae;
import Local.Endereco;
import Local.Pessoa;

public class Main {
    public static void main(String[] args) throws Exception {

    // Endereco e1 = new Endereco("Rua do Amor", 100, "Apto 101", "Porto Alegre");

    // Pessoa p1 = new Pessoa("Luke", e1);
    // System.out.println(p1.getNome());
    // System.out.println(p1.getEndereco().getRua());
    // System.out.println(p1.getEndereco().getNro());
    // System.out.println(p1.getEndereco().getComplemento());
    // System.out.println(p1.getEndereco().getCidade());
    // System.out.println(p1.getEndereco()); //objeto da classe endereço - memória
    // System.out.println(p1); //endereço + nome        

    // Exemplo 1: com construtores inicializando os atributos
    Endereco primeiroEndereco = new Endereco("Rua Abc", 100, 
    "Apto 101", "Porto Alegre");		
    Pessoa pessoa = new Pessoa("João", primeiroEndereco);
    System.out.println(pessoa.getNome() + ", " + 	
    pessoa.getEndereco().getRua() + ", " + pessoa.getEndereco().getNro() + ", " +
    pessoa.getEndereco().getComplemento() + ", " + pessoa.getEndereco().getCidade());
    System.out.println(pessoa.getEndereco());
    System.out.println(pessoa);

    // Exemplo 2: com construtores padrão somente
    Endereco segundoEndereco = new Endereco();
    segundoEndereco.setRua("Rua Abc");
    segundoEndereco.setNro(100);
    segundoEndereco.setComplemento("Apto 101");
    segundoEndereco.setCidade("Porto Alegre");

    Pessoa p2 = new Pessoa();
    p2.setNome("João");
    p2.setEndereco(segundoEndereco);

///////////////////////////////////////////////////////////////////////////////////////////

    Aluno primeiroAluno;
    primeiroAluno = new Aluno("João", 7);
    Aluno segundoAluno;
    segundoAluno = new Aluno("Maria", 8);
    Turma t1 = new Turma("S056", primeiroAluno, segundoAluno);
    
    System.out.println(t1);
    System.out.println(t1.getPrimeiroAluno());
    System.out.println(t1.getSegundoAluno());
    
    System.out.println(primeiroAluno == t1.getPrimeiroAluno());
    primeiroAluno = new Aluno("Jose", 9);
    System.out.println(primeiroAluno == t1.getPrimeiroAluno());

///////////////////////////////////////////////////////////////////////////////////////////

    Filho primeiroFilho = new Filho("Oliver");
    Filho segundoFilho = new Filho("Daniel");
    System.out.println(primeiroFilho.toString());
    System.out.println(segundoFilho.toString());

    Mae mae = new Mae("Natália", primeiroFilho, segundoFilho);
    System.out.println(mae.toString());
    }
}