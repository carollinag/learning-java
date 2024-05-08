package exercicioBeeCrowd;

import java.util.Scanner;

public class JeitosdeSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite os dois valores do eixo X1 e Y1 / X2 e Y2: ");
        String [] x = scanner.nextLine().split("[\\s/]+");

        // 1.0 7.0/5.0 9.0
        // ["1.0 7.0", "5.0 9.0"]

        // ["1.0", "7.0"]
        // ["5.0", "9.0"]

        for (String eixoX : x) {
            System.out.println(eixoX);
        }
        scanner.close();
    }

}
