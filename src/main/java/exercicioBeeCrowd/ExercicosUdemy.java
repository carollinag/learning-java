package exercicioBeeCrowd;

import java.util.Scanner;

public class ExercicosUdemy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// prigrama receber um numero e verificar se ele esta entre 0 e 10
// e se é par;
/*

        System.out.print("Digite um numero: ");
        int numb = input.nextInt();
        if (numb >= 0 && numb <= 10 ) {
            System.out.println("Numero valido");
        } else {
            System.out.println("Numero invalido");
        }
        if (numb % 2 == 0) {
                System.out.println("Numero é par");
        } else {
            System.out.println("Numero impar");
        }

        System.out.println("Digite o ano: ");
        int ano = input.nextInt();

        boolean bissexto = ano % 4 == 0 &&((ano %100) !=0 ||(ano %400 == 0));

        if (bissexto == true){
            System.out.println(ano + " é ano bissexto");
        } else {
            System.out.println(ano + " não ano bissexto");
        }
//Criar um programa que receba duas notas parciais, calcular a média final.
// Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado",
// se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação",
// caso contrário imprime no console "Reprovado".



        System.out.println("Digite nota 1: ");
        double nota = input.nextDouble();
        System.out.println("Digite nota 2: ");
        double nota2 = input.nextDouble();

        double mediaFinal = nota + nota2 / 2;
        if (mediaFinal >= 7){
            System.out.println("Aprovado");
        } else if (mediaFinal <7 && mediaFinal > 4.0){
            System.out.println("Recuperação");
        } else
            System.out.println("Reprovado");


// Criar um programa que receba um número e diga se ele é um número primo.

        System.out.print("Digite um numero: ");
        int numero = input.nextInt();

        if (numero <= 1) {
            System.out.println("Por favor, insira um número inteiro positivo maior que 1.");
            return;
        }

        int contadorDeDivisores = 0;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                 contadorDeDivisores++;
            }
        }

        if (contadorDeDivisores == 0) {
            System.out.println("\nO numero " + numero + " é primo.");
        } else
            System.out.println("\nO numero " + numero + " não é primo.");
*/

        System.out.print("Digite um numero: ");
        int numero = input.nextInt();

        if (numero <= 1) {
            System.out.println("Por favor, insira um número inteiro positivo maior que 1.");
            return;
        }

        int contadorDeDivisores = 0;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                contadorDeDivisores++;
            }
        }

        switch (contadorDeDivisores) {
            case 0:
                System.out.println("\nO numero " + numero + " é primo.");
                break;
            default:
                System.out.println("\nO numero " + numero + " não é primo.");
        }


        input.close();
        }

    }
