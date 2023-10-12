package Banco;

public class ContaPremium extends ContaBanco{
    private float _valorEmInvestimentos;
    public ContaPremium(String nroConta, float limite, float juros, float agencia, float saldo, String nomeCliente,
        float valorEmInvestimentos) {
        super(nroConta, 0, 0, agencia, 0, nomeCliente);
        _valorEmInvestimentos = valorEmInvestimentos;
    }
    
	public float getValorEmInvestimentos() {
		return _valorEmInvestimentos;
	}

	public void setValorEmInvestimentos(float valorEmInvestimentos) {
		_valorEmInvestimentos = valorEmInvestimentos;
	}

	@Override
	public String toString(){
		return super.toString() + ", valor em investimentos: " + _valorEmInvestimentos;
	}	    
}