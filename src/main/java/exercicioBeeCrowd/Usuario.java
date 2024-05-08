package exercicioBeeCrowd;

public class Usuario {

    String nome;
    String email;

    public boolean equals(Object obj) {
        if (obj instanceof Usuario) {
            Usuario outro = (Usuario) obj;
            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        } else {
            return false;
        }
    }

     public int hashCode() {
        return 0;
    }

    /*
    public boolean equals(Object objeto) {

        Usuario outro = (Usuario) objeto;

        boolean nomeIgual = outro.nome.equals(this.nome);
        boolean emailIgual = outro.email.equals(this.email);
        return nomeIgual && emailIgual;
    }*/
}

