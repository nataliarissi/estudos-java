package Pessoa;

public class PessoaFisica extends Pessoa {
	private String _cpf;
	private String _rg;
	
	public PessoaFisica(String nome, Endereco endereco, int telefone, String cpf, String rg) {
		super(nome, endereco, telefone);
		_cpf = cpf;
		_rg = rg;
	}

	public String getCpf() {
		return _cpf;
	}

	public void setCpf(String cpf) {
		_cpf = cpf;
	}

	public String getRg() {
		return _rg;
	}

	public void setRg(String rg) {
		_rg = rg;
	}

	@Override
	public String toString() {
		return "Pessoa Física - CPF: " + _cpf + ", RG: " + _rg + ", nome: " + Nome + ", endereco: " + Endereco + ", telefone:" + Telefone;
	}
	
}