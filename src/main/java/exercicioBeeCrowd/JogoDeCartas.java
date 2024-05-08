package exercicioBeeCrowd;

import java.util.Scanner;
import java.util.LinkedList;

public class JogoDeCartas {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            while (true) {
                int n = input.nextInt();
                if (n == 0) break;

                LinkedList<Integer> cartas = new LinkedList<>();
                for (int i = 1; i <= n; i++) {
                    cartas.add(i);
                }

                StringBuilder descarte = new StringBuilder();
                while (cartas.size() >= 2) {
                    if (descarte.length() > 0) {
                        descarte.append(", ");
                    }
                    descarte.append(cartas.removeFirst());
                    cartas.addLast(cartas.removeFirst());
                }

                System.out.println(descarte);
                System.out.println(cartas.getFirst());
            }

            input.close();
        }
    }

