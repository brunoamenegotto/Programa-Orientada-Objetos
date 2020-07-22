import java.util.Arrays;
public class Principal
{
    public static void main(String[] args)
    {
    	int i;

    	LivroDeBiblioteca vetor[] = new LivroDeBiblioteca [4];

    	vetor[0] = new LivroDeBiblioteca("Senhor dos Aneis", "J.R.R.Tolken", "Fantasia", 25656);
    	vetor[1] = new LivroDeBiblioteca("Call of Chrtullu", "LoveCraft", "Terror", 666);
    	vetor[2] = new LivroDeBiblioteca("Calculo II", "Lethod", "Terror", 656);
    	vetor[3] = new LivroDeBiblioteca("A Batalha do Apocalipse", "Eduardo Spohr", "Fantasia", 5466);

    	for(i=0;i<vetor.length;i++)
    	{
    		System.out.println("--------------");
    		System.out.println(vetor[i]);
    	}
    	for(i=0;i<vetor.length;i++)
    	{
			System.out.println("----------");
    		vetor[i].emprestarItem(666);
    		vetor[i].descricaoItem(25656);
    		vetor[i].emprestadoItem(666);
    		vetor[i].descricaoItem(666);
    	}

    }
}
