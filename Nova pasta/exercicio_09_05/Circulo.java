public class Circulo implements FiguraGeometrica, FiguraEscalavel{
	private double raio;

	public Circulo(double raio){
		this.raio= raio;
	}

	public void calcularArea(){
		System.out.println("A area do circulo eh: " +Math.PI*raio*raio);
	}

	public void calcularPerimetro(){
		System.out.println("O perimetro do circulo eh: " +Math.PI*Math.PI*raio);
	}

	public void diminuirObjeto(int valor){
		raio = raio-valor;
	}

	public void aumentarObjeto(int valor){
		raio = raio+valor;
	}

	public String toString(){
		String aux;
		aux = "Raio: " +raio;
		return aux;
	}

}