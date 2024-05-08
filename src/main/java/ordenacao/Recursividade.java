package ordenacao;

public class Recursividade {
    public static void main(String[] args) {

    int [] vetor = new int[5];

    for (int i=0 ; i < 5 ; i++){
        vetor[i] = (int)(Math.random() * vetor.length);
        System.out.print(vetor[i] + " ");
    }
        System.out.println("soma");
        System.out.println(somar (0, 0, vetor));
}
    private static int somar (int soma, int poisicao, int [] vetor){
        if (poisicao < vetor.length){
            soma = soma + vetor[poisicao];
            return somar (soma, poisicao + 1, vetor);
        }else{
            return soma;
        }
    }
}
