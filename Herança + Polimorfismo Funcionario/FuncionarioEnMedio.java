public class FuncionarioEnMedio extends Funcionario
{
	private String nome_escola;

	public FuncionarioEnMedio(double s, int c, String ne)
	{
		super(s, c);
		nome_escola = ne;
	}
	public String getNome_Escola()
	{
		return nome_escola;
	}
	public double getSalarioComAdicional()
	{
		return getSalario() * 1.1;
	}
	public String toString()
	{
		String aux;
		aux = super.toString()+"\nNome da Escola: "+nome_escola;
		return aux;
	}
}