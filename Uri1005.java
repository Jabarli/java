import java.util.Scanner;

public class Uri1005{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double NotaP1, NotaP2, Media;

        //entrada
        NotaP1 = teclado.nextDouble();
        NotaP2 = teclado.nextDouble();
         
        //Processamento
        Media = (NotaP1*3.5 + NotaP2*7.5)/11;
        
        //Saida
        System.out.printf("MEDIA = %.5f\n" , Media);
    }
}