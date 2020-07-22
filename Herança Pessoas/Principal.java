public class Principal
{
	public static void main(String[] args)
	{
		Data nasc = new Data(2,1,1998);
		Funcionario f1 = new Funcionario ("Buno","988044969",nasc,5000,565);
		f1.imprimir();

		System.out.println("---------------");

		Funcionario f2 = new Funcionario ("Gilson/Mateus",nasc,1000,630);
		f2.imprimir();

		System.out.println("---------------");

		Aluno a1 = new Aluno("Mateus", "98656555",nasc,17192653);
		a1.imprimir();

		System.out.println("---------------");

		Aluno a2 = new Aluno("Bruno", nasc,17193526);
		a2.imprimir();

		System.out.println("---------------");

		Bolsista b1 = new Bolsista ("Bruno","98989595",nasc,1616515,500);
		b1.imprimir();

		System.out.println("---------------");

		Bolsista b2 = new Bolsista ("Gilson",nasc,17419536,0);
		b2.imprimir();
		System.out.println("---------------");
    }
}
