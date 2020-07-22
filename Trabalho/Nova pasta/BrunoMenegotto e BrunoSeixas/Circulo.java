public class Circulo implements FiguraGeometrica, FiguraEscalavel
{
    private double raio;
    
    public Circulo(double raio)
    {
        this.raio = raio;
    }

    @Override
    public double calcularArea()
    {
        return raio * Math.PI * raio;
    }
    
    @Override
    public double calcularPerimetro()
    {
        return 2 * Math.PI * raio;
    }
    
    @Override
    public void aumentarObjeto(int a)
    {
        raio = raio  + a;
    }
    
    @Override
    public void diminuirObjeto(int b)
    {
        raio = raio - b;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Circulo)
        {
            Circulo outro = (Circulo) obj;
            if(outro.raio == raio)
                return true;
        }
        return false;
    }
    
    @Override
    public String toString()
    {
        String aux;
        aux = " Circulo"+"\n Raio: "+raio+"\n Area: "+calcularArea()+"\n Perimetro: "+calcularPerimetro();
        return aux;
    }
}
