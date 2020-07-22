public interface ItemDaBiblioteca
{
	void emprestarItem(int cod);
	void devolverItem(int cod);
	void emprestadoItem(int cod);
	void descricaoItem(int cod);
}