import java.util.Arrays;
public class MetodosEstaticos
{
	public static int aux;
	public static void soma(int vetor[])
	{
		int soma = 0;
		for(int i=0;i<vetor.length;i++)
		{
			soma = soma + vetor[i];
		}
		System.out.println("Soma é "+soma);
	}
	public static void media(int vetor[])
	{
		int media;
		int soma = 0;
		int i;
		for(i=0;i<vetor.length;i++)
		{
			soma = soma + vetor[i];
		}
		media = (soma/i);
		System.out.println("Media é "+media);
	}
	public static void imprimir(int vetor[])
	{
		int i;
		for(i=0;i<vetor.length;i++)
			System.out.println("Conteudo "+i+" do vetor: "+vetor[i]);
	}
	public static void ordenar(int vetor[])
	{
		Arrays.sort(vetor);
		System.out.println("Vetor ordenado: ");
		for(int i=0;i<vetor.length;i++)
			System.out.println(" "+vetor[i]);
	}
	public static void buscar (int vetor[], int valor)
	{
		int pos = Arrays.binarySearch(vetor, valor);
		if (pos>=0)
			System.out.println ("Achei na posição "+pos);
		else
			System.out.println ("Nao Achei");
	}
	public static void comparar(int vetor[], int vetorb[])
	{

	}

}