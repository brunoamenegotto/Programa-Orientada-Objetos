package br.uepg.deinfo.primeiro;
public class Pessoa
{
	private int codigo;
	private String nome;
	protected double salario;

	protected Pessoa(int c, String n)
	{
		codigo = c;
		nome = n;
	}

	protected String getNome()
	{
		return nome;
	}

	protected int getCodigo()
	{
		return codigo;
	}

	public String toString()
	{
		String aux;
		aux = " Codigo: "+codigo+"\n Nome: "+nome+"\n Salario: "+salario;
		return aux;
	}
}