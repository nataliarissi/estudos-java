package Familia;

public class Mae {
    private String NomeMae;
    private Filho PrimeiroFilho;
    private Filho SegundoFilho;

    public Mae(){
    }

    public Mae(String nomeMae, Filho primeiroFilho, Filho segundoFilho){
        NomeMae = nomeMae;
        PrimeiroFilho = primeiroFilho;
        SegundoFilho = segundoFilho;
    }
    
    public String getNomeMae(){
        return NomeMae;
    }

    public Filho getPrimeiroFilho(){
        return PrimeiroFilho;
    }

    public Filho getSegundoFilho(){
        return SegundoFilho;
    }

    public String setNomeMae(){
        return NomeMae;
    }

    public void setPrimeiroFilho(Filho primeiroFilho){
        PrimeiroFilho = primeiroFilho;
    }

    public void setSegundoFilho(Filho segundFilho){
        SegundoFilho = segundFilho;
    }

	@Override
	public String toString() {
		return "Nome da mãe: " + NomeMae + ", Primeiro Filho: " + PrimeiroFilho.getNomeFilho() + ", Segundo Filho: " + SegundoFilho.getNomeFilho();
	}

}