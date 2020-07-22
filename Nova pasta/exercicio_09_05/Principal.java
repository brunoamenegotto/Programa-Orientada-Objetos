import java.util.Arrays;
public class Principal {

    public static void main(String[] args) {
        FiguraGeometrica vetor[] = new FiguraGeometrica[3];
        vetor[0] = new Quadrado(2,2,2,2);
        vetor[1] = new Retangulo(2,4,2,4);
        vetor[2] = new Circulo(3);

		System.out.println(vetor[0]);
        Quadrado tempQua;
        tempQua = (Quadrado)vetor[0];
        tempQua.calcularArea();
		tempQua.calcularPerimetro();
		tempQua.diminuirObjeto(1);
		System.out.println(vetor[0]);
		tempQua.aumentarObjeto(2);
		System.out.println(vetor[0]);

		System.out.println("\n");

		System.out.println(vetor[1]);
        Retangulo tempRet;
        tempRet = (Retangulo)vetor[1];
        tempRet.calcularArea();
		tempRet.calcularPerimetro();
		tempRet.diminuirObjeto(1);
		System.out.println(vetor[1]);
		tempRet.aumentarObjeto(2);
		System.out.println(vetor[1]);

		System.out.println("\n");

		System.out.println(vetor[2]);
        Circulo tempCir;
        tempCir = (Circulo)vetor[2];
        tempCir.calcularArea();
		tempCir.calcularPerimetro();
		tempCir.diminuirObjeto(1);
		System.out.println(vetor[2]);
		tempCir.aumentarObjeto(2);
		System.out.println(vetor[2]);



    }

}
