/*[Sobrecarga] Crie três métodos sobrecarregados chamados mudarData( ).
a) O primeiro deve receber um objeto LocalDate e um inteiro e setar o
ano do objeto LocalDate com o inteiro recebido.
b) O segundo deve receber um objeto LocalDate e dois inteiros e setar o
mês e o ano do objeto LocalDate com os inteiros recebidos.
c) O terceiro deve receber um objeto LocalDate e três inteiros e setar o
dia, o mês e o ano do objeto LocalDate com os inteiros recebidos.*/

import java.time.LocalDate;

public class Data {

    public LocalDate mudarData(LocalDate dataLocal, int ano){
        return dataLocal.withYear(ano);
    }

    public LocalDate mudarData(LocalDate dataLocal, int mes, int ano){
        return dataLocal.withMonth(mes).withYear(ano);
    }

    public LocalDate mudarData(LocalDate dataLocal, int ano, int mes, int dia) {
        return dataLocal.withYear(ano).withMonth(mes).withDayOfMonth(dia);
    }
}
