package exercicioBeeCrowd;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.Scanner;


public class MaiorMenorIF {
    public static void main(String[] args) {
  /*      Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero para A: ");
        int a = input.nextInt();
        System.out.print("Digite um numero para B: ");
        int b = input.nextInt();
        System.out.print("Digite um numero para C: ");
        int c = input.nextInt();
        System.out.print("Digite um numero para D: ");
        int d = input.nextInt();
        if (b > c && d > a && ((a+b) < (c+d)) && (a % 2 == 0) ) {
            System.out.println("Valores aceitos");
        }
        else {
            System.out.println("Valores não aceitos");
        }
*/
        //System.out.println(!true && true);

        var date = new Date();
        var min = date.getMinutes();
        System.out.println(date.getYear());
        if (min == 24 && date.getHours() == 15 && date.getYear() > 2000){
            System.out.println("verdade");
        }
        else{
            System.out.println("mentira");
        }
       // input.close();
    }
}
