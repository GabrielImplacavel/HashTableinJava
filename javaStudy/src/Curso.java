import java.util.*;

public class Curso {
    public String codCurso;
    public String nomeCurso;

    public Curso() {
        UUID meuUUID = UUID.randomUUID();

        this.codCurso = meuUUID.toString().toUpperCase().substring(15, 18);
    }

    public void leCurso() {
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Código do Curso: %1$s\n", this.codCurso);

        System.out.print("Nome...........: ");
        this.nomeCurso = entrada.nextLine();
    }
}