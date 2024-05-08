package escola2;

import escola1.Disciplina;
import escola1.Professor;

public class AssociacaoMuitosParaMuitos {
    public static void main(String[] args) {

        Disciplina disciplina1 = new Disciplina();
        disciplina1.setNome("Matematica");
        disciplina1.setCargaHoraria(80);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setNome("Portugues");
        disciplina2.setCargaHoraria(10);

        Professor professor1 = new Professor();
        professor1.setNome("Carlos");
        professor1.setMatricula(13445);
        professor1.setFormacaoAcademica("Licenciatura");
        professor1.setSalario(1500.30);

        Professor professor2 = new Professor();
        professor2.setNome("Pedro");
        professor2.setMatricula(13490);
        professor2.setFormacaoAcademica("Bacharel");
        professor2.setSalario(1400.70);

        //relacao de Carlos com matematica
        professor1.adicionarDisciplina(disciplina1);
        disciplina1.adicionarProfessor(professor1);
        //relacao de Calos com portugues
        professor1.adicionarDisciplina(disciplina2);
        disciplina2.adicionarProfessor(professor1);

        //relacao de Pedro com portugues
        professor2.adicionarDisciplina(disciplina2);
        disciplina2.adicionarProfessor(professor2);

        //listar as disciplinas do prof. Carlos
        System.out.println("\nDisciplina do Professor Carlos");
        for(int i=0; i < professor1.quantidadeDeDisciplinas(); i++){
//            Disciplina disciplina= professor1.getDisciplina(i);
//            System.out.println(disciplina.getNome());
            System.out.println(professor1.getDisciplina(i).getNome());
        }
        //listar os professores da disciplina Portugues
        System.out.println("\nProfessores da disciplina de portugues");
        for(int i=0; i < disciplina2.quantidadeProfessores(); i++){
            System.out.println(disciplina2.getProfessor(i).getNome());
        }







    }
}
