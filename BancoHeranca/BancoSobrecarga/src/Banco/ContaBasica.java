package Banco;

public class ContaBasica extends ContaBanco {

	public ContaBasica(String nroConta, float agencia, float saldo, String nomeCliente, int tipoCartao,
		float taxaAdministrativaMensal) {
		super(nroConta, 0, 0.1f, agencia, 0, nomeCliente);
		_taxaAdministrativaMensal = taxaAdministrativaMensal;
		_tipoCartao = tipoCartao;
	}

	private float _taxaAdministrativaMensal;
	private int _tipoCartao;

	public float getTaxaAdministrativaMensal() {
		return _taxaAdministrativaMensal;
	}

	public void setTipoCartao(int taxaAdministrativaMensal) {
		_taxaAdministrativaMensal = taxaAdministrativaMensal;
	}

	@Override
	public String toString(){
		return super.toString() + ", taxa administrativa mensal: " + _taxaAdministrativaMensal;
	}	
}