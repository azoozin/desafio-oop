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

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJohn = new Dev();
        devJohn.setNome("John");
        devJohn.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos InscritoJohn:" + devJohn.getConteudosInscritos());
        devJohn.progredir();
        devJohn.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos John:" + devJohn.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos John:" + devJohn.getConteudosConcluidos());
        System.out.println("XP:" + devJohn.calcularTotalXp());

        System.out.println("-------");

        Dev devBruh = new Dev();
        devBruh.setNome("Bruh");
        devBruh.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Bruh:" + devBruh.getConteudosInscritos());
        devBruh.progredir();
        devBruh.progredir();
        devBruh.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Bruh:" + devBruh.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Bruh:" + devBruh.getConteudosConcluidos());
        System.out.println("XP:" + devBruh.calcularTotalXp());

    }
}
