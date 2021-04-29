import java.util.*;

public class Aluno {
    public String codAluno;
    public String nomeAluno;

    public Aluno() {
        UUID meuUUID = UUID.randomUUID();

        this.codAluno = meuUUID.toString().toUpperCase().substring(15, 18);
    }

    public void leAluno() {
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Código do Aluno: %1$s\n", this.codAluno);

        System.out.print("Nome...........: ");
        this.nomeAluno = entrada.nextLine();
    }
}