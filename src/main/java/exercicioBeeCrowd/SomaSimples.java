package exercicioBeeCrowd;

import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int number1= input.nextInt();
        System.out.print("Digite outro número: ");
        int number2= input.nextInt();
        System.out.println("A soma dos dois números deu: "+ (number1 + number2));
        input.close();
    }
}
