import java.text.SimpleDateFormat;
import java.util.Date;


public class Teste {
    public static void main(String[] args) {

        // Obtém a data e hora atual
        Date now = new Date();
        // Formata a data e hora para incluir ano, mês, dia, horas, minutos e segundos
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        String timestamp = dateFormat.format(now);
        System.out.println(timestamp);
    }
}
