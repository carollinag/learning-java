package exercicioBeeCrowd;

public class MediaPonderada {
    public static void main(String[] args) {
        double[] notas = {5.0, 7.1};
        double[] pesos = {3.5, 7.5};

        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("i: " + i);
            System.out.println("nota: " + notas[i]);
            System.out.println("peso: " + pesos[i]);

            double mul = notas[i] * pesos[i];
            soma = soma+mul;

            System.out.println("mul: " + mul);
            System.out.println("soma: " + soma);
        }

        System.out.println("soma final: " + soma);
    }
}