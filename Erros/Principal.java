import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;
public class Principal
{
	public static void main(String[] args)
    {
    	boolean test;
     	Carro vetor[] = new Carro[2];
    	Scanner leitura = new Scanner(System.in);

  		test = false;

			while(test == false)
			{
				try
					{
						System.out.println("Informe o indice do vetor: ");
						int i = leitura.nextInt();
						vetor[i] = new Carro();

						System.out.println("Informe o modelo do carro: ");
						String modelo = leitura.next();
						System.out.println("Informe a potencia do carro: ");
						String potencia = leitura.next();
						int pot = Integer.parseInt(potencia);

						vetor[0].setModelo(modelo);
						vetor[0].setPotencia(pot);

						for(i = 0; i < vetor.length;i++)
						{
							System.out.println("\n"+vetor[i]);
						}
						test = true;
					}
					catch(InputMismatchException e)
					{
						System.out.println("Erro! Voce digitou uma String no indice do vetor");
						leitura.next();
					}
					catch(ArrayIndexOutOfBoundsException e)
					{
						System.out.println("Erro! Indice maior que o tamanho do vetor");
						leitura.next();
					}
					catch(NumberFormatException e)
					{
						System.out.println("Erro! Voce digitou uma String no lugar de um Inteiro");
						leitura.next();
					}
					catch(NullPointerException e)
					{
						System.out.println("Erro! Voce nao instaciou a posicao certa");
						leitura.next();
					}

			}
    }
}
