/*Escreva uma classe para representar um programador. A classe deve ter os campos
nome, salarioMensal e horasExtras. Deve, também, ter o método
calcularSalario( ) que retorna o valor a receber pelo programador: salário mensal +
(quantidade de horas extras * valor hora extra). O valor da hora extra é passado como
argumento para o método.*/

public class Programador2 {
    String nome;
    double salarioMensal;
    int horasExtras;

    Programador2(String nome){
        this.nome = nome;
        salarioMensal = 0;
        horasExtras = 0;
    }

    double calculaSalario(double salarioMensal, int horasExtras, double valorHoraExtra){
        return salarioMensal + horasExtras * valorHoraExtra;
    }


}
