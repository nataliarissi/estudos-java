package Pessoa;

public class PessoaJuridica extends Pessoa {

	public PessoaJuridica(String nome, Endereco endereco, int telefone, 
		String cnpj, String inscricaoEstadual) {
		super(nome, endereco, telefone);
		_cnpj = cnpj;
		_inscricaoEstadual = inscricaoEstadual;
	}

	private String _cnpj;
	private String _inscricaoEstadual;

	public String getCnpj() {
		return _cnpj;
	}

	public void setCnpj(String cnpj) {
		_cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return _inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		_inscricaoEstadual = inscricaoEstadual;
	}

	@Override
	public String toString() {
		return "Pessoa Jurídica - CNPJ: " + _cnpj 
		+ ", inscrição Estadual: " + _inscricaoEstadual 
		+ ", nome: " + Nome 
		+ ", endereco: " + Endereco 
		+ ", telefone: " + Telefone;
	}
	
	
}