
import java.util.Scanner; // para importar a biblioteca

public class Exercicio2a{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float lado, area;

        //entrada
        System.out.println("Digite a medida do lado do quadrado");
        lado = teclado.nextFloat();

        //Processamento
        area = lado*lado;

        //saida
        System.out.printf("A area do quadrado e %.3f\n", area);
        
    
    }
}