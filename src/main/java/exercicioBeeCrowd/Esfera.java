package exercicioBeeCrowd;

import java.util.Scanner;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Esfera {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14159;
        System.out.println("Digit o raio: ");
        int raio = input.nextInt();

        double volume = ((4/3.0) * pi * Math.pow(raio, 3));

        input.close();

        DecimalFormat decfor = new DecimalFormat("0.000");
        decfor.setRoundingMode(RoundingMode.HALF_DOWN);

        System.out.print("Volume" + decfor.format(volume));
    }
}
