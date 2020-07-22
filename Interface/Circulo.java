public class Circulo implements FiguraGeometrica, FiguraEscalavel
{
	private double raio;

	public Circulo(double raio)
	{
		this.raio = raio;
	}

	public void AumentaObjeto(double a)
	{
		raio = raio + a;
	}
	public void DiminuiObjeto(double d)
	{
		raio = raio - d;
	}
	public double CalculaArea()
	{
		return Math.PI*(raio*raio);
	}
	public double CalculaPerimetro()
	{
		return 2*Math.PI*(raio);
	}
	public String toString()
	{
		String aux;
		aux = " Circulo"+"\n Raio: "+raio+"\n Area: "+CalculaArea()+"\n Perimetro: "+CalculaPerimetro();
		return aux;
	}

}