package Banco;

public class ContaBasica extends ContaBanco {
	private float _taxaAdministrativaMensal;
	public ContaBasica(String nroConta, float limite, float juros, float agencia, float saldo, String nomeCliente, int tipoCartao,
		float taxaAdministrativaMensal) {
		super(nroConta, 0, 0, agencia, 0, nomeCliente);
		_taxaAdministrativaMensal = taxaAdministrativaMensal;
	}
	
	public float getTaxaAdministrativaMensal() {
		return _taxaAdministrativaMensal;
	}

	public void setTipoCartao(int taxaAdministrativaMensal) {
		_taxaAdministrativaMensal = taxaAdministrativaMensal;
	}

	public float taxaMensalCB(){
		return Limite * _taxaAdministrativaMensal;
	}

	@Override
	public String toString(){
		return super.toString() + ", taxa administrativa mensal: " + _taxaAdministrativaMensal;
	}	
}