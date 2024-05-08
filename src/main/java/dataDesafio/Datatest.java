package dataDesafio;

public class Datatest {
    public static void main(String[] args) {
        Data data1 = new Data();
        data1.ano =2024;

        var data2 = new Data(19, 4, 2024);

        System.out.printf("%02d/%02d/%02d\n",data1.dia, data1.mes, data1.ano);
        System.out.println(data1.obterDataFormatada());
        System.out.println(data2.obterFormatada());
        data1.imprimirDataFormatada();
    }

}
