package exercicioBeeCrowd;

import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String conceito= "";
        System.out.print("Digite a nota: ");

        int nota = input.nextInt();
        switch (nota) {
            case 10: case 9:
                conceito = "A";
                break;
            case 8: case 7:
                conceito = "B";
                break;
            case 6: case 5:
                conceito = "C";
                break;
            case 4:
            case 3:
                conceito = "D";
                break;
            default:
                conceito = "Não encontrado";        }
        System.out.println(" conceito é: " + conceito);
        input.close();
    }
}
