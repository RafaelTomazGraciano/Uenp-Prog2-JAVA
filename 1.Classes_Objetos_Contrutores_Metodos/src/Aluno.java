/*- Crie uma classe chamada Aluno, com matricula e nome. Crie uma classe chamada
Dupla, com dois campos do tipo Aluno. A classe deve ter o método mostrarAlunos( )
que exibe na tela os nomes dos dois alunos da Dupla.*/

public class Aluno {
    String nome;
    int matricula;

    Aluno(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }
}
