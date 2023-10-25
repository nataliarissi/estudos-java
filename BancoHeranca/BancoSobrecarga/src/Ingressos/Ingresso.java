package Ingressos;

public class Ingresso {
    protected float Valor;
    protected String Descricao;

    public Ingresso(float valor, String descricao){
        Valor = valor;
        Descricao = descricao;
    }
}

//outro jeito para a execução

// public class Ingresso {
// 	protected float Valor;
	
// 	public Ingresso(float valor) {
// 		Valor = valor;
// 	}
// 	public float getValor() {
// 		return Valor;
// 	}
// 	public void setValor(float valor) {
// 		Valor= valor;
// 	}
// 	public String getDescricao() {
// 		return "Ingresso";
// 	}
	
// }