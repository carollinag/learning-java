package ordenacao;

import java.util.Map;

public class SelectionSort {
    public static void main(String[] args) {

        int [] vetor = new int [10];
        System.out.print("Desordenado ");
        for (int i = 0; i < vetor.length; i++) {
            vetor [i] = (int) (Math.random() * vetor.length);
            System.out.print(vetor[i] + " ");
        }
        int posicaoMenor, aux;
        for (int i = 0; i < vetor.length; i++) {
        posicaoMenor = i;
        for (int j = i + 1; j < vetor.length; j++) {
            if (vetor[j] < vetor[posicaoMenor]) {
                posicaoMenor = j;
            }
        }
        aux = vetor[posicaoMenor];
        vetor[posicaoMenor] = vetor[i];
        vetor[i] = aux;
    }
        System.out.println();
        System.out.print("Ordenado ");
        for (int i = 0; i < vetor.length; i++) {
        System.out.print(vetor[i] + " ");
    }
}
}
