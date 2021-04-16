import java.util.Scanner;

public class Uri1037{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        //variaveis
        double num;
        String Intervalo;
        
        //entrada
        num = teclado.nextDouble();

        //processamento
        if (num >=0  && num <=25){
            Intervalo = "[0,25]";
            System.out.println ("Intervalo " +Intervalo);
        }
        else if (num >25 && num <=50){
            Intervalo = "(25,50]";
            System.out.println ("Intervalo " +Intervalo);
        }
        else if (num >50 && num <=75){
            Intervalo = "(50,75]";
            System.out.println ("Intervalo " +Intervalo);
        }
        else if (num >75 && num <=100){
            Intervalo = "(75,100]";
            System.out.println ("Intervalo " +Intervalo);
        }
        else{
            Intervalo = "Fora de Intervalo";
            System.out.println ("Fora do Intervalo");
        }
    }
}