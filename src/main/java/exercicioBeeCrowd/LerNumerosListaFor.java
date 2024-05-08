package exercicioBeeCrowd;

import java.util.Scanner;

public class LerNumerosListaFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite 3 valores separados por espaço :  ");
        String[] medidas = input.nextLine().replace(",", ".").split(" ");

        double [] valores = new double [3];

        for (int i = 0; i < 3; i++) {
            //
            valores[i] = Double.parseDouble(medidas[i]);
        }
        for (int i=0; i< valores.length;i++) {
            System.out.println("Valor" + (i + 1) + ":" + valores[i]);
        }
        input.close();
        }
    }