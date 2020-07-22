public class Bolsista extends Aluno
{
	private float bolsa;

    public Bolsista (String n, String t, Data nasc, int ra, float b)
    {
    	super(n, t, nasc, ra);
    	bolsa = b;
    }
    public Bolsista (String n, Data nasc, int ra, float b)
    {
    	super(n, nasc, ra);
    	bolsa = b;
    }
    public void imprimir()
    {
    	super.imprimir();
    	System.out.println("Valor da bolsa: "+bolsa);
    }
}