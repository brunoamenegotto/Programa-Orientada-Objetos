import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {
		Scanner leitura = new Scanner(System.in);
    	DataNascimento data;
    	Fucionario vetor[] = new Fucionario[2];


    	System.out.print("Digete dia do nascimento: ");
    	byte dia = leitura.nextByte();
    	System.out.print("Digete mes do nascimento: ");
    	byte mes = leitura.nextByte();
        System.out.print("Digete ano do nascimento: ");
    	short ano = leitura.nextShort();
    	System.out.print("Informe o nome do funcionario: ");
    	String nome = leitura.next();
    	System.out.print("Informe o CPF do funcionario: ");
		long CPF = leitura.nextLong();
		System.out.print("Informe o salario do funcionario: ");
		double salario = leitura.nextDouble();
		System.out.print("Informe o cargo do funcionario: ");
		String cargo = leitura.next();

    	data = new DataNascimento();
    	data.setDia(dia);
    	data.setMes(mes);
    	data.setAno(ano);

		System.out.println("-------");

    	System.out.println("Funcionario1");
    	vetor[0] = new Fucionario();
    	vetor[0].setNome(nome);
    	vetor[0].setCPF(CPF);
    	vetor[0].setSalario(salario);
      	vetor[0].setCargo(cargo);
    	vetor[0].setDataNascimento(data);
    	vetor[0].imprimir();

    	System.out.println("-------");

    	System.out.println("Funcionario2");
    	vetor[1] = new Fucionario();
    	vetor[1].setNome(nome);
    	vetor[1].setCPF(CPF);
    	vetor[1].setSalario(salario);
      	vetor[1].setCargo(cargo);
    	vetor[1].setDataNascimento(data);
    	vetor[1].imprimir();

		System.out.println("-------");

    }
}
