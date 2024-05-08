package exercicioBeeCrowd;

import java.io.PrintStream;
import java.util.Scanner;

public class TempoEvento {
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

        int diasCheios= (diaTermino - diaInicio) -1;

        int horasI = (24 - horaInicio);
        int minutosI = (60 - minutoInicio);
        int segundosI = (60 - segundoInicio);


        int segundos = (segundosI + segundoTermino);
        int minutos = segundos /60 ;
        int restSeg = segundos % 60;
        //System.out.println(segundos);
        //System.out.println(minutos);
        //System.out.println(restSeg);
        int min = (minutosI + minutoTermino + minutos);
        int hora = min /60;
        int restMin = min % 60;

        int horas = (horasI + horaTermino + hora);
        int dia = horas /24;
        int restHoras = horas % 24;


        System.out.println(diasCheios + dia);
        System.out.print( restHoras + "horas" + restMin + "minutos" + restSeg + "segundos");

        scanner.close();
    }
}