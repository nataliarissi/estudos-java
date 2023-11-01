package Banco;

public class ContaBanco {
	
	public ContaBanco(String nroConta, float limite, float juros, float agencia, float saldo, String nomeCliente) {
		NroConta = nroConta;
		Limite = limite;
		Juros = juros;
		Agencia = agencia;
		Saldo = saldo;
		NomeCliente = nomeCliente;
	}

	protected String NroConta;
	protected float Limite;
	protected float Juros;
	protected float Agencia;
	protected float Saldo;
	protected String NomeCliente;

	public String getNroConta() {
		return NroConta;
	}

	public void setNroConta(String nroConta) {
		NroConta = nroConta;
	}

	public float getLimite() {
		return Limite;
	}

	public void setLimite(float limite) {
		Limite = limite;
	}
	
	public float getJuros() {
		return Juros;
	}

	public void setJuros(float juros) {
		Juros = juros;
	}

	public float getAgencia() {
		return Agencia;
	}

	public void setAgencia(float agencia) {
		Agencia = agencia;
	}
	
	public float getSaldo() {
		return Saldo;
	}

	public void setSaldo(float saldo) {
		Saldo = saldo;
	}
	
	public String getNomeCliente() {
		return NomeCliente;
	}

	public void setNome(String nomeCliente) {
		NomeCliente = nomeCliente;
	}

	@Override
	public String toString(){
		return "Número da conta: " + NroConta 
			+ ", limite: " + Limite
			+ ", juros: " + Juros
			+ ", agência: " + Agencia
			+ ", saldo: " + Saldo
			+ ", nome do cliente: " + NomeCliente;
	}	
}