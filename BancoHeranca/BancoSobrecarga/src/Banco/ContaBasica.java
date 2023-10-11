package Banco;

public class ContaBasica extends ContaBanco {
	private int _tipoCartao;

	public ContaBasica(String nroConta, int tipoCartao) {
//		float limite = 0;
//		float juros = 10; 
		super(nroConta, 0, 10);
		_tipoCartao = tipoCartao;
	}
	
	
}