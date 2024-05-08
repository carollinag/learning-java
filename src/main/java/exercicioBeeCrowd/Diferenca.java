package exercicioBeeCrowd;

import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[] valores = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("\nDigite o seu " + (i + 1) + "º numero: ");
            String valor = input.nextLine();
            valores[i] = Integer.parseInt(valor);
        }
            int multiplicacao1 = valores[0] * valores[1];
            int multiplicacao2 = valores[2] * valores[3];
            int subitracao = multiplicacao1 - multiplicacao2;
        //System.out.println(multiplicacao1);
        //System.out.println(multiplicacao2);
        System.out.println("Diferença: " + subitracao);

        for (int i = 0; i < 4; i++) {
            System.out.println("Numero " + (i + 1) + ": " + valores[i]);
        }
        input.close();
}}
