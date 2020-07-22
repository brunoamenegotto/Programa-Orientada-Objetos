public class Livro
{
	private String nome;
	private String autor;
	private String descricao;
	private boolean emprestado;

	public Livro(String n, String a, String d)
	{
		nome = n;
		autor = a;
		descricao = d;
		emprestado = false;
	}
	public String getNome()
	{
		return nome;
	}
	public String getAutor()
	{
		return autor;
	}
	public String getDescricao()
	{
		return descricao;
	}

	public void setEmprestado(boolean e)
	{
		emprestado = e;
	}
	public boolean getEmprestado()
	{
		return emprestado;
	}

	public String toString()
	{
		String aux;
		aux = "Nome: "+nome+"\nAutor: "+autor+"\nDescricao: "+descricao;
		return aux;
	}
}