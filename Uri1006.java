import java.util.Scanner;

public class Uri1006 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double A, B, C, Media;

        //entrada
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();
         
        //Processamento
        Media = (A*2 + B*3 + C*5)/10;
        
        //Saida
        System.out.printf("MEDIA = %.1f\n" , Media);
    }

}