package exercicioBeeCrowd;

import java.util.Scanner;

public class MediaPonderadaNovo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[2];
        double[] pesos = {3.5, 7.5};

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("\nDigite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        notas[0]= nota1;
        notas[1]=nota2;

        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("i: " + i);
            System.out.println("nota: " + notas[i]);
            System.out.println("peso: " + pesos[i]);

            double mul = notas[i] * pesos[i];
            soma = soma+mul;

            System.out.println("mul: " + mul);
            System.out.println("soma: " + soma);
        }

        System.out.println("soma final: " + soma);
        scanner.close();
    }
}