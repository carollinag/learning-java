package exercicioBeeCrowd;

import java.util.Scanner;
import java.text.DecimalFormat;

public class SalarioBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nDigite seu nome: ");
        String nome = input.nextLine();
        System.out.print("\nDigite seu salário: ");
        double salario = input.nextDouble();
        System.out.print("\nDigite o valor de suas vendas: ");
        double valorVendas = input.nextDouble();
        double porcento = (valorVendas * 0.15);
        System.out.println("Seu nome é: " + nome);
        System.out.printf("Seu salário é: R$" + (salario + porcento));
    }
}
