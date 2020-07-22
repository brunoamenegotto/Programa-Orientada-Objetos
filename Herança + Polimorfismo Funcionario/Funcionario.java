public class Funcionario
{
	private double salario;
	private int codigo;

	public Funcionario(double s, int c)
	{
		salario = s;
		codigo = c;
	}

	public void editar (double s, int c)
	{
		salario = s;
		codigo = c;
	}
	public void editar (double s)
	{
		salario = s;
	}
	public void editar (int c)
	{
		codigo = c;
	}
	public double getSalarioComAdicional()
	{
		return salario;
	}
	public final double getSalario()
	{
		return salario;
	}
	public String toString()
	{
		String aux;
		aux = "Salario: "+salario+"\nCodigo: "+codigo+"\nSalario Adicional: "+getSalarioComAdicional();
		return aux;
	}

}