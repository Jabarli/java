import java.util.Scanner;

public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int qtdPar = 0;
        int numero;
       
           for (int contador=1; contador <=5; contador ++){ //contador = contador +1){
            numero = teclado.nextInt();
            if (numero % 2 == 0){
            qtdPar++;     
            }
        }
        System.out.println(qtdPar+ " valores pares");
    
    }
}