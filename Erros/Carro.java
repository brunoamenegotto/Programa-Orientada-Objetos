public class Carro
{
	private String modelo;
	private int potencia;

	public void setModelo (String modelo)
	{
		this.modelo = modelo;
	}

	public void setPotencia (int potencia)
	{
		this.potencia = potencia;
	}


	public String toString()
	{
		String aux;
		aux = "Modelo: "+modelo+"\nPotencia: "+potencia;
		return aux;
	}

}