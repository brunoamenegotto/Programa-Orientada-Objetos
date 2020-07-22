public class Funcionario
{
	private DataNascimento data;
	private String nome;
	private long CPF;
	private double salario;
	private String cargo;

	public String getNome()
	{
		return nome;
	}
	public void setNome(String nomeP)
	{
		nome = nomeP;
	}
	private boolean validosCPF(long CPFp)
	{
		if(CPFp >= 1)
			return true;
		else
			return false;
	}
	public long getCPF()
	{
		return CPF;
	}
	public void setCPF(long CPFp)
	{
		if(validosCPF(CPFp))
			CPF = CPFp;
	}
	public double getSalario()
	{
		return salario;
	}
	public void setSalario(double salarioP)
	{
		if (salarioP > 900)
			salario = salarioP;
		else
			System.out.println("O Funcionario nao eh escravo");
	}
	public String getCargo()
	{
		return cargo;
	}
	public void setCargo(String cargoP)
	{
		cargo = cargoP;
	}
	public void setData(byte diaP, byte mesP, short anoP)
	{
		data = new DataNascimento();
		data.setDia(diaP);
		data.setMes(mesP);
		data.setAno(anoP);
	}

	public void setData(DataNascimento diaP)
	{
		data = diaP;
	}
	public void imprimir()
	{
		System.out.println("Nome do funcionario: "+nome);
		System.out.println("CPF do funcionario: "+CPF);
		System.out.println("Salario: "+salario);
		System.out.println("Cargo: "+cargo);
		data.imprimirDataNascimento();
	}




}