package tiposArray;

import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantidade de notas: ");
        int quantidade = input.nextInt();
        double[] notas  = new double[quantidade];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota" + (i + 1) + ": ");
            notas[i] = input.nextDouble();
        }
        //System.out.println(Arrays.toString(notas));

        double soma = 0;
        for(double notaFinal : notas) {
            soma += notaFinal;
        }
        System.out.println("A media é: " + soma / notas.length);

        input.close();
    }
}
