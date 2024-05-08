package exercicioBeeCrowd;

import java.util.Scanner;

public class BuscaLinear {
    public static void main(String[] args) {

        String[] lestras = {"A", "B", "C", "D", "E", "F", "G", "H"};

        for (int i = 0; i < lestras.length; i++) {
            System.out.print(lestras[i] + " ");
        }
        Scanner input = new Scanner(System.in);
        System.out.print("\nQual letra você esta procurando? ");
        String letra = input.nextLine();
        input.close();
        //BUSCA LINEAR
        boolean encontrou = false;
        for (int i = 0; i < lestras.length; i++) {
            String elemento = lestras[i];
            if (elemento.equalsIgnoreCase(letra)) {
                encontrou = true;
                break;
            }
        }
        if (encontrou == true) {
            System.out.println("Encontrou!");
        }else {
            System.out.println("Não encontrou");
        }

    }
}
