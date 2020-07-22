public class ContaCorrente
{
	private String nome;
	private double saldo;

	public ContaCorrente(String n)
	{
		nome = n;
	}

	public void depositar(double valor) throws MinhaExcecao
	{
		if(valor<0)
			throw new MinhaExcecao("Numero negativo");
		saldo = saldo + valor;
	}
}