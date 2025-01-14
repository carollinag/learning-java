package colecao;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Joao");
        usuarios.put(3, "Maria");
        usuarios.put(35, "Jorge");
        usuarios.put(9, "Fernanda");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(35));
        System.out.println(usuarios.containsValue("Maria"));

        System.out.println(usuarios.get(9));
        System.out.println(usuarios.remove(1));

        for(int chave: usuarios.keySet()) {
            System.out.println(chave);
        }

        for(String valor: usuarios.values()) {
            System.out.println(valor);
        }

        for(Map.Entry<Integer, String> registro: usuarios.entrySet()) {
            System.out.print(registro.getKey() +"---> ");
            System.out.println(registro.getValue());
        }


    }
}
