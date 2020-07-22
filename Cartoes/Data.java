public class Data
{
	private int dia;
	private int mes;
	private int ano;

	public Data (int d, int m, int a)
	{
		if (d >= 1 && d <= 31)
			dia = d;
			else
				System.out.println ("Dia Invalido");
		if (m >= 1 && m <= 12)
			mes = m;
			else
				System.out.println ("Mes Invalido");
		if (a >= 1900 && a <2099)
			ano = a;
			else
				System.out.println ("Ano Invalido");
	}
	public String toString()
	{
		String aux;
		aux = dia+"/"+mes+"/"+ano;
		return aux;
	}
}