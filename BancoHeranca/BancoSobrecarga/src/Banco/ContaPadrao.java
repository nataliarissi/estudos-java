package Banco;

public class ContaPadrao extends ContaBanco{
    private int _pontosDeFidelidade;
    public ContaPadrao(String nroConta, float limite, float juros, float agencia, float saldo, String nomeCliente,
        int pontosDeFidelidade) {
        super(nroConta, 0, 0, agencia, 0, nomeCliente);
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