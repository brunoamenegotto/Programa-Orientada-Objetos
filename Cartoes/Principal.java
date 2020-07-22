import java.util.Arrays;
public class Principal
{
	public static void main(String[] args)
    {
    	Data data = new Data(22,4,2018);
		int i, j;
    	CartaAniversario aniversario[] = new CartaAniversario[1];
    	CartaDiaNamorados namorados[] = new CartaDiaNamorados[1];
    	for(i=0; i<aniversario.length; i++)
    	{
    		aniversario[i] = new CartaAniversario("Bruno","Gilson",data,"Feliz_Aniversario");
    		System.out.println(aniversario[i]);
    	}
    	for(j=0;j<namorados.length;j++)
    	{
    		namorados[j] = new CartaDiaNamorados("Bruno","Dayane",data,"Feliz Dia dos Namorados");
    		System.out.println(namorados[j]);
    	}
    }
}
