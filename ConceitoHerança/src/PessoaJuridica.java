
public class PessoaJuridica extends Pessoa {
//atributos
	private long cnpj;
	
//construtor
	public PessoaJuridica(String nome, long cnpj)
	{
		super(nome); //chamando o construtor da classe pai
		this.cnpj = cnpj;
	}
	
//métodos
	public String getNome()
	{
		return "Pessoa Juridica: " + super.getNome() + " - CNPJ: " + cnpj;
	}
}
