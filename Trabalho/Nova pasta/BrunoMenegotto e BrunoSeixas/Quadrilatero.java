public abstract class Quadrilatero implements FiguraGeometrica, FiguraEscalavel
{
    private double lado1;
    private double lado2;
    
    public Quadrilatero(double lado1, double lado2)
    {
        this.lado1 = lado1;
        this.lado2 = lado2;

    }
    public double getLado1()
    {
        return lado1;
    }
    public double getLado2()
    {
        return lado2;
    }
    
    @Override
    public void aumentarObjeto(int a)
    {
        lado1 = lado1 + a;
        lado2 = lado2 + a;
    }
    
    @Override
    public void diminuirObjeto(int b)
    {
        lado1 = lado1 - b;
        lado2 = lado2 - b;
    }
      
    @Override
    public boolean equals (Object obj)
    {
        if(obj instanceof Quadrilatero)
        {
            Quadrilatero outro = (Quadrilatero) obj;
            if(outro.getLado1() == getLado1() && outro.getLado2() == getLado2())
                return true;
        }
        return false;
    }
    
    @Override
    public String toString()
    {
        String aux;
        aux = "Quadrilatero do tipo:";
        return aux;
    }
}
