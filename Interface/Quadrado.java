public class Quadrado extends Quadrilatero
{
	public Quadrado(double lado1)
	{
		super(lado1, lado1, lado1, lado1);
	}
	public double CalculaArea()
	{
		return getLado1()*getLado1();
	}
	public double CalculaPerimetro()
	{
		return getPerimetro();
	}
	public String toString()
	{
		String aux;
		aux = " Quadrado"+"\n Lado: "+getLado1()+"\n Area: "+CalculaArea()+"\n Perimetro: "+CalculaPerimetro();
		return aux;
	}
}