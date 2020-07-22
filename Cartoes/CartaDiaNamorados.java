public class CartaDiaNamorados extends CartaoWeb
{
	private String mostraMensagem;

	public CartaDiaNamorados(String r, String d, Data dp, String m)
	{
		super(r, d, dp);
		mostraMensagem = m;
	}
	public String getMostraMensagem()
	{
		return mostraMensagem;
	}
		public String toString()
	{
		String aux;
		aux = super.toString()+"\nMensagem: "+getMostraMensagem();
		return aux;
	}
}