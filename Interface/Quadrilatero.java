public abstract class Quadrilatero implements FiguraGeometrica, FiguraEscalavel
{
	private double lado1;
	private double lado2;
	private double lado3;
	private double lado4;

	public Quadrilatero(double ladol, double lado2, double lado3, double lado4)
	{
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
	}
	public double getLado1()
	{
		return lado1;
	}
	public double getLado2()
	{
		return lado2;
	}
	public void AumentaObjeto(double a)
	{
		lado1 = lado1 + a;
		lado2 = lado2 + a;
		lado3 = lado3 + a;
		lado4 = lado4 + a;
	}
	public void DiminuiObjeto(double d)
	{
		lado1 = lado1 + d;
		lado2 = lado2 + d;
		lado3 = lado3 + d;
		lado4 = lado4 + d;
	}
	public double getPerimetro()
	{
		return lado1 + lado2 + lado3 + lado4;
	}
}