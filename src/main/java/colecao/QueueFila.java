package colecao;

import java.util.Queue;
import java.util.LinkedList;
public class QueueFila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        //Offer e add -> adicionam elementos na fila
        //diferenca é o comportamento ocorre quando a fila está cheia!
        fila.add("Ana"); //retorna false
        fila.offer("Bella"); //lanća uma execão.
        fila.add("Calos");
        fila.offer("Rafaela");
        fila.add("Gui");

        //peek e element -> Obter o proximo elemento da fila (sem remover)
        //diferenca é o comportamento ocorre quando a fila está vazia!
        //System.out.println(fila.peek()); //retorna null
        //System.out.println(fila.element());//lanća uma execão.

        //poll e remove -> Obter o proximo elemento da fila e remover
        //diferenca é o comportamento ocorre quando a fila está vazia!
        System.out.println(fila.poll());
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());

        //fila.size();
        //fila.clear();
        //fila.isEmpty();
        //fila.contains(...);
    }
}
