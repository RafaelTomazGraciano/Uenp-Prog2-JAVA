/*Escreva uma classe para representar um programador horista (que trabalha por horas).
A classe deve ter os campos valorHora e horasTrabalhadas. Deve, também, ter o
método calcularSalario() que retorna o valor a receber pelo programador (horas
trabalhadas multiplicadas pelo valor da hora).*/

public class Programador {
    int horasTrabalhadas;
    double valorHora;

    Programador(int horasTrabalhadas, double valorHora){
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    double calcularSalario(){
        return horasTrabalhadas * valorHora;
    }

}
