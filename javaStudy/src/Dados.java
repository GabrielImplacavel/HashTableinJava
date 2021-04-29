import java.util.*;

public class Dados {
    public Hashtable cadastroAluno;
    public Hashtable cadastroCurso;
    public Hashtable cadastroMatricula;

    public Dados() {
        this.cadastroAluno = new Hashtable();
        this.cadastroCurso = new Hashtable();
        this.cadastroMatricula = new Hashtable();
    }

    public void gravaDados(Aluno aluno) {
        this.cadastroAluno.put(aluno.codAluno, aluno);
    }

    public void gravaDados(Curso curso) {
        this.cadastroCurso.put(curso.codCurso, curso);
    }

    public void gravaDados(Matricula matricula) {
        this.cadastroMatricula.put(matricula.numMatricula, matricula);
    }

    public void listaMatriculas() {
        Set<String> setOfMatriculas = cadastroMatricula.keySet();

        for (String chaveMatricula : setOfMatriculas) {
            Matricula matricula = (Matricula) cadastroMatricula.get(chaveMatricula);
            System.out.printf("Matrícula: %1$s - Data: %2$s\n", matricula.numMatricula, matricula.dataMatricula);
            Aluno aluno = (Aluno) cadastroAluno.get(matricula.codALuno);
            System.out.printf("Aluno: %1$s",aluno.nomeAluno);
            System.out.println("\n");
            Curso curso = (Curso) cadastroCurso.get(matricula.codCurso);
            System.out.printf("Curso: %1$s",curso.nomeCurso);
            System.out.println("\n");
        }
    }
}
