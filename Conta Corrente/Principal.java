import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {

		int opcao;
    	Scanner leitura = new Scanner(System.in);
    	Data data;
    	ContaCorrente conta1, conta2;

    	System.out.print("Digete um dia: ");
    	byte dia = leitura.nextByte();
    	System.out.print("Digete um mes: ");
    	byte mes = leitura.nextByte();
		System.out.print("Digete um ano: ");
    	short ano = leitura.nextShort();
    	System.out.print("Digete o numero da agencia: ");
    	short agencia = leitura.nextShort();
    	System.out.print("Digete o numero da conta: ");
    	short numero = leitura.nextShort();
    	System.out.print("Digete o seu nome: ");
    	String nome = leitura.next();
    	System.out.print("Digete o seu saldo: ");
    	double saldo = leitura.nextDouble();
    	System.out.print("Voce deseja sacar [1] ou Voce deseja depositar [2]? ");
    	opcao = leitura.nextInt();

    switch (opcao)
    	{
    		case 1:
    			System.out.print("Quanto quer sacar? ");
    			double saque = leitura.nextDouble();
    			if (saque < 0 | saque > saldo)
    				System.out.println("Impossivel sacar");
    			else
    				saldo = saldo - saque;
    			break;
    		case 2:
    			System.out.print("Quanto quer depositar? ");
    			double deposito = leitura.nextDouble();
    			if (deposito < 0)
    				System.out.println("Impossivel depositar");
    			else
    				saldo = saldo + deposito;
      			break;
      		default:
   				System.out.println("Voce digitou uma opção invalida");
    	}

		conta1 = new ContaCorrente();

    	data = new Data();
    	data.setDia(dia);
    	data.setMes(mes);
    	data.setAno(ano);

		System.out.println("-------");

    	System.out.println("Conta 1");
    	conta1 = new ContaCorrente();
    	conta1.setAgencia(agencia);
    	conta1.setNumero(numero);
    	conta1.setNome(nome);
    	conta1.setSaldo(saldo);
    	conta1.setData(data);
    	conta1.imprimir();

		System.out.println("-------");

    	System.out.println("Conta 2");
    	conta2 = new ContaCorrente();
    	conta2.setAgencia(agencia);
    	conta2.setNumero(numero);
    	conta2.setNome(nome);
    	conta2.setSaldo(saldo);
    	conta2.setData(data);
    	conta2.imprimir();
    }
}
