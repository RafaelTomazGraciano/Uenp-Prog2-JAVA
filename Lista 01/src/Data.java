/*Crie uma classe Data que tenha três campos: dia, mes e ano. Crie três construtores:
    - um vazio
    - um construtor que recebe o ano (neste caso, os campos dia e mes devem ser
    iniciados com 1
    - um construtor que recebe três parâmetros.
Crie um método formatarData( ) que recebe como parâmetro o separador e
retorna a data formatada. Exemplo:
    - se for passado o caractere “/”, o retorno será 1/6/2021
    - se for passado o caractere “-”, o retorno será 1-6-2021
Crie um método main( ) e mostre:
    - como criar objetos utilizando os construtores criados.
    - como chamar o método e exibir o resultado
Observação: não utilize nenhuma das classes de data da linguagem Java.*/

public class Data {
    int dia;
    int mes;
    int ano;

    Data(){
        dia = 1;
        mes = 1;
        ano = 1;
    }

    Data(int ano){
        dia = 1;
        mes = 1;
        this.ano = ano;
    }

    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String formatarData(char opcao){
        return "" + dia + opcao + mes + opcao + ano;
    }

    public static void main(String[] args){
        Data data1 = new Data();
        System.out.println(data1.formatarData('/'));
        Data data2 = new Data(2024);
        System.out.println(data2.formatarData('-'));
        Data data3 = new Data(1,6,2021);
        System.out.println(data3.formatarData('/'));
    }

}
