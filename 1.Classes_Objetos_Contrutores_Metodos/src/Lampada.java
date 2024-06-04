/*Crie uma classe chamada Lampada. A classe deve ter o atributo (campo) acesa.
A classe deve ter os métodos:
● acender() (muda o campo acesa para verdadeiro)
● apagar() (muda o campo acesa para falso)
Crie um método chamado mostrarEstado() que retorna a mensagem “acesa” ou
“apagada” conforme o valor do campo acesa.*/


public class Lampada {

    boolean acesa;

    Lampada(){
        acesa = false;
    }

    void acender(){
        acesa = true;
    }

    void apagar(){
        acesa = false;
    }

    void mostrarEstado(){
        if(acesa){
            System.out.println("Lampada acesa");
        }
        else{
            System.out.println("Lampada apagada");
        }
    }

    public static void main(String[] args) {
    Lampada lampada = new Lampada();
    lampada.mostrarEstado();
    lampada.acender();
    lampada.mostrarEstado();
    lampada.apagar();
    lampada.mostrarEstado();
    }
}