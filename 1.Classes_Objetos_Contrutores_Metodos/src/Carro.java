/*- Crie uma classe chamada Carro com os campos marca, modelo, ano de fabricação e
velocidade. Crie um construtor vazio e um construtor que receba argumentos, exceto
velocidade, que deve iniciar em 0. A classe deve ter os métodos:
- acelerar(), que incrementa a velocidade em 1
- frear(), que decrementa a velocidade em 1
Restrições: a velocidade não pode ficar negativa nem ultrapassar 200 km/h.
Sugestão: chame os métodos acelerar( ) e frear( ) dentro de repetições para testar os limites.*/

public class Carro {
    String marca;
    String modelo;
    int ano_fabricacao;
    int velocidade;

    Carro(){
        marca = null;
        modelo = null;
        ano_fabricacao = 0;
        velocidade = 0;
    }

    Carro(String marca, String modelo, int ano_fabricacao){
        this.marca = marca;
        this.modelo = modelo;
        this.ano_fabricacao = ano_fabricacao;
        velocidade = 0;
    }

    int acelerar(){
        if (velocidade == 200){
            return velocidade = 200;
        }
        else{
            return velocidade += 1;
        }
    }

    int frear(){
        if (velocidade == 0){
            return velocidade = 0;
        }
        else{
            return velocidade -= 1;
        }
    }

}
