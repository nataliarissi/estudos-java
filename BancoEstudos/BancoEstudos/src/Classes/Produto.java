package Classes;

public class Produto {

	private String Nome;
	private float Preco;
	private String Descricao;

	public Produto(String nome, float preco) {
		Nome = nome;
		Preco = preco;
		Descricao = "";
	}

	public Produto(String nome, float preco, String descricao) {
		Nome = nome;
		Preco = preco;
		Descricao = descricao;
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
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	@Override
	public String toString() {
		return "Nome: " + Nome + ", preco: R$" + Preco + ", desc.: " + Descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
		result = prime * result + Float.floatToIntBits(Preco);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (Nome == null) {
			if (other.Nome != null)
				return false;
		} else if (!Nome.equals(other.Nome))
			return false;
		if (Float.floatToIntBits(Preco) != Float.floatToIntBits(other.Preco))
			return false;
		return true;
	}
}