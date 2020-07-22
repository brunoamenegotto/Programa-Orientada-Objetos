public abstract class CartaoWeb
{
	private String remetente;
	private String destinatario;
	private Data data;

	public CartaoWeb(String r, String d, Data dp)
	{
		remetente = r;
		destinatario = d;
		data = dp;
	}

	public abstract String getMostraMensagem();
	public String getRemetente()
	{
		return remetente;
	}
	public String getDestinatario()
	{
		return destinatario;
	}
	public Data getData()
	{
		return data;
	}
		public String toString()
	{
		String aux;
		aux = "Data: "+data+"\nRemetente: "+remetente+"\nDestinario: "+destinatario;
		return aux;
	}
}