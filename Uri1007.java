import java.util.Scanner;

public class Uri1007{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int A, B, C, D, Dif;

        //entrada
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

        //processamento
        Dif = (A*B - C*D);

        //saida
        System.out.println("DIFERENCA = " +Dif);
    }

}
