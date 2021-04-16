/*
Leia um número inteiro que representa um código de DDD para discagem interurbana. Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:

Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa deverá informar:
DDD nao cadastrado
*/

import java.util.Scanner;

public class Uri1050{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        //variaveis
        int codDDD;
        String cidade;

        //entrada
        codDDD = teclado.nextInt();
    
        //processamento
        if (codDDD == 61){
            cidade = "Brasilia";
        }
        else if (codDDD == 71){
            cidade = "Salvador";
        }
        else if (codDDD == 11){
            cidade = "Sao Paulo";
        }
        else if (codDDD == 21){
            cidade = "Rio de Janeiro";
        }
        else if (codDDD == 19){
            cidade = "Campinas";
        }
        else if (codDDD == 27){
            cidade = "Vitoria";
        }
        else if (codDDD == 31){
            cidade = "Belo Horizonte";
        }
        else {
            cidade = "DDD nao encontrado";
        }
    System.out.println ( cidade);
    }
}