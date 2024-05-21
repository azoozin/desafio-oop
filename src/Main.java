import desafio.dominio.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        // Polimorfismo exemplo
        Conteudo conteudo1 = new Curso();
        Conteudo conteudo2 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricoa mentoria de java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
