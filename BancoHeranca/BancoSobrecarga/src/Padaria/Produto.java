package Padaria;

public abstract class Produto {

	public Produto(String nome, float preco, String marca) {
		Nome = nome;
		PrecoUnidade = preco;
		Marca = marca;
	}
	
    protected String Nome;
	protected float PrecoUnidade;
	protected String Marca;

	public abstract void descricao(); 

    @Override
    public String toString(){
        return "Nome do produto: " + Nome 
            + ", preço por unidade: " + PrecoUnidade
            + ", marca: " + Marca; 
    }
}