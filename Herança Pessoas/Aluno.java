public class Aluno extends Pessoa
{
	private int RA;

	public Aluno (String n, String t, Data nasc, int ra)
	{
		super(n,t,nasc);
		RA = ra;
	}
	public Aluno (String n, Data nasc, int ra)
	{
		super(n, nasc);
		RA = ra;
	}
	public void imprimir()
	{
		super.imprimir();
		System.out.println("RA: "+RA);
	}
}