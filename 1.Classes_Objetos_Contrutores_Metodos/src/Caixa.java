/*Crie uma classe chamada Caixa, com os atributos largura, altura e
comprimento. Crie um método chamado calcularVolume() que retorna o volume
da caixa.*/

import java.util.Scanner;

public class Caixa {
    double altura;
    double largura;
    double comprimento;

    Caixa(double altura, double largura, double comprimento){
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    double calcularVolume(){
        return altura * largura * comprimento;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da altura da caixa: ");
        double altura = scanner.nextDouble();
        System.out.print("Digite o valor da largura da caixa: ");
        double largura = scanner.nextDouble();
        System.out.print("Digite o valor da comprimento da caixa: ");
        double comprimento = scanner.nextDouble();
        Caixa caixa = new Caixa(altura, largura, comprimento);
        System.out.println(caixa.calcularVolume());
        scanner.close();
    }
}
