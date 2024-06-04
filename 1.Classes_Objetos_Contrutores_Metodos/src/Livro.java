/*Crie uma classe para representar um Livro. A classe deve ter informações sobre título,
quantidade de páginas, editora e Autor, sendo Autor uma classe com nome e gênero. A
classe Livro deve ter um construtor que não recebe e outro que recebe argumentos.*/

public class Livro {
    String titulo;
    int paginas;
    String editora;
    Autor autor = new Autor();

    Livro(){
        titulo = null;
        paginas = 0;
        editora = null;
        autor.nome = null;
        autor.genero = null;
    }

    Livro(String titulo, int paginas, String editora, String nome, String genero){
        this.titulo = titulo;
        this.paginas = paginas;
        this.editora = editora;
        this.autor.nome = nome;
        this.autor.genero = genero;
    }

}
