import java.util.*;

public class Matricula {
    public String numMatricula;
    public String codALuno;
    public String codCurso;
    public String dataMatricula;

    // Construtor
    public Matricula() {
        UUID meuUUID = UUID.randomUUID();
        this.numMatricula = meuUUID.toString().toUpperCase().substring(15, 18);
    }

    public void leMatricula() {
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Número da Matrícula: %1$s\n", this.numMatricula);

        System.out.print("Código do Aluno....: ");
        this.codALuno = entrada.nextLine();

        System.out.print("Código do Curso....: ");
        ;
        this.codCurso = entrada.nextLine();

        System.out.print("Data da Matrícula..: ");
        this.dataMatricula = entrada.nextLine();
    }

}
