package exercicioBeeCrowd;

import java.util.Scanner;

public class Projetinhos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[] salarios = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o seu " + (i + 1) + "º salario: ");
            String input = entrada.nextLine().replace(",", ".");
            salarios[i] = Double.parseDouble(input);
        }

        double media = calcularMedia(salarios);
        System.out.println("A média salarial é: " + media);

        entrada.close();
    }

    public static double calcularMedia(double[] salarios) {
        double soma = 0;
        for (double salario : salarios) {
            soma += salario;
        }
        return soma / salarios.length;
    }
}