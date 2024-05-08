package exercicioBeeCrowd;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nDigite seu número de funcionario: ");
        int numeroFuncionario = input.nextInt();
        System.out.print("\nDigite suas horas trabalhadas: ");
        double horasTrabalhadas = input.nextDouble();
        System.out.print("\nDigite o valor de horas trabalhadas: ");
        double valorTrabalhadas = input.nextDouble();
        System.out.println("Seu numero é: " + numeroFuncionario);
        System.out.println("Seu salário é: R$" + (horasTrabalhadas * valorTrabalhadas));
    }
}
