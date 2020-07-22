public class Principal
{
    public static void main(String[] args)
    {
    	ContaCorrente conta = new ContaCorrente("Bruno");
    	try
    	{
    		conta.depositar(-10);
    	}catch(MinhaExcecao e)
    		{
    			System.out.println(e.getMessage());

    		}
    }
}
