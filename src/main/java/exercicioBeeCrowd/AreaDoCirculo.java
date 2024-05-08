package exercicioBeeCrowd;

import java.util.Scanner;
public class AreaDoCirculo {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.print("Digite a área: ");
        double pi = 3.14159;
        double raio = teclado.nextDouble();
        double raioO = Math.pow(raio,2);
        double area = pi * raioO;

        System.out.println("A área é: " + area);

    }
}
