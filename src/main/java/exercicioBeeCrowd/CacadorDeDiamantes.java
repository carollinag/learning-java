package exercicioBeeCrowd;
import java.util.Scanner;

public class CacadorDeDiamantes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        input.nextLine();

        input.close();

        for (int i = 0; i < N; i++) {
            String linha = input.nextLine().trim().replace(".", "");

            int cont = 0;

            while (linha.contains("<>")) {
                linha = linha.replaceFirst("\\<>", "");
                cont++;
                if(!linha.contains("<>")){
                    System.out.println(cont);
                }
            }
        }
    }
}