package exercicioBeeCrowd;

import java.util.Scanner;

public class TempoEvento3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia do inicio: ");
        int diaInicio = scanner.nextInt();
        System.out.print("\nDigite o dia do termino: ");
        int diaTermino = scanner.nextInt ();

        System.out.print("\nDigite a hora, minuto e segundo do inicio do evento: ");
        int horaInicio = scanner.nextInt ();
        int minutoInicio = scanner.nextInt ();
        int segundoInicio = scanner.nextInt ();

        System.out.print("\nDigite a hora, minuto e segundo do termino do evento: ");
        int horaTermino = scanner.nextInt ();
        int minutoTermino = scanner.nextInt ();
        int segundoTermino = scanner.nextInt ();

        int segTotal = (diaTermino - diaInicio) * 86400 + (horaTermino - horaInicio) * 3600 + (minutoTermino - minutoInicio) * 60 + (segundoTermino - segundoInicio);

        int dias, horas, minutos, segundos;

        dias = segTotal / 86400;
        horas = (segTotal % 86400) / 3600;
        minutos = ((segTotal % 86400) % 3600) / 60;
        segundos = ((segTotal % 86400) % 3600) % 60;

        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");



        scanner.close();
    }
}