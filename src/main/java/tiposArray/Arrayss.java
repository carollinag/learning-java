package tiposArray;

import java.util.Arrays;

public class Arrayss {
    public static void main(String[] args) {
        double [] notasAlunoA = new double[3];

        notasAlunoA [0] = 7.9;
        notasAlunoA [1] = 8.5;
        notasAlunoA [2] = 9.0;

        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println(notasAlunoA[0]);
        System.out.println(notasAlunoA[notasAlunoA.length - 1]);

        double total = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            total += notasAlunoA[i];
        }
        System.out.println(total/ notasAlunoA.length);

        final double notaArmazenada = 7.9;
        double[] notaAlunoB = {6.9, 8.9, notaArmazenada, 10};
        System.out.println(Arrays.toString(notaAlunoB));

        double totalAlunoB=0;
        for (int i=0; i<notaAlunoB.length; i++) {
            totalAlunoB +=notaAlunoB[i];
        }
        System.out.println(totalAlunoB/notaAlunoB.length);
    }
}
