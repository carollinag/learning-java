package exercicioBeeCrowd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParesEImpares {
    public static void main(String[] args) {

        int [] numeros = {10, 4, 32, 34,543, 3456, 654, 567, 87, 6789, 98};

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int numero : numeros){
            if (numero % 2 == 0) {
                pares.add(numero);
            }else{
                impares.add(numero);
            }

        }
        Collections.sort(pares);
        System.out.print("Números: ");
        for (Integer par : pares){
            System.out.print(par + " ");
        }
        Collections.sort(impares, Collections.reverseOrder());
        System.out.print(" ");
        for (Integer impar : impares){
            System.out.print(impar + " " );
        }
    }
}