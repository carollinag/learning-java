package exercicioBeeCrowd;

public class BreakEContinue {
    public static void main(String[] args) {
        /*
        for (int i=0; i<10; i++){
            if (i==5){
                break;
            }
            System.out.println(i);
        }
        System.out.println("FIM!");
        */

        /*
        for (int i =0; i < 10; i++) {
            if (i %2 ==1){
                continue;
            }
            System.out.println(i);
        }
         */
  // break rotulado e continue rotulado

        extreno:
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 2) {
                    break extreno;
                }
                System.out.printf("[%d %d] ", i , j);
            }
            System.out.println();
        }
        System.out.println("FIM!");
    }
}
