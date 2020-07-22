public class ContaCorrente
{
	private short numero;
	private String nome;
	private double saldo;
	private double limite;

	public ContaCorrente (short numero, String nome, double saldo, double limite)
	{
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
	}
	public ContaCorrente (short numero, String nome, double saldo)
	{
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}
	public ContaCorrente (short numero, String nome)
	{
		this.numero = numero;
		this.nome = nome;
	}

	public short getNumero()
	{
		return numero;
	}
	public void setNumero(short numero)
	{
		this.numero = numero;
	}
	public String getNome()
	{
		return nome;
	}
	public void setNome (String nome)
	{
		this.nome = nome;
	}
	public double getSaldo()
	{
		return saldo;
	}
	public void setSaldo(double saldo)
	{
		if (this.saldo < 0)
			System.out.println("Impossivel detectar seu saldo");
		else
			this.saldo = saldo;
	}
	public double getLimite()
	{
		return limite;
	}
	public void setLimite(double limite)
	{
			this.limite = limite;
	}
	public void editar(short numero, String nome)
	{
		if(numero > 0)
			this.numero = numero;
		else
			System.out.println("Numero invalido");
		this.nome = nome;
	}
		public void editar(short numero, double limite)
	{
		if(numero > 0)
			this.numero = numero;
		else
			System.out.println("Numero invalido");
		this.limite = limite;
	}
		public void editar(String nome, double limite)
	{
		if(limite > 0)
			this.limite = limite;
		else
			System.out.println("Limite de credito invalido");
		this.nome = nome;
	}
	public void imprimir()
		{
			System.out.println("Numero da conta: "+numero);
			System.out.println("Nome: "+nome);
			System.out.println("Saldo: "+saldo);
			System.out.println("Limite de Credito: "+limite);
		}



}