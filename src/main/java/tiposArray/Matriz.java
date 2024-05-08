package tiposArray;
import java.util.Arrays;
import java.util.Scanner;
public class Matriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int qtdeAlunos = input.nextInt();

        System.out.print("Quantas notas por alunos? ");
        int qtdeNotas = input.nextInt();

        double [] [] notasDaTurma = new double[qtdeAlunos][qtdeNotas];

        double total = 0;
        for (int a = 0; a<notasDaTurma.length; a++){
            for (int n = 0; n<notasDaTurma[a].length; n++){

                System.out.printf("Informe a nota %d do aluno %d: ", n +1 , a +1);
                notasDaTurma[a][n] = input.nextDouble();
                total += notasDaTurma[a] [n];
            }
        }

        double media = total / ( qtdeAlunos * qtdeAlunos);
        System.out.println("Media da turma é " + media);

        for(double [] notasDoAluno : notasDaTurma) {
            System.out.println(Arrays.toString(notasDoAluno));
        }

        input.close();
    }
}
