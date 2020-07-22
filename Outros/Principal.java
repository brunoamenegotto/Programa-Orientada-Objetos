public class Principal
{
	public static void main(String args[])
	{
		ContaCorrente conta1= new ContaCorrente();
		conta1.nome="Bruno";
		conta1.depositar(1000);
		conta1.imprimirSaldo();
	}
}
