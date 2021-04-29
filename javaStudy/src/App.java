import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        Dados cadastro = new Dados();

        Aluno novoAluno;
        Curso novoCurso;
        Matricula novaMatricula;

        //  Inserting a new person
        do{
            novoAluno = new Aluno();
            novoAluno.leAluno();
            cadastro.gravaDados(novoAluno);
            System.out.print("\nDeseja cadastrar outro Aluno? (S/N)");
            System.out.println("\n");
        }while(entrada.nextLine().toUpperCase().charAt(0) != 'N');

        //  Inserting a new course
        do{
            novoCurso = new Curso();
            novoCurso.leCurso();
            cadastro.gravaDados(novoCurso);
            System.out.print("\nDeseja cadastrar outro Curso? (S/N)");
            System.out.println("\n");
        }while(entrada.nextLine().toUpperCase().charAt(0) != 'N');

        do{
            novaMatricula=new Matricula();
            
            novaMatricula.leMatricula();
            
            cadastro.gravaDados(novaMatricula);
            
            System.out.print("\nDeseja cadastrar outro Matricula? (S/N)");
            System.out.println("\n");
            
        }while(entrada.nextLine().toUpperCase().charAt(0)!='N');
        
        cadastro.listaMatriculas();

    }
}
