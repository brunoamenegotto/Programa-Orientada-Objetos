public class Pessoa
{
	private String nome;
	private String telefone;
	private Data nascimento;

	public Pessoa (String n, String t, Data nasc)
	{
		nome = n;
		telefone = t;
		nascimento = nasc;
	}
	public Pessoa (String n, Data nasc)
	{
		nome = n;
		nascimento = nasc;
	}
	public void imprimir()
	{
		System.out.println("Nome: "+nome);
		System.out.println("Telefone: "+telefone);
		System.out.println("Data de Nascimento: "+nascimento);
	}
}