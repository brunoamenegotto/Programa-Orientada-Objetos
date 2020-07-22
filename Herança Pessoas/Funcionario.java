public class Funcionario extends Pessoa
{
	private double salario;
	private int codigo;

	public Funcionario (String n, String t, Data nasc, double s, int c)
	{
		super(n,t,nasc);
		salario = s;
		codigo = c;
	}
	public Funcionario (String n, Data nasc, double s, int c)
	{
		super(n, nasc);
		salario = s;
		codigo = c;
	}
	public void imprimir()
	{
		super.imprimir();
		System.out.println("Salario: "+salario);
		System.out.println("Codigo: "+codigo);
	}
}