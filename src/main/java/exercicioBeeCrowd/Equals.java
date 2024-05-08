package exercicioBeeCrowd;

public class Equals {
     //import java.util.Date
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "John Doe";
        u1.email = "john@doe.com";

        Usuario u2 = new Usuario();
        u2.nome = "John Doe";
        u2.email = "john@doe.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));

        //System.out.println(u1 ==u1);

        //System.out.println(u2.equals(new Date()));
    }
}
