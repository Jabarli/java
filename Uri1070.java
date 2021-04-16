import java.util.Scanner;

public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int num; 
        num = teclado.nextInt();
            if (num % 2 == 0){
                num = num + 1;
                System.out.println (num);
            }
            else{ 
                 num = num;
                 System.out.println (num);
                }                
                for(int cont= 1; cont <=5; cont++){  
                System.out.println(num+=2);
            }
        }
}