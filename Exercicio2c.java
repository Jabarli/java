import java.util.Scanner; // para importar a biblioteca

public class Exercicio2c{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double base, altura, area;

        //entrada
        System.out.println("Informe a base do triangulo");
        base = teclado.nextDouble();
        System.out.println("Informe a altura do triangulo");
        altura = teclado.nextDouble();

        //Processamento
        area = (base * altura) / 2.0;

        //Saida
        System.out.printf("A area do triangulo de base %.2f altura %.2f area %.2f\n", base, altura, area);
        
    
    }
}