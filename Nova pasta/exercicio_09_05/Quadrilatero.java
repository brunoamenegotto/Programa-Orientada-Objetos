public abstract class Quadrilatero implements FiguraGeometrica, FiguraEscalavel{
	private int ladoDireito, ladoBaixo, ladoEsquerdo, ladoCima;
	Quadrilatero(int ladoDireito, int ladoBaixo, int ladoEsquerdo, int ladoCima){
		this.ladoDireito = ladoDireito;
		this.ladoBaixo = ladoBaixo;
		this.ladoEsquerdo = ladoEsquerdo;
		this.ladoCima = ladoCima;
	}

	public int getLadoDireito(){
		return ladoDireito;
	}

	public int getLadoBaixo(){
		return ladoBaixo;
	}

	public int getLadoEsquerdo(){
		return ladoEsquerdo;
	}

	public int getLadoCima(){
		return ladoCima;
	}

	public void diminuirObjeto(int valor){
		ladoDireito = ladoDireito-valor;
		ladoBaixo = ladoBaixo-valor;
		ladoEsquerdo = ladoEsquerdo-valor;
		ladoCima = ladoCima-valor;
	}

	public void aumentarObjeto(int valor){
		ladoDireito = ladoDireito+valor;
		ladoBaixo = ladoBaixo+valor;
		ladoEsquerdo = ladoEsquerdo+valor;
		ladoCima = ladoCima+valor;
	}

	public String toString(){
		String aux;
		aux = "Lado Direito:" +ladoDireito+ " Lado Baixo:" +ladoBaixo+ " Lado Esquerdo:" +ladoEsquerdo+ " Lado Cima:" +ladoCima;
		return aux;
	}

}