package exercicioBeeCrowd;

import java.util.Objects;
import java.util.Scanner;

public class QualAnimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite 3 caracteristicas de um animal: ");
        String animal1 = input.nextLine();
        String animal2 = input.nextLine();
        String animal3 = input.nextLine();
/*
        switch (animal1) {
            case "Dog":
                System.out.println("Dog");
                break;
            case "Cat":
                System.out.println("Cat");
                break;
        }
*/
        if (Objects.equals(animal1, "vertebrado")) {
            if (Objects.equals(animal2, "ave")) {
                if (Objects.equals(animal3, "carnivoro")) {
                    System.out.println("Aguia");
                } else if (Objects.equals(animal3, "onivoro")){
                    System.out.println("Pomba");
                }
            } else if (Objects.equals(animal2, "mamifero")) {
                if (Objects.equals(animal3, "onivoro")) {
                    System.out.println("Homem");
                } else if (Objects.equals(animal3, "Herbivaro")) {
                    System.out.println("Vaca");
                }
            }
        } else if (Objects.equals(animal1, "invertebrado")) {
            if (Objects.equals(animal2, "inseto")) {
                if (Objects.equals(animal3, "hematofago")) {
                    System.out.println("Pulga");
                } else if (Objects.equals(animal3, "herbivaro")) {
                    System.out.println("Lagarta");
                }
            } else if (Objects.equals(animal2, "anelideo")){
                if (Objects.equals(animal3, "hematofago")) {
                    System.out.println("Sanguessuga");
                } else if (Objects.equals(animal3, "onivoro")) {
                    System.out.println("Minhoca");
                }
            }
        } else {
            System.out.println("nao existe um animal");
        }

        input.close();
    }
}