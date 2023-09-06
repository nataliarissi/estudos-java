package Local;

public class Endereco {
    private String Rua, Complemento, Cep;
    private int Nro;
    private String Bairro, Cidade, Estado, Pais;

	public Endereco() {
    }

    public Endereco(String rua, int nro, String complemento, String cidade){
        Rua = rua;
        Nro = nro;
        Complemento = complemento;
        Cidade = cidade;
    }

    public Endereco(String rua, int nro, String complemento, String bairro, String cidade, String cep, String estado, String pais){
        Rua = rua;
        Nro = nro;
        Complemento = complemento;
        Bairro = bairro;
        Cidade = cidade;
        Cep = cep;
        Estado = estado;
        Pais = pais;
    }

	public String getRua() {
		return Rua;
	}

	public void setRua(String rua) {
		Rua = rua;
	}

	public int getNro() {
		return Nro;
	}

	public void setNro(int nro) {
		Nro = nro;
	}

	public String getComplemento() {
		return Complemento;
	}

	public void setComplemento(String complemento) {
		Complemento = complemento;
	}

	public String getBairro() {
		return Bairro;
	}

	public void setBairro(String bairro) {
		Bairro = bairro;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	public String getCep() {
		return Cep;
	}

	public void setCep(String cep) {
		Cep = cep;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public String getPais() {
		return Pais;
	}

	public void setPais(String pais) {
		Pais = pais;
	}

	@Override
	public String toString() {
		return "Endereço: " + "Rua: " + Rua + "Número: " + Nro + ", Complemento: " + Complemento + ", Bairro: " + Bairro + 
        ", Cidade: " + Cidade + ", CEP: " + Cep + ", Estado: " + Estado + ", País: " + Pais;
    }
}