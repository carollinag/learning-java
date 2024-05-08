package exercicioBeeCrowd;

import java.util.Scanner;

public class AreaFormasGeometrica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite 3 valores separados por espaço :  ");
        String[] medidas = input.nextLine().replace(",", ".").split(" ");

        double [] valores = new double [3];

        for (int i = 0; i < 3; i++) {
            //
            valores[i] = Double.parseDouble(medidas[i]);
        }
        System.out.println("Triangulo: " + (valores[0] * valores[2])/ 2);
        System.out.println("Circulo: " + (3.14159 * Math.pow(valores[2],2)));
        System.out.println("Trapezio: " + ((valores[0] + valores[1]) * valores[2] / 2));
        System.out.println("Quadrado: " + (valores[1] * valores[1]));
        System.out.println("Retangulo: " + (valores[0] * valores[1]));

        input.close();
        }
    }