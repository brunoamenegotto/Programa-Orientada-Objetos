public class LivroDeBiblioteca extends Livro implements ItemDaBiblioteca
{
	private int codigo;

	public LivroDeBiblioteca(String n, String a, String d, int c)
	{
		super(n, a, d);
		codigo = c;
	}
	public void emprestarItem(int cod)
	{
		if(codigo == cod)
		{
			if(getEmprestado() == false)
			{
				boolean aux = true;
				setEmprestado(aux);
			}
		}
	}

	public void devolverItem(int cod)
	{
		if(codigo == cod)
		{
			if(getEmprestado() == true)
			{
				boolean aux = false;
				setEmprestado(aux);
			}
		}
	}

	public void emprestadoItem(int cod)
	{
		if(codigo == cod)
		{
			if(getEmprestado() == true)
				System.out.println("Livro: "+getNome()+" de codigo "+codigo+" foi emprestado");
			else
				System.out.println("Livro Disponivel");
		}
	}

	public void descricaoItem(int cod)
	{
		if(codigo == cod)
		{
			System.out.println(super.toString());
		}
	}

	public String toString()
	{
		String aux;
		aux = super.toString()+"\nCodigo: "+codigo+"\nEmprestado: "+getEmprestado();
		return aux;
	}

}