package Familia;

import java.util.ArrayList;

public class Mae {
    private String NomeMae;
    private ArrayList<Filho> Filhos;

    public Mae(String nomeMae){
        NomeMae = nomeMae;
        Filhos = new ArrayList<Filho>();
    }
    
    public Mae(String nomeMae, ArrayList<Filho> filhos){
        NomeMae = nomeMae;
		Filhos = filhos;
    }

	public String getNomeMae() {
		return NomeMae;
	}

	public void setNomeMae(String nomeMae) {
		NomeMae = nomeMae;
	}
	public ArrayList<Filho> getFilhos() {
		return Filhos;
	}
	public void setFilhos(ArrayList<Filho> filhos) {
		Filhos = filhos;
	}
	
	public void adicionarFilho(Filho f) {
		Filhos.add(f);
	}
	
	@Override
	public String toString() {
		return "Nome da Mãe: " + NomeMae + ", Filhos: " + Filhos;
	}
}

