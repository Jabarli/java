import java.util.Scanner;

//CORRIGIR CODIGO
public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

       //variaveis
        int hI, mI, hF, mF, tempo, hJ, mJ;

        //entrada
        hI = teclado.nextInt();
        mF = teclado.nextInt();
        hF = teclado.nextInt();
        mF = teclado.nextInt();

        //processamento
        hI = hI * 60 + mI;
        hF = hF * 60 + mF;
        tempo = hF + hI;
        
        //decisão
        if (tempo <=0){
            tempo = tempo + 1440;
        }
        hJ = tempo / 60;
        mJ = tempo % 60;
        System.out.println ("O JOGO DUROU " +hJ+ "HORA(S) E " +mJ+ "MINUTO(S)");

        //CORRIGIR CODIGO
    }    
}
