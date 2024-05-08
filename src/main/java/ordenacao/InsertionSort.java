package ordenacao;

public class InsertionSort {
    public static void main(String[] args) {
        int vetor[] = {3, 4, 5, 6, 7, 8, 9, 0};

        for (int i = 0; i < vetor.length; i++) {
            int aux = vetor[i];
            int j = i - 1;

            while (j >= 0 && vetor[j] < aux) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = aux;
        }
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
    }
}
