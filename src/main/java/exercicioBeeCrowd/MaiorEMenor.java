package exercicioBeeCrowd;

import java.util.Scanner;

public class MaiorEMenor {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Digite quatro valores inteiros separados por espaços:");
        int maior = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            int valor = input.nextInt();
            if (valor > maior) {
                maior = valor;
            }
        }

        System.out.println("O maior valor é: " + maior);

                    input.close();
                }
            }
