package exercicioBeeCrowd;

import java.util.Scanner;

public class ProdutoSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor do produto 1: ");
        int prod1 = input.nextInt();
        System.out.print("Digite o valor do produto 2: ");
        int prod2 = input.nextInt();
        System.out.println("Resultado deu: " + (prod1*prod2));
        input.close();

    }
}
