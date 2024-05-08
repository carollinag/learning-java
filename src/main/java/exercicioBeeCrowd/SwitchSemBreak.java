package exercicioBeeCrowd;

public class SwitchSemBreak {
    public static void main(String[] args) {

        int idade = 0;

        switch (idade) {
            case 3:
                System.out.println("sabe programar");
            case 2:
                System.out.println("sabe falar");
            case 1:
                System.out.println("sabe andar");
            case 0:
                System.out.println("sabe respirar");
                break; // so para não sair o default.
            default:
                System.out.println("não sabe de nada");
        }
        System.out.println("FIM!");
    }
}
