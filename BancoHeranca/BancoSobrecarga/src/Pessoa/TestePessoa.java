package Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		Endereco enderecoPFisica = new Endereco("Rua do Amor", 101, "Porto Alegre");
		PessoaFisica pessoaFisica = new PessoaFisica("Luke", enderecoPFisica, 66078104, 
				"010.668.719-11", "189001784301");
		System.out.println(pessoaFisica.getNome());
		System.out.println(pessoaFisica.getRg());
		System.out.println(pessoaFisica.getEndereco().getCidade());
		System.out.println(pessoaFisica);

		Endereco enderecoPJuridica = new Endereco("Rua da Paixão", 402, "Porto Alegre");
		PessoaJuridica pessoajuridica = new PessoaJuridica("Empresa do Mais Lindo", enderecoPJuridica, 78870101, 
				"1820796401", "987114670");
		System.out.println(pessoajuridica.getEndereco());
		System.out.println(pessoajuridica.getCnpj());
		System.out.println(pessoajuridica.getEndereco().getRua());
		System.out.println(pessoajuridica);
	}
}