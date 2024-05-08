package exercicioBeeCrowd;

import java.util.ArrayList;
import java.util.List;

public class ParesEImparesFuncaoJava {
    public static void main(String[] args) {

        int[] numeros = {10, 4, 32, 34, 543, 3456, 654, 567, 87, 6789, 98};

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }
        System.out.println(pares);
        System.out.println(impares);

        int auxP;
        boolean controle;

        for (int i = 0; i < pares.size(); i++) {
            controle = true;
            for (int j = 0; j < (pares.size() - 1); j++) {
                if (pares.get(j) > pares.get(j + 1)) {
                    auxP = pares.get(j);
                    pares.set(j, pares.get(j + 1));
                    pares.set(j + 1, auxP);
                    controle = false;
                }
            }
            if (controle) {
                break;
            }
        }
        int auxI;
        boolean controles;

        for (int i = 0; i < impares.size(); i++) {
            controles = true;
            for (int j = 0; j < (impares.size() - 1); j++) {
                if (impares.get(j) < impares.get(j + 1)) {
                    auxI = impares.get(j);
                    impares.set(j, impares.get(j + 1));
                    impares.set(j + 1, auxI);
                    controles = false;
                }
            }
            if (controles) {
                break;
            }
        }
        System.out.println(pares);
        System.out.println(impares);
    }
}