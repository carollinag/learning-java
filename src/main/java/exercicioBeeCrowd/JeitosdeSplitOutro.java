package exercicioBeeCrowd;

public class JeitosdeSplitOutro {
    public static void main(String[] args) {

        String texto = " ..1.0 7.0/5.0 9.0.. ";
        String limpa = texto.replace("..", "").trim();
        String [] quebra = limpa.split("[\\s/]+");

        //  ..1.0 7.0/5.0 9.0..
        // ["1.0 7.0", "5.0 9.0"]

        // ["1.0", "7.0"]
        // ["5.0", "9.0"]

        for (String quebras : quebra) {
            System.out.println(quebras);
        }
        }
}

