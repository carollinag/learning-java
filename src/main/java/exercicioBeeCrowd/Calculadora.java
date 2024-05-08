package exercicioBeeCrowd;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("CALCULADORA SIMPLES");
        System.out.println("Digite um numero: ");
        String numbInput1 = input.nextLine().replace(",", ".");
        System.out.println("Digite outro numero: ");
        String numbInput2 = input.nextLine().replace(",", ".");
        double numb1 = Double.parseDouble(numbInput1);
        double numb2 = Double.parseDouble(numbInput2);






    input.close();
    }
}
