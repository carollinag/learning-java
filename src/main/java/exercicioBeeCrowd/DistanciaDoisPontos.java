package exercicioBeeCrowd;

import java.util.Scanner;

public class DistanciaDoisPontos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite os dois valores do eixo X1 e Y1 : ");
        String [] x = scanner.nextLine().split(" ");
        System.out.print("Digite os dois valores do eixo X2 e Y2 ");
        String [] y = scanner.nextLine().split(" ");

        // 1.0 7.0/5.0 9.0
        // ["1.0 7.0", "5.0 9.0"]

        // ["1.0", "7.0"]
        // ["5.0", "9.0"]

        //---------------------

        //  ..1.0 7.0/5.0 9.0..
        // ["1.0 7.0", "5.0 9.0"]

        // ["1.0", "7.0"]
        // ["5.0", "9.0"]

        double [] eixoX = new double [2];
        double [] eixoY = new double [2];

        for (int i =0 ; i<2; i++){
            eixoX[i] = Double.parseDouble(x[i]);
        }
        for (int i =0 ; i<2; i++){
            eixoY[i] = Double.parseDouble(y[i]);
        }
        double p1 = Math.pow (eixoX[0] - eixoY[0], 2);
        double p2 = Math.pow (eixoX[1] - eixoY[1], 2);
        double raiz = Math.sqrt(p1+ p2);

        System.out.println("Resultado: " + raiz);
        scanner.close();
    }

}
