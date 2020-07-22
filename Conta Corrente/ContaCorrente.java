public class ContaCorrente
{
	private Data data;
	private short agencia;
	private short numero;
	private String nome;
	private double saldo;
	private double saque;
	private double deposito;
	public void setData(byte diaP, byte mesP, short anoP)
	{
		data = new Data();
		data.setDia(diaP);
		data.setMes(mesP);
		data.setAno(anoP);
	}
	public short getAgencia()
	{
		return agencia;
	}
	public void setAgencia(short agenciaP)
	{
		if (agenciaP > 0)
			agencia = agenciaP;
		else
			System.out.println("Numero da agencia invalida");
	}
	public short getNumero()
	{
		return numero;
	}
	public void setNumero(short numeroP)
	{
		if (numeroP > 0)
			numero = numeroP;
		else
			System.out.println("Numero da conta invalida");
	}
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nomeP)
	{
		nome = nomeP;
	}
	public double getSaldo()
	{
		return saldo;
	}
	public void setSaldo(double saldoP)
	{
		if(saldoP >= 0)
			saldo = saldoP;
		else
			System.out.println("Nao existe saldo na conta");
	}

	public void setData(Data diaP)
	{
		data = diaP;
	}
	public void imprimir()
	{
		System.out.println("Agencia: "+agencia);
		System.out.println("Numero da Conta: "+numero);
		System.out.println("Nome: "+nome);
		System.out.println("Saldo: "+saldo);
		data.imprimirData();
	}
}