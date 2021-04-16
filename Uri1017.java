import java.util.Scanner;

public class Uri1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int Tempo, Veloc;
        double Litros;

        //entrada
        Tempo = teclado.nextInt();
        Veloc = teclado.nextInt();
        
        //processamento
        Litros = (Tempo * Veloc)/12.0;

        //saida
        System.out.printf("%.3f\n" , Litros);
    }
}