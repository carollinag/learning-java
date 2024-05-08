package dataDesafio;

public class Data {
    int dia;
    int mes;
    int ano;

    Data (){
        dia = 1;
        mes = 1;
        ano = 1070;
    }

    Data (int diaInicial, int mesInicial, int anoInicial){
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
    }

    String obterDataFormatada() {
        return dia + "/" + mes + "/" + ano;
    }
    String obterFormatada() {
        return String.format("%02d/%02d/%02d", dia, mes, ano);
    }
    void imprimirDataFormatada(){
        System.out.println(obterDataFormatada());
    }
}

