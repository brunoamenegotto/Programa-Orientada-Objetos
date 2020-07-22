public class Quadrado extends Quadrilatero 
{
    public Quadrado(double lado1)
    {
        super(lado1, lado1);
    }
    @Override
    public double calcularArea()
    {
        return getLado1() * getLado1();
    }
    
    @Override
    public double calcularPerimetro()
    {
        return getLado1() * 4;
    }
    
    @Override
    public boolean equals (Object obj)
    {
        if(obj instanceof Quadrado)
        {
            Quadrado outro = (Quadrado) obj;
            if(outro.getLado1() == getLado1())
                return true;
        }
        return false;
    }

    @Override
    public String toString()
    {
       String aux;
       aux = super.toString()+" Quadrado"+"\n Lado: "+getLado1()+"\n Area: "+calcularArea()+"\n Perimetro: "+calcularPerimetro();
       return aux;
    }
}
