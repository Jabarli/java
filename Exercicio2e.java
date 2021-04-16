import java.util.Scanner; // para importar a biblioteca

public class Exercicio2e{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double baseMaior, baseMenor, altura, area;

        //entrada
        System.out.println("Informe a baseMaior do trapezio");
        baseMaior = teclado.nextDouble();
        System.out.println("Informe a baseMenor do trapezio");
        baseMenor = teclado.nextDouble();
        System.out.println("Informe a altura do trapezio");
        altura = teclado.nextDouble();

        //Processamento
        area = (baseMaior * baseMenor) * altura / 2;

        //Saida
        System.out.printf("A area do trapezio de baseMaior %.2f baseMenor %.2f altura %.2f e %.2f\n", baseMaior, baseMenor, altura, area);    
    }
}