package exercicioBeeCrowd;

import java.util.Scanner;

public class DesafioRelacional {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o numero: ");
        double numero = entrada.nextDouble();

        System.out.print("Informe o numero: ");
        double numero2 = entrada.nextDouble();

        System.out.print("Informe a operação: ");
        String operacao = entrada.next();

        double resultado = operacao.equals("+") ?
                numero + numero2 : 0;
        resultado = "-".equals(operacao) ? numero - numero2 : resultado;
        resultado = "*".equals(operacao) ? numero * numero2 : resultado;
        resultado = "/".equals(operacao) ? numero / numero2 : resultado;
        resultado = "%".equals(operacao) ? numero % numero2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f" , numero , operacao, numero2, resultado);
    }
}
