package exercicioBeeCrowd;

import org.w3c.dom.ls.LSOutput;

public class DesafioOperadoresLogicos {
    public static void main(String[] args) {
        boolean trabalhoTerca = false;
        boolean trabalhoQuinta = false;

        if (trabalhoTerca || trabalhoQuinta) {
            if (trabalhoTerca && trabalhoQuinta) {
                System.out.println("Comprar Tv 50\" e toma sorvete");
            }
            if (trabalhoTerca ^ trabalhoQuinta) {
                System.out.println("Compra Tv 32\" e toma sorvete");
            }
        }else System.out.println("não compra Tv e nem toma sorvete");
        }
    }

    /*
        boolean trabalhoTerca = false;
        boolean trabalhoQuinta = false;

        boolean Tv50 = trabalhoTerca && trabalhoQuinta;
        System.out.println("Comprou TV 50\"? " + Tv50);

        boolean Tv32 = trabalhoTerca ^ trabalhoQuinta;
        System.out.println("Comprou TV 32\"? " + Tv32);

        boolean sorvete = trabalhoTerca || trabalhoQuinta;
        System.out.println("Tomou sorvete? " + sorvete);
       // System.out.println("Mais saudável? " + !sorvete);


     */