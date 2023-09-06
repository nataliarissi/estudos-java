package Familia;

public class Filho {
    private String Nome;

    public Filho(){
    }

    public Filho(String nome){
        Nome = nome;
    }

    public String getNomeFilho(){
        return Nome;
    }

    public String setNomeFilho(){
        return Nome;
    }

	@Override
	public String toString() {
		return "Nome: " + Nome;
	}
}
