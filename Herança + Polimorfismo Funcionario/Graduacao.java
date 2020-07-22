public class Graduacao extends FuncionarioEnMedio
{
	private String nome_curso;

	public Graduacao(double s, int c, String ne, String nc)
	{
		super(s, c, ne);
		nome_curso = nc;
	}
	public String getNome_Curso()
	{
		return nome_curso;
	}
	public double getSalarioComAdicional()
	{
		return getSalario()*1.5;
	}
	public String toString()
	{
		String aux;
		aux = super.toString()+"\nNome do Curso: "+nome_curso;
		return aux;
	}


}