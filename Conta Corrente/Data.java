public class Data
{
	  private byte dia;
	  private byte mes;
	  private short ano;

	  public  void setDia(byte diaP)
	  {
	  		if (diaP >= 1 && diaP <= 31)
	  			dia = diaP;
	  		else System.out.println("Dia invalido");
	  }
	  public byte getDia ()
	  {
	  		return dia;
	  }

	  public  void setMes(byte mesP)
	  {
	  		if (mesP >= 1 && mesP <= 12)
	  			mes = mesP;
	  		else System.out.println("Mes invalido");
	  }
	  public byte getMes ()
	  {
	  		return mes;
	  }

	  	  public  void setAno(short anoP)
	  {
	  		if (anoP >= 1900 && anoP <= 2199)
	  			ano = anoP;
	  		else System.out.println("Ano invalido");
	  }
	  public short getAno ()
	  {
	  		return ano;
	  }

	  public void imprimirData()
	  {
	  		System.out.println(dia+"/"+mes+"/"+ano);
	  }


}