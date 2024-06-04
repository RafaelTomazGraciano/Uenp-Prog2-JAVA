/*- Crie uma classe chamada Aluno, com matricula e nome. Crie uma classe chamada
Dupla, com dois campos do tipo Aluno. A classe deve ter o método mostrarAlunos( )
que exibe na tela os nomes dos dois alunos da Dupla.*/

public class Dupla {
    Aluno aluno1 = new Aluno("Rigby", 123);
    Aluno aluno2 = new Aluno("Mordecai", 456);

    void mostrarAlunos(){
        System.out.printf("Aluno1: %s | Matricula: %d || Aluno2: %s | Matricula: %d", aluno1.nome, aluno1.matricula, aluno2.nome, aluno2.matricula);
    }
}
