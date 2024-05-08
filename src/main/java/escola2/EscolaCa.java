package escola2;
import escola1.Disciplina;
public class EscolaCa {
    public static void main(String[] args) {
        //intanciaćão
        Disciplina disciplina1 = new Disciplina();
        disciplina1.setNome("Matematica");
        disciplina1.setCargaHoraria(10);

        System.out.println(disciplina1.getNome());
        System.out.println(disciplina1.getCargaHoraria());
    }
}
