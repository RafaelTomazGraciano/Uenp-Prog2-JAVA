import org.junit.jupiter.api.Test;

class LivroAutorTest {
    @Test
    void test() {
        Livro livro = new Livro("livroJava", 257, "Editora", "Rafael", "masculino");
        System.out.println(livro.titulo);
        System.out.println(livro.paginas);
        System.out.println(livro.editora);
        System.out.println(livro.autor.nome);
        System.out.println(livro.autor.genero);
    }
}
