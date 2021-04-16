import java.util.Scanner;

public class Uri1041{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        //variaveis
        double x, y;
        String Quad;

        //entrada
        x = teclado.nextDouble();
        y = teclado.nextDouble();

        //processamento
        if (x == 0 && y == 0){
            Quad = "Origem";
            System.out.println ( Quad);
        }
        else if (x ==0 && y !=0){
            Quad = "Eixo Y";
            System.out.println ( Quad);
        }
        else if (x !=0 && y ==0){
            Quad = "Eixo X";
            System.out.println ( Quad);
        }
        else if (x >0 && y >0){
            Quad = "Q1";
            System.out.println ( Quad);
        }
        else if (x <0 && y >0){
            Quad = "Q2";
            System.out.println ( Quad);
        }
        else if (x <0 && y <0){
            Quad = "Q3";
            System.out.println ( Quad);
        }
        else if (x >0 && y <0){
            Quad = "Q4";
            System.out.println ( Quad);
        }
    }
}