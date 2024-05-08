package colecao;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

        //Set<String> listaAprovados = new HashSet<>();// forma não ordenada
        SortedSet<String> listaAprovados = new TreeSet<>();
        listaAprovados.add("Ana");
        listaAprovados.add("Calos");
        listaAprovados.add("Lucca");
        listaAprovados.add("Pedro");
        listaAprovados.add("Luiz");

        for (String candidados : listaAprovados) {
            System.out.println(candidados);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        //nums.get(1); não é possível acessar pelo índice.


        for (int n : nums){
            System.out.println(n);
        }
    }
}
