public class Principal
{
	public static void main(String[] args)
	{
		Funcionario vetor[] = new Funcionario[2];
		vetor[0] = new FuncionarioEnMedio(1200,213,"SESI");
		System.out.println(vetor[0]);
		vetor[1] = new Graduacao(12500,325,"UEPG","ENG_COMP");
		System.out.println(vetor[1]);
	}
}
