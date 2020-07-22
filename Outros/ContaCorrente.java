public class ContaCorrente
{
	public String nome;
	private short numero;
	private double saldo;

	public void depositar(double valor)
	{
		saldo = saldo + valor;
	}

	public void imprimirSaldo()
	{
		System.out.println("Saldo: "+saldo);
	}
}

