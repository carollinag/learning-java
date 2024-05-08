package codListaLigada;
public class Programa {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        lista.adicionar("AC");
        lista.adicionar("DF");
        lista.adicionar("PB");
        lista.adicionar("PE");
        System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
        System.out.println("Ultimo: " + lista.getUltimo().getValor());
        System.out.println("Tamanho da lista: " + lista.getTamanho());
        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(lista.get(i).getValor());
        }
        System.out.println("Removendo: ");
        lista.remover("ac");
        lista.remover("df");
        lista.remover("pb");
        lista.remover("pe");
        lista.adicionar ("rj");
        System.out.println("Tamanho da lista: " + lista.getTamanho());
        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(lista.get(i).getValor());
        }
    }
}
