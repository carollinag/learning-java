package exercicioBeeCrowd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu primeiro salario: ");
        String sal1= entrada.nextLine().replace(",", ".");
        System.out.println("Digite o seu segundo salario: ");
        String sal2= entrada.nextLine().replace(",", ".");
        System.out.println("Digite o seu terceiro salario: ");
        String sal3= entrada.nextLine().replace(",", ".");

        double salario1 = Double.parseDouble(sal1);
        double salario2 = Double.parseDouble(sal2);
        double salario3 = Double.parseDouble(sal3);
        double media = (salario1 + salario2 + salario3) / 3;
        System.out.println("A media salarial é: " + media);
        entrada.close();
    }
}