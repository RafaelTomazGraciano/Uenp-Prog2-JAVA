public class Pessoa {

    private String nome;
    private int codigo;


    public Pessoa(){
        nome = "";
        codigo = 0;
    }

    public Pessoa(String nome, int codigo){
        this.nome = nome;
        this.codigo = codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo(){
        return codigo;
    }

}
