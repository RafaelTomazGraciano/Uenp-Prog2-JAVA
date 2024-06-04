/*[varargs] Crie um método que receba uma String e uma quantidade variável
de inteiros. Se o valor da String for “SOM”, o método deve retornar a soma de
todos os elementos. Se o valor da String for “MULT”, o método deve retornar
a multiplicação de todos os elementos.*/

public class Calculadora {

    public int calculadora(String opcao, int ...v){
        int resultado = 0;
        if(opcao.equals("SOM")){
            for(int i = 0; i < v.length; i++){
                resultado += v[i];
            }
        }
        if(opcao.equals("MULT")){
            resultado = 1;
            for(int i = 0; i < v.length; i++){
                resultado *= v[i];
            }
        }
        return resultado;
    }

}
