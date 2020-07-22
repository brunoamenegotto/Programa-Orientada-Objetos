package br.uepg.deinfo.primeiro;
import java.util.Scanner;
public class Vetor
{
	private Pessoa vetor[] = new Pessoa[2];

	public void insere()
	{
		Scanner leitura = new Scanner(System.in);

		System.out.println(" Digite o codigo: ");
		int c = leitura.nextInt();
		System.out.println(" Digite o nome: ");
		String n = leitura.next();
		System.out.println(" Digite o salario: ");
		double s = leitura.nextDouble();
		System.out.println(" Digite a posicao: ");
		int pos = leitura.nextInt();

		vetor[pos] = new Pessoa(c, n);

		vetor[pos].salario = s;
	}

	public void imprime()
	{
		Scanner leitura = new Scanner(System.in);

		System.out.println(" Qual é a posicao? ");
		int pos = leitura.nextInt();
		System.out.println(vetor[pos]);
	}

}