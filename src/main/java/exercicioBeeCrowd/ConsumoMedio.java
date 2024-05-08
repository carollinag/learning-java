package exercicioBeeCrowd;

import java.util.Scanner;

public class ConsumoMedio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite quantos km você andou: ");
        int km = input.nextInt();
        System.out.print("\nDigite quandos litros você abasteceu: ");
        double litros = input.nextDouble();

        System.out.println("Seu consumo médio foi de: " + (km/litros));
        input.close();
    }
}
