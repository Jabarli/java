import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int NFunc, HTrab;
        double VHora, Salario;

        //entrada
        NFunc = teclado.nextInt();
        HTrab = teclado.nextInt();
        VHora = teclado.nextDouble();

        //processamento
        Salario = (HTrab * VHora);

        //saida
        System.out.println("NUMBER = " +NFunc);
        System.out.printf("SALARY = U$ %.2f\n" , Salario);
    }

}
