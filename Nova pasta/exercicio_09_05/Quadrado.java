public class Quadrado extends Quadrilatero{
	Quadrado(int ladoDireito, int ladoBaixo, int ladoEsquerdo, int ladoCima){
		super(ladoDireito,ladoBaixo,ladoEsquerdo,ladoCima);
	}

	public void calcularArea(){
		System.out.println("A area do quadrado eh:" + getLadoBaixo()*getLadoDireito());
	}

	public void calcularPerimetro(){
		int perimetro;
		perimetro = getLadoDireito()+getLadoBaixo()+getLadoEsquerdo()+getLadoCima();
		System.out.println("O perimetro do quadrado eh: "+perimetro);
	}

	public String toString(){
		String aux;
		aux = super.toString();
		return aux;
	}
}