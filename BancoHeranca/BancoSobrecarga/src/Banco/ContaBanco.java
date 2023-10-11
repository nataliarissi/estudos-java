package Banco;

public class ContaBanco {
	protected String NroConta;
	protected float Limite;
	protected float Juros;
	
	public ContaBanco(String nroConta, float limite, float juros) {
		NroConta = nroConta;
		Limite = limite;
		Juros = juros;
	}
	
	// add gets/sets - toString	
	
}