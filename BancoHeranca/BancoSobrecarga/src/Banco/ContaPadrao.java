package Banco;

public class ContaPadrao extends ContaBanco{
    private int _pontosDeFidelidade;
    public ContaPadrao(String nroConta, float agencia, float saldo, String nomeCliente,
        int pontosDeFidelidade) {
        super(nroConta, 1000, 0.5f, agencia, 0, nomeCliente);
        _pontosDeFidelidade = pontosDeFidelidade; 
    }
    
	public int getPontosFidelidade() {
		return _pontosDeFidelidade;
	}

	public void setPontosFidelidade(int pontosDeFidelidade) {
		_pontosDeFidelidade = pontosDeFidelidade;
	}

	@Override
	public String toString(){
		return super.toString() + ", pontos de Fidelidade: " + _pontosDeFidelidade;
	}	
}