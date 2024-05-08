package tiposArray;

public class TiposFor {
    public static void main(String[] args) {
        for (int i = 1; i < 30; i=i+i) {
            //System.out.println("i: " + i);
        }

        for (int i = 10; i >= 0; i=i-3) {
          //  System.out.println("i: " + i);
        }

        String [] notas = {"5.0", "uva", "8.5", "4.2"};
        for (String nota : notas) {
           System.out.print( nota);
        }

        for (int i = 0; i < 3; i++) {
           // System.out.println("i: " + i);

            for (int y = 0; y < 3; y++) {
               // System.out.println("y: " + y);
            }
        }

        for (int i = 10; i >= 0; i= i -2) {
          //  System.out.print( "i:" + i);

        }

        int i= 0;
        for (; i < 10; i++) {
           // System.out.print(i);
        }
        //System.out.println("saiu do for...");
        //System.out.println(i);
    }
}

