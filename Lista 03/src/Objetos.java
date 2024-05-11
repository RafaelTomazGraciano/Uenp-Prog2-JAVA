/*[static] Crie uma classe com um campo static chamado quantidadeObjetos.
Este atributo deve ser incrementado a cada vez que um objeto da classe é
instanciado. Mostre como exibir, em dado momento, a quantidade de objetos
existentes.*/

public class Objetos {

    private static int objeto = 0;

   public Objetos(){
        objeto++;
    }

    public static int quantidadeObjetos(){
        return objeto;
    }

}
