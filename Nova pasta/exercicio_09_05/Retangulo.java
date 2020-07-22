public class Retangulo extends Quadrilatero{
	Retangulo(int ladoDireito, int ladoBaixo, int ladoEsquerdo, int ladoCima){
		super(ladoDireito,ladoBaixo,ladoEsquerdo,ladoCima);
	}

	public void calcularArea(){
		System.out.println("A area do retangulo eh:" + getLadoBaixo()*getLadoDireito());
	}

	public void calcularPerimetro(){
		int perimetro;
		perimetro = getLadoDireito()+getLadoBaixo()+getLadoEsquerdo()+getLadoCima();
		System.out.println("O perimetro do retangulo eh: "+perimetro);
	}


	public String toString(){
		String aux;
		aux = super.toString();
		return aux;
	}

}