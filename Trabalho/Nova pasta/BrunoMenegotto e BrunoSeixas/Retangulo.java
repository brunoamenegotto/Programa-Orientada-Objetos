public class Retangulo extends Quadrilatero
{
    public Retangulo(double lado1, double lado2)
    {
        super(lado1, lado2);
    }
    
    @Override
    public double calcularArea()
    {
        return getLado1() * getLado2();
    }

    @Override
    public double calcularPerimetro()
    {
        return (getLado1() * 2) + (getLado2() * 2);
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Retangulo)
        {
            Retangulo outro = (Retangulo) obj;
            if(outro.getLado1() == getLado1() && outro.getLado2() == getLado2());
                return true;
        }
        return false;
    }
    
    @Override
    public String toString()
    {
        String aux;
        aux = super.toString()+" Retangulo"+"\n Base: "+getLado1()+"\n Altura: "+getLado2()+"\n Area: "+calcularArea()+"\n Perimetro: "+calcularPerimetro();
        return aux;
    }
}
