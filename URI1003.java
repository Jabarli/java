import java.util.Scanner; 

public class URI1003{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int A, B, SOMA;

        //entrada
        A = teclado.nextInt();
        B = teclado.nextInt();
         
        //Processamento
        SOMA = A + B;
        
        //Saida
        System.out.println("SOMA = " +SOMA);
    }
}