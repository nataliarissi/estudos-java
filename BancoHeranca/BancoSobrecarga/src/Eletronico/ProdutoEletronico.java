package Eletronico;

public class ProdutoEletronico {
	
	protected String Nome;
	protected float Preco;
	protected String Marca;
	
	public ProdutoEletronico(String nome, float preco, String marca) {
		Nome = nome;
		Preco = preco;
		Marca = marca;
	}
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public float getPreco() {
		return Preco;
	}

	public void setPreco(float preco) {
		Preco = preco;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	@Override
	public String toString() {
		return "Nome do produto eletrônico: " + Nome + ", preço: " + Preco + ", marca: " + Marca;
	}
}