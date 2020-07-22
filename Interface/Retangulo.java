public class Retangulo extends Quadrilatero
{
	public Retangulo(double lado1, double lado2)
	{
		super(lado1, lado1, lado1, lado1);
	}
	public double CalculaArea()
	{
		return getLado1()*getLado2();
	}
	public double CalculaPerimetro()
	{
		return getPerimetro();
	}
	public String toString()
	{
		String aux;
		aux = " Retagulo"+"\n Base: "+getLado1()+"\n Altura: "+getLado2()+"\n Area: "+CalculaArea()+"\n Perimetro: "+CalculaPerimetro();
		return aux;
	}
}