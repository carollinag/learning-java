package colecao;

public class Usuario {
    String nome;

    Usuario(String nome) {
        this.nome = nome;
    }
    public String toString() {
        return "Meu nome é " + this.nome + ".";
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Usuario usuario = (Usuario) o;
//        return Objects.equals(nome, usuario.nome);
//    }
    @Override
    public boolean equals(Object obj){
        Usuario outroUsuario = (Usuario) obj;
        return this.nome.equals(outroUsuario.nome);
    }
    @Override
     public int hashCode(){
        return 0;
     }
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(nome);
//    }

}
