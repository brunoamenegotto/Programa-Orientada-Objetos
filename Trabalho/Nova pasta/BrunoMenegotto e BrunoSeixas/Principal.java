public class Principal 
{
    public static void main(String[] args)
    {
        FiguraGeometrica vetor[] = new FiguraGeometrica[3];
        vetor[0] = new Quadrado(10);
        vetor[1] = new Retangulo(8,5);
        vetor[2] = new Circulo(6);

        for(int i = 0; i < vetor.length; i++)
         {
             System.out.println("\n"+vetor[i]);
             System.out.println("\n---------------");
         }     
        
         System.out.println("Objetos Diminuindo de Tamanho");
         for(int i = 0; i < vetor.length; i++)
         {
             FiguraEscalavel temp = (FiguraEscalavel)vetor[i];
             temp.diminuirObjeto(1);
             System.out.println("\n"+vetor[i]);
             System.out.println("\n---------------");
         }  
    }
}

