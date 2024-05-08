package exercicioBeeCrowd;

import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int qp = 8;

        double soma = 0;
        for (int i = 0; i < qp; i++) {
           // String[] produto = input.nextLine().replace(",", ".").split(" ");

            int q = 2;
            double v = 5;

            soma = soma + q * v;
        }

        System.out.println(soma);
    }
}
