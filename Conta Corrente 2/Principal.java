import java.util.Scanner;
public class Principal
{

    public static void main(String[] args)
    {
    	Scanner leitura = new Scanner(System.in);
    	ContaCorrente vetor[] = new ContaCorrente[3];

    	System.out.print("Digite o numero da conta: ");
    	short numero = leitura.nextShort();
    	System.out.print("Digite o seu nome: ");
    	String nome = leitura.next();
    	System.out.print("Digite o saldo da conta: ");
		double saldo = leitura.nextDouble();
		System.out.print("Digite o limite de credito da conta: ");
		double limite = leitura.nextDouble();


		System.out.println("-------");

    	System.out.println("Conta1");
    	vetor[0] = new ContaCorrente(numero, nome, saldo, limite);
    	vetor[0].imprimir();

   		System.out.println("-------");

    	System.out.println("Conta2");
    	vetor[1] = new ContaCorrente(numero, nome, saldo);
		vetor[1].imprimir();

   		System.out.println("-------");

    	System.out.println("Conta3");
    	vetor[2] = new ContaCorrente(numero, nome);
    	vetor[2].imprimir();
    }
}
